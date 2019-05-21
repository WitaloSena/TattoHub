/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hackstudio.controller;

import br.com.hackstudio.dao.TatuadorDaoImplements;
import br.com.hackstudio.model.Tatuador;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author witalo
 */
public class tatuadores extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

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
        if (request.getParameter("acao").contains("todos")) {

            try {
                TatuadorDaoImplements tatuadorDAO = new TatuadorDaoImplements();

                List tatuadores = new ArrayList();

                tatuadores = tatuadorDAO.listar();

                if (tatuadores.isEmpty()) {
                    System.out.println("Erro");
                    request.setAttribute("mensagem", "Nenhum tatuador cadastrado");

                    RequestDispatcher redireciona = request.getRequestDispatcher("mensagem.jsp");
                    redireciona.forward(request, response);

                } else {
                    request.setAttribute("listaTatuadores", tatuadores);
                    RequestDispatcher red = request.getRequestDispatcher("tatuadores.jsp");
                    red.forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tatuadores.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (request.getParameter("acao").contains("cadastrar")) {

            Tatuador t = new Tatuador();
            t.setNome(request.getParameter("nome"));
            t.setEmail(request.getParameter("email"));
            t.setCpf(request.getParameter("cpf"));
            t.setEndereço(request.getParameter("endereco"));
            t.setTelefone(request.getParameter("telefone"));
            t.setEspecialidade(request.getParameter("especialidade"));
            t.setFacebook(request.getParameter("facebook"));
            t.setInstagram(request.getParameter("instagram"));

        }
        
        
        
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(tatuadores.class.getName()).log(Level.SEVERE, null, ex);
        }
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
