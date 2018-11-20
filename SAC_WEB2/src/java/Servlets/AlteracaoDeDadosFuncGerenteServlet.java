/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Cidade;
import Beans.Estado;
import Beans.Usuario;
import DataAccessObject.CidadeDao;
import DataAccessObject.EstadoDao;
import DataAccessObject.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Michael
 */
@WebServlet(name = "AlteracaoDeDadosFuncGerente", urlPatterns = {"/AlteracaoDeDadosFuncGerente"})
public class AlteracaoDeDadosFuncGerenteServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         
//            HttpSession session = request.getSession();
//            String nome = (String)session.getAttribute("nome");
//
//                UsuarioDao dao = new UsuarioDao();
//                Usuario user = (Usuario) dao.findByFilter(id)

            Usuario user = new Usuario();
            user.setBairroUsuario("Vila piedade");
            user.setCepUsuario("18210370");
            user.setComplementoUsuario("fundos");
            user.setCpfUsuario("9609625843");
            user.setEmailUsuario("lucas@lucas.com");
            user.setSenhaLoginUsuario("sivlsjbvskfv");
            user.setRuaUsuario("americo izzo");
            user.setTelefoneUsuario("27191900");
            user.setNomeUsuario("lucas mello");

            List<Cidade> cidades = new ArrayList<Cidade>();
            CidadeDao daoCidade = new CidadeDao();
            cidades = daoCidade.findAll();
            
            List<Estado> estados = new ArrayList<Estado>();
            EstadoDao estadoDao = new EstadoDao();
            estados = estadoDao.findAll();
            
            request.setAttribute("user", user);
            request.setAttribute("cidades", cidades);
            request.setAttribute("estados", estados);


            RequestDispatcher rd = request.getRequestDispatcher("AlteracaoDeDadosFuncGerente.jsp");
            rd.forward(request, response);
//            }

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