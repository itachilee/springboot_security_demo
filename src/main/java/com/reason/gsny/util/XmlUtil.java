package com.reason.gsny.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/3/3.
 */
public class XmlUtil {
    private static final String HEAD = "head";
    private static final String BODY = "body";

    public static String MapToXml(Map<String, String> arr) {
        String xml = "<xml>";
        Iterator<Map.Entry<String, String>> iter = arr.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            String key = entry.getKey();
            String val = entry.getValue();
            if (IsNumeric(val)) {
                xml += "<" + key + ">" + val + "</" + key + ">";
            } else
                xml += "<" + key + ">" + val + "</" + key + ">";
        }
        xml += "</xml>";
        return xml;
    }
    private static boolean IsNumeric(String str) {
        if (str.matches("\\d *")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws DocumentException {
       String xml = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg><appid><![CDATA[wx00b3a30242ea27f1]]></appid><mch_id><![CDATA[1444971602]]></mch_id><device_info><![CDATA[WEB]]></device_info><nonce_str><![CDATA[9xUWHIOpTtyKhXvL]]></nonce_str><sign><![CDATA[82160CEAB1C95F36252DA55A118B9DC8]]></sign><result_code><![CDATA[SUCCESS]]></result_code><prepay_id><![CDATA[wx20170303145745bee4192d4e0501632252]]></prepay_id><trade_type><![CDATA[JSAPI]]></trade_type></xml>";
        Map<String, String> map = readStringXmlOut(xml);
        System.out.println(map.get("prepay_id"));
    }
    public static Map<String, String> readStringXmlOut(String xml) {
        Map<String, String> map = new HashMap<String, String>();
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML
            Element rootElt = doc.getRootElement(); // 获取根节点
            List<Element> list = rootElt.elements();//获取根节点下所有节点
            for (Element element : list) {  //遍历节点
                map.put(element.getName(), element.getText()); //节点的name为map的key，text为map的value
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
