package com.hb.jwtre.config.jwt;

public interface JwtProperties {
    String SECRET = "HB";
    int EXPIRATION_TIME = 60000*10;
    String TOKEN_PREFIX = "Bearer ";
    String HEADER_STRING = "Authorization";
}
