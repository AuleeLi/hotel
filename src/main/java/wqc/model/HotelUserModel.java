package wqc.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @ClassName: HotelUserModel
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/2/28 21:15
 **/
@Data
public class HotelUserModel implements Serializable {
    private Long userId;
    private String userName;
    private String userAccount;
    private Long userPhoneNum;
    private String userMail;
    private String userCardNum;
    private String userPassword;
    private LocalDate createDate;
    private LocalDate updateDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Long getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(Long userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserCardNum() {
        return userCardNum;
    }

    public void setUserCardNum(String userCardNum) {
        this.userCardNum = userCardNum;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
