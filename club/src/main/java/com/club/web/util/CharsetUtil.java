package com.club.web.util;

import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;

/**
 * @author sgx
 */
public class CharsetUtil {
    private static final Logger LOG = Logger.getLogger(CharsetUtil.class);
    public static final String ISO_8859_1 = "iso-8859-1";
    public static final String UTF_8 = "UTF-8";

    private static String changeCharset(String str, String oldCharset,
            String newCharset) {
        if(str != null) {
            try {
                return new String(str.getBytes(oldCharset), newCharset);
            } catch(UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                LOG.error("未知错误", e);
            }
        }
        return null;
    }

    public static String iso_8859_1ToUTF_8(String str) {
        return changeCharset(str, ISO_8859_1, UTF_8);
    }
}
