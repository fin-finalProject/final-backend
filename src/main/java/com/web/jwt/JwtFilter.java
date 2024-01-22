package com.web.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.web.domain.MemberEntity;
import com.web.dto.CustomUserDetails;

public class JwtFilter extends OncePerRequestFilter {

    private final JWTUtil jwtUtil;

    public JwtFilter(JWTUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		//request에서 Authorization 헤더 찾기
		String authorization= request.getHeader("Authorization");
		System.out.println(authorization+" Authorization");
		//Authorization 헤더 검증
        if (authorization == null || !authorization.startsWith("Bearer ")) {

            System.out.println("token null");
            filterChain.doFilter(request, response);
						
            //조건이 해당되면 메소드 종료 (필수)
            return;
        }		
        
        System.out.println("authorization now");
        //Bearer 부분 제거 후 순수 토큰만 획득
        String token = authorization.split(" ")[1];
        
		//토큰 소멸 시간 검증
        if (jwtUtil.isExpired(token)) {

            System.out.println("token expired");
            filterChain.doFilter(request, response);

            //조건이 해당되면 메소드 종료 (필수)
            return;
        }
        
		//토큰에서 username과 role 획득
        String username = jwtUtil.getUsername(token);
        String role = jwtUtil.getRole(token);
				

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUsername(username);
        memberEntity.setPassword("temppassword");
        memberEntity.setRole(role);
        
		//UserDetails에 회원 정보 객체 담기
        CustomUserDetails customUserDetails = new CustomUserDetails(memberEntity);

        //스프링 시큐리티 인증 토큰 생성
        Authentication authToken = new UsernamePasswordAuthenticationToken(customUserDetails, null, customUserDetails.getAuthorities());
        //세션에 사용자 등록
        SecurityContextHolder.getContext().setAuthentication(authToken);

        filterChain.doFilter(request, response);       
	}

}
