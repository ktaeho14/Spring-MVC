<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<p>글 작성</p>
		
		<form action="insert.do">
			<table border="1">
				<tr>
					<th>이름</th>
					<td><input type="text" name="spName"></td>
				</tr>
				<tr>
					<th>글 제목</th>
					<td><input type="text" name="spTitle"></td>
				</tr>
				<tr>
					<th>글 내용</th>
					<td><textarea cols="60" rows="10" name="spContent"></textarea></td>
				</tr>
				
				<tr>
					<td align="right"><input type="submit" value="글작성"></td>
				</tr>
				
			</table>
		</form>
</body>
</html>