/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Usuario;
import DataAccessObject.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static Connection.ConnectionFactory.status;

/**
 *
 * @author Michael
 */
@WebServlet(name = "CadastroServlet", urlPatterns = {"/CadastroServlet"})
public class CadastroServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String email = request.getParameter("email");
            String fone = request.getParameter("telefone");
            String end = request.getParameter("endereco");
            //request.setAttibute("listaIDAluno", estados);
            String senha = request.getParameter("senha");
            String confsenha = request.getParameter("confSenha");

            UsuarioDao nomeDao = new UsuarioDao();
            //Essa linha abaixo tava dando erro na hora de compilar aqui, então fiz as linhas abaixo dela.
            //Boolean retorno = nomeDao.save(nome, cpf, email, end, 409, "jardim botanico", "80210330", "casa 1", fone, senha, 1, 1, 1);
            //UsuarioDao tem um método save tipo int, ao invés de Boolean.
            //A UsuarioDao.save espera receber 'Usuario' como parametro, então botei nesse obj
            Usuario usuarioParaCadastro = new Usuario();
            usuarioParaCadastro.setNomeUsuario(nome);
            usuarioParaCadastro.setCpfUsuario(cpf);
            usuarioParaCadastro.setEmailUsuario(email);
            usuarioParaCadastro.setRuaUsuario(end);
            usuarioParaCadastro.setNrUsuario(409);
            usuarioParaCadastro.setBairroUsuario("jardim botanico");
            usuarioParaCadastro.setCepUsuario("80210330");
            usuarioParaCadastro.setComplementoUsuario("casa 1");
            usuarioParaCadastro.setTelefoneUsuario(fone);
            usuarioParaCadastro.setSenhaLoginUsuario(senha);

            int valorRetorno = nomeDao.save(usuarioParaCadastro);

            //Caso o valorRetorno seja 1, vai ficar true, caso contrário fica false.
            //isso é um if ternário
            Boolean retorno = valorRetorno == 1 ? true : false;

            if (retorno == true) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet PortalServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class=\"alert alert-success\" role=\"alert\">");
                out.println("This is a success alert—check it out!");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
                response.sendRedirect("index.jsp");

            } else {
                //response.sendRedirect("erro.jsp");
                request.setAttribute("msg", status);
                request.getRequestDispatcher("erroServlet").forward(request, response);
            }

        } catch (Exception ex) {
            request.setAttribute("msg", status);
            request.getRequestDispatcher("erroServlet").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
