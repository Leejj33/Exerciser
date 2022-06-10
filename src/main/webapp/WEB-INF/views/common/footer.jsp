<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <footer>
        <p>
            Copyright &copy; KH Information Educational Institute A-Class Group4 UndongIn
        </p>
        <article class="footer-div">
            <a href="#">프로젝트 소개</a>
            <span> | </span>
            <a href="#">이용약관</a>
            <span> | </span>
            <a href="#">개인정보처리방침</a>
            <span> | </span>
            <a href="#">고객센터</a>
        </article>
    </footer>
	<c:if test="${ !empty sessionScope.message }">
    	<script>	
			alert(${message});
    	</script>
	    <c:remove var="message" scope="session"/>
	</c:if>
        
    <a href=#top>
        <div id="page-top"><img src="${contextPath}/resources/images/Up-Arrow-PNG-Clipart.png" alt="" class="page-top">
        </div>
    </a>