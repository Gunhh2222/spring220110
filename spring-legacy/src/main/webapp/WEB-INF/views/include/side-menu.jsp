<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.side-menu {
	padding-top: 125px;
}
</style>
<div class="col-lg-2 side-menu">
	<div>
		<table class="table">
			<tbody>
				<tr>
					<th scope="row"><a href="/member/myInfo">내정보 보기</a></th>
				</tr>
				<tr>
					<th scope="row"><a href="/member/modify">내정보 수정</a></th>
				</tr>
				<tr>
					<th scope="row"><a href="/member/passwd">비밀번호 변경</a></th>
				</tr>
				<tr>
					<th scope="row"><a href="/member/remove">회원 탈퇴</a></th>
				</tr>
			</tbody>
		</table>
	</div>
</div>
