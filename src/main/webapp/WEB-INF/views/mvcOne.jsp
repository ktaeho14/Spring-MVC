<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			
			<tr>
				<td>${list2.spNo }</td>
				<td>${list2.spName }</td>
				<td>${list2.spTitle }</td>
				<td>${list2.spContent }</td>
				<td>${list2.spDate }</td>
			</tr>
			
			<tr>
				<td colspan="5" align="right"><input type="button" value="목록" onclick="location.href='list.do'"></td>
			</tr>
			<tr>
				<td colspan="5" align="right"><input type="button" value="글 수정" onclick="location.href='updateForm.do?spNo=${list2.spNo}'"></td>
			</tr>
			<tr>
				<td colspan="5" align="right"><input type="button" value="글 삭제" onclick="location.href='delete.do?spNo=${list2.spNo }'"></td>
			</tr>
		</table>
</body>
</html>