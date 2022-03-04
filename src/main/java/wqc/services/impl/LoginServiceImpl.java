package wqc.services.impl;

import org.springframework.stereotype.Service;
import wqc.model.HotelUserModel;
import wqc.services.LoginService;
import wqc.uitl.MD5Utils;
import wqc.uitl.StringUtils;

/**
 * @ClassName: LoginServiceImpl
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/3/4 10:09
 **/
@Service("/LoginService")
public class LoginServiceImpl implements LoginService {

    public Boolean login(HotelUserModel hotelUserModel, String userPassword) {
        if (StringUtils.isEmpty(userPassword)) {
            return false;
        }
//        userPassword = MD5Utils.stringToMD5(userPassword);
        if (userPassword.equals(hotelUserModel.getUserPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
