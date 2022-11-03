package Assincrono.EstruturaDeControle;

import java.util.Scanner;

public class TesteWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int contador;

        contador = 1;
        //Usado quando não tem um valor pre definido
        while (contador <= 10){
            System.out.println(numero+"x"+contador+"="+(numero*contador));
            contador++;
        }
        teclado.close();
    }
}
