package testPDF;

import static org.junit.Assert.*;
import org.junit.Test;
import com.itextpdf.text.pdf.PdfPTable;
import laba4.CreatePDF;

public class TestPDF {
	@Test
    public void test() {
        CreatePDF k = new CreatePDF();
         PdfPTable table = new PdfPTable(3);
     k.addColumns(table);
     assertEquals("Каркас", k.CellGet);
    }
}
