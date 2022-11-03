package Exercicio.Dia19Out;

public class TodasTabuadas {
    public void imprimeTodasTabuadas() {

        int x, i, resultado;

        for (i=0;i < 10; i++){ //loop i de 0 até 9
            for (x = 0; x < 10; x++){ //loop x de 0 até 9

                resultado = i * x; //Miltiplicação do loop i com o loop x

                System.out.println(i +"*"+x+"="+resultado); //saida de dados
            }
        }
    }

    //Classe de entrada e saida de dados
    public static void main(String[] args) {
        TodasTabuadas tt = new TodasTabuadas();//declarando objeto
        tt.imprimeTodasTabuadas(); //Chamando metodo
    }
}

