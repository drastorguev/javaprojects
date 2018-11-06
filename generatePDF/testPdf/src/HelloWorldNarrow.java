//import com.itextpdf.io.font.FontConstants;
//import com.itextpdf.kernel.font.PdfFont;
//import com.itextpdf.kernel.font.PdfFontFactory;
//import com.itextpdf.kernel.geom.Rectangle;
//import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.kernel.pdf.PdfPage;
//import com.itextpdf.kernel.pdf.PdfWriter;
//import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
//import com.itextpdf.layout.Canvas;
//import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.layout.element.Text;
//import com.itextpdf.test.annotations.WrapToTest;
//
//import java.io.File;
//import java.io.IOException;
//
///**
// * @author Bruno Lowagie (iText Software)
// */
//@WrapToTest
//public class C02E01_CanvasExample {
//
//    public static final String DEST = "results/chapter02/canvas_example.pdf";
//
//    public static void main(String args[]) throws IOException {
//        File file = new File(DEST);
//        file.getParentFile().mkdirs();
//        new C02E01_CanvasExample().createPdf(DEST);
//    }
//
//    public void createPdf(String dest) throws IOException {
//        //Initialize PDF document
//        PdfDocument pdf = new PdfDocument(new PdfWriter(dest));
//
//        PdfPage page = pdf.addNewPage();
//        PdfCanvas pdfCanvas = new PdfCanvas(page);
//        Rectangle rectangle = new Rectangle(36, 650, 100, 100);
//        pdfCanvas.rectangle(rectangle);
//        pdfCanvas.stroke();
//        Canvas canvas = new Canvas(pdfCanvas, pdf, rectangle);
//        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
//        PdfFont bold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
//        Text title = new Text("The Strange Case of Dr. Jekyll and Mr. Hyde").setFont(bold);
//        Text author = new Text("Robert Louis Stevenson").setFont(font);
//        Paragraph p = new Paragraph().add(title).add(" by ").add(author);
//        canvas.add(p);
//
//        //Close document
//        pdf.close();
//    }
//}
