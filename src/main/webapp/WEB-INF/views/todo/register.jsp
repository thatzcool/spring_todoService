<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->

    <title></title>
</head>
<body>
      <form action="/todo/register" method="post">
          <div>
              Title : <input type="text" name="title">
          </div>
          <div>
              DueDate : <input type="date" name="dueDate" value="2025-04-12">
          </div>
          <div>
              Writer : <input type="text" name="writer">
          </div>
          <div>
              finished : <input type="checkbox" name="finished">
          </div>
          <div>
              <button type="submit">글등록</button>
          </div>



      </form>

</body>
</html>