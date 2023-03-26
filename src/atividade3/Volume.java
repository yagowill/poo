package atividade3;
import javax.swing.JOptionPane;

public class Volume {
	private float base;
	private float altura;
	private float comprimento;

	public Volume(float base, float altura, float comprimento) {
		this.base = base;
		this.altura = altura;
		this.comprimento = comprimento;
	}
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public void calculaVolume() {

		JOptionPane.showMessageDialog(null, "O volume é " + (this.base * this.altura * this.comprimento));
	}
}