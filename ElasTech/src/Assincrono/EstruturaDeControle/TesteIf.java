package Assincrono.EstruturaDeControle;

import java.util.Scanner;

public class TesteIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1, n2,n3, m;

        System.out.println("Digite a primeira nota: ");
        n1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = teclado.nextDouble();

        m = (n1+n2+n3)/3;

        if (m >=7){
            System.out.println("Parabéns! Você foi aprovado.");
        }
        else{
            System.out.println("Você foi reprovado.");
        }
        System.out.printf("Sua nota final foi: %.2f",m);
    }
}
