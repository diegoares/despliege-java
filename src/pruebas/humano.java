package pruebas;


import java.io.File;
import java.util.Scanner;

public class humano {
	private int id;

	
	private void hola() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Hola");
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private void initTodo() {
		File fichero = new File("hola.txt");
	}

}
