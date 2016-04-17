package Default;

import java.util.HashMap;

public class MapeamentoDeLetras {
	HashMap<String, String> mapa = new HashMap<String, String>();

	public MapeamentoDeLetras() {
		mapa.put("0000", "A");
		mapa.put("0001", "B");
		mapa.put("0010", "C");
		mapa.put("0011", "D");
		mapa.put("0100", "E");
		mapa.put("0101", "F");
		mapa.put("0110", "G");
		mapa.put("0111", "H");
		mapa.put("1000", "I");
		mapa.put("1001", "J");
		mapa.put("1010", "K");
		mapa.put("1011", "L");
		mapa.put("1100", "M");
		mapa.put("1101", "N");
		mapa.put("1110", "O");
		mapa.put("1111", "P");
	}

	public void retornaLetra(String bits) {
		if (mapa.containsKey(bits)) {
			System.out.println("A letra é = " + mapa.get(bits));
		} else {
			System.err.println("\nLetra não existe na listagem");
		}
	}
}
