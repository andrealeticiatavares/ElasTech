package Exercicio.Dia19Out;

public class Tabuada2 {
    public void escreveTabuada(){
        int i, resultado;

        for (i=0; i<10 ; i++){

            resultado = 2 * i;

            System.out.println("2 "+"*" +i + "=" +resultado);

        }
    }

    public static void main(String[] args) {
        Tabuada2 t = new Tabuada2();
        t.escreveTabuada();
    }
}
