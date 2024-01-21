package comstrul;

import java.util.ArrayList;
import java.util.List;

public abstract class  Bloco {
	protected String nomeBloco;
	protected double larguraBloco ;
	protected double comprimentoBloco ;
	protected double alturaBloco ;
	
	
	public String getNomeBloco() {
		return nomeBloco;
	}
	public void setNomeBloco(String nomeBloco) {
		this.nomeBloco = nomeBloco;
	}
	public double getLarguraBloco() {
		return larguraBloco;
	}
	public void setLarguraBloco(double larguraBloco) {
		this.larguraBloco = larguraBloco;
	}
	public double getComprimentoBloco() {
		return comprimentoBloco;
	}
	public void setComprimentoBloco(double comprimentoBloco) {
		this.comprimentoBloco = comprimentoBloco;
	}
	public double getAlturaBloco() {
		return alturaBloco;
	}
	public void setAlturaBloco(double alturaBloco) {
		this.alturaBloco = alturaBloco;
	}
	public abstract void listarBlocos() ;
	
	}
	



