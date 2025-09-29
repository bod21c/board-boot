<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><head><title>Board - Form</title></head>
<body>
<h2><c:choose><c:when test="${mode eq 'edit'}">글 수정</c:when><c:otherwise>글 작성</c:otherwise></c:choose></h2>

<c:choose>
  <c:when test="${mode eq 'edit'}">
    <form action="${pageContext.request.contextPath}/board/${post.id}" method="post">
  </c:when>
  <c:otherwise>
    <form action="${pageContext.request.contextPath}/board" method="post">
  </c:otherwise>
</c:choose>

  <p><label>제목</label><br/>
     <input type="text" name="title" value="${post.title}" style="width:400px;" required/></p>
  <p><label>작성자</label><br/>
     <input type="text" name="author" value="${post.author}" required/></p>
  <p><label>내용</label><br/>
     <textarea name="content" rows="12" cols="80" required>${post.content}</textarea></p>

  <p>
    <button type="submit"><c:choose><c:when test="${mode eq 'edit'}">수정</c:when><c:otherwise>등록</c:otherwise></c:choose></button>
    <a href="${pageContext.request.contextPath}/board">취소</a>
  </p>
</form>
</body></html>
