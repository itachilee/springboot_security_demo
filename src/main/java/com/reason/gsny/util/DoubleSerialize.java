package com.reason.gsny.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * json注解
 * 对需要格式化double类型的属性进行格式化
 * 返回两位小数
 *
 * @author leon
 */
public class DoubleSerialize extends JsonSerializer<Double> {

    private DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException, JsonProcessingException {
        if (value != null) {
            //显示几位修改几
            df.setMaximumFractionDigits(2);
            df.setGroupingSize(0);
            df.setRoundingMode(RoundingMode.FLOOR);
            //根据实际情况选择使用

            // 返回出去是字符串
            // gen.writeString(df.format(value));

            // 返回出去是数字形式
            gen.writeNumber(df.format(value));
        }
    }
}