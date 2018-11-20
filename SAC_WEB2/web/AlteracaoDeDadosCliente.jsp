<%-- 
    Document   : AlteracaoDeDadosCliente
    Created on : 03/11/2018, 17:51:39
    Author     : LucasMello
--%>

<%@page import="Beans.Usuario"%>
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
                        <li><a href="ReclamacoesClienteServlet">Reclamações</a></li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="LogoutServlet">Logout</a></li>
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
                    


      

                    <%
//                        if (request.getAttribute("user") != null) {
//                            Usuario user = (Usuario) request.getAttribute("user");
//                                
//                    <!-- Text Nome-->

                        out.println("<div class='form-group'>");
                        out.println("<label class='col-md-4 control-label'>Nome completo</label>");
                        out.println("<div class='col-md-4 inputGroupContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-user'></i></span>");
                                out.println("<input  name='nome' placeholder='Nome' class='form-control'  type='text' disabled>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");


                 //   <!-- Text Sobrenome-->

                        out.println("<div class='form-group'>");
                        out.println("<label class='col-md-4 control-label' >CPF</label>"); 
                        out.println("<div class='col-md-4 inputGroupContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-user'></i></span>");
                                out.println("<input name='cpf' placeholder='XXX.XXX.XXX-XX' class='form-control'  type='text' disabled>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    //<!-- Text E-mail-->
                            
                    out.println("<div class='form-group'>");
                        out.println("<label class='col-md-4 control-label'>E-Mail</label>  ");
                        out.println("<div class='col-md-4 inputGroupContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-envelope'></i></span>");
                                out.println("<input name='email' placeholder='E-Mail' class='form-control'  type='text'>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");


                    //<!-- Text Telefone-->

                    out.println("<div class='form-group'>");
                        out.println("<label class='col-md-4 control-label'>Telefone</label>  ");
                        out.println("<div class='col-md-4 inputGroupContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-earphone'></i></span>");
                                out.println("<input name='telefone' placeholder='(XX)XXX-XXXX' class='form-control' type=text'>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");

                    //<!-- Text Endereco-->

                    out.println("<div class='form-group'>");
                        out.println("<label class='col-md-4 control-label'>Endereço</label>  ");
                        out.println("<div class='col-md-4 inputGroupContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-home'></i></span>");
                                out.println("<input name='endereco' placeholder='Endereço' class='form-control' type='text'>");
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
                                    out.println("<option>Curitiba</option>");
                                    out.println("<option>Londrina</option>");
                                out.println("</select>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");

                    //<!-- Select Estado -->

                    out.println("<div class='form-group'> ");
                        out.println("<label class='col-md-4 control-label'>Estado</label>");
                        out.println("<div class='col-md-4 selectContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-list'></i></span>");
                                out.println("<select name='estado' class='form-control selectpicker' >");
                                    out.println("<option value=' ' >Selecione seu estado</option>");
                                    out.println("<option>Paraná</option>");
                                    out.println("<option>São Paulo</option>");
                                out.println("</select>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");

                    out.println("<div class='form-group'>");
                        out.println("<label class='col-md-4 control-label'>Senha</label>  ");
                        out.println("<div class='col-md-4 inputGroupContainer'>");
                            out.println("<div class='input-group'>");
                                out.println("<span class='input-group-addon'><i class='glyphicon glyphicon-home'></i></span>");
                                out.println("<input name='senha' placeholder='Senha' class='form-control' type='text'>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
//                        }


                    %>
                    

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




