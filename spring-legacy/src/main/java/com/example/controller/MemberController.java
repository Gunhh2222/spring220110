package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberVO;
import com.example.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}

	@GetMapping("/login")
	public String loginForm() {
		System.out.println("loginForm() 호출됨...");
		return "member/login";
	}
	
	@GetMapping("/join")
	public String joinForm() {
		System.out.println("joinForm() 호출됨...");
		return "member/join";
	}
	
	@PostMapping("/join")
	public ResponseEntity<String> join(MemberVO memberVO){
		
		System.out.println("memberVO" + memberVO);
		
		// 1. 아이디 중복체크(DB에 있는지 확인)
		String id = memberVO.getId();
		
		
		// 2. 비밀번호, 비밀번호 확인 서로 같은지 체크
		
		// 3. DB에 등록
		
		// 4. 회원가입완료 메세지를 띄우고, 로그인화면으로 이동
		
		
		return null;
	}
}
