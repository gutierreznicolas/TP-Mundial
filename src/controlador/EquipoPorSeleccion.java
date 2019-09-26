package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import modelo.Equipo;
import modelo.Jugador;


public class EquipoPorSeleccion {
	HerramientasInterface herramientas=new HerramientasInterface();
	Clip clip;
	Equipo equipo=new Equipo();
	
	public void equipoXseleccion(JFrame Pantalla) {
		Pantalla.setVisible(false);
		JFrame frameEquipoxSeleccion=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", frameEquipoxSeleccion);
		herramientas.CambiarColor(frameEquipoxSeleccion, Color.BLUE);
		frameEquipoxSeleccion.setBounds(100, 100, 1200, 800);
		frameEquipoxSeleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEquipoxSeleccion.getContentPane().setLayout(null);
		frameEquipoxSeleccion.setVisible(true);
		JButton Botonatras=new JButton("ATRAS");
		herramientas.crearBoton(Botonatras, 0, 11, 89, 23, frameEquipoxSeleccion, Color.YELLOW, 11);
		
		JLabel TextoInfo = new JLabel("INFO DE LAS SELECCIONES");
		herramientas.IngresarTexto(TextoInfo, frameEquipoxSeleccion, 65, Color.GREEN, 0, 0, 1184, 66);
		
		JLabel ImagenAlemania = new JLabel();
		herramientas.CargarImagen(ImagenAlemania, "Imagenes\\alemania.jpg", 27, 110, 112, 58, frameEquipoxSeleccion);
		JButton BotonAlemania = new JButton("ALEMANIA");
		herramientas.crearBoton(BotonAlemania, 27, 179, 104, 23, frameEquipoxSeleccion,Color.WHITE, 11);
		
		JLabel ImagenArabia = new JLabel();
		herramientas.CargarImagen(ImagenArabia, "Imagenes\\arabia saudita.jpg",173, 110, 100, 60, frameEquipoxSeleccion);
		JButton BotonArabia = new JButton("ARABIA S.");
		herramientas.crearBoton(BotonArabia,173, 179, 99, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenArgentina = new JLabel();
		herramientas.CargarImagen(ImagenArgentina, "Imagenes\\argentina.jpg", 323, 110, 104, 58, frameEquipoxSeleccion);
		JButton BotonArgentina = new JButton("ARGENTINA");
		herramientas.crearBoton(BotonArgentina, 323, 179, 99, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenAustralia = new JLabel();
		herramientas.CargarImagen(ImagenAustralia, "Imagenes\\australia.jpg", 470, 110, 100, 58, frameEquipoxSeleccion);
		JButton BotonAustralia = new JButton("AUSTRALIA");
		herramientas.crearBoton(BotonAustralia, 470, 179, 100, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenBelgica = new JLabel();
		herramientas.CargarImagen(ImagenBelgica, "Imagenes\\belgica.jpg", 603, 110, 104, 58, frameEquipoxSeleccion);
		JButton BotonBelgica = new JButton("BELGICA");
		herramientas.crearBoton(BotonBelgica,613, 179, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenBrasil = new JLabel();
		herramientas.CargarImagen(ImagenBrasil, "Imagenes\\brasil.jpg", 742, 102, 112, 66, frameEquipoxSeleccion);
		JButton BotonBrasil = new JButton("BRASIL");
		herramientas.crearBoton(BotonBrasil, 752, 179, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
	
		JLabel ImagenColombia = new JLabel();
		herramientas.CargarImagen(ImagenColombia, "Imagenes\\colombia.jpg",874, 98, 104, 70, frameEquipoxSeleccion);
		JButton BotonColombia = new JButton("COLOMBIA");
		herramientas.crearBoton(BotonColombia,874, 179, 99, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenCoreaSur = new JLabel();
		herramientas.CargarImagen(ImagenCoreaSur, "Imagenes\\corea del sur.jpg",1013, 98, 104, 70, frameEquipoxSeleccion);
		JButton BotonCoreaSur = new JButton("COREA DEL SUR");
		herramientas.crearBoton(BotonCoreaSur,995, 179, 138, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenCostaRica = new JLabel();
		herramientas.CargarImagen(ImagenCostaRica, "Imagenes\\costa rica.jpg", 22, 260, 100, 66,frameEquipoxSeleccion);
		JButton BotonCostaRica = new JButton("COSTA RICA");
		herramientas.crearBoton(BotonCostaRica, 22, 335, 112, 23, frameEquipoxSeleccion,Color.WHITE, 11);
		
		JLabel ImagenCroacia = new JLabel();
		herramientas.CargarImagen(ImagenCroacia, "Imagenes\\croacia.jpg", 173, 260, 100, 66, frameEquipoxSeleccion);
		JButton BotonCroacia = new JButton("CROACIA");
		herramientas.crearBoton(BotonCroacia, 173, 335, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenDinamarca = new JLabel();
		herramientas.CargarImagen(ImagenDinamarca, "Imagenes\\dinamarca.jpg", 323, 260, 104, 66, frameEquipoxSeleccion);
		JButton BotonDinamarca = new JButton("DINAMARCA");
		herramientas.crearBoton(BotonDinamarca, 323, 335, 99, 23, frameEquipoxSeleccion,Color.WHITE, 11);
		
		JLabel ImagenEgipto = new JLabel();
		herramientas.CargarImagen(ImagenEgipto, "Imagenes\\egipto.jpg", 470, 260, 100, 66, frameEquipoxSeleccion);
		JButton BotonEgipto = new JButton("EGIPTO");
		herramientas.crearBoton(BotonEgipto, 470, 335, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenEspaña = new JLabel();
		herramientas.CargarImagen(ImagenEspaña, "Imagenes\\españa.jpg", 603, 260, 104, 66, frameEquipoxSeleccion);
		JButton BotonEspaña = new JButton("ESPAÑA");
		herramientas.crearBoton(BotonEspaña, 613, 335, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenFrancia = new JLabel();
		herramientas.CargarImagen(ImagenFrancia, "Imagenes\\francia.jpg", 742, 260, 112, 66, frameEquipoxSeleccion);
		JButton BotonFrancia = new JButton("FRANCIA");
		herramientas.crearBoton(BotonFrancia, 752, 335, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenInglaterra = new JLabel();
		herramientas.CargarImagen(ImagenInglaterra, "Imagenes\\inglaterra.jpg", 874, 260, 104, 66, frameEquipoxSeleccion);
		JButton BotonInglaterra = new JButton("INGLATERRA");
		herramientas.crearBoton(BotonInglaterra,874, 335, 104, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenIran = new JLabel();
		herramientas.CargarImagen(ImagenIran, "Imagenes\\iran.jpg", 1013, 260, 104, 66, frameEquipoxSeleccion);
		JButton BotonIran = new JButton("IRAN");
		herramientas.crearBoton(BotonIran, 1023, 335, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenIslandia = new JLabel();
		herramientas.CargarImagen(ImagenIslandia, "Imagenes\\islandia.jpg",27, 416, 100, 66, frameEquipoxSeleccion);
		JButton BotonIslandia = new JButton("ISLANDIA");
		herramientas.crearBoton(BotonIslandia, 27, 493, 106, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenJapon = new JLabel();
		herramientas.CargarImagen(ImagenJapon, "Imagenes\\japon.jpg",173, 416, 100, 66, frameEquipoxSeleccion);
		JButton BotonJapon = new JButton("JAPON");
		herramientas.crearBoton(BotonJapon,173, 493, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenMarruecos = new JLabel();
		herramientas.CargarImagen(ImagenMarruecos, "Imagenes\\marruecos.jpg", 323, 416, 104, 66, frameEquipoxSeleccion);
		JButton BotonMarruecos = new JButton("MARRUECOS");
		herramientas.crearBoton(BotonMarruecos, 323, 493, 99, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenMexico = new JLabel();
		herramientas.CargarImagen(ImagenMexico, "Imagenes\\mexico.jpg", 470, 416, 100, 66, frameEquipoxSeleccion);
		JButton BotonMexico = new JButton("MEXICO");
		herramientas.crearBoton(BotonMexico,481, 493, 89, 23, frameEquipoxSeleccion,  Color.WHITE, 11);
		
		JLabel ImagenNigeria = new JLabel();
		herramientas.CargarImagen(ImagenNigeria, "Imagenes\\nigeria.jpg", 603, 416, 104, 66, frameEquipoxSeleccion);
		JButton BotonNigeria = new JButton("NIGERIA");
		herramientas.crearBoton(BotonNigeria, 618, 493, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenPanama = new JLabel();
		herramientas.CargarImagen(ImagenPanama, "Imagenes\\panama.jpg", 742, 416, 112, 66, frameEquipoxSeleccion);
		JButton BotonPanama = new JButton("PANAMA");
		herramientas.crearBoton(BotonPanama, 752, 493, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenPeru = new JLabel();
		herramientas.CargarImagen(ImagenPeru, "Imagenes\\peru.jpg", 874, 416, 104, 66, frameEquipoxSeleccion);
		JButton BotonPeru = new JButton("PERU");
		herramientas.crearBoton(BotonPeru, 889, 493, 89, 23, frameEquipoxSeleccion,  Color.WHITE, 11);
		
		JLabel ImagenPolonia = new JLabel();
		herramientas.CargarImagen(ImagenPolonia, "Imagenes\\polonia.jpg", 1013, 416, 104, 66, frameEquipoxSeleccion);
		JButton BotonPolonia = new JButton("POLONIA");
		herramientas.crearBoton(BotonPolonia, 1023, 493, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);

		JLabel ImagenPortugal = new JLabel();
		herramientas.CargarImagen(ImagenPortugal, "Imagenes\\portugal.jpg", 27, 564, 104, 66, frameEquipoxSeleccion);
		JButton BotonPortugal = new JButton("PORTUGAL");
		herramientas.crearBoton(BotonPortugal, 27, 641, 95, 23, frameEquipoxSeleccion,  Color.WHITE, 11);
		
		JLabel ImagenRusia = new JLabel();
		herramientas.CargarImagen(ImagenRusia, "Imagenes\\rusia.jpg", 173, 564, 100, 66, frameEquipoxSeleccion);
		JButton BotonRusia = new JButton("RUSIA");
		herramientas.crearBoton(BotonRusia, 173, 641, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSenegal = new JLabel();
		herramientas.CargarImagen(ImagenSenegal, "Imagenes\\senegal.jpg", 323, 564, 104, 66, frameEquipoxSeleccion);
		JButton BotonSenegal = new JButton("SENEGAL");
		herramientas.crearBoton(BotonSenegal, 323, 641, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSerbia = new JLabel();
		herramientas.CargarImagen(ImagenSerbia, "Imagenes\\serbia.jpg", 470, 564, 100, 66, frameEquipoxSeleccion);
		JButton BotonSerbia = new JButton("SERBIA");
		herramientas.crearBoton(BotonSerbia, 481, 641, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSuecia = new JLabel();
		herramientas.CargarImagen(ImagenSuecia, "Imagenes\\suecia.jpg",603, 564, 104, 66, frameEquipoxSeleccion);
		JButton BotonSuecia = new JButton("SUECIA");
		herramientas.crearBoton(BotonSuecia, 618, 641, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSuiza = new JLabel();
		herramientas.CargarImagen(ImagenSuiza, "Imagenes\\suiza.jpg", 742, 564, 112, 66, frameEquipoxSeleccion);
		JButton BotonSuiza = new JButton("SUIZA");
		herramientas.crearBoton(BotonSuiza, 752, 641, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenTunez = new JLabel();
		herramientas.CargarImagen(ImagenTunez, "Imagenes\\tunez.jpg",874, 564, 104, 66, frameEquipoxSeleccion);
		JButton BotonTunez = new JButton("TUNEZ");
		herramientas.crearBoton(BotonTunez, 889, 641, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenUruguay = new JLabel();
		herramientas.CargarImagen(ImagenUruguay, "Imagenes\\uruguay.jpg", 1013, 564, 104, 66, frameEquipoxSeleccion);
		JButton BotonUruguay = new JButton("URUGUAY");
		herramientas.crearBoton(BotonUruguay, 1023, 641, 89, 23, frameEquipoxSeleccion, Color.WHITE, 11);
		
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, frameEquipoxSeleccion);
		
		Botonatras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				frameEquipoxSeleccion.setVisible(false);
				Pantalla.setVisible(true);
			}
		});
		BotonAlemania.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Alemania");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonArabia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Arabia Saudita");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		
		BotonArgentina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Argentina");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
			}
		});
		BotonAustralia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Australia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonBelgica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Belgica");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
		}
		});
		BotonBrasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Brasil");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonColombia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Colombia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonCoreaSur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Corea Del Sur");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
			}
		});
		BotonCostaRica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Costa Rica");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonCroacia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Croacia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
			}
		});
		BotonDinamarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Dinamarca");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonEgipto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Egipto");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonEspaña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("España");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonFrancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Francia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonInglaterra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Inglaterra");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
			}
		});
		BotonIran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Iran");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonIslandia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Islandia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
			}
		});
		BotonJapon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Japon");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonMarruecos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Marruecos");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
			}
		});
		BotonMexico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Mexico");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonNigeria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Nigeria");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonPanama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Panama");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonPeru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Peru");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonPolonia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Polonia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonPortugal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Portugal");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonRusia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Rusia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonSenegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Senegal");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonSerbia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Serbia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonSuecia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Suecia");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
			}
		});
		BotonSuiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Suiza");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonTunez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Tunez");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		BotonUruguay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				ArrayList<Jugador> seleccion=equipo.obtenerSeleccion("Uruguay");
				Equipo equipo =new Equipo();
				equipo.equipo=seleccion;
				herramientas.mostrarEquipo(equipo,frameEquipoxSeleccion,clip);
				}
		});
		}
	

}
