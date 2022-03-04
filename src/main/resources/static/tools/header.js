$(function () {
});
/**
 * @Description: ajax请求后端通用函数
 * @param rurl: 请求地址
 * @param onCompleteFun: 请求成功回调函数
 * @param onFailureFun: 请求失败回调函数
 * @param params: 请求参数 Json对象，例如{"orderId":"","orderName":"ss"}
 * @param asynFlag: 异步标志,true or false,缺省为true异步执行
 * @Author: wqc
 * @Date: 2022/2/27 20:12
 */
function ajaxJsonRequest(rurl, onCompleteFun, onFailureFun, params, asynFlag) {
    var extra = null;
    if(params && typeof params.extra == "object"){
        extra = params.extra;
        delete params.extra;
    }
    $.ajax({
        async: asynFlag !== false,
        type: "POST",
        url: rurl,
        contentType: "application/json;charset=UTF-8",
        data: JSON.stringify(params || {}),
        dataType: 'json',
        beforeSend: function (xhr) {
            xhr.setRequestHeader("__REQUEST_TYPE", "AJAX_REQUEST");
        },
        success: function(data){
            if( typeof onCompleteFun == 'function'){
                onCompleteFun(data, extra);
            }else{
                var fuc = eval(onCompleteFun || "defaultSuccessCallBack");// 成功回调事件不存在时，调用默认的方法名
                // 参数中 extra 属性如果是对象格式，则会作为成功回调的第二个参数传入
                fuc(data, extra);
            }
        },
        error: function (data) {
            if (data.status == 998) {
                alert(data.responseText);
            } else {
                var fuc = eval(onFailureFun || "defaultFailureCallBack");
                fuc(data);
            }
        }
    });
}
function ajaxRequestGet(rurl, onCompleteFun, onFailureFun, params, asynFlag) {
    var async = true;
    var param = "";
    if (params != undefined) {
        param = params;
    }
    if (asynFlag != undefined) {
        if ((asynFlag == false) || (asynFlag == "false")) {
            async = false;
        }
        else {
            async = true;
        }
    }
    // onCompleteFun == undefined || onCompleteFun == null || onCompleteFun == "null" || onCompleteFun.isEmpty()
    if (isEmpty(onCompleteFun)) {
        onCompleteFun = "defaultSuccessCallBack";//使用缺省function
    }
    // onFailureFun == undefined || onFailureFun == null || onFailureFun == "null" || onFailureFun.isEmpty()
    if (isEmpty(onFailureFun)) {
        onFailureFun = "defaultFailureCallBack";//使用缺省function
    }
    jQuery.ajax
    ({
        async: async,
        type: "GET",
        url: rurl,
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        data: param,
        cache:false,
        dataType: 'json',
        beforeSend: function (xhr) {
            xhr.setRequestHeader("__REQUEST_TYPE", "AJAX_REQUEST");
        },
        success: eval(onCompleteFun),
        error: eval(onFailureFun)
    });
}

/**
 * AJAX请求调用的函数,该函数可以把form内部的所有可提交变量全部提交到后台
 * @param url ajax请求的url
 * @param onCompleteFun ajax请求完成之后调用的函数名称
 * @param onFailureFun ajax请求失败调用的函数
 * @param form ajax请求form表单对象
 * @param asynFlag 异步标志,true or false,缺省为true异步执行
 * @Author: wqc
 * @Date: 2022/2/27 20:22
 */

function ajaxFormRequest(rurl, onCompleteFun, onFailureFun, form, asynFlag) {
    var async = true;
    var param = "";
    var queryStr = getQueryStrFomForm(form);
    if (queryStr != undefined) {
        param = queryStr;
    }
    if (asynFlag != undefined) {
        if ((asynFlag == false) || (asynFlag == "false")) {
            async = false;
        }
        else {
            async = true;
        }
    }
    // onCompleteFun == undefined || onCompleteFun == null || onCompleteFun == "null" || onCompleteFun.isEmpty()
    if (isEmpty(onCompleteFun)) {
        onCompleteFun = "defaultSuccessCallBack";//使用缺省function
    }
    // onFailureFun == undefined || onFailureFun == null || onFailureFun == "null" || onFailureFun.isEmpty()
    if (isEmpty(onFailureFun)) {
        onFailureFun = "defaultFailureCallBack";//使用缺省function
    }
    $.ajax({
        async: async,
        type: "POST",
        url: rurl,
        data: param,
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        dataType: 'json',
        beforeSend: function (xhr) {
            xhr.setRequestHeader("__REQUEST_TYPE", "AJAX_REQUEST");
        },
        success: eval(onCompleteFun),
        error: eval(onFailureFun)
    });
}

/**
 * AJAX请求调用的函数,该函数可以把form内部的所有可提交变量全部提交到后台
 * @param url ajax请求的url
 * @param onCompleteFun ajax请求完成之后调用的函数名称
 * @param onFailureFun ajax请求失败调用的函数
 * @param form form表单对象名称
 * @param asynFlag 异步标志,true or false,缺省为true异步执行
 * @return 无返回值
 */
function ajaxFormFileRequest(rurl, onCompleteFun, onFailureFun, form, asynFlag) {
    var async = true;
    var param = new FormData(document.getElementById(form));
    if (asynFlag != undefined) {
        if ((asynFlag == false) || (asynFlag == "false")) {
            async = false;
        }
        else {
            async = true;
        }
    }
    // onCompleteFun == undefined || onCompleteFun == null || onCompleteFun == "null" || onCompleteFun.isEmpty()
    if (isEmpty(onCompleteFun)) {
        onCompleteFun = "defaultSuccessCallBack";//使用缺省function
    }
    // onFailureFun == undefined || onFailureFun == null || onFailureFun == "null" || onFailureFun.isEmpty()
    if (isEmpty(onFailureFun)) {
        onFailureFun = "defaultFailureCallBack";//使用缺省function
    }

    $.ajax
    ({
        async: async,
        type: "POST",
        url: rurl,
        data: param,
        cache: false,
        processData: false,
        contentType: false,
        dataType: 'json',
        beforeSend: function (xhr) {
            xhr.setRequestHeader("__REQUEST_TYPE", "AJAX_REQUEST");
        },
        success: eval(onCompleteFun),
        error: eval(onFailureFun)
    });
}

/**
 * 从form中取得请求的字符串（会枚举form中的所有可传入后台的对象）
 * @param fm form对象
 * @return 请求的字符串
 */
function getQueryStrFomForm(fm) {
    var tp = fm.elements;
    var str = "";
    var names = "";

    var etype;
    for (var i = 0; i < tp.length; i++) {
        etype = tp[i].type;
        if ("text".equalsIgnoreCase(etype) || "hidden".equalsIgnoreCase(etype) || "textarea".equalsIgnoreCase(etype) ||
            "select-one".equalsIgnoreCase(etype) || "select-multiple".equalsIgnoreCase(etype) || "password".equalsIgnoreCase(etype)) {
            if (tp[i].name != "") {
                // this process is not sb, because on the background logic process use ','
                if ("select-multiple".equalsIgnoreCase(etype)) {
                    var selectedValues = [];
                    $(tp[i]).find(':selected').each(function () {
                        str = str + "&" + tp[i].name + "=" + $(this).val();
                    });
                } else {
                    str = str + "&" + tp[i].name + "=" + tp[i].value.toUrlString();
                }

            }
        }
        else if (("checkbox".equalsIgnoreCase(etype) || "radio".equalsIgnoreCase(etype)) && tp[i].checked) {

            if (tp[i].name != "") {
                str = str + "&" + tp[i].name + "=" + tp[i].value.toUrlString();
            }
        }
    }
    if (str != "") {
        str = str.substring(1, str.length);
    }
    return str;
}


/**
 * 字符串不区分大小写的比较
 * @param arg 要比较的字符串
 * @return boolean 如果相同返回true，否则返回false
 */
String.prototype.equalsIgnoreCase = function (arg) {
    return (new String(this.toLowerCase()) == (new String(arg)).toLowerCase());
};

/**
 * 判断字符串是否是空字符串
 * @return 如果是空字符串，返回true，否则返回false
 */
String.prototype.isEmpty = function () {
    var tp = this.trim();
    if (tp == "" || tp == null || "undefined" == typeof(tp))
        return true;
    else
        return false;
}
function isEmpty(param) {
    if (param == undefined || param == null || param == "null" || typeof(param) == "undefined" || param.trim() == "") {
        return true;
    } else {
        return false;
    }
}
/**
 * @Description: ajax调用缺省的操作成功回调function
 *
 * @Author: wqc
 * @Date: 2022/2/27 20:27
 */
function defaultSuccessCallBack(data) {
}

//ajax调用缺省的失败回调function
function defaultFailureCallBack() {
    alert("系统发生异常");
}