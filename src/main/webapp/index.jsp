<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
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
	          <a class="nav-link active" aria-current="page" href="#">Usu�rio</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>

	<div class="container">
		<div class="row justify-content-center">
	      <h1 class= col-4 >Lista de Usu�rios</h1>
	      <hr>
		</div>
	</div>
	
	<div class="container">
	
	
		<a href="form.jsp"><button type="submit" class="btn btn-primary mb-3">Adicionar usu�rio</button></a>

		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Email</th>
		      <th scope="col">Pa�s</th>
		      <th scope="col">A��es</th>
		    </tr>
		  </thead>
		  
		  <c:forEach items="${usuarios}" var="user" varStatus="i">
			  
			  	<tr>
			      <td>${user.id}</td>
			      <td>${user.nome}</td>
			      <td>${user.email}</td>
			      <td>${user.pais}</td>
			      <td><a href="?id=${i.index}&alterar=1">Alterar</a></td>
			      <td><a href="?id=${i.index}&alterar=0">Remover</a></td>
			    </tr>
		  </c:forEach>
		</table>
	</div>
</body>
</html>