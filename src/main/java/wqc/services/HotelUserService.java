package wqc.services;

import wqc.model.HotelUserModel;
import wqc.model.OrderModel;

import java.util.List;

/**
 * @ClassName: HotelUserService
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:10
 **/
public interface HotelUserService {
    List<HotelUserModel> searchByUserAccount(String userAccount);

    int saveUserAccount(HotelUserModel model);

    int updateUserAccount(HotelUserModel model);

    int deleteUserAccount(Long userId);
}
