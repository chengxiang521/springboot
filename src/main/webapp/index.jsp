
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <TITLE>$TITLE$</TITLE>
  </head>
  <body>
  <c:foreach items="${sessionscope.list}" var="ca">
${ca.id}========${ca.cat_id}========${ca.category_name}=======<br/>
  </c:foreach>
  <h1>111阿达asdas1</h1>
  </body>
</html>
