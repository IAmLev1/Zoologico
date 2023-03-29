package Control;

import Model.Animal;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import Model.Client;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Levi.ing
 */
public class DeptoLogistica {

    private static List<Animal> listaAnimales = new ArrayList<Animal>();
    private static List<Client> listaClientes = new ArrayList<Client>();
    

    public void ingresar(Client cliente) {
        listaClientes.add(cliente);
    }

    public void ingresar(Animal animal) {
        listaAnimales.add(animal);
    }
    
    public void eliminarAnimal(int cod) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            if(listaAnimales.get(i).getCodigo() == cod) {
                listaAnimales.remove(i);
            }
        }
    }

    public List<Animal> showListAnim () {
        return listaAnimales;
    }


    public void generarPdf() throws DocumentException {
        Document documento = new Document();
        try {
            // Crear una instancia de PdfWriter y asociarla con el documento
            PdfWriter.getInstance(documento, new FileOutputStream("src/Pdf/tablaZ00.pdf"));

            // Abrir el documento
            documento.open();
            
                    // Creo la tabla de la imagen y el texto
        PdfPTable tablaImagenTexto = new PdfPTable(2);
        tablaImagenTexto.setWidthPercentage(100);

        // Agrego la celda de la imagen
        String rutaImagen = "src/imagenes/LOGO.png";
        Image foto = Image.getInstance(new File(rutaImagen).getAbsolutePath());
        foto.scaleToFit(250, 250);
        PdfPCell celdaImagen = new PdfPCell(foto);
        celdaImagen.setBorder(Rectangle.NO_BORDER);
        celdaImagen.setVerticalAlignment(0);
        celdaImagen.setHorizontalAlignment(0);
        tablaImagenTexto.addCell(celdaImagen);

        // Agrego la celda del texto
        Paragraph texto = new Paragraph("Zoológico MI PAI\nChina japon\ntel: +57 9999999999");
        PdfPCell celdaTexto = new PdfPCell(texto);
        celdaTexto.setBorder(Rectangle.NO_BORDER);
        celdaTexto.setVerticalAlignment(0);
        celdaTexto.setHorizontalAlignment(20);
        tablaImagenTexto.addCell(celdaTexto);

        // Agrego espacio vertical entre la tabla de la imagen y el texto
        documento.add(new Paragraph(20, " "));

        // Agrego la tabla de la imagen y el texto al documento
        documento.add(tablaImagenTexto);

            PdfPTable tabla = new PdfPTable(4);

            // Agregar las celdas de la primera fila
            tabla.addCell("Nombre");
            tabla.addCell("Cedula");
            tabla.addCell("Plan");
            tabla.addCell("VALOR VENTA");

            //Agregar los datos que me pide el reporte
            for (int i = 0; i < listaClientes.size(); i++) {
                tabla.addCell(listaClientes.get(i).getNombre());
                tabla.addCell(listaClientes.get(i).getCedula());
                tabla.addCell("plan");
                tabla.addCell("$ "+listaClientes.get(i).getDinero());

            }

            // Agregar la tabla al documento
            documento.add(tabla);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar el documento
            documento.close();
        }
    }
//
//    public void facture(int num) {
//        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//        Date date = new Date();
//        Actions printX = new Actions();
//        float cambio;
//        printX.print("Hora de compra: " + dateFormat.format(date) + "\n");
//        if (num == 1) {
//            printX.print("su compra fue: Plan 1");
//            cambio = (client.getDinero() - Plan.plan1());
//        } else {
//            if ((num == 2)) {
//                printX.print("su compra fue: Plan 2");
//                cambio = (client.getDinero() - Plan.plan2());
//            } else {
//                printX.print("su compra fue: Plan 3");
//                cambio = (client.getDinero() - Plan.plan3());
//            }
//
//        }
//
//        printX.print("Datos del cliente: " + client.getNombre());
//        printX.print("DNI del cliente: " + client.getCedula());
//        printX.print("Datos del vendedor/Admin: " + "Admin123");
//        printX.print("Dinero recibido: " + client.getDinero());
//        printX.print("Su cambio e: " + cambio);
//
//        printX.print("Gracias por su compra");
//
//    }
//
//
}
