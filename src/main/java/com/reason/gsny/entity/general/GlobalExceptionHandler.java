package com.reason.gsny.entity.general;

import com.reason.gsny.util.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

/**
 * @author leon
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**-------- 通用异常处理方法 --------**/
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        // 通用异常结果打印到日志
        log.error(ExceptionUtil.getMessage(e));
        return R.error();
    }

    /**-------- 指定异常处理方法 --------**/
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public R error(NullPointerException e) {
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.NULL_POINT);
    }

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseBody
    public R error(IndexOutOfBoundsException e) {
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.HTTP_CLIENT_ERROR);
    }

    /**-------- 自定义定异常处理方法 --------**/
    @ExceptionHandler(CMSException.class)
    @ResponseBody
    public R error(CMSException e) {
        e.printStackTrace();
        return R.error().message(e.getMessage()).code(e.getCode());
    }
}