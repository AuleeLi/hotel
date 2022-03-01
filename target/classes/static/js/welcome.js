$(function () {
    ajaxJsonRequest(basePath + "test", "success", null, {"orderId" : "123"});
});
function success(data) {
    alert(data.orderId);
}