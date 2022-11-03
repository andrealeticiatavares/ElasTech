package Exercicio.Dia19Out;

public class Array3 {
    public void menorValor(){

        int []numero = {9,5,2,7};
        int menor = 1000000, i;

        for (i = 0; i <4; i++) {
            if (numero[i] < menor){
                menor = numero[i];
            }
        }
        System.out.println(menor);
    }

    public static void main(String[] args) {
        Array3 a3 = new Array3();
        a3.menorValor();

    }
}

