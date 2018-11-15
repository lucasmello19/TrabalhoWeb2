<%-- 
    Document   : index
    Created on : 10/11/2018, 16:41:21
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>SAC Beibe</title>
</head>

<body class="bg-info">
            <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">

                    <a class="navbar-brand" href="#">Beibe</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="ReclamacoesCliente.jsp">Reclamações</a></li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Logout</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="AlteracaoDeDadosCliente.jsp">Conta</a></li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
    
    <br>

    <br>
   
  <div class="container">

      <div class="col-sm-4 col-sm-offset-4 inputGroupContainer">
          <h4 class="text-center text-danger"> Identifique-se para acessar a plataforma! </h4>
        <form class="form-group well form-horizontal">
          <h2 class="text-center">Beibe <br> SAC</h2>
          <br>
          <input type="text" name="login" required autofocus class="form-control mx-sm-3" placeholder="Login"><br>

          <input type="password" name="password" value="" required  class="form-control mx-sm-3"  placeholder="Senha"><br>

          <input type="submit" name="submit" value="Login" class="btn btn-primary">
          <a href="cadastro.php" class="pull-right">Cadastre-se</a>
        </form>
      </div>


  </div>
</body>
</html>
