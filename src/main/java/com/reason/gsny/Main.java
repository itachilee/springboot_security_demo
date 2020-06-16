package com.reason.gsny;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.reason.gsny.entity.SysUser;
import com.reason.gsny.repository.impl.SimpleJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;
import java.util.Optional;

/**
 * @date 2020/6/12
 * @author leon
 */
@SpringBootApplication
// 开启swagger api文档
@EnableSwagger2
// 排除更新值为null的字段
@EnableJpaRepositories( value = "com.reason.gsny.repository",repositoryBaseClass = SimpleJpaRepositoryImpl.class)
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    @Component
    public  class AuditorAwareSecurityImpl implements AuditorAware<Long> {
        @Override
        public Optional<Long> getCurrentAuditor() {
            try {
                Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
                SysUser customer = (SysUser) authentication.getPrincipal();
                return Optional.of(customer.getId());
            } catch (ClassCastException e) {
                return  Optional.empty();
            }

        }
    }

}