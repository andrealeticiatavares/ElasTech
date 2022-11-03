package Exercicio.Dia19Out;

import java.util.Arrays;

public class Array1 {
    public void listarnomes(){
        //Array de 3 posições
        String[]nome = {"São Paulo", "Curitiba", "Porto Alegre"};

        //Saida de dados dentro do array
        System.out.println(Arrays.toString(nome));
    }

    public static void main(String[] args) {
        Array1 a = new Array1();
        a.listarnomes();
    }
}

