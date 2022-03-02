$(function () {
    ajaxJsonRequest(basePath + "test", "success", null, {"orderId" : "123"});
});
function success(data) {
    // alert(data.orderId);
    $("#hotel_address").html("中山区长江路228号宏孚国际大厦1楼");
    $("#big_img").attr("src", basePath + "images/test.png");
}