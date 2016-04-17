package Default;

public class DESSimplificado {

	public static void main(String args[]) throws Exception {
		MapeamentoDeLetras mapa = new MapeamentoDeLetras();
		int K = Integer.parseInt("0111111101", 2);
		SDES A = new SDES(K);
		int m = Integer.parseInt("10100010", 2);
		System.out.print("\nChave K1: ");
		SDES.printaDado(A.K1, 8);
		System.out.print("\nChave K2: ");
		SDES.printaDado(A.K2, 8);
		m = A.decripta(m);
		System.out.print("\nMensagem decriptada: ");
		SDES.printaDado(m, 8);
		System.out.println();		
		String s = Integer.toBinaryString(m);
		String m1 = "0"+s.substring(0, 3);
		String m2 = "0"+s.substring(4, 7);
		mapa.retornaLetra(m1);
		System.out.println();
		mapa.retornaLetra(m2);
		System.out.println();

		System.out.println("\nCodificando os 4 bits mais significativos:");
		int n = Integer.parseInt(m1);
		n = A.encripta(n);
		System.out.print("\nMensagem encriptada: ");
		SDES.printaDado(n, 4);
		System.out.println();
		String letra1 = Integer.toBinaryString(n);
		letra1 = letra1.substring(3, 7);
		mapa.retornaLetra(letra1);

		System.out.println("\nCodificando os 4 bits menos significativos:");
		n = Integer.parseInt(m2);
		n = A.encripta(n);
		System.out.print("\nMensagem encriptada: ");
		SDES.printaDado(n, 4);
		System.out.println();
		String letra2 = Integer.toBinaryString(n);
		System.out.println(letra2);
		letra2 = letra2.substring(1, 5);
		mapa.retornaLetra(letra2);
	}
}