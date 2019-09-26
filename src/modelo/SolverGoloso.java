package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class SolverGoloso implements Serializable {
	public Equipo equipoIdeal=new Equipo();
	private Equipo posible=new Equipo();
	public Equipo equipoGolosoPuro=new Equipo();
	private static final long serialVersionUID = 1783898258333749299L;
	ArrayList<Jugador> jugadores=equipoIdeal.listaOrdenada();
	public SolverGoloso(){
		
		while(SuperaLimiteAmarillas(equipoIdeal)||SuperaLimiteNacionalidad(equipoIdeal)||SuperaLimiteGoles0(equipoIdeal)||NoSuperaPuntajeElite(equipoIdeal)) {
			
			equipoIdeal=new Equipo();
		
		}
	}
	
	
	public void EquipoIdealHeuristica() {
		int i=0;
		while(i!=200) {
			GenerarEquipoPosible();
			if(posible.puntajeEquipo>equipoIdeal.puntajeEquipo) {
				equipoIdeal=posible;
			}
			i++;
		}
	}
	private void GenerarEquipoPosible() {
		while(SuperaLimiteAmarillas(posible)||SuperaLimiteNacionalidad(posible)||SuperaLimiteGoles0(posible)||NoSuperaPuntajeElite(posible)) {
			posible=new Equipo();
		}
	}
	
	public void golosoPuro() {
		
		
		equipoGolosoPuro.equipo.removeAll(equipoGolosoPuro.equipo);
		
		for(Jugador jug:jugadores) {
			
				if(!equipoGolosoPuro.yaEstaLaPosicion(jug.posicion)&&equipoGolosoPuro.tamaño()!=11 && !JugadorCondicionaEquipo(equipoGolosoPuro,jug)) {
	
						equipoGolosoPuro.equipo.add(jug);
						
				}else {
					
				}
				
			}
	
			
			
		}
	
	private boolean JugadorCondicionaEquipo(Equipo equipo,Jugador jugador){
		Equipo aux=equipo;
		aux.equipo=equipo.equipo;
		aux.equipo.add(jugador);
		if(NoSuperaCondiciones(aux)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	public boolean NoSuperaCondiciones(Equipo equipo) {
		if(SuperaLimiteAmarillas(equipo)||SuperaLimiteNacionalidad(equipoIdeal)||SuperaLimiteGoles0(equipoIdeal) ) {
			return true;
		}
		return false;
	}
	
	private boolean SuperaLimiteAmarillas(Equipo equipo) {
		if(CantidadDeJugadoresCon5Tarjetas(equipo)>4) {
			return true;
		}
		return false;
		
	}


	private int CantidadDeJugadoresCon5Tarjetas(Equipo equipo) {
		int masDe5=0;
		for(int i=0;i<equipo.tamaño();i++) {
			if(equipo.get(i).Tarjetas>5) {
				masDe5++;
			}
		}
		return masDe5;
	}
	private boolean SuperaLimiteNacionalidad(Equipo equipo) {
		ArrayList<String> paisesRevisados=new ArrayList<String>();
		for(int i=0;i<equipo.tamaño();i++) {
			if(paisesRevisados.contains(equipo.get(i).nacionalidad)) {
				
			}
			else{
				paisesRevisados.add(equipo.get(i).nacionalidad);
				if(cantidadDeJugadoresDelPais(equipo.get(i).nacionalidad,equipo)>3) {
					return true;
				
			}
			}
		}
		return false;
	}
	private int cantidadDeJugadoresDelPais(String pais,Equipo equipo) {
		int jugadoresDelPais=0;
		for(int i=0;i<equipo.tamaño();i++) {
			if(equipo.get(i).nacionalidad==pais) {
				jugadoresDelPais++;
			}
		}
		return jugadoresDelPais;
	}
	private boolean SuperaLimiteGoles0(Equipo equipo) {
		if(cantidadDeJugadoresCon0Goles(equipo)>6) {
			return true;
		}
		return false;
	}
	private int cantidadDeJugadoresCon0Goles(Equipo equipo) {
		int Jugadores0Goles=0;
		for(int i=0;i<equipo.tamaño();i++) {
			if(equipo.get(i).Goles==0) {
				Jugadores0Goles++;
			}
		}
		return Jugadores0Goles;
	}
	private boolean NoSuperaPuntajeElite(Equipo equipo) {
		if(equipo.puntajeEquipo<1300) {
			return true;
		}
		return false;
	}
	public Jugador obtenerJugadorPorNombre(String nombreApellido) {
		for(int i=0;i<350;i++) {
			if(equipoIdeal.Listajugadores.get(i).obtenerNombre()==nombreApellido) {
				return equipoIdeal.Listajugadores.get(i);
			}
		}
		throw new RuntimeException("no existe nombre");
		
	}
	
	public ArrayList<Jugador> obtenerListaDeJugadoresPorPosicion(String posicion){
		ArrayList<Jugador> lista=new ArrayList<Jugador>();
		
		for(int i=0;i<equipoIdeal.Listajugadores.size();i++) {
			if(equipoIdeal.Listajugadores.get(i).posicion==posicion){
				lista.add(equipoIdeal.Listajugadores.get(i));
			}
		}
		return lista;
	}
	
	

}
