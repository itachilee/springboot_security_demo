package com.reason.gsny.util;

import java.util.*;

/**
 * Created by admin on 2017/3/2.
 */
public class SignUtil {
    public static String sign(Map<String, String> map, String key) {
//        //排序
//        String sort = sortParameters(map);
//        //拼接API秘钥
//        sort = sort + "&key=" + key;
//        //System.out.println(sort);
//        //MD5加密
//        String sign = MD5.MD5Encode(sort).toUpperCase();
//        return sign;
        StringBuffer sb = new StringBuffer();
        Set es = map.entrySet();
        Iterator it = es.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            String k = (String)entry.getKey();
            Object v = entry.getValue();
            if(null != v && !"".equals(v)
                    && !"sign".equals(k) && !"key".equals(k)) {
                sb.append(k + "=" + v + "&");
            }
        }
        sb.append("key=" + key);//最后加密时添加商户密钥，由于key值放在最后，所以不用添加到SortMap里面去，单独处理，编码方式采用UTF-8
        System.out.println(sb.toString());
        String sign = MD5Util.MD5Encode(sb.toString(), "UTF-8").toUpperCase();
        return sign;
    }

    /**
     * 对参数列表进行排序，并拼接key=value&key=value形式
     *
     * @param map
     * @return
     */
    private static String sortParameters(Map<String, String> map) {
        Set<String> keys = map.keySet();
        List<String> paramsBuf = new ArrayList<String>();
        for (String k : keys) {
            paramsBuf.add((k + "=" + getParamString(map, k)));
        }
        // 对参数排序
        Collections.sort(paramsBuf);
        String result = "";
        int count = paramsBuf.size();
        for (int i = 0; i < count; i++) {
            if (i < (count - 1)) {
                result += paramsBuf.get(i) + "&";
            } else {
                result += paramsBuf.get(i);
            }
        }
        return result;
    }

    /**
     * 返回key的值
     *
     * @param map
     * @param key
     * @return
     */
    private static String getParamString(Map map, String key) {
        String buf = "";
        if (map.get(key) instanceof String[]) {
            buf = ((String[]) map.get(key))[0];
        } else {
            buf = (String) map.get(key);
        }
        return buf;
    }

    /**
     * 字符串列表从大到小排序
     *
     * @param data
     * @return
     */
    private static List<String> sort(List<String> data) {
        Collections.sort(data, new Comparator<String>() {
            public int compare(String obj1, String obj2) {
                return obj1.compareTo(obj2);
            }
        });
        return data;
    }

    public static void main(String[] args) throws IllegalAccessException {
        String appid = ConfigUtil.getAppid();
        String mch_id = ConfigUtil.getMchId();
        String nonce_str = "077oox21lg76zm3j";//生成随机数，可直接用系统提供的方法
        String body = "E光学-商品订单";
        String out_trade_no = "20170303020229";
        String total_fee = "1";
        String spbill_create_ip = "10.22.38.47";//用户端ip,这里随意输入的
        String notify_url = "paymentController.do?payResult";//支付回调地址
        String trade_type = "JSAPI";
        String openid = "owqLTwu7_WNfqlZjI7Qp2lb0hfjY";

        SortedMap<String, String> map = new TreeMap<String, String>();
        map.put("appid", appid);
        map.put("mch_id", mch_id);
        map.put("attach", "支付测试");
        map.put("device_info", "WEB");
        map.put("nonce_str", nonce_str);
        map.put("body", body);
        map.put("out_trade_no", out_trade_no);
        map.put("total_fee", total_fee);
        map.put("spbill_create_ip", spbill_create_ip);
        map.put("trade_type", trade_type);
        map.put("notify_url", notify_url);
        map.put("openid", openid);
       // Configure.setKey(ConfigUtil.getEncodingAesKey());
        String sign = SignUtil.sign(map, ConfigUtil.getEncodingAesKey());
        //String sign1 = Signature.getSign(map);//参数加密
        System.out.println("sign秘钥:-----------" + sign);
//        System.out.println("sign秘钥:-----------" + sign1);
        System.out.println(UUID.randomUUID());
    }
}
