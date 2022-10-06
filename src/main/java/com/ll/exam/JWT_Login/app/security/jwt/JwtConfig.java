package com.ll.exam.JWT_Login.app.security.jwt;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.crypto.SecretKey;
import java.util.Base64;

@Configuration
public class JwtConfig {

    @Value("${custom.jwt.secretKey}")
    private String secretKeyPlain;

    @Bean // 빈이 등록이 된것이다. 한번만 작동된다. @Configuration + @Bean = > 싱글톤이 기본적으로 제공된다.
    public SecretKey jwtSecretKey(){
        String keyBase64Encoded = Base64.getEncoder().encodeToString(secretKeyPlain.getBytes());
        return Keys.hmacShaKeyFor(keyBase64Encoded.getBytes());
    }
}
