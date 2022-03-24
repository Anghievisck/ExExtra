
package ex4meninobenio;

import java.util.Scanner;

public class EX4MENINOBENIO {
    
    public static void main(String[] args) {
       Scanner IntSC = new Scanner(System.in);
       
       System.out.print("Qual o horário em que seu turno começa? ");
       int In = IntSC.nextInt();
       int Out = In + 6;
       if (Out > 24){
           Out = Out - 24;
           System.out.println("Horário de Saída: " + Out + " AM");
       } else {
           if (Out >= 12){
               Out = Out - 12;
               if (Out == 0){
                   System.out.println("Horário de Saída: 12PM");
               } else {
                   System.out.println("Horário de Saída: 0AM");
               }
           } else if (Out == 12) {
               System.out.println("Horário de Saída: " + Out + "AM");
           } else {
               System.out.println("Horário de Saída: " + Out + "AM");
           }
       }
    }
}