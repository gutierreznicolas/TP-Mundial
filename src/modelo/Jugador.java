package modelo;

import java.io.Serializable;

public class Jugador implements Serializable{

private static final long serialVersionUID = 383465161201125430L;

	String nombreApellido;
	String nacionalidad;
	double puntaje;
	String posicion;
	int Tarjetas;
	int Goles;
	public String imagen;
	
	public Jugador(String NombreCompleto , String seleccion ,String pos,String imagen)
	{
		nombreApellido=NombreCompleto;
		nacionalidad=seleccion;
		posicion=pos;
		this.imagen=imagen;
	}
	public String obtenerNombre() 
	{
		return nombreApellido;
	}
	public String obtenerNacionalidad() 
	{
		return nacionalidad;
	}
	public String obtenerPosicion() 
	{
		return posicion;
	}
	public void asignarPuntaje(int goles , int faltas , int tarjetas , int promedio) 
	{
		Goles=goles;
		Tarjetas=tarjetas;
		puntaje=(2*goles)-(faltas/10)-tarjetas+promedio;
	}
	public double obtenerPuntaje()
	{
		return puntaje;
	}
	
	
	

}
