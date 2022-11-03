package Assincrono.Algoritimos;

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, c, d, u, resto;
        int novoNumero;

        //ENTRADA DE DADOS
        System.out.println("Digite um número imteiro de 3 digitos: ");
        numero = teclado.nextInt();

        //PROCESSAMENTO
        c = numero / 100;      //Ex: 234 / 100 = 2
        resto = numero % 100; //Ex: 234 % 100 = 34
        d = resto / 10;       //Ex: 34 / 10 = 3
        u = resto % 10;      //Ex: 34 % 10 = 4

        novoNumero = u * 100 + d * 10 + c;

        //SAIDA DE DADOS
        System.out.println(novoNumero);

        teclado.close();
    }
}
