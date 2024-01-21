package comstrul;

import java.util.ArrayList;
import java.util.List;

public class TijoloComun extends Bloco {
    @Override
    public void listarBlocos() {
    	List<Bloco> tijoloComuns=new ArrayList<Bloco>();
    	
    	
        TijoloComun tijoloComun1=new TijoloComun();
        tijoloComun1.setNomeBloco("tijolo comun 5x10x21 cm");
        tijoloComun1.setLarguraBloco(0.5);
        tijoloComun1.setAlturaBloco(0.10);
        tijoloComun1.setComprimentoBloco(0.21);
        tijoloComuns.add(tijoloComun1);
        TijoloComun tijoloComun2=new TijoloComun();
        tijoloComun2.setNomeBloco("tijolo comun 4,3x9,1x19,1 cm");
        tijoloComun2.setLarguraBloco(0.043);
        tijoloComun2.setAlturaBloco(0.091);
        tijoloComun2.setComprimentoBloco(0.0191);
        tijoloComuns.add(tijoloComun2);
    }
}
