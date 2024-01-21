package comstrul;

import javax.swing.JOptionPane;

import Alicerce.Fundacao;


public class Principal {
	public static void main(String[] args) {
        /*clase construcao */
		
		String largura= JOptionPane.showInputDialog("Qual vai ser a largura da casa ?");
		String comprimento = JOptionPane.showInputDialog("Qual vai ser o comprimento  da casa ?");
		
		Construcao construcao=new Construcao();
		construcao.setLargura(Double.valueOf(largura));
		construcao.setComprimento(Double.valueOf(comprimento));
		construcao.calcularArea();
		construcao.calcularPerimetro();
		JOptionPane.showInternalMessageDialog(null, "perimetro da construção: "+construcao.calcularPerimetro()  );
		
	    Viga viga =new Viga();
	    Bloco blocoCeramico=new BlocoCeramico();
	    viga.setLarguraViga(blocoCeramico.getLarguraBloco()); 
		System.out.println(viga.getLarguraViga());
	  /*fundação */
		Fundacao fundacao=new Fundacao();
		
		String estacas=JOptionPane.showInputDialog("qual distancia de estacas deseja adicionar na fundação ?");
		String alturaFundacao =JOptionPane.showInputDialog("Qual sera a altura do alicerse  ?");
	    String alturaVigaFundacao=JOptionPane.showInputDialog("Qual a altura das vigas da fundação ?");
	    
		fundacao.setPerimetroFundacao(fundacao.getConstrucao().calcularPerimetro());
		fundacao.setAlturafundacao(Double.parseDouble(alturaFundacao));
		fundacao.getViga().setAlturaViga(Double.parseDouble(alturaVigaFundacao));
		
	}
}
