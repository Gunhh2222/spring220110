package com.example.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberVO;
import com.example.service.MemberService;
import com.example.utill.JScript;

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
		String id = memberVO.getId();//memberVO안에 있는 id정보를 가지고옴
		
		MemberVO dbMemberVO = memberService.getMemberById(id);
		
		System.out.println("dbMemberVO :" + dbMemberVO);
		
		if (dbMemberVO != null) { //이미 존재하는 아이디
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "text/html; charset=UTF-8");

			String str = JScript.back("아이디가 존재하지 않습니다.");

			return new ResponseEntity<String>(str, headers, HttpStatus.OK);
		}
		// 2. 비밀번호, 비밀번호 확인 서로 같은지 체크
		
		// 3. DB에 등록
		
		// 4. 회원가입완료 메세지를 띄우고, 로그인화면으로 이동
		
		
		return null;
	}
}
