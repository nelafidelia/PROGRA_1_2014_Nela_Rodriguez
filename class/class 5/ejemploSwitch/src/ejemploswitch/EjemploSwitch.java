/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploswitch;

import java.util.Scanner;

/**
 *Marianela Rodriguez Salazar
 * @author NELA
 */ 
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor1=0;
        int valor2=0;
       double resultado;
        char continuar;
        int opcion=0;
        boolean validar;
        
        Scanner teclado=new Scanner(System.in);
        
        operaciones ooperaciones=new operaciones();
        
        do{
         System.out.println("Digite la operacion a evaluar");
         System.out.println("1 suma");
         System.out.println("2 resta");
         System.out.println("3 divicion");
         System.out.println("4 multiplicacion");
         System.out.println("5 raiz ");
         System.out.println("6 potencia ");
         
         opcion=Integer.parseInt(teclado.nextLine());
         
         switch(opcion)
         {
             case 1:
         System.out.println("Digite el valor del primer digito");
         valor1= Integer.parseInt(teclado.nextLine());
         System.out.println("Digite el valor del segundo digito");
         valor2= Integer.parseInt(teclado.nextLine());
         resultado=ooperaciones.Sumar(valor1,valor2);
         System.out.println(resultado);
        break;
        
         
        case 2:
         System.out.println("Digite el valor del primer digito");
         valor1= Integer.parseInt(teclado.nextLine());
         System.out.println("Digite el valor del segundo digito");
         valor2= Integer.parseInt(teclado.nextLine());
         resultado=ooperaciones.resta(valor1,valor2);
          System.out.println(resultado);
        
                 break;
            
         case 3:
         System.out.println("Digite el valor del primer digito");
         valor1= Integer.parseInt(teclado.nextLine());
         System.out.println("Digite el valor del segundo digito");
         valor2= Integer.parseInt(teclado.nextLine());
        resultado= ooperaciones.divicion(valor1,valor2);
        System.out.println(resultado);
                 break;
              
         case 4:
         System.out.println("Digite el valor del primer digito");
         valor1= Integer.parseInt(teclado.nextLine());
         System.out.println("Digite el valor del segundo digito");
         valor2= Integer.parseInt(teclado.nextLine());
         resultado=ooperaciones.divicion(valor1,valor2);
         System.out.println(resultado);
                 break;
             
         case 5:
         System.out.println("Digite el valor del primer digito");
         valor1= Integer.parseInt(teclado.nextLine());
         System.out.println("Digite el valor del segundo digito");
         valor2= Integer.parseInt(teclado.nextLine());
         resultado=ooperaciones.divicion(valor1,valor2);
         System.out.println(resultado);
                 break;
         case 6:
         System.out.println("Digite el valor del primer digito");
         valor1= Integer.parseInt(teclado.nextLine());
         resultado=ooperaciones.raiz(valor1);
         System.out.println(resultado);
                 break;
         case 7:
         System.out.println("Digite el valor del primer digito");
         valor1= Integer.parseInt(teclado.nextLine());
         System.out.println("Digite el valor del segundo digito");
         valor2= Integer.parseInt(teclado.nextLine());
         resultado=ooperaciones.potencia(valor1,valor2);
         System.out.println(resultado);
                 break;
                 default:
                     break;
         }
         
         System.out.println("Desea continuar con otra operacion S-N");
         continuar=teclado.nextLine().charAt(0);
        if((continuar=='S')||(continuar=='s'));
        {
            validar=true;
        }
        if ((continuar=='N')||(continuar=='n'))
        {
         validar=false;
        }
        
        }while(validar);
        
        }
}     
            
            
       
        
      
     