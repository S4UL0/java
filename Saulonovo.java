
package saulonovo;

import java.util.Scanner;

public class Saulonovo {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("digite a posição que você deseja ");
        int valor = tcl.nextInt();
        int A = 0 ;
        int B = 1;
        int aux;
        System.out.println("--POSIÇÕES--");
        
        for(int i = 0;i < valor; i++) {        
            aux = B;
            B = A+B;
            A = aux;
        System.out.println(A);
        }                                      
    }
    
}
