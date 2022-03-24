package ex5garotokevinho;

import java.util.Scanner;

public class Ex5GarotoKevinho {

    public static void main(String[] args) {
        Scanner IntSC = new Scanner(System.in);
        
        System.out.print("Digite o número de horas extras cumpridas: ");
        float HE = IntSC.nextFloat();
        System.out.print("Digite o número de horas-falta: ");
        float HF = IntSC.nextFloat();
        
        float ME = HE * 60;
        float MF = HF * 60;
        
        float MET = ME - MF;
        float HET = MET / 60;
    }
    
}
