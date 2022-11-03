package Exercicio.Dia18Out;

public class ListaImpares {

    public void listar(){
    int x = 1;
    int resto;

        while (x <= 100){
        resto = x % 2; //resto da divisão do valor de x com 2. EX: 4%2=0

        if (resto == 1){ //Se o resto for igual a 1 o x é impar
            System.out.println(x);// Saida do valor de x
        }
        x++;
    }
}

    public static void main(String[] args) {
        ListaImpares li = new ListaImpares();
        li.listar();
    }
}
