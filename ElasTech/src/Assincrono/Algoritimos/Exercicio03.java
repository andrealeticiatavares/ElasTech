package Assincrono.Algoritimos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salarioMinimo, valor1Kw,qtdKw, valorTotal,valorComDesconto;

        //ENTRADA
        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Dígite a quantidade de Kw gastos: ");
        qtdKw = teclado.nextDouble();

        //PROCESSAMENTO
        //1- Quanto custa 1 Kw
        valor1Kw = (salarioMinimo/7)/100;
        //2- Valor da conta total;
        valorTotal = valor1Kw * qtdKw;
        //3- Valor com desconto
        valorComDesconto = valorTotal * 0.9;

        //SAÍDA
        System.out.printf("O valor de 1 Kw é R$%.2f\n",valor1Kw);
        System.out.printf("O valor total é R$%.2f\n",valorTotal);
        System.out.printf("O valor com desconto é R$%.2f\n",valorComDesconto);


    }
}

