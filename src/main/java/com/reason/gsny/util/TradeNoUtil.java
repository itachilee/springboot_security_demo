package com.reason.gsny.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2016/12/22.
 */
public class TradeNoUtil {
    //日期流水+客户id
    public static String createNo(String payType, String custId){
        //---------------生成订单号 开始------------------------
        //当前时间 yyyyMMddHHmmss
        DateFormat dateTimeformat = new SimpleDateFormat("yyyyMMddhhmmss");
        String currTime = dateTimeformat.format(new Date());
        //四位随机数
        String strRandom = "";
        //10位序列号,可以自行调整。
        String strReq = currTime + strRandom;
        //订单号，此处用时间加随机数生成，商户根据自己情况调整，只要保持全局唯一就行
        String out_trade_no = strReq;
        //---------------生成订单号 结束------------------------
        return payType+strReq;

    }


}
