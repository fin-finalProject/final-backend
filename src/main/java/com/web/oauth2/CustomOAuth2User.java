package com.web.oauth2;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;

import com.web.domain.Role;

import lombok.Getter;

@Getter
public class CustomOAuth2User extends DefaultOAuth2User {

    private String email;
    private Role role;
    private Long memberNum;


    public CustomOAuth2User(Collection<? extends GrantedAuthority> authorities,
                            Map<String, Object> attributes, String nameAttributeKey,
                            String email, Role role, Long memberNum) {
        super(authorities, attributes, nameAttributeKey);
        this.email = email;
        this.role = role;
        this.memberNum = memberNum;
    }
}