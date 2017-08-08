package action;

import dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 用户接口
 * */
@Controller("userAction")
@RequestMapping("/user")
public class UserAction {

    @Resource
    UserDao userDao;

    @RequestMapping("/signup")
    @ResponseBody
    public String signUp(){
        return "signup";
    }

    @RequestMapping("/signin")
    @ResponseBody
    public String signIn(){
        return "signin";
    }
    @RequestMapping("/signout")
    @ResponseBody
    public String signOut(){
        return "signout";
    }
}
