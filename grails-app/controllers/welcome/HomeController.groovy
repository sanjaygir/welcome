package welcome

import com.github.axet.vget.VGet
import org.apache.poi.xslf.usermodel.SlideLayout
import org.apache.poi.xslf.usermodel.XMLSlideShow
import org.apache.poi.xslf.usermodel.XSLFAutoShape
import org.apache.poi.xslf.usermodel.XSLFShape
import org.apache.poi.xslf.usermodel.XSLFSlide
import org.apache.poi.xslf.usermodel.XSLFSlideLayout
import org.apache.poi.xslf.usermodel.XSLFSlideMaster
import org.apache.poi.xslf.usermodel.XSLFTextShape

class HomeController {

    def index() {

        //creating presentation
        XMLSlideShow ppt = new XMLSlideShow();

        //getting the slide master object
        XSLFSlideMaster slideMaster = ppt.getSlideMasters()[0];

        //get the desired slide layout
        XSLFSlideLayout titleLayout = slideMaster.getLayout(SlideLayout.TITLE);

        //creating a slide with title layout
        XSLFSlide slide1 = ppt.createSlide(titleLayout);

        //selecting the place holder in it
        XSLFTextShape title1 = slide1.getPlaceholder(0);
        XSLFTextShape body = slide1.getPlaceholder(1)

        XSLFSlide slide2 = ppt.createSlide(titleLayout);

        //selecting the place holder in it
        XSLFTextShape title2 = slide2.getPlaceholder(0);
        XSLFTextShape body2 = slide2.getPlaceholder(1)

        //setting the title init
        title1.setText("Sanjax Test");
        body.setText("This is content");

        title2.setText("Sanjax Test 2");
        body2.setText("This is content 2");

        //create a file object
        File file = new File("/var/roadrace/upload/sanjax.pptx");
        FileOutputStream out = new FileOutputStream(file);

        //save the changes in a PPt document
        ppt.write(out);
        System.out.println("slide cretated successfully");
        out.close();





        render "Hello"

    }
}
