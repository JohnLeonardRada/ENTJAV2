package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BusBean;

public class BusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Create Local Variables.
		String busName = request.getParameter("busName");
		String plateNo = request.getParameter("plateNo");
		String busDriver = request.getParameter("busDriver");
		
		BusBean bus = new BusBean(busName, plateNo, busDriver);
		
		System.out.println("Bus Name: " + busName);
		System.out.println("Plate No: " + plateNo);
		System.out.println("Bus Driver: " + busDriver);
		
		/*Once we have all the input values, 
		 We are now ready to perform
		 Business logic methods.*/
		bus.busCoding();
		
		
		//Perform Data Object Binding On ServletContext/Application.
		getServletContext().setAttribute("vehicle", bus);
		
		response.sendRedirect("display.jsp");
	}	
}
