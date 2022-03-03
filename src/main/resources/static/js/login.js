function changeColor(obj, bool) {
    if (bool) {
        $(obj).css("border", "2px solid #ffc300");
    } else {
        $(obj).css("border", "1px solid #676767");
    }
}
function changeInpBack(type) {
    if (type == "account") {
        $("#login_account_num").css("background-image", "url('../images/account_back_img.png')");
        $("#login_account_num").attr("placeholder", "请输入帐号");
    }
    if (type == "phone") {
        $("#login_account_num").css("background-image", "url('../images/phone_back_img.png')");
        $("#login_account_num").attr("placeholder", "请输入手机号");
    }
    if (type == "mail") {
        $("#login_account_num").css("background-image", "url('../images/mail_back_img.png')");
        $("#login_account_num").attr("placeholder", "请输入邮箱");
    }
}
