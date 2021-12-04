package br.edu.univas.ComProxy;

public class main {

	public static void Main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		image.display(); 
		System.out.println("");
		image.display();
	}

}
