package Exercicio.Dia20Out;

import java.util.Scanner;

public class Predio {

    public String enderco;
    public String cidade;
    public String estado;
    public int numAptos;

    public Predio(){

    }

    public void getEnderco(String s) {
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public String getCidade(String são_paulo) {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void getEstado(String pará) {
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void getNumApts(int i) {
    }

    public void setNumApts(int numAptos) {
        Scanner teclado = new Scanner(System.in);
        while (numAptos <= 0){
            System.out.println("Informe um numero maior que 0:");
            teclado.nextInt();
        }
        this.numAptos = numAptos;
    }

    public static void main(String[] args) {
        Predio p = new Predio();
        p.getCidade("Belém");
        p.getEnderco("Roberto Camelier");
        p.getEstado("Pará");
        p.getNumApts(4);

        System.out.println(p.numAptos);

    }

}
