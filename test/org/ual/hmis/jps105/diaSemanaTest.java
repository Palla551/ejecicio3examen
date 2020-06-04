package org.ual.hmis.jps105;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class diaSemanaTest {

	@ParameterizedTest // (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"1,1 -> lunes","2,2 -> martes","3,3 -> miercoles","4,4 -> jueves",
		"5,5 -> viernes","6,6 -> sabado","7,7 -> domingo", "8,otro valor -> Error!"})
	void testDiaSemana(int input, String expected) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(c.diaSemana(input), expected);
	}

}
