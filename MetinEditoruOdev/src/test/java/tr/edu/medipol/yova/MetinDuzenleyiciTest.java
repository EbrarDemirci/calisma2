package tr.edu.medipol.yova;

import org.junit.Test;

import static org.junit.Assert.*;


public class MetinDuzenleyiciTest {

	@Test
	public void bosluklarıtemizle_BosluklarıTemizle() {
		String orjinal = "    GÜ   N  A    Y D  I  N" ;
		
    	String sonuc = MetinDüzenleyici.bosluklariTemizle(orjinal);
		
    	assertEquals("Beklenmedik sonuç","GÜNAYDIN",sonuc);
    	
	}
	@Test
	public void bosluklarıtemizle_BoslukVarsaOlanlarıTemizle() {
		String orjinal = "    GÜ   N  A    Y D  I  N" ;
		
    	String sonuc = MetinDüzenleyici.bosluklariTemizle(orjinal);
		
    	assertEquals("Metnin düzeltilmiş hali","GÜNAYDIN",sonuc);
    	
	}
	
	@Test
	public void bosluklarıtemizle_BoslukYoksaAynenYaz() {
		String orjinal = "TÜNAYDIN" ;
		
    	String sonuc = MetinDüzenleyici.bosluklariTemizle(orjinal);
		
    	assertEquals("Aynen geri dönen sonuç",orjinal,sonuc);
    	
	}
	@Test
	public void bosluklarıtemizle_BoşMetinVarsaHataVermeli() {
		String orjinal = "        " ;
		
    	String sonuc = MetinDüzenleyici.bosluklariTemizle(orjinal);
		
    	assertEquals("Alanı boş bırakmayınız","",sonuc);
    	
	}

	
}
