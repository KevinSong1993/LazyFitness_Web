package action;

import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller("index")
@RequestMapping("/")
public class IndexAction {
    @RequestMapping("/")
    public ModelAndView signin(){
        ModelAndView mv = new ModelAndView("login");
//        mv.addObject("title","Admin");
        return mv;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
//        mv.addObject("title","Admin");
        return mv;
    }

    @RequestMapping("/table")
    public ModelAndView table(){
        ModelAndView mv = new ModelAndView("table");
        String[] columns = {"Rendering engine","Browser","Platform(s)","Engine version","CSS grade"};
        mv.addObject("columns", columns);
        JSONArray tabledatas = JSONArray.parseArray("[{\"Rendering engine\":\"Trident\",\"Browser\":\"Internet Explorer 4.0\",\"Platform(s)\":\"Win 95+\",\"Engine version\":\"4\",\"CSS grade\":\"X\"},{\"Rendering engine\":\"Trident\",\"Browser\":\"Internet Explorer 5.0\",\"Platform(s)\":\"Win 95+\",\"Engine version\":\"5\",\"CSS grade\":\"C\"}]");
        mv.addObject("tabledatas",tabledatas);
        return mv;
    }

    @RequestMapping("/blank")
    public ModelAndView blank(){
        ModelAndView mv = new ModelAndView("blank");
//        mv.addObject("title","Admin");
        return mv;
    }
}
