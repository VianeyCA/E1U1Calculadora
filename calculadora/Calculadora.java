package calculadora;
import java.util.Scanner;
import Logica.Operaciones;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
          Operaciones opera= new Operaciones();
         int opc,op;
         String resp="si";
         System.out.println("Ingrese el numero de la operacion a realizar: ");
         System.out.println("1.-Suma");
         System.out.println("2.-Resta");
         System.out.println("3.-Multiplicacion");
         System.out.println("4.-Division");
         System.out.println("5.-Salir");
         opc=leer.nextInt();
         
         
         switch (opc){
             case 1:
                 opera.DatosSuma();
                // op();
                 break;
             case 2:
                 opera.DatosResta();
                 //op();
                 break;
             case 3:
                 opera.DatosMultiplicación();
                // op();
                 break;
             case 4:
                 opera.DatosDivision();
                 //op();
                 break;
             case 5:
                //5 default:
                     System.out.println("Programa Terminado");
                     System.exit(0);
                  //   op();
                     break;  
                 default:
                     System.out.println("Valor no encontrado");
                     
         }
         System.out.println("\" Deseas continuar con las operaciones 1.-Si  / 2.- No \"");
                 op=leer.nextInt();
                 if(op==1){
                     Calculadora.main(args);
                 } else{
                     System.out.println("Programa Terminado");
                     System.exit(0);                     
                 }
         
    }

    private static void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        
 
    
    }
    
}
