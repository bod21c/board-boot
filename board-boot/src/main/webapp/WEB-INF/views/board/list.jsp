<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><head><title>Board - List</title></head>
<body>
<h2>게시글 목록</h2>
<p><a href="${pageContext.request.contextPath}/board/write">글쓰기</a></p>
<table border="1" cellpadding="8" cellspacing="0">
  <thead><tr><th>ID</th><th>제목</th><th>작성자</th><th>작성일</th></tr></thead>
  <tbody>
    <c:forEach var="p" items="${posts}">
      <tr>
        <td>${p.id}</td>
        <td><a href="${pageContext.request.contextPath}/board/${p.id}">${p.title}</a></td>
        <td>${p.author}</td>
        <td>${p.createdAt}</td>
      </tr>
    </c:forEach>
    <c:if test="${empty posts}">
      <tr><td colspan="4">등록된 글이 없습니다.</td></tr>
    </c:if>
  </tbody>
</table>
</body></html>
