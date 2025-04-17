<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Todo Register View</title>
</head>
<body>
<div class="card-body">
    <form action="/todo/register" method="post">
        <div class="input-group mb-3">
            <span class="input-group-text">Ttitle</span>
            <input type="text" name="title" class="form-control" placeholder="Title">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text">Duedate</span>
            <input type="date" name="dueDate" class="form-control" placeholder="dueDate">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text">Writer</span>
            <input type="text" name="writer" class="form-control" placeholder="Writer">
        </div>
        <div class="my-4">
            <div class="float-end">
                <button class="btn btn-primary" type="submit" value="Submit">글등록</button>
                <button type="reset" class="btn btn-primary">취소</button>
            </div>
        </div>

    </form>
    <script>
          const serverValidResult = {}
          <c:forEach items="${errors}" var="error">
          serverValidResult['${error.getField()}'] = '${error.defaultMessage}'
          </c:forEach>
           console.log(serverValidResult)
    </script>

</div>

<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
-->
</body>
</html>
