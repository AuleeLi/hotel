package wqc.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wqc.model.HotelUserModel;
import wqc.model.OrderModel;
import wqc.services.HotelUserService;
import wqc.services.OrderService;
import wqc.uitl.Result;

import java.util.List;

/**
 * @ClassName: HotelUserController
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:10
 **/
@Api(tags = "HotelUserController")
@RestController
@RequestMapping("/hotelUser")
public class HotelUserController {
    @Autowired
    private HotelUserService hotelUserService;

    @ApiOperation("登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userAccount", value = "用户账号", dataType = "String", required = true),
            @ApiImplicitParam(name = "userPassword", value = "用户密码", dataType = "String", required = true)
    })
    @GetMapping("/searchByUserAccount")
    public String searchByUserAccount(@RequestParam String userAccount, @RequestParam String userPassword) {

        List<HotelUserModel> hotelUserModel = hotelUserService.searchByUserAccount(userAccount);
        if (hotelUserModel.size() == 0) {
            return "账号不存在";
        } else if (hotelUserModel.size() > 1) {
            return "账号存在多个";
        } else {
            return "success";
        }
    }

    @ApiOperation("注册")
    @PostMapping("/saveUserAccount")
    public Result saveUserAccount(@RequestBody  HotelUserModel hotelUserModel) {
        int i = hotelUserService.saveUserAccount(hotelUserModel);
        if (i > 0) {
            return new Result("注册成功", 200);
        } else {
            return new Result("注册失败", 500);
        }
    }

    @ApiOperation("修改")
    @PutMapping("/updateUserAccount")
    public Result updateUserAccount(@RequestBody HotelUserModel hotelUserModel) {
        int i = hotelUserService.updateUserAccount(hotelUserModel);
        if (i > 0) {
            return new Result("更新成功", 200);
        } else {
            return new Result("更新失败", 500);
        }
    }

    @ApiOperation("删除")
    @DeleteMapping("/deleteUserAccount")
    public Result deleteUserAccount(@RequestParam Long userId) {
        int i = hotelUserService.deleteUserAccount(userId);
        if (i > 0) {
            return new Result("删除成功", 200);
        } else {
            return new Result("删除失败", 500);
        }
    }
}
