package testWrite;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

import org.junit.Test;

public class TestWrite {

@Test
	public void test() {
	String num[] = new String[20];
	File file = new File("program1.txt");
		try {
		if(file.exists()){
		PrintWriter zapis = new PrintWriter(file.getAbsoluteFile());
		try {
		zapis.write("1" + "\n" + "2" + "\n");
		}
			finally {
			zapis.close();
		}
	} else {
	file.createNewFile();
	PrintWriter zapis = new PrintWriter(file.getAbsoluteFile());
		try {
		zapis.write("1" + "\n" + "2" + "\n");
		}
			finally {
			zapis.close();
		}
	}
		}	
	catch (Exception e) {
	System.err.println(e.getMessage());
	}
		 try {			 
	            BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
	            for (int i = 0; i < 20; i++) {
	            	num[i] = br.readLine();
	            }
		 }
	        catch (Exception e) {
	            System.err.println(e.getMessage());
}
	assertTrue(file.exists());
	assertEquals("1",num[0]);
	assertEquals("2",num[1]);
	}
	
	}