package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.domain.Member;
import com.web.jwt.JWTUtil;
import com.web.repository.MemberRepository;

@Service
public class TokenService {

	@Autowired
	MemberRepository mRepo;

	private final JWTUtil jwtUtil;

	public TokenService(JWTUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
	}

	public boolean existMember(String token) {
		if (token != null && token.startsWith("Bearer ")) {
			return true;
		} else {
			return false;
		}
	}

//	public Member getMember(String token) {
//		String jwtToken = token.substring(7);
//
//		String email = jwtUtil.getEmail(jwtToken);
//		Member member = mRepo.findByEmail(email);
//
//		return member;
//	}
	
	public Member getMemberByMemberNum(String token) {
		String jwtToken = token.substring(7);
		Long memberNum = jwtUtil.getMemberNum(jwtToken).get();
		Member member = mRepo.findById(memberNum).get();
		return member;
	}
	
	public Long getMemberNum(String token) {
		String jwtToken = token.substring(7);
		Long memberNum = jwtUtil.getMemberNum(jwtToken).get();
		return memberNum;
	}

}
