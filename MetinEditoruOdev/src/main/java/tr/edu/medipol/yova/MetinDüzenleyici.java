package tr.edu.medipol.yova;

import org.apache.commons.lang3.StringUtils;

public final class MetinDüzenleyici {

	
	public static String bosluklariTemizle(String orjinal) {
		return StringUtils.deleteWhitespace(orjinal);
		
	}
	
	public static String kisaltVeBuyukHarfeCevir(String orjinal) {
		 return StringUtils.abbreviateMiddle(orjinal,"." ,20).toUpperCase();
				 
	}
	
}
