package notas;

import java.util.Scanner;

public class Notas {
/**
 * @author Victoriano
 */
public static void main(String[] args) {
	/**
	 * @version Final
	 */
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int numero = 0;
String calificacion = "";
System.out.print("Introduzca el valor de una calificación: ");
numero = reader.nextInt();

calificacion = notas.califica.califica(numero);

System.out.println(calificacion);
reader.close();
}

/**
 * @param numero Parametro número del método cali (método obsoleto)
 * @return Devuelve la variable calificacion (método obsoleto)
 * @deprecated Use {@link notas.califica#califica(int)} instead
 */
public static String cali(int numero) {
	return notas.califica.califica(numero);
}

/**
 * @param num_nota Parametro introducido de la nota
 * @return Devuelve la variable calificación
 * @deprecated Use {@link califica#califica(int)} instead
 */
public static String califica(int num_nota) {
	return califica.califica(num_nota);
}
}