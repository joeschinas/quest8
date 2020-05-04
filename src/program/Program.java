/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entidades.Primos;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Visitante
 */
public class Program {

   
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner (System.in);
        Integer numFirst=0;
       Integer numSecond=0;
       
       Primos p;
      do{
         System.out.println("Digite o primeiro numero:");
         numFirst = read.nextInt();
         System.out.println("Digite o Segundo numero");
         numSecond= read.nextInt();
         if(numFirst>=numSecond){
             System.out.println("Primeiro numero nao pode ser maior ou igual ao segundo !");
             
         }
        p = new Primos(numFirst,numSecond);
        }while(numFirst>=numSecond);
         
        p.identidficador();
        
        
        
 
                 
        
          read.close();
    
      }
}
