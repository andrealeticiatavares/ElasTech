/*
O continue faz somente com que a iteração atual pare, pulando para a próxima
 */

package Assincrono.EstruturaDeControle;

import java.util.Scanner;

public class TesteContinue {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador =1;
/*
        //For usando break
        for (contador=1; contador <= 10;contador++){
            if(contador == 5){
                continue;
            }
            System.out.println("Contador= "+contador);
        }
        System.out.println("Fim do programa!");
        */

        //While usando break
        while (contador <= 10){
            if (contador == 5){
                continue;
            }
            System.out.println("Contador= "+contador);
            contador++;
        }
        System.out.println("Fim do programa");
    }
}
