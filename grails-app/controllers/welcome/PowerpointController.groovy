package welcome

import org.apache.poi.xslf.usermodel.SlideLayout
import org.apache.poi.xslf.usermodel.XMLSlideShow
import org.apache.poi.xslf.usermodel.XSLFSlide
import org.apache.poi.xslf.usermodel.XSLFSlideLayout
import org.apache.poi.xslf.usermodel.XSLFSlideMaster
import org.apache.poi.xslf.usermodel.XSLFTextShape

class PowerpointController {

    def index() {


    }

    def create(){

        def numSlides = params.numSlides.toInteger()

        [num: numSlides]
    }

    def download(){

        def name = params.name

        def file = new File("/var/roadrace/upload/${name}.pptx")

        if (file.exists()) {
            response.setContentType("application/octet-stream")
            response.setHeader("Content-disposition", "filename=${file.name}")
            response.outputStream << file.bytes
            return
        }

        render "done"
    }

    def save(){


        def slideName = params.slidename

        def totalSlides = params.int("slidesnum")

        //creating presentation
        XMLSlideShow ppt = new XMLSlideShow();

        //getting the slide master object
        XSLFSlideMaster slideMaster = ppt.getSlideMasters()[0];

        //get the desired slide layout
        XSLFSlideLayout titleLayout = slideMaster.getLayout(SlideLayout.TITLE);


        for(int i=1; i<=totalSlides; i++){

            //creating a slide with title layout
            XSLFSlide slide = ppt.createSlide(titleLayout);

            //selecting the place holder in it
            XSLFTextShape title = slide.getPlaceholder(0);
            XSLFTextShape body = slide.getPlaceholder(1)

            title.setText(params["title[${i}]"]);
            body.setText(params["content[${i}]"]);

        }

        //create a file object
        File file = new File("/var/roadrace/upload/${slideName}.pptx");
        FileOutputStream out = new FileOutputStream(file);

        //save the changes in a PPt document
        ppt.write(out);
        System.out.println("slide cretated successfully");
        out.close();

        render "Complete"
    }
}
