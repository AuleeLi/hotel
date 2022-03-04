package wqc.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import wqc.model.HotelUserModel;
import wqc.services.HotelUserService;
import wqc.services.LoginService;
import wqc.uitl.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: LoginController
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/3/3 10:18
 **/
@Api(tags = "LoginController")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private HotelUserService hotelUserService;
    @Autowired
    private LoginService loginService;

    @ApiOperation("登录页跳转")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nextPage", value = "登陆成功后要跳转的页面", dataType = "String", required = true)
    })
    @GetMapping("/loginHome")
    public ModelAndView loginHome(@RequestParam String nextPage) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("nextPage", nextPage);
        modelAndView.setViewName("login/login");
        return modelAndView;
    }
    @ApiOperation("用户协议跳转")
    @ApiImplicitParams({
    })
    @GetMapping("/agreement")
    public ModelAndView agreement() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login/agreement");
        return modelAndView;
    }
    @ApiOperation("隐私政策跳转")
    @ApiImplicitParams({
    })
    @GetMapping("/policy")
    public ModelAndView policy() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login/policy");
        return modelAndView;
    }
    @GetMapping("/login")
    public Result login(@RequestParam String userAccount, @RequestParam String userPassword) {
        List<HotelUserModel> list = hotelUserService.searchByUserAccount(userAccount);
        Result result = null;
        HotelUserModel hotelUserModel = null;
        if (list == null || list.size() == 0) {
            result = new Result("账号不存在", 0000);
        } else if (list.size() > 1) {
            result = new Result("账号存在多个", 1111);
        } else if (loginService.login(hotelUserModel = list.get(0), userPassword)) {
            result = new Result("登陆成功", 200, hotelUserModel);
        } else {
            result = new Result("密码错误，请重新输入", 2222);
        }
        return result;
    }
}
