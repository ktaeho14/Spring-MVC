<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
			<colgroup>
				<col width="50">
				<col width="100">
				<col width="300">
				<col width="100">
				<col width="200">
				
			</colgroup>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>제목</th>
				<th>내용</th>
				<th>날짜</th>
			</tr>
			<c:choose>
				<c:when test="${empty list }">
					<tr>
						<td colspan="5" align="center">----작성된 게시글이 없습니다----</td>
					</tr>
				</c:when>
				
				<c:otherwise>
					<c:forEach items="${list }" var="dto">
						<tr>
							<td>${dto.spNo }</td>
							<td>${dto.spName }</td>
							<td><a href="selectOne.do?spNo=${dto.spNo}">${dto.spTitle }</a></td>
							<td>${dto.spContent }</td>
							<td>${dto.spDate }</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			<tr>
				<td colspan="5" align="right">
					<input type="button" value="글 작성" onclick="location.href='insertForm.do'">
				</td>
			</tr>
		
		</table>
</body>
</html>