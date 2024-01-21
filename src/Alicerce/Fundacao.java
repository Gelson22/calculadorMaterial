package Alicerce;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import comstrul.Bloco;
import comstrul.BlocoCeramico;
import comstrul.BlocoConcreto;
import comstrul.Construcao;
import comstrul.TijoloComun;
import comstrul.Viga;

public class Fundacao {
	private double alturafundacao;
	private double perimetroFundacao  ;  
    
	Bloco blocoCeramico=new BlocoCeramico() ;
	Bloco blocoConcreto=new BlocoConcreto();
	Bloco tijoloComun=new TijoloComun();
	 private void blocoCeramico1() {
		blocoCeramico.getLarguraBloco();

	}
	 public Bloco getBlocoCeramico() {
		return blocoCeramico;
	}
	public void setBlocoCeramico(Bloco blocoCeramico) {
		this.blocoCeramico = blocoCeramico;
	}
	public Bloco getBlocoConcreto() {
		return blocoConcreto;
	}
	public void setBlocoConcreto(Bloco blocoConcreto) {
		this.blocoConcreto = blocoConcreto;
	}
	public Bloco getTijoloComun() {
		return tijoloComun;
	}
	public void setTijoloComun(Bloco tijoloComun) {
		this.tijoloComun = tijoloComun;
	}
	private void blocoCeramico2() {
		blocoCeramico.getLarguraBloco();

	}
	 private void blocoCeramico3() {
		blocoCeramico.getLarguraBloco();

	};

	private Construcao construcao=new Construcao ();
	
	public Construcao getConstrucao() {
		return construcao;
	}
	public void setConstrucao(Construcao construcao) {
		this.construcao = construcao;
	}
	
	public double getAlturafundacao() {
		return alturafundacao;
	}
	public void setAlturafundacao(double alturafundacao) {
		this.alturafundacao = alturafundacao;
	}
	public double getPerimetroFundacao() {
		return perimetroFundacao;
	}
	public void setPerimetroFundacao(double perimetroFundacao) {
		this.perimetroFundacao = perimetroFundacao;
	}
	
    private Viga viga  =new Viga ( );
    
	public Viga getViga() {
		return viga;
	}
	public void setViga(Viga viga) {
		this.viga = viga;
	}
    
	public void escolherBloco() {
		String blocoAlicerse=JOptionPane.showInputDialog("qual tipo de bloco deseja usar no alicerse ? \n1-bloco ceramico \n 2-bloco de concreto \n 3-tijolo comum") ;
		
		switch(Integer.valueOf(blocoAlicerse)) {
		case 1:JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico !");
			 String opcaoBlocoCeramico=JOptionPane.showInputDialog(null, "Qual bloco cerâmico deseja utilizar ?\n  1 - bloco cerâmico 6 furos 9x14x19 cm \\n 2 -bloco ceramico 6 furos 9x14x24 cm \\n 3 - bloco ceramico 8 furos 9x19x19 cm \\n 4 - bloco ceramico 8 furos 9x19x24 cm \\n 5 - bloco ceramico 8 furos 9x19x29 cm \\n 6 - bloco ceramico 9 furos 11,5x14x24 cm \\n 7 - bloco ceramico 9 furos 11,5x19x19 cm \\n 8 - bloco ceramico 9 furos 11,5x19x24 cm \\n 9 - bloco ceramico 9 furos 11,5x19x29 cm \\n 10 - bloco ceramico 12 furos 14x19x19  cm \\n 11 - bloco ceramico 12 furos 14x19x24 cm \\n 12 - bloco ceramico 12 furos 14x19x29 cm  ");
			 switch (Integer.valueOf(opcaoBlocoCeramico)) {
			    case 1:
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco cerâmico 6 furos 9x14x19 cm ");
			    	 blocoCeramico1();
			    	break;
			    	
			    	    
			    	    
			    case 2: 
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 6 furos 9x14x24 cm ");
			    	break;
			    case 3:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 8 furos 9x19x19 cm ");
			    	break;
			    case 4:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 8 furos 9x19x24 cm ");
			    	break;
			    case 5:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi  bloco ceramico 8 furos 9x19x29 cm ");
			    	break;
			    case 6:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 9 furos 11,5x14x24 cm ");
			    	break;
			    case 7:                                                                               
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 9 furos 11,5x19x19 cm ");
			    	break;
			    case 8:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 9 furos 11,5x19x24 cm ");
			    	break;
			    case 9:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 9 furos 11,5x19x29 cm  ");
			    	break;
			    case 10:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 12 furos 14x19x19  cm ");
			    	break;
			    case 11:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 12 furos 14x19x24 cm ");
			    	break;
			    case 12:  
			    	JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco ceramico 12 furos 14x19x29 cm");
			    	break;
			 }
			break; 
 		case 2:JOptionPane.showMessageDialog(null, "o bloco escolhido foi bloco de concreto  !");
 		     String opcaoBlocoConcreto=JOptionPane.showInputDialog("Qual bloco de concreto deseja utilizar ?\n 1 - bloco de concreto 11,5x19x24 cm \\n 2 - bloco de concreto 11,5x19x36,5 cm  \\n 3 - bloco de concreto 14x19x29 cm \\n 4 - bloco de concreto 9x19x39 cm \\n 5 - bloco de concreto 14x19x39 cm \\n 6 - bloco de concreto 19x19x39 cm \\n 7 - bloco de concreto 9x19x29 cm ");
 		     
 		    break; 
		case 3:JOptionPane.showMessageDialog(null, "o bloco escolhido foi tijolo comum  !");
		     String opcaoTijoloComum=JOptionPane.showInputDialog("Qual tijolo comun deseja utilizar ?\n 1- tijolo comum 5x10x21 cm \\n 2 - tijolo comum 4,3x9,1x19,1 cm ");
		    break; 
		}
	}
    
}
