package TareaDavid.TareaDavid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 *
 * @author Valenciano
 * 28 may 2026
 */
public class GestorNotasTest {

	@Test
	void calcularMediaTest() {
		assertEquals(6, GestorNotas.calcularMedia(5, 6, 7));
		
	}

	@Test
	void estaAprobadoTest() {
		assertTrue(GestorNotas.estaAprobado(5));

	}

	@Test
	void notaTextoTest () {
    	assertEquals("Aprobado", GestorNotas.notaTexto(6));

	}
	
}