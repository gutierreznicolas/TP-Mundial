package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import modelo.Equipo;
import modelo.Jugador;
import modelo.SolverGoloso;

public class HerramientasInterface  {
	
	
	
public void crearBoton(JButton boton , int medida1,int medida2,int medida3, int medida4,JFrame Pantalla,Color color,int TamañoLetra) {
		
		boton.setFont(new Font("Unispace", Font.ITALIC, TamañoLetra));
		boton.setBackground(color);
		boton.setBounds(medida1, medida2, medida3, medida4);
		Pantalla.getContentPane().add(boton);
	}
	public int SacarCartelInt(String texto){
	 int valor;
	 valor=Integer.parseInt(JOptionPane.showInputDialog(texto));
	 return valor;
	}
	
	
	
	public void CambiarColor(JFrame jframe,Color color) {
		
		jframe.getContentPane().setBackground(color);
	
		
	}
	public void IngresarTexto(JLabel jlabel,JFrame jframe,int tamañoLetra ,Color color,int medida1,int medida2,int medida3, int medida4) {
		
		jlabel.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel.setFont(new Font("Unispace", Font.ITALIC, tamañoLetra));
		jlabel.setBounds(medida1, medida2, medida3, medida4);
		jlabel.setForeground(color);
		jframe.getContentPane().add(jlabel);
	}
	public void CargarImagen(JLabel jlabel,String icono , int medida1  , int medida2  , int medida3  ,int medida4 ,JFrame Pantalla) {
		jlabel.setIcon(new ImageIcon(icono));
		jlabel.setBounds(medida1,medida2,medida3,medida4);
		Pantalla.getContentPane().add(jlabel);
	}
	
		public void ponerIcono(String imagen,JFrame Pantalla) {
			Pantalla.setIconImage(Toolkit.getDefaultToolkit().getImage(imagen));
		}
		public void sonidoCorto(Clip clip) {
			try{
				clip= AudioSystem.getClip();
				File a = new File("Sonido\\botonSonido.wav");
				clip.open(AudioSystem.getAudioInputStream(a));
				clip.start();
				
				}
				catch (Exception tipoerror) {
					System.out.println("" + tipoerror);
				}
		}
		public void mostrarEquipo(Equipo equipoIdealGoloso,JFrame frame,Clip clip){
			frame.setVisible(false);
			JFrame MostrarEquipo=new JFrame();
			ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", MostrarEquipo);
			MostrarEquipo.setBounds(100, 100, 1200, 800);		
			MostrarEquipo.setVisible(true);
			CambiarColor(MostrarEquipo, Color.GREEN);
			
			JLabel ImagenPunteroIzquierdo = new JLabel();
			JLabel ImagenCentroDelantero = new JLabel();
			JLabel ImagenPunteroDerecho = new JLabel();
			JLabel ImagenVolanteIzquierdo = new JLabel();
			JLabel ImagenVolanteCentral = new JLabel();
			JLabel ImagenVolanteDerecho = new JLabel();
			JLabel ImagenArquero = new JLabel();
			JLabel ImagenLateralDerecho = new JLabel();
			JLabel ImagenCentralDerecho = new JLabel();
			JLabel ImagenCentralIzquierdo = new JLabel();
			JLabel ImagenLateralIzquierdo = new JLabel();
			
			JButton BotonAtras = new JButton("ATRAS");
			crearBoton(BotonAtras, 0, 0, 89, 23, MostrarEquipo, Color.YELLOW, 15);
			JButton BotonVerPuntajeDelEquipo = new JButton("VER PUNTAJE DEL EQUIPO");
			crearBoton(BotonVerPuntajeDelEquipo, 425, 0, 260, 35, MostrarEquipo, Color.WHITE, 15);
			JButton BotonGuardarEstado = new JButton("GUARDAR");
			crearBoton(BotonGuardarEstado, 1036, 4, 138, 20, MostrarEquipo, Color.WHITE, 15);
			
			ArrayList<Jugador>jugadores=new ArrayList<Jugador>();
			CargarImagen(ImagenPunteroIzquierdo,equipoIdealGoloso.obtenerJugadorPorPosicion("puntero izquierdo",equipoIdealGoloso.equipo).imagen, 855, 117, 156, 162, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("puntero izquierdo",equipoIdealGoloso.equipo));
			CargarImagen(ImagenCentroDelantero,equipoIdealGoloso.obtenerJugadorPorPosicion("centro delantero",equipoIdealGoloso.equipo).imagen, 970, 344, 141, 164, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("centro delantero",equipoIdealGoloso.equipo));
			CargarImagen(ImagenPunteroDerecho, equipoIdealGoloso.obtenerJugadorPorPosicion("puntero derecho",equipoIdealGoloso.equipo).imagen, 890, 595, 135, 156, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("puntero derecho",equipoIdealGoloso.equipo));
			CargarImagen(ImagenVolanteIzquierdo, equipoIdealGoloso.obtenerJugadorPorPosicion("volante izquierdo",equipoIdealGoloso.equipo).imagen,550, 134, 121, 145, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("volante izquierdo",equipoIdealGoloso.equipo));
			CargarImagen(ImagenVolanteCentral,equipoIdealGoloso.obtenerJugadorPorPosicion("volante central",equipoIdealGoloso.equipo).imagen, 483, 354, 126, 145, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("volante central",equipoIdealGoloso.equipo));
			CargarImagen(ImagenVolanteDerecho, equipoIdealGoloso.obtenerJugadorPorPosicion("volante derecho",equipoIdealGoloso.equipo).imagen, 525, 587, 128, 125, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("volante derecho",equipoIdealGoloso.equipo));
			CargarImagen(ImagenArquero, equipoIdealGoloso.obtenerJugadorPorPosicion("arquero",equipoIdealGoloso.equipo).imagen, 45, 360, 145, 128, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("arquero",equipoIdealGoloso.equipo));
			CargarImagen(ImagenLateralDerecho,equipoIdealGoloso.obtenerJugadorPorPosicion("lateral derecho",equipoIdealGoloso.equipo).imagen, 240, 634, 136, 128, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("lateral derecho",equipoIdealGoloso.equipo));
			CargarImagen(ImagenCentralDerecho, equipoIdealGoloso.obtenerJugadorPorPosicion("central derecho",equipoIdealGoloso.equipo).imagen,214, 468, 141, 123, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("central derecho",equipoIdealGoloso.equipo));
			CargarImagen(ImagenCentralIzquierdo, equipoIdealGoloso.obtenerJugadorPorPosicion("central izquierdo",equipoIdealGoloso.equipo).imagen, 192, 234, 126, 115, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("central izquierdo",equipoIdealGoloso.equipo));
			CargarImagen(ImagenLateralIzquierdo, equipoIdealGoloso.obtenerJugadorPorPosicion("lateral izquierdo",equipoIdealGoloso.equipo).imagen, 250, 117, 126, 106, MostrarEquipo);
			jugadores.add(equipoIdealGoloso.obtenerJugadorPorPosicion("lateral izquierdo",equipoIdealGoloso.equipo));
			JLabel nuevaCancha = new JLabel();
			CargarImagen(nuevaCancha, "Imagenes\\1491127204-95410191gettyimages-488144002.jpg", 0, 117, 1194, 645, MostrarEquipo); 
			JOptionPane.showMessageDialog(null,equipoIdealGoloso.toString());
			
			BotonAtras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sonidoCorto(clip);
					MostrarEquipo.setVisible(false);
					frame.setVisible(true);
				}
			});
			BotonVerPuntajeDelEquipo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sonidoCorto(clip);
					JOptionPane.showMessageDialog(null, "EL PUNTAJE DEL EQUIPO ES: "+Puntaje(jugadores));
				}
			});
			BotonGuardarEstado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					sonidoCorto(clip);
					String nombreArchivo = JOptionPane.showInputDialog("Escriba el nombre del archivo");
					try 
					 {
					 FileOutputStream fos = new FileOutputStream(nombreArchivo);
					 ObjectOutputStream out = new ObjectOutputStream(fos);
					 out.writeObject(equipoIdealGoloso);
					 out.close();
					 }
					 catch (Exception ex)
					 {
					 ex.printStackTrace();
					 }
				}
			});
			
		}
		public  void LLenarJComboBoxPosicion(JComboBox<String> combo,String posicion,SolverGoloso equipoIdealGoloso) {
			for(int i=0;i<32;i++) {
				combo.addItem(equipoIdealGoloso.obtenerListaDeJugadoresPorPosicion(posicion).get(i).obtenerNombre());
			}
		}
		private double Puntaje(ArrayList<Jugador> seleccion) {
			double puntaje=0;
			for(int i=0;i<seleccion.size();i++) {
				puntaje=puntaje+seleccion.get(i).obtenerPuntaje();
			}
			return puntaje;
		}
		
}
