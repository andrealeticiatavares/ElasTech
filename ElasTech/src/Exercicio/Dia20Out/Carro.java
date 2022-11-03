package Exercicio.Dia20Out;

public class Carro {
     public int numPortas;
     public int ano;
     public double preco;
     public double kilometragem;
     public String marca;
     public String cor;

     public Carro(){
         /*
         this.numPortas = 2;
         this.ano = 1990;
         this.preço = 50000.5;
         this.kilometragem = 0.0;
         this.marca = "Jipe";
         */
     }
    public Carro(String marca, String cor){
         this.marca = marca;
         this.cor = cor; }
    public void setAno(int ano) {
         this.ano = ano;
     }
     public int getAno() {
         return ano;
     }
     public void setCor(String cor) {
         this.cor = cor;
     }
     public String getCor() {
         return cor;
     }
     public void setKilometragem(double kilometragem) {
         this.kilometragem = kilometragem;
     } public double getKilometragem() {
         return kilometragem;
     }
     public void setMarca(String marca) {
         this.marca = marca;
     }
     public String getMarca() {
         return marca;
     }
     public void setNumPortas(int numPortas) {
         this.numPortas = numPortas;
     }
     public int getNumPortas() {
         return numPortas;
     }
     public void setPreco(double preço) {
         this.preco = preco;
     }
    public double getPreco() {
         return preco;
     }

    public static void main(String[] args) {
         Carro c = new Carro();
         c.setAno(2001);
         c.setCor("prata");
         c.setKilometragem(30000);
         c.setMarca("Ford");
         c.setNumPortas(4);
         c.setPreco(35000);

         Carro c2 = new Carro("Fiat","Azul");
         c2.setAno(1980);
         c2.setKilometragem(0);
         c2.setPreco(100000);
         c2.setNumPortas(2);
         c2.setMarca("Ford");

         System.out.println("Ano: "+ c.ano);
         System.out.println("Marca: "+ c2.marca);
         System.out.println("Preço: "+ c2.preco);
     }
}

