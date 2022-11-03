package Assincrono.Algoritimos;

/*
02.Programas para caucular:
a) Área de um quadrado, dado seu lado (a = lado * lado).
 */

import java.util.Scanner;
public class Exercicio02_a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float lado, area;

        //ENTRADA
        System.out.println("Digite o lado do quadrado: ");
        lado = teclado.nextFloat();

        //PROCESSAMENTO
        area = lado * lado; //cauculo da area

        //SAÍDA
        System.out.println("A área do quadrado é "+area);

        teclado.close();
    }
}