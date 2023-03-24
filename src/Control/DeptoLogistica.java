package Control;

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


/**
 *
 * @author Levi.ing
 */
public class DeptoLogistica {

    //private Client client = new Client();

//    public void ingresarAnimalSalvaje() throws IOException {
//        Actions action = new Actions();
//        Actions action2 = new Actions();
//
//        String np = action.leerString("Nivel de peligrosidad:");
//        String na = action.leerString("Nombre del animal:");
//        int ca = action.leerInt("Codigo del animal:");
//        AnimalSalvaje as = new AnimalSalvaje(np, ca, na);
//        action2.print("Ingresado correctamente :" + as.toString());
//    }
//
//    public void ingresarDomestico() throws IOException {
//        Actions action = new Actions();
//        Actions action2 = new Actions();
//
//        String np = action.leerString("Uso:");
//        String na = action.leerString("Nombre del animal:");
//        int ca = action.leerInt("Codigo del animal:");
//        AnimalesDomesticos as = new AnimalesDomesticos(np, ca, na);
//        action2.print("Ingresado correctamente :" + as.toString());
//    }
//    
//    public void ingresarCliente() throws IOException{
//        Actions action = new Actions();
//        Actions action2 = new Actions();
//        
//        String name = action.leerString("Nombre del cliente: ");
//        String dni = action.leerString("Numero de idenficacion del cliente: ");
//        int age = action.leerInt("Edad del cliente: ");
//        float money= action.leerFloat("Dinero a recibido: ");
//        client = new Client(name, dni, age, money);
//        action2.print("bienvenido"+client.getNombre());
//    }
//
//    public void admonZoo() throws IOException {
//        Actions action = new Actions();
//        Actions action2 = new Actions();
//
//        int num = 0;
//        do {
//            num = action2.leerInt("Que desea hacer: \n 1 COMPRAR PLAN \n 2 para xxxxx \n 3 INGRESAR ANIMAL");
//        } while (num < 1 && num > 3);
//
//        if (num == 1) {
//            action.print("PLANES");
//            menuPlan();
//        } else {
//            if (num == 2) {
//                action.print("---XXXXXX--- \n");
//            } else {
//                action.print("---INGRESO DE ANIMAL--- \n");
//                menuIngresoAnimal();
//            }
//        }
//        
//        
//    }
//
//    public void menuPlan() throws IOException {
//        Actions action2 = new Actions();
//        //Actions action = new Actions();
//        int num = 0;
//        do {
//            BuyTokens.boletaN1();
//            BuyTokens.boletaN2();
//            BuyTokens.boletaN3();
//            num = action2.leerInt("Ingrese el numero del plan que desea");
//        } while (num < 1 && num > 3);
//
//        if (num == 1) {
//            BuyTokens.boletaN1();
//            ingresarCliente();
//        } else {
//            if (num == 2) {
//                BuyTokens.boletaN2();
//                ingresarCliente();
//            } else {
//                BuyTokens.boletaN3();
//                ingresarCliente();
//            }
//        }
//        
//        facture(num);
//    }
//    
//    public void menuIngresoAnimal() throws IOException{
//        Actions action2 = new Actions();
//        Actions action = new Actions();
//        int num = 0;
//        do {
//            action.print("1. Animal Salvaje");
//            action.print("2. Animal Domesticos");
//            num = action2.leerInt("Ingrese que tipo de animal va ingresar");
//        } while (num < 1 || num > 3);
//        
//        if(num==1){
//            ingresarAnimalSalvaje();
//        }
//        else{
//            ingresarDomestico();
//        }
//    }
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
