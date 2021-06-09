package com.ss.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Form() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read form fields
		String correctUsername = "Wyatt";
		String correctPassword = "Password";
		
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        System.out.println("User entered " + username + "for username");
        System.out.println("User entered " + password + "for password");
         
        PrintWriter writer = response.getWriter();
        
        String correct = "";
        if(correctUsername.equals(username) && correctPassword.equals(password)) {
        	correct += "<h1> Login successful, username and password were a match!</h1>";
        } else {
        	correct += "<h1> Login failed, wrong username or password.</h1>";
        }
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<p>We would normally validate the username and password with our database but instead I stored then in the servlet. "
        		+ "The correct username is \"Wyatt\" and the Password is \"Password\"<br/><br/></p>";   
        htmlRespone += "<h2>You entered username: " + username + "<br/>";      
        htmlRespone += "You entered password: " + password + "</h2>";
         
        // return response
        writer.println(htmlRespone);
        writer.println(correct);
	}

}
