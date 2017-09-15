package com.club.web.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtils {

    /**
     * 是否是手机号码
     * @param phoneNo
     * @return
     */
    public static boolean isMobileNO(String phoneNo) {
        Pattern pattern = Pattern.compile("((^1)\\d{10}$)");
        Matcher matcher = pattern.matcher(phoneNo);
        return matcher.matches();
    }

    public static boolean isNotBlank(Object o) {
        if(o != null && !("").equals(o)) {
            return true;
        } else
            return false;
    }

    public static String isNotBlank(String o,String str) {
        if(o != null && !("").equals(o)) {
            return o;
        } else
            return str;
    }
}
