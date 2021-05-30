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

@WebServlet(name="Read", urlPatterns="/Read")
public class ReadFile extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		read(request);
        request.getRequestDispatcher("/Form.jsp").forward(request, response);
	}
	String num[] = new String[20];
	public void read(HttpServletRequest request) {
		 try {
	            File file = new File("program1.txt");
				 if(file.exists()){				 
	            BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
	            for (int i = 0; i < 20; i++) {
	            	num[i] = br.readLine();
	            }
				 }
		 }
	        catch (Exception e) {
	            System.err.println(e.getMessage());
}
		 try {
	request.setAttribute("vid1", num[0]);
	request.setAttribute("vid2", num[1]);
	request.setAttribute("vid3", num[2]);
	request.setAttribute("vid4", num[3]);
	request.setAttribute("vid5", num[4]);
	request.setAttribute("kark1", num[5]);
	request.setAttribute("kark2", num[6]);
	request.setAttribute("kark3", num[7]);
	request.setAttribute("obiv1", num[8]);
	request.setAttribute("obiv2", num[9]);
	request.setAttribute("obiv3", num[10]);
	request.setAttribute("obiv4", num[11]);
	request.setAttribute("obiv5", num[12]);
	request.setAttribute("napoln1", num[13]);
	request.setAttribute("napoln2", num[14]);
	request.setAttribute("napoln3", num[15]);
		 }
		 catch (Exception e) {
	            System.err.println(e.getMessage());
}
}
}


