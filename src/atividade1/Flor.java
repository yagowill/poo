package atividade1;

public class Flor {
   private String nome;
   private int NPetalas;
   private float valor;

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public int getNPetalas() {
       return NPetalas;
   }

   public void setNPetalas(int NPetalas) {
       this.NPetalas = NPetalas;
   }

   public float getValor() {
       return valor;
   }

   public void setValor(float valor) {
       this.valor = valor;
   }
   
   public void apresentarFlor() {
       System.out.println("A flor de " + this.getNome() + " Possui " + this.getNPetalas() + " Petalas e custa R$ " + this.getValor());
   }
   
}
