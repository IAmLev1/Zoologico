package Control;

import Model.AnimalDomestico;
import Model.AnimalSalvaje;
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

public class DeptoLogistica {

    private static List<AnimalDomestico> animDomesticos = new ArrayList<AnimalDomestico>();
    private static List<AnimalSalvaje> animSalvajes = new ArrayList<AnimalSalvaje>();
    private static List<Client> listaClientes = new ArrayList<Client>();
    private static List<String> listaRetiros = new ArrayList<String>();
    private static List<String> listaAdopciones = new ArrayList<String>();

    public void ingresarCliente(Client cliente) {
        listaClientes.add(cliente);
    }

    public void ingresarAnimSalvaje(AnimalSalvaje animSalvaje) {
        animSalvajes.add(animSalvaje);
    }

    public void ingresarAnimDomestico(AnimalDomestico animDomestico) {
        animDomesticos.add(animDomestico);
    }

    public void ingresarRetiros(String retiro) {
        listaRetiros.add(retiro);
    }

    public void ingresarAdopciones(String adopcion) {
        listaAdopciones.add(adopcion);
    }

    public void eliminarAnimalDomestico(String cod) {
        for (int i = 0; i < animDomesticos.size(); i++) {
            if (animDomesticos.get(i).getCodigo().equals(cod)) {
                animDomesticos.remove(i);
            }
        }
    }

    public void eliminarAnimalSalvaje(String cod) {
        for (int i = 0; i < animSalvajes.size(); i++) {
            if (animSalvajes.get(i).getCodigo().equals(cod)) {
                animSalvajes.remove(i);
            }
        }
    }

    public List<AnimalSalvaje> showListAnimSalvajes() {
        return animSalvajes;
    }

    public List<AnimalDomestico> showListAnimDomesticos() {
        return animDomesticos;
    }

    public List<Client> showListClien() {
        return listaClientes;
    }

    public List<String> showListRetiros() {
        return listaRetiros;
    }

    public List<String> showListAdopciones() {
        return listaAdopciones;
    }

    public void generarPdfPersona() throws DocumentException {
        Document documento = new Document();
        try {
            // Crear una instancia de PdfWriter y asociarla con el documento
            PdfWriter.getInstance(documento, new FileOutputStream("src/Pdf/tablaPersonas.pdf"));

            // Abrir el documento
            documento.open();

            // Creo la tabla de la imagen y el texto
            PdfPTable tablaImagenTexto = new PdfPTable(2);
            tablaImagenTexto.setWidthPercentage(100);

            // Agrego la celda de la imagen
            String rutaImagen = "src/imagenes/Logo1.png";
            Image foto = Image.getInstance(new File(rutaImagen).getAbsolutePath());
            foto.scaleToFit(160, 160);
            PdfPCell celdaImagen = new PdfPCell(foto);
            celdaImagen.setBorder(Rectangle.NO_BORDER);
            celdaImagen.setVerticalAlignment(0);
            celdaImagen.setHorizontalAlignment(0);
            tablaImagenTexto.addCell(celdaImagen);

            // Agrego la celda del texto
            Paragraph texto = new Paragraph("Zoológico MI PAI\nColombia, Medellín, El güeco\ntel: +57 9999999999");
            PdfPCell celdaTexto = new PdfPCell(texto);
            celdaTexto.setBorder(Rectangle.NO_BORDER);
            celdaTexto.setVerticalAlignment(0);
            celdaTexto.setHorizontalAlignment(20);
            tablaImagenTexto.addCell(celdaTexto);

            // Agrego espacio vertical entre la tabla de la imagen y el texto
            documento.add(new Paragraph(20, " "));

            // Agrego la tabla de la imagen y el texto al documento
            documento.add(tablaImagenTexto);

            PdfPTable tabla = new PdfPTable(5);

            // Agregar las celdas de la primera fila
            tabla.addCell("Nombre");
            tabla.addCell("Cedula");
            tabla.addCell("Plan");
            tabla.addCell("adiciones");
            tabla.addCell("VALOR VENTA");

            //Agregar los datos que me pide el reporte
            for (int i = 0; i < listaClientes.size(); i++) {
                tabla.addCell(listaClientes.get(i).getNombre());
                tabla.addCell(listaClientes.get(i).getCedula());
                tabla.addCell(listaClientes.get(i).getPlan().getNumPlan());
                tabla.addCell(listaClientes.get(i).getPlan().getAdiciones());
                tabla.addCell("$ " + listaClientes.get(i).getDinero());
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
}
