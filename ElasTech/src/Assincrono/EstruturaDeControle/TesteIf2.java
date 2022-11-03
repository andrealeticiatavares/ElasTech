package Assincrono.EstruturaDeControle;

import java.util.Scanner;

public class TesteIf2 {
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

        if (m >=9){ //Media 10 a 9, conceito A
            System.out.println("Conceito A");
        }
        else if (m >= 8){ // Media 8 a 9, conceito B
            System.out.println("Conceito B");
        } 
        else if (m >=7) { //Media 7 a 8, conceito C
            System.out.println("Conceito C");
        } 
        else if (m>=6) { //Media 6 a 7, conceito D
            System.out.println("Conceito D");            
        } else if (m>=5) { //Media 5 a 6, conceito E
            System.out.println("Conceito E");
        }
        else { //Media menor que 5, conceito F
            System.out.println("Conceito F");
        }
        System.out.printf("Sua nota final foi: %.2f",m);
    }
}
