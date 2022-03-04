/**
 * @Description: 文本框获取焦点及失去焦点事件
 *
 * @Author: wqc
 * @Date: 2022/3/4 15:23
 */
function changeColor(obj, bool) {
    if (bool) {
        $(obj).css("border", "2px solid #ffc300");
    } else {
        $(obj).css("border", "1px solid #676767");
    }
}
/**
 * @Description: 修改帐号文本框样式及提示内容
 *
 * @Author: wqc
 * @Date: 2022/3/4 15:23
 */
function changeInpBack(type) {
    if (type == "account") {
        $("#login_account_num").css("background-image", "url('../images/account_back_img.png')");
        $("#login_account_num").attr("placeholder", "请输入帐号");
        $("#tips_account").html("请输入帐号");
    }
    if (type == "phone") {
        $("#login_account_num").css("background-image", "url('../images/phone_back_img.png')");
        $("#login_account_num").attr("placeholder", "请输入手机号");
        $("#tips_account").html("请输入手机号");
    }
    if (type == "mail") {
        $("#login_account_num").css("background-image", "url('../images/mail_back_img.png')");
        $("#login_account_num").attr("placeholder", "请输入邮箱");
        $("#tips_account").html("请输入邮箱");
    }
}
/**
 * @Description: 登录按钮点击
 *
 * @Author: wqc
 * @Date: 2022/3/4 15:22
 */
function login() {
    var userAccount = $("#login_account_num").val();
    var userPassword = $("#login_password").val();
    if (isEmpty(userAccount)) {
        $("#login_account_num").val("");
        $("#login_account_num").css("border", "2px solid red");
        $("#tips_account").css("display", "inline-block");
    }
    if (isEmpty(userPassword)) {
        $("#login_password").val("");
        $("#login_password").css("border", "2px solid red");
        $("#tips_psd").css("display", "inline-block");
    }
    if (isEmpty(userAccount) || isEmpty(userPassword)) {
        return;
    }
    if (!$("#agreement_check").prop('checked')) {
        setAnimation();
        return;
    }
    var params = "userAccount=" + userAccount
        + "&userPassword=" + userPassword;
    ajaxRequestGet(basePath + "login/login", "loginSuccess", null, params);
}
/**
 * @Description: 登陆成功回调函数
 *
 * @Author: wqc
 * @Date: 2022/3/4 15:22
 */
function loginSuccess(data) {
    console.log(data);
    if ($("#nextPage").val() == "welcome") {
        window.location.href = basePath + "welcome";
    }
}
/**
 * @Description: 协议文字闪烁效果
 *
 * @Author: wqc
 * @Date: 2022/3/4 15:22
 */
function setAnimation() {
    var time = 0;
    times = setInterval(function () {
        $(".agreement").css("color",(time % 3 == 1 ? "#ffc300" : time % 3 == 2 ? "#ff020a" : "#6c6c6c"));
        time++;
        if (time > 15) {
            clearInterval(times);
        }
    }, 128);
}