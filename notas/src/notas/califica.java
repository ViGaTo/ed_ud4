package notas;

/**
 * @author Victoriano
 *@version Final
 */
public class califica {
	/**
	 * @param num_nota Se introduce el parametro num_nota el cual es entero.
	 * @return Devuelve la calificación.
	 */
	public static String califica(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
		calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
		calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota <9)
		calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
		calificacion = "Sobresaliente";
		else
		calificacion = "El valor de la calificación introducida no es correcta";
		return calificacion;
	}

}
