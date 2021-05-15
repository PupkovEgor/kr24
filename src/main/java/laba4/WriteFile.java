package laba4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AbstractClass.Karkas;

@WebServlet(name="WriteFile", urlPatterns="/WriteFile") 
public class WriteFile extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		response.sendRedirect(request.getContextPath() + "/admin_menu.jsp");
	}
	static String num[] = new String[20];
	private static class RequestCalc {
		private final String st1;
		private final String st2;
		private final String st3;
		private final String st4;
		private final String st5;
		private final String kar1;
		private final String kar2;
		private final String kar3;
		private final String o1;
		private final String o2;
		private final String o3;
		private final String o4;
		private final String o5;
		private final String napol1;
		private final String napol2;
		private final String napol3;
		private RequestCalc (String v1,String v2,String v3,String v4,String v5,String k1,String k2,String k3, 
				String ob1, String ob2, String ob3, String ob4, String ob5, String nap1, String nap2, String nap3 ) {
			this.st1 = v1;
			this.st2 = v2;
			this.st3 = v3;
			this.st4 = v4;
			this.st5 = v5;
			this.kar1 = k1;
			this.kar2 = k2;
			this.kar3 = k3;
			this.o1 = ob1;
			this.o2 = ob2;
			this.o3 = ob3;
			this.o4 = ob4;
			this.o5 = ob5;
			this.napol1 = nap1;
			this.napol2 = nap2;
			this.napol3 = nap3;
		}
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
			request.getParameter("v1"),
			request.getParameter("v2"),
			request.getParameter("v3"),
			request.getParameter("v4"),
			request.getParameter("v5"),
			request.getParameter("k1"),
			request.getParameter("k2"),
			request.getParameter("k3"),
			request.getParameter("ob1"),
			request.getParameter("ob2"),
			request.getParameter("ob3"),
			request.getParameter("ob4"),
			request.getParameter("ob5"),
			request.getParameter("nap1"),
			request.getParameter("nap2"),
			request.getParameter("nap3"));
			}	
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			 try {
		            File file = new File("program1.txt");
					 if(file.exists()){
						 PrintWriter zapis = new PrintWriter(file.getAbsoluteFile());
						 try {
							 zapis.write(st1 + "\n" + st2 + "\n" + st3 + "\n" + st4 + "\n" + st5 + "\n" +
									 kar1 + "\n" + kar2 + "\n" + kar3 + "\n" + o1 + "\n" + o2 + "\n" +
									 o3 + "\n" + o4 + "\n" + o5 + "\n" + napol1 + "\n" + napol2 + "\n" + napol3);
					        }
					        finally {
					        	zapis.close();
					        }
					 } else {
						 file.createNewFile();
				            PrintWriter zapis = new PrintWriter(file.getAbsoluteFile());
					        try {
					        	zapis.write(st1 + "\n" + st2 + "\n" + st3 + "\n" + st4 + "\n" + st5 + "\n" +
										 kar1 + "\n" + kar2 + "\n" + kar3 + "\n" + o1 + "\n" + o2 + "\n" +
										 o3 + "\n" + o4 + "\n" + o5 + "\n" + napol1 + "\n" + napol2 + "\n" + napol3);
					        }
					        finally {
					            zapis.close();
					        }
					 }
		            BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
		            for (int i = 0; i < 20; i++) {
		            	num[i] = br.readLine();
		            }
			 }
		        catch (Exception e) {
		            System.err.println(e.getMessage());
	 }
	}
}
}

