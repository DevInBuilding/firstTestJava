package i_executavel;

import i_fila_dinamica.TestaFila;
import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("O que deseja?");
        String a = sc.nextLine();
        if(a.equalsIgnoreCase("a")){
            TestaFila.main(args);
        }
    }
}
