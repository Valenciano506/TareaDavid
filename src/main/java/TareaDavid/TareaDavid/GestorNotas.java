package TareaDavid.TareaDavid;

/*
 *
 * @author Valenciano
 * 28 may 2026
 */
public class GestorNotas {
	
	public static void main(String[] args) {
		
		double media = calcularMedia(5, 6, 7);
		System.out.println("La media es: " + media);
		System.out.println(estaAprobado(media));
		System.out.println(notaTexto(media));
		notaMaxima(5, 6, 7);
		
	}

	public static double calcularMedia(double n1, double n2, double n3) {
		
		double media = (n1 + n2 + n3) / 3;
		return media;
		
	}

	public static boolean estaAprobado(double media) {
		
		if (media >= 5) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static String notaTexto(double media) {
		
		if (media < 5) {
			return "Suspenso";
		}
		else if (media >= 5 || media <= 6.99) {
			return "Aprobado";
		}
		else if (media >= 7 || media <= 8.99) {
			return "Notable";
		}
		else {
			return "Sobresaliente";
		}
		
	}

	public static double notaMaxima(double n1, double n2, double n3) {
		
		if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
			throw new IllegalArgumentException("No puede haber notas negativas o mayores que 10");
		}
		
		double max = n1;

	    if (n2 > max) {
	        max = n2;
	    }

	    if (n3 > max) {
	        max = n3;
	    }

	    return max;
		
	}

}
