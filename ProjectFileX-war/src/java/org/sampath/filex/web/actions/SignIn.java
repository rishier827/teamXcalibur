/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sampath.filex.web.actions.DatabaseConnection;

/**
 *
 * @author Ashantha
 */
public class SignIn extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    static String empid;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        empid=request.getParameter("un");
        
       
            Connection con=DatabaseConnection.createConnection();
            String un=request.getParameter("un");
            String pw=request.getParameter("pw");

        try {            
            PreparedStatement ps=con.prepareStatement("select * from employee where empid='"+un+"'");
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                System.out.println("empid"+rs.getString("empid")+"//"+un);
                System.out.println("pword"+rs.getString("password")+"//"+pw);
                if(rs.getString("empid").trim().equals(un.trim()) && rs.getString("password").trim().equals(pw.trim()))
                {
                    
                    if(rs.getString("ba").equals("y"))
                        response.sendRedirect("filexweb/uploadFile.jsp");
                    else if(rs.getString("pm").equals("y"))
                        response.sendRedirect("filexweb/MSDLogin.jsp");
                    else if(rs.getString("extsh").equals("y"))
                        response.sendRedirect("filexweb/Login.jsp");
                    else
                        response.sendRedirect("filexweb/message.jsp?message=Invalid user name or password!");    
                }
                else
                    response.sendRedirect("filexweb/message.jsp?message=Invalid user name or password!");
            }
            else{
            System.out.println("There is no such a EmployeeID");
            response.sendRedirect("filexweb/message.jsp?message=Invalid user name or password!");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
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