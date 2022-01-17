<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="/WEB-INF/views/include/head.jsp" /> <!-- head 파일경로 -->
<style>
#contact {
	padding-top: 300px; 
}
</style>
</head>
<body id="page-top">
	<!-- Navigation-->
	<jsp:include page="/WEB-INF/views/include/nav-bar.jsp" /> <!-- nav-bar 파일경로 -->
	<!-- Contact Section-->
	<section class="page-section" id="contact">
		<div class="container">
			<!-- Contact Section Heading-->
			<h2
				class="page-section-heading text-center text-uppercase text-secondary mb-0">회원가입</h2>
			<!-- Icon Divider-->
			<div class="divider-custom">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Contact Section Form-->
			<div class="row justify-content-center">
				<div class="col-lg-8 col-xl-7">
					<form action="/member/login" method="POST" id="contactForm" data-sb-form-api-token="API_TOKEN">
						<!-- id input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="id" type="text" name="id"
								data-sb-validations="required" />
							<label for="name">아이디</label>
						</div>
						<!-- passwd1 input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="passwd" type="password" name="passwd"
								data-sb-validations="required,email" /> <label for="passwd">비밀번호</label>
						</div>
						<!-- passwd2 input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="passwdConfirm" type="password" name="passwdConfirm"
								data-sb-validations="required,email" /> <label for="passwdConfirm">비밀번호 확인</label>
						</div>
						<!-- Submit Button-->
						<button class="btn btn-primary btn-xl" id="submitButton"
							type="submit">회원가입 하기</button>
							<!-- name input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="name" type="text" name="name"
								data-sb-validations="required" />
							<label for="id">이름</label>
						</div>
							<!-- email input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="email" type="email" name="email"
								data-sb-validations="required" />
							<label for="id">이름</label>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- Footer-->
	<jsp:include page="/WEB-INF/views/include/footer.jsp" /> <!-- footer 파일경로 -->
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="/resources/js/scripts.js"></script>
	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
	<!-- * *                               SB Forms JS                               * *-->
	<!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
	<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>
