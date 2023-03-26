package atividade1;

public class Atividade1 {

   public static void main(String[] args) {
       Flor flor1 = new Flor ();
       flor1.setNome("Lotus ou Nelumbo Nucifera");
       flor1.setNPetalas(8);
       flor1.setValor(299.00f);
       flor1.apresentarFlor();
       
       Flor flor2 = new Flor ();
       flor2.setNome("Li­rio ou Lilium");
       flor2.setNPetalas(6);
       flor2.setValor(25.90f);
       flor2.apresentarFlor();
       
       Flor flor3 = new Flor();
       flor3.setNome("Orqui­dea ou Orchidaceae");
       flor3.setNPetalas(3);
       flor3.setValor(29.99f);
       flor3.apresentarFlor();
   }
}
