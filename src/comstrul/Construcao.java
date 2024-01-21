package comstrul;

import javax.swing.JOptionPane;

public class Construcao {
	private double largura ;
	private double comprimento ;
	
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	@Override
	public String toString() {
		return "Construcao [largura=" + largura + ", comprimento=" + comprimento + "]";
	}
	
	public void calcularArea () {
		double area=largura*comprimento ;
		JOptionPane.showInternalMessageDialog(null, "Area da construção: "+area );
	}
	public double calcularPerimetro() {
		
		return  largura+comprimento*2;
	}
	
     
}
