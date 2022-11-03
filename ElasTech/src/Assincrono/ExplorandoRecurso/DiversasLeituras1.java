package Assincrono.ExplorandoRecurso;

import java.util.Scanner;

public class DiversasLeituras1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String texto;
        System.out.println("Digite seu nome: ");
        texto = teclado.nextLine();
        System.out.println("Seu nome é " + texto);
    }
}
