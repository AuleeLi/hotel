package wqc.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
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
    @ApiOperation("登录页跳转")
    @ApiImplicitParams({
    })
    @GetMapping("/loginHome")
    public ModelAndView loginHome() {
        ModelAndView modelAndView = new ModelAndView();
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
}
