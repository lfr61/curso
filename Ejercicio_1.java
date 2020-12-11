package String;

public class Ejercicio_1 {

	public static void main(String[] args) {
		String nombre, apellido, nombreCompleto;
		nombre = "Pepito";
		apellido = "Pérez";
		nombreCompleto = nombre.concat(apellido);
		System.out.println("La cadena " + nombreCompleto + " tiene longitud " + nombreCompleto.length());
	}
}
