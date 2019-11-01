package akm.ex3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
public class servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");;

        PrintWriter out = response.getWriter();
        String title = "Ex3 servlet";

        String username = new String(request.getParameter("username").getBytes("ISO8859-1"),"UTF-8");
        String email = new String(request.getParameter("email").getBytes("ISO8859-1"),"UTF-8");
        String address = new String(request.getParameter("address").getBytes("ISO8859-1"),"UTF-8");
        String resume = new String(request.getParameter("resume").getBytes("ISO8859-1"),"UTF-8");

        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
		"<html>" +
		"<head><meta charset='utf-8'><title>" + title +
		"</title><link rel='stylesheet' href='https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css'>" +
		"</head><body>" +
		"<div style='padding: 100px 100px 10px;'>" +
		"<table class='table table-bordered table-hover'>" +
		"<tr><td>用户名</td><td>" + username + "</td></tr>" +
		"<tr><td>Email</td><td>" + email + "</td></tr>" +
		"<tr><td>通信地址</td><td>" + address + "</td></tr>" +
		"<tr><td>个人简历</td><td>" + resume + "</td></tr>" +
		"</table>" +
		"</div></body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
