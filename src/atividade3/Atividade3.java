package atividade3;
import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		float base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base: "));
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: "));
		float comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento: "));
		
		Volume concreto = new Volume(base, altura, comprimento);
		
		concreto.calculaVolume();
	}

}