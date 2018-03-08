package br.com.map;

public class Incremental {
		
	private static int count ;
	private static Incremental instancia;

	public String toString() {
		return "Incremental " + count;
	}
	
	public static Incremental getInstance() {
		if (instancia == null){
			instancia = new Incremental();
			instancia.count++;
		}else {
			instancia.count++;
			return instancia;
		}
		return instancia;
	}
}
