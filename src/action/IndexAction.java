package action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("index")
@RequestMapping("/")
public class IndexAction {
    @RequestMapping("/")
    public ModelAndView signin(){
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("title","Admin");
        return mv;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("title","Admin");
        return mv;
    }

    @RequestMapping("/table")
    public ModelAndView table(){
        ModelAndView mv = new ModelAndView("table");
        mv.addObject("title","Admin");
        return mv;
    }

    @RequestMapping("/blank")
    public ModelAndView blank(){
        ModelAndView mv = new ModelAndView("blank");
        mv.addObject("title","Admin");
        return mv;
    }
}
