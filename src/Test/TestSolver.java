package Test;

import org.junit.Test;

import junit.framework.TestCase;

import modelo.SolverGoloso;

public class TestSolver extends TestCase {
	
	@Test
	public void testObtenerPorNombre() {
		SolverGoloso solver=obtenerSolver();
		
		assertEquals("Franco Armani",solver.obtenerJugadorPorNombre("Franco Armani").obtenerNombre());
		
		}
	@Test
	public void testCumpleCondiciones() {
		SolverGoloso solver=obtenerSolver();
		
		assertFalse(solver.NoSuperaCondiciones(solver.equipoIdeal));
	}
	private SolverGoloso obtenerSolver() {
		SolverGoloso solver=new SolverGoloso();
		return solver;
	}

}
