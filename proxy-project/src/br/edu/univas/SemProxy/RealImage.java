package br.edu.univas.SemProxy;

public class RealImage {
	private String fileName;
	
	public RealImage(String fileName){
		this.fileName = fileName;
	}

	public void display() {
		loadFromDisk(fileName);
		System.out.println("Displaying " + fileName);
	}
	   
	private void loadFromDisk(String fileName){
		System.out.println("Loading from disk - " + fileName);
	}
}
