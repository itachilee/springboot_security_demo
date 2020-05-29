package com.reason.gsny.util;

import java.util.ResourceBundle;

/**
 * Created by admin on 2016/12/21.
 */
public class ConfigUtil {
    private static final ResourceBundle resourceBundle = ResourceBundle
            .getBundle("config");

    public static String getAppid(){
        return resourceBundle.getString("appid");
    }

    public static String getSecret(){
        return resourceBundle.getString("secret");
    }

    public static String getToken(){
        return resourceBundle.getString("token");
    }

    public static String getPaymentType(){
        return resourceBundle.getString("paymentType");
    }

    public static String getEncodingAesKey(){
        return resourceBundle.getString("encodingAesKey");
    }

    public static String getMchId(){return resourceBundle.getString("mchid");}

    public static String getValue(String key){
        return resourceBundle.getString(key);
    }


}
