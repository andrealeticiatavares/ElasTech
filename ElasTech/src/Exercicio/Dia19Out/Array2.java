package Exercicio.Dia19Out;

public class Array2 {
    public void somarValores(){
        int i, soma = 0;
        Integer []valor = {5,6,7,8,9};

        for (i = 0; i < 5; i++ ){
            soma = soma + valor[i]; //Soma dos valores em cada posição
        }
        System.out.println(soma); //saida do valor da soma
    }

    public static void main(String[] args) {
        Array2 a2 = new Array2();
        a2.somarValores();

    }

}
