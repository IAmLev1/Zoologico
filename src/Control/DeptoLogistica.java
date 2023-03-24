package Control;

import Model.Animal;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Model.Client;
import Model.AnimalSalvaje;
import Model.AnimalesDomesticos;
import java.util.ArrayList;

/**
 *
 * @author Levi.ing
 */
public class DeptoLogistica {

    private static ArrayList<AnimalesDomesticos> listaAnimalesDomesticos = new ArrayList<>();
    private static ArrayList<AnimalSalvaje> listaAnimalesSalvajes = new ArrayList<>();
    private static ArrayList<Client> listaClientes = new ArrayList<>();

    public static void ingresar(Client cliente) {
        listaClientes.add(cliente);
    }

    public static void ingresar(AnimalSalvaje aSalvaje) {
        listaAnimalesSalvajes.add(aSalvaje);
    }
    
    public static void ingresar(AnimalesDomesticos aDomesticos) {
        listaAnimalesDomesticos.add(aDomesticos);
    }
    
    
    
    

//    public static void generarPdf() throws DocumentException {
//        Document documento = new Document();
//        try {
//            // Crear una instancia de PdfWriter y asociarla con el documento
//            PdfWriter.getInstance(documento, new FileOutputStream("C:/Users/usuario/Documents/tabla.pdf"));
//
//            // Abrir el documento
//            documento.open();
//
//            PdfPTable tabla = new PdfPTable(6);
//
//            // Agregar las celdas de la primera fila
//            tabla.addCell("PLAN");
//            tabla.addCell("VALOR");
//            tabla.addCell("CANTIDAD");
//            tabla.addCell("VALOR VENTA");
//            tabla.addCell("DESCUENTOS");
//            tabla.addCell("TOTAL");
//
//            //Agregar los datos que me pide el reporte
//            for (int i = 0; i < Clientes.size(); i++) {
//                tabla.addCell(listaBoletas.get(i).getTipoPlan());
//                tabla.addCell(String.valueOf(listaBoletas.get(i).getValorUnidad()));
//                tabla.addCell(String.valueOf(listaBoletas.get(i).getCantBoletas()));
//                tabla.addCell(String.valueOf(listaBoletas.get(i).getValorVenta()));
//                tabla.addCell(String.valueOf(listaBoletas.get(i).getDescuento()));
//                tabla.addCell(String.valueOf(listaBoletas.get(i).getCostoTotal()));
//            }
//
//            // Agregar la tabla al documento
//            documento.add(tabla);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Cerrar el documento
//            documento.close();
//        }
//    }
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
