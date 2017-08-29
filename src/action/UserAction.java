package action;

import dao.UserDao;
import model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 用户接口
 **/
@Controller("user")
@RequestMapping("/user")
public class UserAction {

    @Resource
    private UserDao userDao;

    @RequestMapping("/signup")
    @ResponseBody
    public String signUp(
            @RequestParam(value = "mobile",required = true) String mobile,
            @RequestParam(value = "password",required = true)String password,
            @RequestParam(value = "userFrom",required = false,defaultValue = "0")int userFrom){
        UserModel user = new UserModel();
        user.setMobile(mobile);
        user.setPassword(password);
        user.setUserFrom(userFrom);
        userDao.save(user);
        return "success";
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
