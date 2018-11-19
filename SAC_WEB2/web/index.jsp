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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
    $(document).ready(function(){
        $("#hider1, #hider2").click(function(){
            $("#cadastro").hide();
        });
        $("#show").click(function(){
            $("#cadastro").show();
        });
    });
    </script>
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
           

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
    
    <br>

   
  <div class="container">

      <div class="col-sm-4 col-sm-offset-4 inputGroupContainer">
          <h4 class="text-center text-danger"> Identifique-se para acessar a plataforma! </h4>
        <form class="form-group well form-horizontal" action="LoginServlet" method="POST">            
          <h2 class="text-center">Beibe <br> SAC</h2>
          <hr/>
          <div class="radio">
              <label><input type="radio" value="cliente" name="optradio" id="show" checked>Sou Cliente</label>
          </div>
          <div class="radio">
            <label><input type="radio" value="funcionario" name="optradio" id="hider1">Sou Funcionário</label>
          </div>
          <div class="radio">
            <label><input type="radio" value="gerente" name="optradio" id="hider2">Sou Gerente</label>
          </div>
          <br>
          <input type="email" name="email" required autofocus class="form-control mx-sm-3" placeholder="E-mail"><br>

          <input type="password" name="senha" value="" required  class="form-control mx-sm-3"  placeholder="Senha"><br>

          <input type="submit" name="submit" value="Entrar" class="btn btn-primary">
          <a href="Cadastro.jsp" class="pull-right" id="cadastro">Cadastre-se</a>
        </form>
      </div>


  </div>
</body>
</html>
