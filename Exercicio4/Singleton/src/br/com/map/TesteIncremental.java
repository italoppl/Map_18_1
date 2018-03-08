package br.com.map;

public class TesteIncremental {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {		
			System.out.println(Incremental.getInstance());
		}
	}
}
