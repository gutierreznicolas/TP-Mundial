package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import java.io.ObjectInputStream;

import java.util.ArrayList;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controlador.HerramientasInterface;
import modelo.Equipo;
import modelo.Jugador;
import modelo.SolverGoloso;

public class ModoEquipo {
	HerramientasInterface herramientas=new HerramientasInterface();
	Clip clip;
	Clip clip1;
	SolverGoloso equipoIdealGoloso=new SolverGoloso();
	InterfaceInfoSelecciones infoSelecciones=new InterfaceInfoSelecciones();
	EquipoPorSeleccion EquipoxSeleccion=new EquipoPorSeleccion();
	EquipoSinRestricciones equipoSinRestricciones=new EquipoSinRestricciones();
	
	
	public void modoEquipo(JFrame Pantalla) {
		try{
			clip1= AudioSystem.getClip();
			File a = new File("sonido\\cancion rusia 2018.wav");
			clip1.open(AudioSystem.getAudioInputStream(a));
			clip1.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		herramientas.CambiarColor(Pantalla, Color.BLUE);
		
		JLabel ImagenMbappe = new JLabel();
		herramientas.CargarImagen(ImagenMbappe, "Imagenes\\Camiseta-francia-12-kylian-mbappe-236297252_1.jpg", 724, 267, 260, 383, Pantalla);
		JLabel ImagenBusquets = new JLabel();
		herramientas.CargarImagen(ImagenBusquets, "Imagenes\\321269.jpg", 724, 0, 260, 529, Pantalla);
		JLabel TextoJugar = new JLabel("EMPIEZA A JUGAR");
		herramientas.IngresarTexto(TextoJugar, Pantalla, 20, Color.GREEN,351, 11, 308, 33);
		JLabel ImagenMessi = new JLabel();
		herramientas.CargarImagen(ImagenMessi, "Imagenes\\Lionel+Messi+Brazil+v+Argentina+2018+FIFA+TJgesAk3YVyl.jpg", 0, 11, 316, 639, Pantalla);

		JButton BotonOpcionEquipoIdeal = new JButton("EQUIPO IDEAL AL AZAR");
		herramientas.crearBoton(BotonOpcionEquipoIdeal, 326, 86, 375, 39, Pantalla, Color.WHITE, 20);
		JButton BotonOpcionEquipoSinRestricciones = new JButton("ARMAR MI EQUIPO SIN RESTRICCIONES");
		herramientas.crearBoton(BotonOpcionEquipoSinRestricciones,326, 173, 436, 39, Pantalla, Color.WHITE, 20);
		JButton BotonOpcionVerEquipoPorSeleccion = new JButton("VER EQUIPO POR SELECCION");
		herramientas.crearBoton(BotonOpcionVerEquipoPorSeleccion, 326, 267, 360, 39, Pantalla, Color.WHITE, 20);
		JButton BotonInfoSeleccion = new JButton("INFO DE SELECCION");
		herramientas.crearBoton(BotonInfoSeleccion, 326, 459, 287, 39, Pantalla, Color.WHITE, 20);
		JButton BotonHistoriaMundiales = new JButton("HISTORIA DE LOS MUNDIALES");
		herramientas.crearBoton(BotonHistoriaMundiales, 326, 356, 388, 39, Pantalla, Color.WHITE, 20);

		
		BotonOpcionEquipoIdeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				Pantalla.setVisible(false);
				JFrame frameEquipoIdeal=new JFrame();
				herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", frameEquipoIdeal);
				herramientas.CambiarColor(frameEquipoIdeal, Color.BLUE);
				frameEquipoIdeal.setBounds(100, 100, 1200, 800);
				frameEquipoIdeal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frameEquipoIdeal.getContentPane().setLayout(null);
				frameEquipoIdeal.setVisible(true);
				
				JComboBox<String> nombreJugador = new JComboBox<String>();
				nombreJugador.setBounds(866, 149, 140, 20);
				frameEquipoIdeal.getContentPane().add(nombreJugador);
				LLenarJComboBoxTodos(nombreJugador);
				

				
				JButton BotonAtras = new JButton("ATRAS");
				herramientas.crearBoton(BotonAtras, 0, 0, 89, 23, frameEquipoIdeal, Color.YELLOW, 15);
				JButton BotonEquipoIdeal = new JButton("VER EQUIPO IDEAL");
				herramientas.crearBoton(BotonEquipoIdeal, 519, 35, 260, 33, frameEquipoIdeal, Color.WHITE, 20);
				JButton BotonVerPuntajeJugador = new JButton("VER PUNTAJE DE JUGADOR");
				herramientas.crearBoton(BotonVerPuntajeJugador, 866, 35, 242, 33, frameEquipoIdeal, Color.WHITE, 20);
				JButton BotonAplicarCambios = new JButton("APLICAR CAMBIOS");
				herramientas.crearBoton(BotonAplicarCambios,154, 35, 260, 35, frameEquipoIdeal, Color.WHITE, 20);
				JButton BotonRecordarEquipo = new JButton("RECORDAR EQUIPO");
				herramientas.crearBoton(BotonRecordarEquipo,866, 300, 260, 35, frameEquipoIdeal, Color.WHITE, 20);
				JButton botonEquipoGolosoPuro=new JButton("Equipo Goloso Puro");
				herramientas.crearBoton(botonEquipoGolosoPuro, 866, 500, 260, 35, frameEquipoIdeal, Color.WHITE, 20);
				JButton BotonCargar = new JButton("CARGAR EQUIPO");
				herramientas.crearBoton(BotonCargar,866, 657, 260, 35, frameEquipoIdeal, Color.WHITE, 20);
				
				JComboBox<String> arqueros = new JComboBox<String>();
				arqueros.setBounds(154, 100, 140, 20);
				frameEquipoIdeal.getContentPane().add(arqueros);
				herramientas.LLenarJComboBoxPosicion(arqueros,"arquero",equipoIdealGoloso);
				JLabel TextoArqueros = new JLabel("ARQUERO");
				herramientas.IngresarTexto(TextoArqueros, frameEquipoIdeal, 11, Color.BLACK, 26, 103, 79, 14);
				
				JComboBox<String> LateralesD = new JComboBox<String>();
				LateralesD.setBounds(154, 149, 140, 20);
				frameEquipoIdeal.getContentPane().add(LateralesD);
				herramientas.LLenarJComboBoxPosicion(LateralesD,"lateral derecho",equipoIdealGoloso);
				JLabel TextoLateralesD = new JLabel("LATERAL D.");
				herramientas.IngresarTexto(TextoLateralesD, frameEquipoIdeal, 11, Color.BLACK,26, 152, 91, 14);

				JComboBox<String> LateralesI = new JComboBox<String>();
				LateralesI.setBounds(154, 194, 140, 20);
				frameEquipoIdeal.getContentPane().add(LateralesI);
				herramientas.LLenarJComboBoxPosicion(LateralesI,"lateral izquierdo",equipoIdealGoloso);
				JLabel TextoLateralesI = new JLabel("LATERAL I.");
				herramientas.IngresarTexto(TextoLateralesI, frameEquipoIdeal, 11, Color.BLACK, 26, 197, 89, 14);
				
				JComboBox<String> CentralesD = new JComboBox<String>();
				CentralesD.setBounds(154, 239, 140, 20);
				frameEquipoIdeal.getContentPane().add(CentralesD);
				herramientas.LLenarJComboBoxPosicion(CentralesD,"central derecho",equipoIdealGoloso);
				JLabel TextoCentralesD = new JLabel("CENTRAL D.");
				herramientas.IngresarTexto(TextoCentralesD, frameEquipoIdeal, 11, Color.BLACK, 26, 242, 79, 14);

				JComboBox<String> CentralesI = new JComboBox<String>();
				CentralesI.setBounds(154, 286, 140, 20);
				frameEquipoIdeal.getContentPane().add(CentralesI);
				herramientas.LLenarJComboBoxPosicion(CentralesI,"central izquierdo",equipoIdealGoloso);
				JLabel TextoCentralesI = new JLabel("CENTRAL I.");
				herramientas.IngresarTexto(TextoCentralesI, frameEquipoIdeal, 11, Color.BLACK, 26, 286, 79, 14);

				JComboBox<String> VolantesD = new JComboBox<String>();
				VolantesD.setBounds(154, 332, 140, 20);
				frameEquipoIdeal.getContentPane().add(VolantesD);
				herramientas.LLenarJComboBoxPosicion(VolantesD,"volante derecho",equipoIdealGoloso);
				JLabel TextoVolantesD = new JLabel("VOLANTE D.");
				herramientas.IngresarTexto(TextoVolantesD, frameEquipoIdeal, 11, Color.BLACK, 26, 335, 82, 14);

				JComboBox<String> VolantesC = new JComboBox<String>();
				VolantesC.setBounds(154, 385, 140, 20);
				frameEquipoIdeal.getContentPane().add(VolantesC);
				herramientas.LLenarJComboBoxPosicion(VolantesC,"volante central",equipoIdealGoloso);
				JLabel TextoVolantesC = new JLabel("VOLANTE C.");
				herramientas.IngresarTexto(TextoVolantesC, frameEquipoIdeal, 11, Color.BLACK, 26, 385, 79, 14);

				JComboBox<String> VolantesI = new JComboBox<String>();
				VolantesI.setBounds(154, 436, 140, 20);
				frameEquipoIdeal.getContentPane().add(VolantesI);
				herramientas.LLenarJComboBoxPosicion(VolantesI,"volante izquierdo",equipoIdealGoloso);
				JLabel TextoVolantesI = new JLabel("VOLANTE I.");
				herramientas.IngresarTexto(TextoVolantesI, frameEquipoIdeal, 11, Color.BLACK, 26, 439, 79, 14);

				JComboBox<String> PunterosD = new JComboBox<String>();
				PunterosD.setBounds(154, 487, 140, 20);
				frameEquipoIdeal.getContentPane().add(PunterosD);
				herramientas.LLenarJComboBoxPosicion(PunterosD,"puntero derecho",equipoIdealGoloso);
				JLabel TextoPunterosD = new JLabel("PUNTERO D.");
				herramientas.IngresarTexto(TextoPunterosD, frameEquipoIdeal, 11, Color.BLACK, 26, 490, 79, 14);
				
				JComboBox<String> PunterosI = new JComboBox<String>();
				PunterosI.setBounds(154, 534, 140, 20);
				frameEquipoIdeal.getContentPane().add(PunterosI);
				herramientas.LLenarJComboBoxPosicion(PunterosI,"puntero izquierdo",equipoIdealGoloso);
				JLabel TextoPunterosI = new JLabel("PUNTERO I.");
				herramientas.IngresarTexto(TextoPunterosI, frameEquipoIdeal, 11, Color.BLACK,26, 537, 79, 14);
				
				JComboBox<String> CentroDelanteros = new JComboBox<String>();
				CentroDelanteros.setBounds(154, 596, 140, 20);
				frameEquipoIdeal.getContentPane().add(CentroDelanteros);
				herramientas.LLenarJComboBoxPosicion(CentroDelanteros,"centro delantero",equipoIdealGoloso);
				JLabel TextoCentroDelanteros = new JLabel("CENTRO D.");
				herramientas.IngresarTexto(TextoCentroDelanteros, frameEquipoIdeal, 11, Color.BLACK,26, 588, 79, 14);
				
				JLabel ImagenMaradona=new JLabel();
				herramientas.CargarImagen(ImagenMaradona, "Imagenes\\foto1apertura.jpg", 304, 57, 540, 944, frameEquipoIdeal);
				JLabel ImagenFondo=new JLabel();
				herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, frameEquipoIdeal);
				
				BotonEquipoIdeal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);
						equipoIdealGoloso=new SolverGoloso();
						equipoIdealGoloso.EquipoIdealHeuristica();
						herramientas.mostrarEquipo(equipoIdealGoloso.equipoIdeal,frameEquipoIdeal,clip);
						
						
					}
				});
				
				botonEquipoGolosoPuro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);
						equipoIdealGoloso=new SolverGoloso();
						equipoIdealGoloso.golosoPuro();
						herramientas.mostrarEquipo(equipoIdealGoloso.equipoGolosoPuro, frameEquipoIdeal, clip);
					}
				});
				
				BotonAplicarCambios.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);
						ArrayList<Jugador> jugadoresElegidos=new ArrayList<Jugador>();
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)arqueros.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)LateralesD.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)LateralesI.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)CentralesI.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)CentralesD.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)VolantesI.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)VolantesD.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)VolantesC.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)PunterosD.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)PunterosI.getSelectedItem()));
						jugadoresElegidos.add(equipoIdealGoloso.obtenerJugadorPorNombre((String)CentroDelanteros.getSelectedItem()));
						Equipo equipo=new Equipo();
						equipo.equipo=jugadoresElegidos;
						SolverGoloso elegido=new SolverGoloso();
						elegido.equipoIdeal=equipo;
						if(elegido.NoSuperaCondiciones(equipo)) {
							JOptionPane.showMessageDialog(null," El equipo conformado no cumple con las condiciones,examine que condicion esta rompiendo"+
						"\n .no puede haber mas de 6 jugadores sin goles"+
						"\n .no puede haber mas de 3 jugadores del mismo pais"+"\n .no puede haber mas de 4 jugadores con  tarjeras");
						}else {
							herramientas.mostrarEquipo(elegido.equipoIdeal,frameEquipoIdeal,clip);
						}
					}
				});
				BotonCargar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);

						
						String nombreArchivo = JOptionPane.showInputDialog("Escriba el nombre del archivo");
						SolverGoloso equipoGuardado=null;
						 try
						 {
						 FileInputStream fis = new FileInputStream(nombreArchivo);
						 ObjectInputStream in = new ObjectInputStream(fis);
						 equipoGuardado = (SolverGoloso) in.readObject();
						 in.close();
						 
						
						 }
						 catch (Exception ex)
						 {
						 ex.printStackTrace();
						 }
						
						JOptionPane.showMessageDialog(null, nombreArchivo+":"+"\n"+equipoGuardado.equipoIdeal.get(0).obtenerNombre()+"\n"+
								equipoGuardado.equipoIdeal.get(1).obtenerNombre()+"\n"+equipoGuardado.equipoIdeal.get(2).obtenerNombre()+"\n"+
								equipoGuardado.equipoIdeal.get(3).obtenerNombre()+"\n"+equipoGuardado.equipoIdeal.get(4).obtenerNombre()+"\n"+
								equipoGuardado.equipoIdeal.get(5).obtenerNombre()+"\n"+equipoGuardado.equipoIdeal.get(6).obtenerNombre()+"\n"+
								equipoGuardado.equipoIdeal.get(7).obtenerNombre()+"\n"+equipoGuardado.equipoIdeal.get(8).obtenerNombre()+"\n"+
								equipoGuardado.equipoIdeal.get(9).obtenerNombre()+"\n"+equipoGuardado.equipoIdeal.get(10).obtenerNombre()+"\n"+
								"Puntaje: "+equipoGuardado.equipoIdeal.puntajeEquipo);

					}
				});
				BotonAtras.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);
						frameEquipoIdeal.setVisible(false);
						Pantalla.setVisible(true);
					}
				});
				BotonRecordarEquipo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);
						JOptionPane.showMessageDialog(null,equipoIdealGoloso.toString());
					}
				});
				
				BotonVerPuntajeJugador.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);
						JOptionPane.showMessageDialog(null,equipoIdealGoloso.obtenerJugadorPorNombre((String)nombreJugador.getSelectedItem()).obtenerPuntaje());
						
					}
				});
				
				
			}
		});
		BotonHistoriaMundiales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				herramientas.sonidoCorto(clip);
				clip1.stop();
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\Historia de la Copa Mundial de la FIFA.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				Pantalla.setVisible(false);
				JFrame frameHistoriaMundial=new JFrame();
				frameHistoriaMundial.setVisible(true);
				herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", frameHistoriaMundial);
				frameHistoriaMundial.setBounds(100, 100, 1200, 800);
				frameHistoriaMundial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frameHistoriaMundial.getContentPane().setLayout(null);
				herramientas.CambiarColor(frameHistoriaMundial, Color.BLUE);
				JLabel TextoHistoriaMundiales = new JLabel("HISTORIA DE LOS MUNDIALES");
				herramientas.IngresarTexto(TextoHistoriaMundiales, frameHistoriaMundial, 69, Color.BLACK, 44, 0, 1140, 83);
				
				JScrollPane scrollTablaMundiales = new JScrollPane();
				scrollTablaMundiales.setBounds(254, 84, 700, 349);
				frameHistoriaMundial.getContentPane().add(scrollTablaMundiales);
				
				JTable tableMundiales = new JTable();
				tableMundiales.setModel(new DefaultTableModel(
					new Object[][] {
						{"        1930", "       URUGUAY", "       URUGUAY", "      ARGENTINA", "     YUGOSLAVIA", "     Guillermo Stabile (Argentina)"},
						{"        1934", "         ITALIA", "          ITALIA", " CHECOSLOVAQUIA", "       ALEMANIA", "Oldrich Nejedly (Checoslovaquia)"},
						{"        1938", "        FRANCIA", "          ITALIA", "         HUNGRIA", "          BRASIL", "      Leonidas Da Silva (Brasil)"},
						{"        1950", "         BRASIL", "        URUGUAY", "            BRASIL", "          SUECIA", "                Ademir (Brasil)"},
						{"        1954", "          SUIZA", "        ALEMANIA", "          HUNGRIA", "         AUSTRIA", "       Sandor Kocsis (Hungria)"},
						{"        1958", "         SUECIA", "         BRASIL", "          SUECIA", "        FRANCIA", "       Just Fontaine (Francia)"},
						{"        1962", "          CHILE", "         BRASIL", " CHECOSLOVAQUIA", "           CHILE", "        Leonel Sanchez (Chile)"},
						{"        1966", "     INGLATERRA", "     INGLATERRA", "         ALEMANIA", "        PORTUGAL", "            Eusebio (Portugal)"},
						{"        1970", "         MEXICO", "           BRASIL", "            ITALIA", "       ALEMANIA", "        Gerd Muller (Alemania)"},
						{"        1974 ", "       ALEMANIA", "       ALEMANIA", "         HOLANDA", "        POLONIA", "        Grzegorz Lato (Polonia)"},
						{"        1978", "      ARGENTINA", "      ARGENTINA", "         HOLANDA", "          BRASIL", "      Mario Kempes (Argentina)"},
						{"        1982", "        ESPA\u00D1A", "        ALEMANIA", "            ITALIA", "        POLONIA", "             Paolo Rossi (Italia)"},
						{"        1986", "        MEXICO", "       ARGENTINA", "         ALEMANIA", "        FRANCIA", "    Diego Maradona (Argentina)"},
						{"        1990", "          ITALIA", "        ALEMANIA", "        ARGENTINA", "           ITALIA", "       Salvatore Schillaci (Italia)"},
						{"        1994", " ESTADOS UNIDOS", "           BRASIL", "            ITALIA", "          SUECIA", "              Romario (Brasil)"},
						{"        1998", "        FRANCIA", "        FRANCIA", "            BRASIL", "         CROACIA", "               Ronaldo (Brasil)"},
						{"        2002", "COREA/JAPON", "          BRASIL", "         ALEMANIA", "        TURQUIA", "          Oliver Kahn (Alemania)"},
						{"        2006", "       ALEMANIA", "           ITALIA", "          FRANCIA", "        ALEMANIA", "        Zinedine Zidane (Francia)"},
						{"        2010", "      SUDAFRICA", "         ESPA\u00D1A", "         HOLANDA", "        ALEMANIA", "         Diego Forlan (Uruguay)"},
						{"        2014", "         BRASIL", "        ALEMANIA", "       ARGENTINA", "        HOLANDA", "          Lionel Messi (Argentina)"},
					},
					new String[] {
						"AÑO", "SEDE", "CAMPEON", "SUBCAMPEON", "TERCER PUESTO", "MEJOR JUGADOR"
					}
				));
				tableMundiales.getColumnModel().getColumn(1).setPreferredWidth(95);
				tableMundiales.getColumnModel().getColumn(2).setPreferredWidth(95);
				tableMundiales.getColumnModel().getColumn(3).setPreferredWidth(100);
				tableMundiales.getColumnModel().getColumn(4).setPreferredWidth(95);
				tableMundiales.getColumnModel().getColumn(5).setPreferredWidth(162);
				tableMundiales.getColumnModel().getColumn(5).setMinWidth(21);
				tableMundiales.setFont(new Font("Tahoma", Font.ITALIC, 11));
				tableMundiales.setBorder(new LineBorder(new Color(0, 0, 0)));
				tableMundiales.setBackground(new Color(255, 255, 255));
				scrollTablaMundiales.setViewportView(tableMundiales);
				
				JLabel ImagenMaradonaCopa = new JLabel();
				herramientas.CargarImagen(ImagenMaradonaCopa, "Imagenes\\beso_86.jpg", -43, 84, 299, 458, frameHistoriaMundial);
				JLabel ImagenPeleCopa = new JLabel();
				herramientas.CargarImagen(ImagenPeleCopa, "Imagenes\\pele-copa-mundo.jpg", 880, 94, 304, 437, frameHistoriaMundial);
				JLabel ImagenGotzeCopa = new JLabel();
				herramientas.CargarImagen(ImagenGotzeCopa, "Imagenes\\mario-gotze-alemania-31-05-2016.jpg", 254, 430, 367, 332, frameHistoriaMundial);
				JLabel ImagenCasillasCopa = new JLabel();
				herramientas.CargarImagen(ImagenCasillasCopa, "Imagenes\\n_seleccion_espanola_casillas-1850091.jpg", 617, 430, 299, 348, frameHistoriaMundial);
				JLabel ImagenBuffonCopa = new JLabel();
				herramientas.CargarImagen(ImagenBuffonCopa, "Imagenes\\campeonato_alemania_2006_mundial_futbol_copa_fifa_italia_campeon_del_mundo.jpg", 0, 537, 256, 241, frameHistoriaMundial);
				JLabel ImagenZidaneCopa = new JLabel();
				herramientas.CargarImagen(ImagenZidaneCopa, "Imagenes\\Zidane_con_trofeo.jpg", 917, 526, 304, 236, frameHistoriaMundial);
				
				JButton BotonAtras = new JButton("ATRAS");
				herramientas.crearBoton(BotonAtras, 0, 0, 89, 23, frameHistoriaMundial, Color.YELLOW, 12);
				
				BotonAtras.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						herramientas.sonidoCorto(clip);
						clip.stop();
						frameHistoriaMundial.setVisible(false);
						Pantalla.setVisible(true);
						clip1.start();
					}
				});
			}
		});
		BotonInfoSeleccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip1.stop();
				Pantalla.setVisible(false);
				infoSelecciones.infoSelecciones(Pantalla,clip1);
				
				
				
				

			}
		});
		BotonOpcionVerEquipoPorSeleccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				EquipoxSeleccion.equipoXseleccion(Pantalla);
			}
		});
		BotonOpcionEquipoSinRestricciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				equipoSinRestricciones.EquiposSinRestricciones(Pantalla);
			}
		});
	}
	
	private void LLenarJComboBoxTodos(JComboBox<String> combo) {
		for(int i=0;i<equipoIdealGoloso.equipoIdeal.Listajugadores.size();i++) {
			
			combo.addItem(equipoIdealGoloso.equipoIdeal.Listajugadores.get(i).obtenerNombre());
		}
	}
	
		}
