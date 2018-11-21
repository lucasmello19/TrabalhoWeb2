<%-- 
    Document   : Cadastro
    Created on : 16/11/2018, 17:25:03
    Author     : Michael
--%>

<%@page import="java.beans.Beans"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Model.Estado"%>
<%@page import="DataAccessObject.EstadoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Cidade"%>
<%@page import="java.util.List"%>
<%@page import="DataAccessObject.CidadeDao"%>
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
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Logout</a></li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <!-- restante da tela-->

        <div class="container">

            <form class="well form-horizontal" action="CadastroServlet" method="post"  id="contact_form">
                <fieldset>

                    <legend>Cadastro</legend>

                    <!-- Text Nome-->

                    <div class="form-group">
                        <label class="col-md-4 control-label">Nome</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input  name="nome" placeholder="Nome" class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>

                    <!-- Text Sobrenome-->

                    <div class="form-group">
                        <label class="col-md-4 control-label" >CPF</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="cpf" placeholder="XXX.XXX.XXX-XX" class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>

                    <!-- Text E-mail-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">E-Mail</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                <input name="email" placeholder="E-Mail" class="form-control"  type="text" required>
                            </div>
                        </div>
                    </div>


                    <!-- Text Telefone-->

                    <div class="form-group">
                        <label class="col-md-4 control-label">Telefone</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                <input name="telefone" placeholder="(XX)XXX-XXXX" class="form-control" type="text" required>
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
                    <%
                    //<!-- Select Estado -->

                    out.println("<div class='form-group'> ");
                        out.println("<label class='col-md-4 control-label'>Estado</label>");
                        out.println("<div class='col-md-4 selectContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-list'></i></span>");
                                out.println("<select name='estado' class='form-control selectpicker' >");
                                    out.println("<option value=' ' >Selecione seu estado</option>");
                                    if (request.getAttribute("estados") != null) {
                                        List<Estado> estados = (List<Estado>) request.getAttribute("estados");

                                        for (Integer i = 0; i < estados.size(); i++) {
                                            out.println("<option>" + estados.get(i).getNomeEstado()+ "</option>");
                                        }
                                    }
                                out.println("</select>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");

                    //<!-- Text Cidade-->

                    out.println("<div class='form-group'> ");
                        out.println("<label class='col-md-4 control-label'>Cidade</label>");
                        out.println("<div class='col-md-4 selectContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-list'></i></span>");
                                out.println("<select name='cidade' class='form-control selectpicker' >");
                                    out.println("<option value=' ' >Selecione sua cidade</option>");
                                    
                                    if (request.getAttribute("cidades") != null) {
                                        List<Cidade> cidades = (List<Cidade>) request.getAttribute("cidades");

                                        for (Integer i = 0; i < cidades.size(); i++) {
                                            out.println("<option>" + cidades.get(i).getNomeCidade() + "</option>");
                                        }
                                    }
                                out.println("</select>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    %>
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
                    
                    <!-- Senha -->
                    
                    <div class="form-group">
                        <label class="col-md-4 control-label">Senha</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input  name="senha" placeholder="Senha" class="form-control"  type="password" required>
                            </div>
                        </div>
                    </div>
                    
                    <!-- Confirmação de Senha -->
                    
                    <div class="form-group">
                        <label class="col-md-4 control-label">Confirmação de Senha</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input  name="confSenha" placeholder="Confirmação de Senha" class="form-control"  type="password" required>
                            </div>
                        </div>
                    </div>

                    <!-- Buttons -->
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn-success" value="submit">Enviar</button>
                            <button type="button" class="btn btn-primary" >Voltar</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div><!-- /.container -->   
</body>
</html>