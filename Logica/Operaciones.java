package Logica;
import java.util.Scanner;

public class Operaciones {

     double Num, Num2,Resul;
     
     public void DatosSuma(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Introduce un numero: "); 
         Num=leer.nextDouble(); 
         System.out.println("Introduce un numero: "); 
         Num2=leer.nextDouble(); 
         Resul=Num+Num2; 
         System.out.println("Resultado: "+Resul);
     }
     public void DatosResta(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Introduce un numero: "); 
         Num=leer.nextDouble(); 
         System.out.println("Introduce un numero: "); 
         Num2=leer.nextDouble(); 
         Resul=Num-Num2; 
         System.out.println("Resultado: "+Resul);
     }
     public void DatosMultiplicación(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Introduce un numero: "); 
         Num=leer.nextDouble(); 
         System.out.println("Introduce un numero: "); 
         Num2=leer.nextDouble();
         Resul=Num*Num2; 
         System.out.println("Resultado: "+Resul);
     }
     public void DatosDivision(){
         Scanner leer= new Scanner(System.in);
         System.out.println("Introduce un dividendo: "); 
         Num=leer.nextDouble(); 
         System.out.println("Introduce un divisor: "); 
         Num2=leer.nextDouble(); 
         Resul=Num/Num2; 
         System.out.println("Resultado: "+Resul);
     }
//Suma     
public class Suma {
    double Num,Num2, Resul;
     
      void setNumero(double num1){
         Num = num1;
     }
       void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }
    
}
//Resta
public class Resta {
     double Num,Num2, Resul;
     
      void setNumero(double num1){
         Num = num1;
     }
       void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }
}


//Multiplicacion
public class Multiplicacion {
     double Num,Num2, Resul;
     
         void setNumero(double num1){
         Num = num1;
     }
         void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }

    
}

//Division
public class Division {
     double Num,Num2, Resul;
     
      void setNumero(double num1){
         Num = num1;
     }
       void setNumero2(double nume){
         Num2 = nume;
     }
         void setResultado(double resulta){
         Resul = resulta;
     }
         double getNumero(){
         return  Num;
     }
         double getNumero2(){
          return Num2;
     }
         double getResultado(){
         return Resul;
     }
    
}
}
