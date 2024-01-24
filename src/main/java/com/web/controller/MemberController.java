package com.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.web.domain.MemberEntity;
import com.web.dto.JoinDTO;
import com.web.jwt.JWTUtil;
import com.web.service.MemberService;

@RestController
public class MemberController {
	// 회원정보 서비스
	@Autowired
	private MemberService memberService;
	// 토큰을 사용하여 회원정보 불러오기 위해 선언
	private final JWTUtil jwtUtil;
    public MemberController(JWTUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
	
	// 아이디 중복확인
	@PostMapping("/checkId")
	public String checkId(@RequestBody JoinDTO joinDTO) {
		String res = memberService.checkId(joinDTO.getUsername());
		return res;
	}
	// 회원가입
	@PostMapping("/join")
	public String join(@RequestBody JoinDTO joinDTO) {
		String res = memberService.join(joinDTO);
		return res;
	}
	
	// 필요할 때 토큰 넘겨서 username(아이디)로 멤버 정보 불러오기
	@PostMapping("/getIdRole")
    public Map<String, Object> getCurrentMember(@RequestHeader(name = HttpHeaders.AUTHORIZATION, required = false) String token) {
		Map<String, Object> map = new HashMap<>();
        if (token != null && token.startsWith("Bearer ")) {
            String jwtToken = token.substring(7);
            
            // 토큰을 이용해 사용자 정보 추출
            // 권한만 확인
            String role = jwtUtil.getRole(jwtToken);
            map.put("Role", role);
            
            // 아이디로 멤버 정보 전체 반환
            String username = jwtUtil.getUsername(jwtToken);
            MemberEntity member = memberService.getMemberInfo(username);
            if(member != null) {
            	map.put("result", "Success");
            	map.put("member", member);
            } else {
            	map.put("result", "failure");
            }
        }
        return map;
    }
}
