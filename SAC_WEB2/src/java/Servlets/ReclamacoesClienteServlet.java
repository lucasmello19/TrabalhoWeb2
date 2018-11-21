/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Atendimento;
import Model.Categoria;
import Model.Usuario;
import DataAccessObject.AtendimentoDao;
import DataAccessObject.CategoriaProdDao;
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
 * @author LucasMello
 */
@WebServlet(name = "ReclamacoesClienteServlet", urlPatterns = {"/ReclamacoesClienteServlet"})
public class ReclamacoesClienteServlet extends HttpServlet {

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
            HttpSession session = request.getSession();
            String nome = (String) session.getAttribute("nome");

//            if (nome != null) {
                if ((String) session.getAttribute("acaoForm") != null) {

                    String acaoForm = (String) session.getAttribute("acaoForm");

                    if (acaoForm == "insert") {

                    } else if (acaoForm == "insert") {

                    } else if (acaoForm == "insert") {

                    } else {

                    }

                    RequestDispatcher rd = request.getRequestDispatcher("ReclamacoesCliente.jsp");
                    rd.forward(request, response);

                } else {

                    String categ = request.getParameter("categoria");

                    List<Atendimento> list = new ArrayList<>();

                    Atendimento a = new Atendimento();
                    a.setDescAtendimento("desc 1");
                    a.setSituacaoAtendimento("resolviso");
                    a.setSolucaoAtendimento("solucao 1");
                    //a.setDtHoraFimAtendimento(dtHoraFimAtendimento);

                    list.add(a);

                    Atendimento b = new Atendimento();
                    b.setDescAtendimento("desc 2");
                    b.setSituacaoAtendimento("resolviso");
                    b.setSolucaoAtendimento("solucao 2");

                    list.add(b);

                    Atendimento c = new Atendimento();
                    c.setDescAtendimento("desc 3");
                    c.setSituacaoAtendimento("resolviso");
                    c.setSolucaoAtendimento("solucao 3");

                    list.add(c);

                    CategoriaProdDao dao = new CategoriaProdDao();
                    List<Categoria> categs = dao.findAll();

                    RequestDispatcher rd = request.getRequestDispatcher("ReclamacoesCliente.jsp");
                    request.setAttribute("list", list);
                    request.setAttribute("index", request.getParameter("index"));
                    request.setAttribute("acao", request.getParameter("acao"));

                    rd.forward(request, response);
                }

//            }
//            RequestDispatcher rd = request.getRequestDispatcher("LoginServlet");
//            rd.forward(request, response);
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
