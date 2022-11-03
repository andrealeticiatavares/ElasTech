/*
O break faz todo o laço para
 */

package Assincrono.EstruturaDeControle;

import java.util.Scanner;

public class TesteBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador =1;

        //For usando break
        for (contador=1; contador <= 10;contador++){
            if(contador == 5){
                break;
            }
            System.out.println("Contador= "+contador);
        }
        System.out.println("Fim do programa!");

        //While usando break
        while (true){
            if (contador == 5){
                break;
            }
            System.out.println("Contador= "+contador);
            contador++;
        }
        System.out.println("Fim do programa");
    }
}
