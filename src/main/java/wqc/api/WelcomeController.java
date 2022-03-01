package wqc.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @ClassName: WelcomeController
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/27 14:59
 **/
@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public ModelAndView welcome(ModelAndView modelAndView) {
        modelAndView.setViewName("welcome/welcome");
        return modelAndView;
    }
    @PostMapping("/test")
    public Map welcome(@RequestBody Map<String, String> map) {
        System.out.println(map);
        return map;
    }
}
