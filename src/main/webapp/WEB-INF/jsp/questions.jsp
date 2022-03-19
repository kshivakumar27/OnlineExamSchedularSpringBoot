<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form th:action="@{/submitnew}" method="get" style="max-width: 600px; margin: 0 auto; " modelAttribute="Quetions">
<h3>what is the full form of jdbc</h3>
<input type="radio" name="q1" value="lassan">
<h3>what is the full form of jdbc</h3>
<input type="radio" name="q2" value="java lassan">java lassan
<br>
<input type="submit" name="submit">
</form>
</body>
</html>