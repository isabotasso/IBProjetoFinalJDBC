<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-5">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">RaiaDrogasil</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Usuário</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
	
		<div class="container w-50" style="outline: 1px solid #cccccc;">
		<form action="CrudController" method="post">
	 <h1 class="mt-3">Adicionar usuário</h1>
		<c:choose>
			<c:when test="${ user == null }">
			  <div class="mb-3">
				<label>Nome:</label>
				<input type="text" class="form-control"  name="nome" required/>
				</div>
				  <div class="mb-3">
				<label>Email:</label>
				<input type="text" class="form-control"  name="email"/>
				</div>
				  <div class="mb-3">
				<label>País:</label>
				<input type="text" class="form-control" name="pais"/>
			</div>
				<button type="submit" name="option" class="btn btn-dark mb-3" value="insert">Salvar</button>
			</c:when>
			<c:otherwise>
				<input type="hidden" name="id" value="${user.id}"/>
				<label>Nome:</label>
				<input type="text" class="form-control" name="nome" value="${user.nome}" required/>
				
				<label>Email:</label>
				<input type="text" class="form-control" name="email" value="${user.email}"/>
				
				<label>País:</label>
				<input type="text" class="form-control" name="pais" value="${user.pais}"/>
			<hr>
				<button type="submit" name="option" class="btn btn-dark mb-3" value="update">Atualizar</button>
			</c:otherwise>
		</c:choose>
	</form>
	</div>
</body>
</html>