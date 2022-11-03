/*
Tabuada
 */

package Assincrono.EstruturaDeControle;

import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();//informar o número que quer ser multiplicado

        //Loop para multiplicar o numero de 1 ate 10
        for (int contador = 1; contador <= 10; contador++){
            System.out.println(numero+"x"+contador+"="+(numero*contador)); //Saída de dados
        }
    }
}
