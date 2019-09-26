package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;



public class Equipo implements Serializable
{
	public ArrayList<Jugador> Listajugadores;
	private Datos datos=new Datos();
	public ArrayList<Jugador> equipo=new ArrayList<Jugador>();
	private double puntajeElite=87;
	public double puntajeEquipo=0;
	private static final long serialVersionUID = 5599111638521712467L;
	
	public Equipo()
	{
		Listajugadores=new ArrayList<Jugador>();
		datos.asignarJugadores(Listajugadores);
		armarEquipo();
		
	}
	public Jugador get(int i) {
		return equipo.get(i);
	}
	

	private void armarEquipo() {
		
		Random aleatorio = new Random(System.currentTimeMillis());
		while(equipo.size()!=11) {
			
				int intAletorio = aleatorio.nextInt(352);
				
				if(!yaEstaLaPosicion(Listajugadores.get(intAletorio).posicion)&& Listajugadores.get(intAletorio).puntaje>puntajeElite) {
					equipo.add(Listajugadores.get(intAletorio));
					puntajeEquipo=puntajeEquipo+Listajugadores.get(intAletorio).puntaje;
				}
			
			
		}
	}

	public boolean yaEstaLaPosicion(String posicion) {
		for(int i=0;i<equipo.size();i++) {
			if(equipo.get(i).posicion==posicion) {
				return true;
			}
		}
		return false;
	}
	public int tamaño() {
		return equipo.size();
	}
	public ArrayList<Jugador> obtenerSeleccion(String pais){
		ArrayList<Jugador> seleccion=new ArrayList<Jugador>();
		for(int i=0;i<Listajugadores.size();i++) {
			if(Listajugadores.get(i).obtenerNacionalidad()==pais) {
				seleccion.add(Listajugadores.get(i));
			}
		}
		return seleccion;
	}
	public Jugador obtenerJugadorPorPosicion(String posicion,ArrayList<Jugador> lista){
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).posicion==posicion){
				return lista.get(i);
			}
		}
		throw new RuntimeException("la posicion ingresada no existe");
	}
	
	
	
		public ArrayList<Jugador> listaOrdenada(){
			ArrayList<Jugador> jugadores=Listajugadores;
			
			ordenarPorPuntaje(jugadores,new Comparator<Jugador>()
			{
				@Override
				public int compare(Jugador uno, Jugador otro) {
					if( uno.obtenerPuntaje() < otro.obtenerPuntaje() )
						return -1;
					else if( uno.obtenerPuntaje() > otro.obtenerPuntaje() )
						return 1;
					else
						return 0;			
			}});
			Collections.reverse(jugadores);
			return jugadores;  
		}
		private ArrayList<Jugador> ordenarPorPuntaje(ArrayList<Jugador> lista,Comparator<Jugador> comparador){
			
			ArrayList<Jugador> ret =lista;
			Collections.sort(ret, comparador);
			
			return ret;
			
			}
		
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(" Arquero: "+obtenerJugadorPorPosicion("arquero",equipo).obtenerNombre()+
								"\n central derecho: "+obtenerJugadorPorPosicion("central derecho",equipo).obtenerNombre()+
							    "\n central izquierdo: "+obtenerJugadorPorPosicion("central izquierdo",equipo).obtenerNombre()+
							    "\n lateral derecho: "+obtenerJugadorPorPosicion("lateral derecho",equipo).obtenerNombre()+
								"\n lateral izquierdo: "+obtenerJugadorPorPosicion("lateral izquierdo",equipo).obtenerNombre()+
								"\n volante derecho: "+obtenerJugadorPorPosicion("volante derecho",equipo).obtenerNombre()+
								"\n volante central: "+obtenerJugadorPorPosicion("volante central",equipo).obtenerNombre()+
								"\n volante izquierdo: "+obtenerJugadorPorPosicion("volante izquierdo",equipo).obtenerNombre()+
								"\n puntero derecho: "+obtenerJugadorPorPosicion("puntero derecho",equipo).obtenerNombre()+
								"\n centro delantero: "+obtenerJugadorPorPosicion("centro delantero",equipo).obtenerNombre()+
								"\n puntero izquierdo: "+obtenerJugadorPorPosicion("puntero izquierdo",equipo).obtenerNombre());
		return sb.toString();
	}
	

}
