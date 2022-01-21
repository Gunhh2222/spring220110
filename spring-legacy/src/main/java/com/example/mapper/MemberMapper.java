package com.example.mapper;

import com.example.domain.MemberVO;

public interface MemberMapper { // interface는 추상화를 시켜 설계도를 만드는 것

	// =============== select =================
	
	MemberVO getMemberById(String id);

	void insertMember(MemberVO memberVO);
	
	// =============== insert =================
	
	
	// =============== update =================
	
	
	// =============== delete =================

}
