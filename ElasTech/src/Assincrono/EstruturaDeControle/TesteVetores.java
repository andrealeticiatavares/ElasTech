package Assincrono.EstruturaDeControle;

import java.util.Scanner;

public class TesteVetores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] valores;

        valores = new double[5];

        System.out.println("Digite os valores: ");
        for (int i = 0; i < 5; i++){
            valores[i] = teclado.nextDouble();
        }

        System.out.println("Valores digitados");
        for (int i = 0; i < 5; i++){
            System.out.printf("%.2f ",valores[i]);
        }

    }


}
