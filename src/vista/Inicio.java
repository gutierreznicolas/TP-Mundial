package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.sound.sampled.Clip;

import javax.swing.JButton;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import controlador.HerramientasInterface;
import controlador.ModoEquipo;
import controlador.Cronograma;

public class Inicio {

	private JFrame Pantalla;
	private HerramientasInterface herramientas=new HerramientasInterface();
	private ModoEquipo modoEquipo=new ModoEquipo();
	private Cronograma cronograma=new Cronograma();
	private Clip clip;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.Pantalla.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Pantalla = new JFrame();
		herramientas.CambiarColor(Pantalla, Color.PINK);
		Pantalla.setBounds(100, 100, 1000, 700);
		Pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pantalla.getContentPane().setLayout(null);
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", Pantalla);
		
		JLabel ImagenRusia2018 = new JLabel();
		herramientas.CargarImagen(ImagenRusia2018, "Imagenes\\noticia-eliminatoriasrusia2018-noticia-858470.jpg", 139, 121, 720, 422, Pantalla);
		JLabel TextoRusia2018 = new JLabel("RUSIA 2018 APP");
		herramientas.IngresarTexto(TextoRusia2018, Pantalla, 70, Color.BLUE, -23, 0, 984, 88);
		JLabel MessiComienzo = new JLabel();
		herramientas.CargarImagen(MessiComienzo, "Imagenes\\220px-Lionel_Messi_2017.jpg", -12, 187, 157, 399, Pantalla);
		JLabel RonaldoComienzo = new JLabel();
		herramientas.CargarImagen(RonaldoComienzo, "Imagenes\\250px-New_Zealand-Portugal_(20).jpg", 770, 199, 214, 371, Pantalla);
		JLabel NeymarComienzo = new JLabel();
		herramientas.CargarImagen(NeymarComienzo, "Imagenes\\Neymar-Legende-200x300.jpg", -23, 0, 188, 262, Pantalla);
		JLabel KroosComienzo = new JLabel();
		herramientas.CargarImagen(KroosComienzo, "Imagenes\\260px-Kroos.jpg", 783, 0, 201, 345, Pantalla);
		JLabel CopaComienzo = new JLabel();
		herramientas.CargarImagen(CopaComienzo, "Imagenes\\D_Q_NP_612533-MCO26621161343_012018-X.jpg", 416, 534, 178, 147, Pantalla);
		JButton BotonCronograma = new JButton("CRONOGRAMA");
		herramientas.crearBoton(BotonCronograma, 22, 572, 382, 79, Pantalla, Color.WHITE, 40);
		JButton BotonModoEquipos = new JButton("MODO EQUIPOS");
		herramientas.crearBoton(BotonModoEquipos, 587, 572, 374, 79, Pantalla, Color.WHITE, 40);
		
		BotonCronograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				cronograma.cronograma(Pantalla);
			
			}
		});
		
		BotonModoEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				ImagenRusia2018.setVisible(false);
				TextoRusia2018.setVisible(false);
				MessiComienzo.setVisible(false);
				RonaldoComienzo.setVisible(false);
				NeymarComienzo.setVisible(false);
				KroosComienzo.setVisible(false);
				CopaComienzo.setVisible(false);
				BotonCronograma.setVisible(false);
				BotonModoEquipos.setVisible(false);
				modoEquipo.modoEquipo(Pantalla);
			}
		});



	}
}
