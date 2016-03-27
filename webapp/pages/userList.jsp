<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/style.css">

    <script src="<c:url value="/resources/js/vendors/jquery.js"/>" type="application/javascript"></script>
    <script src="<c:url value="/resources/js/vendors/underscore.js"/>" type="application/javascript"></script>
    <script type="application/javascript">
        _.templateSettings = {
            interpolate: /\<\@\=(.+?)\@\>/gim,
            evaluate: /\<\@(.+?)\@\>/gim,
            escape: /\<\@\-(.+?)\@\>/gim
        };
    </script>
    <script src="<c:url value="/resources/js/script.js"/>" type="application/javascript"></script>
</head>
<body>

<!-- Underscore шаблон строки в таблице юзеров -->
<script type="text/x-underscore-template" id="user-table-body-row">
<@ _(users).each(function(user){ @>
<tr>
    <td><@= user.id @></td>
    <td><@= user.firstName @></td>
    <td><@= user.lastName @></td>
    <td><@= user.email @></td>
    <td class="controls">
        <a class="edit btn btn-sm btn-primary"
           data-action="edit"
           data-id="<@= user.id @>"
           href="/users/<@= user.id @>/edit>">
            Edit
        </a>
        <a class="delete btn btn-sm btn-danger"
           data-action="delete"
           data-id="<@= user.id @>"
           href="/delete/<@= user.id @>/delete>">
            Delete
        </a>
    </td>
</tr>
<@ }); @>
</script>


<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Добавлены простым рендером страницы
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                                <th>&nbsp;</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="user" items="${usersList}">
                                <tr>
                                    <td>${user.id}</td>
                                    <td>${user.firstName}</td>
                                    <td>${user.lastName}</td>
                                    <td>${user.email}</td>
                                    <td>
                                        <a href="<c:url value="/edit/${user.id}" />">Edit</a>
                                        <a href="<c:url value="/delete/${user.id}" />">Delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <!-- /.table-responsive -->
                </div>
                <!-- /.panel-body -->
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title pull-left">
                        Users loaded via AJAX
                    </h3>
                    <a class="add btn btn-primary pull-right" data-action="create" href="#">Create new user</a>
                    <div class="clearfix"></div>
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="table-responsive">
                        <table id="user-list-table" class="table table-striped table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                                <th>&nbsp;</th>
                            </tr>
                            </thead>
                            <tbody></tbody>
                        </table>
                    </div>
                    <!-- /.table-responsive -->
                </div>
                <!-- /.panel-body -->
            </div>
        </div>
    </div>
</div>

</body>
</html>