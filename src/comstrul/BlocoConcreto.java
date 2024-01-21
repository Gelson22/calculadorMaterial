package comstrul;

import java.util.ArrayList;
import java.util.List;

public class BlocoConcreto extends Bloco {
  @Override
public void listarBlocos() {
	List<Bloco > blocosConcretos=new ArrayList<Bloco>();
	BlocoConcreto blocoConcreto1=new BlocoConcreto();
	blocoConcreto1.setNomeBloco("bloco de concreto 11,5x19x24 cm ");
	blocoConcreto1.setLarguraBloco(0.0115);
	blocoConcreto1.setAlturaBloco(0.19);
	blocoConcreto1.setComprimentoBloco(0.24);
	blocosConcretos.add(blocoConcreto1);
	BlocoConcreto blocoConcreto2=new BlocoConcreto();
	blocoConcreto2.setNomeBloco("bloco de concreto 11,5x19x36,5 cm");
	blocoConcreto2.setLarguraBloco(0.0115);
	blocoConcreto2.setAlturaBloco(0.19);
	blocoConcreto2.setComprimentoBloco(0.0365);
	blocosConcretos.add(blocoConcreto2);
	BlocoConcreto blocoConcreto3=new BlocoConcreto();
	blocoConcreto3.setNomeBloco("bloco de concreto 14x19x29 cm");
	blocoConcreto3.setLarguraBloco(0.14);
	blocoConcreto3.setAlturaBloco(0.19);
	blocoConcreto3.setComprimentoBloco(0.29);
	blocosConcretos.add(blocoConcreto3);
	BlocoConcreto blocoConcreto4=new BlocoConcreto();
	blocoConcreto4.setNomeBloco("bloco de concreto 9x19x39 cm");
	blocoConcreto4.setLarguraBloco(0.9);
	blocoConcreto4.setAlturaBloco(0.19);
	blocoConcreto4.setComprimentoBloco(0.39);
	blocosConcretos.add(blocoConcreto4);
	BlocoConcreto blocoConcreto5=new BlocoConcreto();
	blocoConcreto5.setNomeBloco("bloco de concreto 14x19x39 cm");
	blocoConcreto5.setLarguraBloco(0.14);
	blocoConcreto5.setAlturaBloco(0.19);
	blocoConcreto5.setComprimentoBloco(0.39);
	blocosConcretos.add(blocoConcreto5);
	BlocoConcreto blocoConcreto6=new BlocoConcreto();
	blocoConcreto6.setNomeBloco("bloco de concreto 19x19x39 cm");
	blocoConcreto6.setLarguraBloco(0.19);
	blocoConcreto6.setAlturaBloco(0.19);
	blocoConcreto6.setComprimentoBloco(0.39);
	blocosConcretos.add(blocoConcreto6);
	BlocoConcreto blocoConcreto7=new BlocoConcreto();
	blocoConcreto7.setNomeBloco("bloco de concreto 9x19x29 cm");
	blocoConcreto7.setLarguraBloco(0.9);
	blocoConcreto7.setAlturaBloco(0.19);
	blocoConcreto7.setComprimentoBloco(0.29);
	blocosConcretos.add(blocoConcreto7);
	
    }
}
