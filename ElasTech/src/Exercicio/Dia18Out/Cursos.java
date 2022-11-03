package Exercicio.Dia18Out;

public class Cursos {
    public void escreveNome(){

        //Variavel
        int x = 1;

        //Loop while que vai do 1 ate o 5
        while (x <= 5){
            System.out.println("Elas Tech"); //Saida
            x++; //Imcremento -> x=x+1
        }
    }

    public static void main(String[] args) {
        Cursos c = new Cursos();
        c.escreveNome();
    }
}
