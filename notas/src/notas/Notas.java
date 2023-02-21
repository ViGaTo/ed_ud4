package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
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
 * @param numero
 * @return
 * @deprecated Use {@link notas.califica#califica(int)} instead
 */
public static String cali(int numero) {
	return notas.califica.califica(numero);
}

/**
 * @param num_nota
 * @return
 * @deprecated Use {@link califica#califica(int)} instead
 */
public static String califica(int num_nota) {
	return califica.califica(num_nota);
}
}