<%@ page contentType="text/html; charset=UTF-8" %>
<html><head><title>Board - Detail</title></head>
<body>
<h2>게시글 상세</h2>
<p><b>제목:</b> ${post.title}</p>
<p><b>작성자:</b> ${post.author}</p>
<p><b>작성일:</b> ${post.createdAt}</p>
<hr/>
<pre style="white-space: pre-wrap;">${post.content}</pre>
<hr/>
<p><a href="${pageContext.request.contextPath}/board/${post.id}/edit">수정</a></p>
<form action="${pageContext.request.contextPath}/board/${post.id}/delete" method="post" style="display:inline;">
  <button type="submit" onclick="return confirm('삭제하시겠습니까?');">삭제</button>
</form>
<p><a href="${pageContext.request.contextPath}/board">목록</a></p>
</body></html>
