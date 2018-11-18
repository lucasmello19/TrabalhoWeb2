<%-- 
    Document   : ReclamacoesCliente
    Created on : 04/11/2018, 16:05:20
    Author     : LucasMello
--%>

<%@page import="Beans.Atendimento"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style type="text/css">

            body {
                background: #f5f5f5;

            }
            .table-wrapper {
                background: #fff;
                padding: 20px 25px;
                margin: 30px 0;
                border-radius: 3px;
                box-shadow: 0 1px 1px rgba(0,0,0,.05);
            }
            .table-title {        
                padding-bottom: 15px;
                background: #f5f5f5;
                color: #000000;
                padding: 16px 30px;
                margin: -20px -25px 10px;
                border-radius: 3px 3px 0 0;
            }
            .table-title h2 {
                margin: 5px 0 0;
                font-size: 24px;
            }
            .table-title .btn-group {
                float: right;
            }
            .table-title .btn {
                color: #fff;
                float: right;
                font-size: 13px;
                border: none;
                min-width: 50px;
                border-radius: 2px;
                border: none;
                outline: none !important;
                margin-left: 10px;
            }
            .table-title .btn i {
                float: left;
                font-size: 21px;
                margin-right: 5px;
            }
            .table-title .btn span {
                float: left;
                margin-top: 2px;
            }
            table.table tr th, table.table tr td {
                border-color: #e9e9e9;
                padding: 12px 15px;
                vertical-align: middle;
            }
            table.table tr th:first-child {
                width: 60px;
            }
            table.table tr th:last-child {
                width: 100px;
            }


            table.table th i {
                font-size: 13px;
                margin: 0 5px;
                cursor: pointer;
            }	
            table.table td:last-child i {
                opacity: 0.9;
                font-size: 22px;
                margin: 0 5px;
            }
            table.table td a {
                font-weight: bold;
                color: #566787;
                display: inline-block;
                text-decoration: none;
                outline: none !important;
            }

            table.table td a.edit {
                color: #FFC107;
            }
            table.table td a.delete {
                color: #F44336;
            }

            /* Modal styles */
            .modal .modal-dialog {
                max-width: 400px;
            }
            .modal .modal-header, .modal .modal-body, .modal .modal-footer {
                padding: 20px 30px;
            }
            .modal .modal-content {
                border-radius: 3px;
            }
            .modal .modal-footer {
                background: #ecf0f1;
                border-radius: 0 0 3px 3px;
            }
            .modal .modal-title {
                display: inline-block;
            }
            .modal .form-control {
                border-radius: 2px;
                box-shadow: none;
                border-color: #dddddd;
            }
            .modal textarea.form-control {
                resize: vertical;
            }
            .modal .btn {
                border-radius: 2px;
                min-width: 100px;
            }	
            .modal form label {
                font-weight: normal;
            }	
        </style>
        <title>SAC Beibe</title>
    </head>
    <body>

        <!-- menu-->


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
                        <li><a href="LogoutServlet">Logout</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="AlteracaoDeDadosCliente.jsp">Conta</a></li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <!-- reclamações-->


        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Reclamações</h2>
                        </div>
                        <div class="col-sm-6">
                            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Adicionar nova reclamação</span></a>
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Titulo</th>
                            <th>Descrição</th>
                            <th>Tipo</th>
                            <th>Status</th>
                            <th>Editar/Deletar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%

                            List<Atendimento> list = (List<Atendimento>) request.getAttribute("list");

                            if (list != null) {
                                for (int i = 0; i < list.size(); i++) {

                                    Atendimento a = list.get(i);

                                    out.println("<tr>");
                                    out.println("<td>" + a.getSituacaoAtendimento() + "</td>");
                                    out.println("<td>" + a.getSolucaoAtendimento() + "</td>");
                                    out.println("<td>Defeito</td>");
                                    out.println("<td>Em aberto</td>");
                                    out.println("<td>");
                                    out.println("<a href='#editEmployeeModal' class='edit' data-toggle='modal'><i class='material-icons' data-toggle='tooltip' title='Edit'>&#xE254;</i></a>");
                                    out.println("<a href='#deleteEmployeeModal' class='delete' data-toggle='modal'><i class='material-icons' data-toggle='tooltip' title='Delete'>&#xE872;</i></a>");
                                    out.println("</td>");
                                    out.println("</tr>");

                                }
                            }

                        %>
                    </tbody>
                </table>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">						
                            <h4 class="modal-title">Adicionar reclamação</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Titulo</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Descrição</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="input-group">
                                <label>Tipo</label>
                                <select name="tipo" class="form-control selectpicker" >
                                    <option value=" " >Selecione o tipo da reclamação</option>
                                    <option>Defeito</option>
                                    <option>Atraso</option>
                                </select>
                            </div>				
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>



        <!-- Edit Modal HTML -->
        <div id="editEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">						
                            <h4 class="modal-title">Editar Reclamação</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>

                        <tbody>
                            <%                             
                                Atendimento a = list.get(0);

                                out.println("<div class='modal-body'>");
                                out.println("<div class='form-group'>");
                                out.println("<label>" + "Titulo" + "</label>");
                                out.println("<input type='text' class='form-control' required>");
                                out.println("</div>");
                                out.println("<div class='form-group>");
                                out.println("    <label>Descrição</label>");
                                out.println("   <input type=email' class='form-control required>");
                                out.println("</div>");
                                out.println("<div class='input-group'>");
                                out.println("<label>Tipo</label>");
                                out.println("<select name='tipo' class='form-control selectpicker' >");
                                out.println("<option value=' oi'>Selecione o tipo da reclamação</option>");
                                out.println("<option>Defeito</option>");
                                out.println("<option>Atraso</option>");
                                out.println("</select>");
                                out.println("</div>");
                                out.println("</div");


                            %>

                        </tbody>


                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <input type="submit" class="btn btn-warning" value="Editar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Delete Modal HTML -->

        <div id="deleteEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">
                            <h4 class="modal-title">Deletar reclamação</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <p>Tem certeza que deseja deletar esta reclamação?</p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <input type="submit" class="btn btn-danger" value="Deletar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>       


