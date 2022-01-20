package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.MemberVO;
import com.example.mapper.MemberMapper;


@Service 	
// 여기가 서비스 부분이라고 알려주기 위해
// 이노테이션을 달고 서비스 임포트 시켜주고 
// 이노테이션 service를 작성해야 MemberController에서 사용가능
@Transactional 
// 트랜잭셔널을 철수와 영희(철수와 영희가 서로 돈을 주고 받는데 철수는 돈을 보냈는데 영희가 돈을 못 받으면 작동하지 않도록 해준다.)

public class MemberService {

	private MemberMapper memberMapper;

	
	
	public MemberService(MemberMapper memberMapper) {
		super();
		this.memberMapper = memberMapper;
	}



	public MemberVO getMemberById(String id) {
		return memberMapper.getMemberById(id);
	}
		
	
	
	
}
