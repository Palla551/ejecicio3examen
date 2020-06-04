package org.ual.hmis.jps105;

public class Ejercicio3 {
	
	public String diaSemana(int dia) {
		switch (dia) {
		case 1: return "1 -> lunes";
		case 2: return "2 -> martes";
		case 3: return "3 -> miercoles";
		case 4: return "4 -> jueves";
		case 5: return "5 -> viernes";
		case 6: return "6 -> sabado";
		case 7: return "7 -> domingo";

		default:
			return "otro valor -> Error!";
		}
	}

}
