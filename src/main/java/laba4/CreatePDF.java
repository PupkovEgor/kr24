package laba4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class CreatePDF {

	  public CreatePDF() {
	    	
	    }
	    public void Create(String numberpdf) throws IOException {
	      	
	    	Document document = new Document(); //ñîçäàíèå êëàññà Document
	    	
	    	String filepath = new File("").getCanonicalPath();
			String[] parsfilepath = filepath.split("/");
			
			int lengthpath = parsfilepath.length;
			String abspath=""; 
			for(int i=0;i<(lengthpath-1);i++) {
				abspath=abspath+parsfilepath[i]+"/";
			}
			filepath=abspath+"webapps/Calculate/Check.pdf";
			String fontpath =abspath+"/webapps/CreatePDF/fonts/times.ttf";
	    	
			try {	
				PdfWriter.getInstance(document, new FileOutputStream(filepath));
			} catch (FileNotFoundException | DocumentException e) {
				e.printStackTrace();
			}
						
			document.open(); 
			
			BaseFont times = null;
			try {
				times = BaseFont.createFont(fontpath, "UTF-8", BaseFont.EMBEDDED);
			} catch (DocumentException | IOException e) {
				e.printStackTrace();
			}
			
			String string_pdf = "Результат выполнения работы приложения";
			Paragraph paragraph = new Paragraph();
		    paragraph.add(new Paragraph(string_pdf, new Font(times,14)));
		    
		    String string_pdf2 = "С заказом можно ознакомиться в таблице ниже:";
		    paragraph.add(new Paragraph(string_pdf2, new Font(times,14)));
		    
		     
		    try {
				document.add(paragraph);
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
		    
		  //îðãàíèçàöèÿ ïåðåõîäà íà ñëåäóþùóþ ñòðîêó
			 paragraph.clear();
			 String string_pdf3 = " ";
			 paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
			 
			 try {
					document.add(paragraph);
				} catch (DocumentException e1) {
					e1.printStackTrace();
				}
		    
		    
			 //îðãàíèçàöèÿ ïåðåõîäà íà ñëåäóþùóþ ñòðîêó
			 paragraph.clear();
			 paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
			 
			 try {
					document.add(paragraph);
				} catch (DocumentException e1) {
					e1.printStackTrace();
				}
	    
	 
			//äîáàâëåíèå òàáëèöû
			 PdfPTable table = new PdfPTable(3); //ñîçäàíèå òàáëèöû ñ 4 ñòîëáöàìè
			 addColumns(table);
			 
			 try {
				document.add(table);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		    
		    document.close(); //çàêðûòèå è ñîõðàíåíèå äîêóìåíòà PDF
	    }
	    

	private void addColumns(PdfPTable table) {
			
			//çàïîëíåíèå òàáëèöû ââîäèìûìè çíà÷åíèÿ â òåêñòîâûå ïîëÿ íà ãëàâíîé ôîðìå
			String cell1 = "";
			String cell2 = "Вид";
			String cell3 = "Цена (руб)";
			String cell4 = "Каркас";
			String cell5 = Calc.KarkasGet; 
			String cell6 = Calc.KarkasGetPrice;
			String cell7 = "Обивка";
			String cell8 = Calc.ObivkaGet;
			String cell9 = Calc.ObivkaGetPrice;
			String cell10 = "Наполнитель";
			String cell11 = Calc.NapolnitelGet;
			String cell12 = Calc.NapolnitelGetPrice;
			String cell13 = "Стул";
			String cell14 = Calc.ChairGet;
			String cell15 = Calc.ChairGetPrice;
			String cell16 = "Колличество стульев";
			String cell17 = Calc.KolvoChairGet;
			String cell18 = "";
			String cell19 = "Срочный заказ?";
			String cell20 = Calc.check1Get;
			String cell21 = "";
			String cell22 = "";
			String cell23 = "ИТОГО:";
			String cell24 = Calc.Summa;
			
					
			table.addCell(cell1);
		    table.addCell(cell2);
		    table.addCell(cell3);
		    table.addCell(cell4);
		    table.addCell(cell5);
		    table.addCell(cell6);
		    table.addCell(cell7);
		    table.addCell(cell8);
		    table.addCell(cell9);
		    table.addCell(cell10);
		    table.addCell(cell11);
		    table.addCell(cell12);
		    table.addCell(cell13);
		    table.addCell(cell14);
		    table.addCell(cell15);
		    table.addCell(cell16);
		    table.addCell(cell18);
		    table.addCell(cell17);
		    table.addCell(cell19);
		    table.addCell(cell20);
		    table.addCell(cell21);
		    table.addCell(cell22);
		    table.addCell(cell23);
		    table.addCell(cell24);
		    
			
		    //âûøå äîëæåí áûòü òåêñò íà ðóññêîì ÿçûêå, êàê åãî âûâåñòè ìîæíî ïîñìîòðåòü â ñïðàâêå.
		}
	}

