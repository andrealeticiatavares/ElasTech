package Assincrono.EstruturaDeControle;

import java.util.Scanner;
public class TesteSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Só pode ser usado variáveis do tipo int, char e String no Switch
        int valor;
        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();
        //Não é póssivel usar operadores logicos do tipo and(&&), or(||), not no Switch

        switch (valor) {
            case 1: //Caso valor igual a 1
                System.out.println("Você digitou 1");
                break; // Interrompe o programa
            case 2: //Caso valor igual a 2
                System.out.println("Você digitou 2");
                break;
            case 3: //Caso valor igual a 3
                System.out.println("Você digitou 3");
                break;
            case 4: //Caso valor igual a 4
                System.out.println("Você digitou 4");
                break;
            case 5: //Caso valor igual a 5
                System.out.println("Você digitou 5");
                break;
            default: //Caso valor igual não seja igual aos anteriores
                System.out.println("Digite outro valor");
                break;
        }
    }
}
