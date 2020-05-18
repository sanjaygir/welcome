package welcome

import com.github.axet.vget.VGet

class HomeController {

    def index() {

        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
            String url = "https://www.youtube.com/watch?v=C0DPdy98e4c";
            // ex: "/Users/axet/Downloads"
            String path = "/var/roadrace/upload"
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
