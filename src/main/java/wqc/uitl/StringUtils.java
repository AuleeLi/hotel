package wqc.uitl;

/**
 * @ClassName: StringUtils
 * @Description: 酒店房间管理系统
 * @Author: wqc
 * @Date: 2022/3/4 10:23
 **/
public class StringUtils {
    public static boolean isEmpty(String param) {
        return param == null || param == "" || param.trim() == "";
    }
}
