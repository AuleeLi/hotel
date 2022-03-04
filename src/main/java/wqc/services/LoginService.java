package wqc.services;

import wqc.model.HotelUserModel;

import java.security.NoSuchAlgorithmException;

/**
 * @ClassName: LoginService
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/3/4 10:08
 **/
public interface LoginService {
    Boolean login(HotelUserModel hotelUserModel, String userPassword);
}
