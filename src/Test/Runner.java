
package Test;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Runner {
    
    static Scanner scanner = new Scanner (System.in);
    
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        
        try{
            
            //Se crea un arreglo de botones que se mostrará en la ventana de dialogo
            String[] botones = {"Agregar un producto", "Salir de la tienda"};

            //Se guarda en la variable ventana  la opción elegida por el usuario según la posición del boton seleccionadp
            int ventana = JOptionPane.showOptionDialog(null, 
                                            "Seleccione la opción de preferencia", // mensaje 
                                            "Ejercicio simple", // titulo
                                            JOptionPane.DEFAULT_OPTION, //tipo de opción (yes/no)
                                            JOptionPane.QUESTION_MESSAGE, //tipo de mensaje
                                            null, //icono
                                            botones, botones[0]); //declaración de botonoes y posición de donde arranca para visualizar los botones
            //If's anidados para la visualización de un mensaje por la posición del arreglo de botones
            switch (ventana) {
                case 0 -> addProduct();
                case 1 -> exitProgram();
                default -> {
                        System.exit(0);
                }
            }
        }catch(HeadlessException e){
            mainMenu();
        }
    }
    
    private static void addProduct(){
        /**
        * Constructor
        * @param idSale
        * @param nameProduct
        * @param unitValue
        * @param typeProduct
        * @param engraved
        * @param cantSale 
        */

        
        
        String nameProduct = null;
        String idSale = null;
        double unitValue = 0;
        boolean engraved = false;
        short cantSale = 0;
        
        System.out.println("Nombre de producto");
        nameProduct = scanner.next();
        
        System.out.println("Nombre de producto");
    }

    private static void exitProgram() {
        
    }


}
