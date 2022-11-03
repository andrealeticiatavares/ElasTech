package Exercicio.Dia18Out;

public class ListaPares {
    public void listar(){
        int x = 1;
        int resto;

        while (x <= 100){
            resto = x % 2;
            if (resto == 0){
                System.out.println(x);
            }
            x++;
        }
    }

    public static void main(String[] args) {
        ListaPares lp = new ListaPares();
        lp.listar();
    }
}

