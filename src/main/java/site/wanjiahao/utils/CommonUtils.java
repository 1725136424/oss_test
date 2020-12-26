package site.wanjiahao.utils;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class CommonUtils {

    public static Map<String, Object> parseUrl(String urlParams) {
        HashMap<String, Object> map = new HashMap<>();
        String[] params = urlParams.split("&");
        for (String param : params) {
            String[] parseMap = param.split("=");
            if (parseMap.length == 1) {
                map.put(parseMap[0], "");
            } else {
                map.put(parseMap[0], parseMap[1].replace("%", "/"));
            }

        }
        return map;
    }

    public static String getURLEncoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String URLDecoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            // 加号decode会变成空格 所以直接把加号编码为%2B
            str = str.replaceAll("\\+", "%2B");
            result = java.net.URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

}
