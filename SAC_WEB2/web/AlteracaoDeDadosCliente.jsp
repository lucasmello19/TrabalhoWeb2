<%-- 
    Document   : AlteracaoDeDadosCliente
    Created on : 03/11/2018, 17:51:39
    Author     : LucasMello
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SAC Beibe</title>
    </head>
    <body>
        <!-- restante da tela-->

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

        <!-- restante da tela-->

        <div class="container">

            <form class="well form-horizontal" action=" " method="post"  id="contact_form">
                <fieldset>

                    <legend>Editar</legend>

                    <!-- Text Nome-->

                    <div class="form-group">
                        <label class="col-md-4 control-label">Nome</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input  name="nome" placeholder="Nome" class="form-control"  type="text">
                            </div>
                        </div>
                    </div>

                    <!-- Text Sobrenome-->

                    <div class="form-group">
                        <label class="col-md-4 control-label" >CPF</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="cpf" placeholder="XXX.XXX.XXX-XX" class="form-control"  type="text" disabled>
                            </div>
                        </div>
                    </div>

                    <!-- Text E-mail-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">E-Mail</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                <input name="email" placeholder="E-Mail" class="form-control"  type="text" disabled>
                            </div>
                        </div>
                    </div>


                    <!-- Text Telefone-->

                    <div class="form-group">
                        <label class="col-md-4 control-label">Telefone</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                <input name="telefone" placeholder="(XX)XXX-XXXX" class="form-control" type="text">
                            </div>
                        </div>
                    </div>

                    <!-- Text Endereco-->

                    <div class="form-group">
                        <label class="col-md-4 control-label">Endereço</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                <input name="endereco" placeholder="Endereço" class="form-control" type="text">
                            </div>
                        </div>
                    </div>

                    <!-- Text Cidade-->

                    <div class="form-group"> 
                        <label class="col-md-4 control-label">Cidade</label>
                        <div class="col-md-4 selectContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
                                <select name="estado" class="form-control selectpicker" >
                                    <option value=" " >Selecione sua cidade</option>
                                    <option>Curitiba</option>
                                    <option>Londrina</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <!-- Select Estado -->

                    <div class="form-group"> 
                        <label class="col-md-4 control-label">Estado</label>
                        <div class="col-md-4 selectContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
                                <select name="estado" class="form-control selectpicker" >
                                    <option value=" " >Selecione seu estado</option>
                                    <option>Paraná</option>
                                    <option>São Paulo</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <!-- radio genero -->
                    <div class="form-group">
                        <label class="col-md-4 control-label">Gênero</label>
                        <div class="col-md-4">
                            <div class="radio">
                                <label>
                                    <input type="radio" name="genero" value="masculino" /> Masculino
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="genero" value="feminino" /> Feminino
                                </label>
                            </div>
                        </div>
                    </div>

                    <!-- Buttons -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn-warning" >Editar</button>
                            <button type="submit" class="btn btn-primary" formaction="ReclamacoesCliente.jsp">Voltar</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div><!-- /.container -->   
</body>
</html>




