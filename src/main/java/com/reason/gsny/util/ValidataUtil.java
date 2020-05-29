package com.reason.gsny.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Created by admin on 2017/2/28.
 */
public class ValidataUtil {
    private static String token = ConfigUtil.getToken();

    public static boolean chechSignature(String signature, String timestamp, String nonce) {
//1.将token，timestamp,nonce三个参数排序
        String[] str = new String[]{token, timestamp, nonce};
        Arrays.sort(str);
//2.将三个参数字符串接成一个字符串
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            buff.append(str[i]);
        }
//3.进行sha1加密
        MessageDigest md = null;
        String result = "";
        try {
            md = MessageDigest.getInstance("SHA-1");
            byte[] date = md.digest(buff.toString().getBytes());
//将字节数组转换成字符串
            result = bytesToStr(date);
            System.out.println("加密后的" + result);
        } catch (NoSuchAlgorithmException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result != null ? (result.equals(signature.toUpperCase())) : false;
    }

    //将直接数组转换成十六进制字符串
    private static String bytesToStr(byte[] byteArray) {
        String strDigest = "";
        for (int i = 0; i < byteArray.length; i++) {
            strDigest += byteToHexStr(byteArray[i]);
        }
        return strDigest;
    }

    //将一个字节转换成16进制字符串
    private static String byteToHexStr(byte mByte) {
        char[] Digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] temp1 = new char[2];
        temp1[0] = Digit[mByte >>> 4 & 0X0F];
        temp1[1] = Digit[mByte & 0X0F];
        String str = new String(temp1);
        return str;
    }
}