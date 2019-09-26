package Test;



import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;
import modelo.Equipo;
import modelo.Jugador;

public class TestEquipo extends TestCase {
	
	

	@Test
	public void testObtenerPorPosicion() {
		Equipo qu=obtenerEquipo();
		
		assertEquals("Franco Armani",qu.equipo.get(0).obtenerNombre());
		}
	@Test
	public void testYaEstaPosicion() {
		Equipo qu=obtenerEquipo();
		assertTrue(qu.yaEstaLaPosicion("arquero"));
	}
	
	
	private Equipo obtenerEquipo() {
		Equipo equipo=new Equipo();
		ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
		Jugador jug1=new Jugador("Franco Armani","Argentina","arquero","Imagenes\\franco Armani.jpg");
		jug1.asignarPuntaje(0,0, 0, 87);
		jugadores.add(jug1);
		Jugador jug2=new Jugador("Nicolas Otamendi","Argentina","central derecho","Imagenes\\nicolas otamendi.jpg");
		jug2.asignarPuntaje(9, 9, 9, 87);
		jugadores.add(jug2);
		Jugador jug3=new Jugador("Federico Fazio","Argentina","central izquierdo","Imagenes\\federico fazzio.jpg");
		jug3.asignarPuntaje(2, 6, 6, 83);
		jugadores.add(jug3);
		Jugador jug4=new Jugador("Nicolas Tagliafico","Argentina","lateral izquierdo","Imagenes\\nicolas tagliafico.jpg");
		jug4.asignarPuntaje(2, 11, 11, 81);
		jugadores.add(jug4);
		Jugador jug5=new Jugador("Gabriel Mercado","Argentina","lateral derecho","Imagenes\\gabriel mercado.jpg");
		jug5.asignarPuntaje(1, 6, 6, 80);
		jugadores.add(jug5);
		Jugador jug6=new Jugador("Lucas Biglia","Argentina","volante derecho","Imagenes\\lucas biglia.jpg");
		jug6.asignarPuntaje(2, 10, 10, 83);
		jugadores.add(jug6);
		Jugador jug7=new Jugador("Ever Banega","Argentina","volante izquierdo","Imagenes\\ever banega.jpg");
		jug7.asignarPuntaje(5, 18, 18, 83);
		jugadores.add(jug7);
		Jugador jug8=new Jugador("Giovani Lo Celso","Argentina","volante central","Imagenes\\lo celso.jpg");
		jug8.asignarPuntaje(6, 4, 4, 77);
		jugadores.add(jug8);	

		Jugador jug9=new Jugador("Lionel Messi","Argentina","puntero izquierdo","Imagenes\\lionel messi.jpg");
		jug9.asignarPuntaje(51, 6, 6, 94);	
		jugadores.add(jug9);
		Jugador jug10=new Jugador("Angel Di Maria","Argentina","puntero derecho","Imagenes\\angel di maria.jpg");
		jug10.asignarPuntaje(23, 2, 2, 86);	
		jugadores.add(jug10);

		Jugador jug11=new Jugador("Sergio Aguero","Argentina","centro delantero","Imagenes\\sergio aguero.jpg");
		jug11.asignarPuntaje(28, 3, 3, 88);	
		jugadores.add(jug11);
		equipo.equipo=jugadores;
		
		return equipo;
	}

}
