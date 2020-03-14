package ex_3_1;
//singleton lazy
class Incremental {
	private static Incremental inc = null;
	private static int count = 0; 
	private int numero;
	
	private Incremental() { 
		numero = ++count;
	}
	
	public static Incremental getInstance() {
		if (inc == null) {
			inc = new Incremental();
		}
		return inc;
	}
	public String toString() {
		return "Incremental " + numero; 
	}
}
