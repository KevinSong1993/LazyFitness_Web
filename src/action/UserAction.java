package action;

import dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 用户接口
 **/
@Controller("userAction")
@RequestMapping("/user")
public class UserAction {

    @Resource
    UserDao userDao;

    @RequestMapping("/signup")
    public ModelAndView signUp(){
        ModelAndView mv = new ModelAndView("header");
        mv.addObject("title","miaomiao");
        return mv;
    }
//
//    @RequestMapping("/signin")
//    @ResponseBody
//    public String signIn(){
//        return "signin";
//    }
//
//    @RequestMapping("/signout")
//    @ResponseBody
//    public String signOut(){
//        return "signout";
//    }
}
