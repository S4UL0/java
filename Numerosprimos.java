
package numerosprimos;

import java.util.Scanner;

public class Numerosprimos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Valor que você deseja");
        int valor = tcl.nextInt();
        int x = 0;
        for (int i = 1; i < 10; i++) {
            if(valor % i == 0){
                x++;
            
            }
        }if(x == 2){
            System.out.println("O numero " + valor + " É primo"); 
        }else{
            System.out.println("O numero " + valor +" Não é primo"); 
        }

    }
    
}
