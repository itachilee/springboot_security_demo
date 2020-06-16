package com.reason.gsny.entity.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * jwt相应实体
 * @author leon
 */
@Getter
@AllArgsConstructor
public class AuthenticationResponse implements Serializable {

    /**
     * jwt令牌
     */
    private final String jwt;

}
