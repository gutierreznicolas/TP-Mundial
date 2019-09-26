package Test;

import org.junit.Test;

import junit.framework.TestCase;
import modelo.Jugador;

public class TestJugador extends TestCase {

	@Test
	public void testAsignarPuntaje() {
		Jugador jug=obtenerJugador();
		jug.asignarPuntaje(51, 6, 6, 94);
		
		assertEquals(190.0,jug.obtenerPuntaje());
		}
	
	private Jugador obtenerJugador() {
		Jugador jugador=new Jugador("Lionel Messi","Argentina","puntero izquierdo","Imagenes\\lionel messi.jpg");
		return jugador;
	}
}
