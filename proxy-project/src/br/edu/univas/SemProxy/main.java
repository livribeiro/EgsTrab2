package br.edu.univas.SemProxy;

public class main {

	public static void Main(String[] args) {
		RealImage image = new RealImage("test_10mb.jpg");
		
		image.display(); 
		System.out.println("");
		image.display(); 
	}

}
