package controlador;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class InterfaceInfoSelecciones {
	HerramientasInterface herramientas=new HerramientasInterface();
	Clip clip;
	InfoFila1 info1=new InfoFila1();
	InfoFila2 info2=new InfoFila2();
	InfoFila3 info3=new InfoFila3();
	InfoFila4 info4=new InfoFila4();
	
	public void infoSelecciones(JFrame Pantalla,Clip clip1) {
		Pantalla.setVisible(false);
		JFrame frameInfoSeleccion=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", frameInfoSeleccion);
		herramientas.CambiarColor(frameInfoSeleccion, Color.BLUE);
		frameInfoSeleccion.setBounds(100, 100, 1200, 800);
		frameInfoSeleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameInfoSeleccion.getContentPane().setLayout(null);
		frameInfoSeleccion.setVisible(true);
		JButton Botonatras=new JButton("ATRAS");
		herramientas.crearBoton(Botonatras, 0, 11, 89, 23, frameInfoSeleccion, Color.YELLOW, 11);
		
		JLabel TextoInfo = new JLabel("INFO DE LAS SELECCIONES");
		herramientas.IngresarTexto(TextoInfo, frameInfoSeleccion, 65, Color.GREEN, 0, 0, 1184, 66);
		
		JLabel ImagenAlemania = new JLabel();
		herramientas.CargarImagen(ImagenAlemania, "Imagenes\\alemania.jpg", 27, 110, 112, 58, frameInfoSeleccion);
		JButton BotonAlemania = new JButton("ALEMANIA");
		herramientas.crearBoton(BotonAlemania, 27, 179, 104, 23, frameInfoSeleccion,Color.WHITE, 11);
		
		JLabel ImagenArabia = new JLabel();
		herramientas.CargarImagen(ImagenArabia, "Imagenes\\arabia saudita.jpg",173, 110, 100, 60, frameInfoSeleccion);
		JButton BotonArabia = new JButton("ARABIA S.");
		herramientas.crearBoton(BotonArabia,173, 179, 99, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenArgentina = new JLabel();
		herramientas.CargarImagen(ImagenArgentina, "Imagenes\\argentina.jpg", 323, 110, 104, 58, frameInfoSeleccion);
		JButton BotonArgentina = new JButton("ARGENTINA");
		herramientas.crearBoton(BotonArgentina, 323, 179, 99, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenAustralia = new JLabel();
		herramientas.CargarImagen(ImagenAustralia, "Imagenes\\australia.jpg", 470, 110, 100, 58, frameInfoSeleccion);
		JButton BotonAustralia = new JButton("AUSTRALIA");
		herramientas.crearBoton(BotonAustralia, 470, 179, 100, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenBelgica = new JLabel();
		herramientas.CargarImagen(ImagenBelgica, "Imagenes\\belgica.jpg", 603, 110, 104, 58, frameInfoSeleccion);
		JButton BotonBelgica = new JButton("BELGICA");
		herramientas.crearBoton(BotonBelgica,613, 179, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenBrasil = new JLabel();
		herramientas.CargarImagen(ImagenBrasil, "Imagenes\\brasil.jpg", 742, 102, 112, 66, frameInfoSeleccion);
		JButton BotonBrasil = new JButton("BRASIL");
		herramientas.crearBoton(BotonBrasil, 752, 179, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
	
		JLabel ImagenColombia = new JLabel();
		herramientas.CargarImagen(ImagenColombia, "Imagenes\\colombia.jpg",874, 98, 104, 70, frameInfoSeleccion);
		JButton BotonColombia = new JButton("COLOMBIA");
		herramientas.crearBoton(BotonColombia,874, 179, 99, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenCoreaSur = new JLabel();
		herramientas.CargarImagen(ImagenCoreaSur, "Imagenes\\corea del sur.jpg",1013, 98, 104, 70, frameInfoSeleccion);
		JButton BotonCoreaSur = new JButton("COREA DEL SUR");
		herramientas.crearBoton(BotonCoreaSur,995, 179, 138, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenCostaRica = new JLabel();
		herramientas.CargarImagen(ImagenCostaRica, "Imagenes\\costa rica.jpg", 22, 260, 100, 66,frameInfoSeleccion);
		JButton BotonCostaRica = new JButton("COSTA RICA");
		herramientas.crearBoton(BotonCostaRica, 22, 335, 112, 23, frameInfoSeleccion,Color.WHITE, 11);
		
		JLabel ImagenCroacia = new JLabel();
		herramientas.CargarImagen(ImagenCroacia, "Imagenes\\croacia.jpg", 173, 260, 100, 66, frameInfoSeleccion);
		JButton BotonCroacia = new JButton("CROACIA");
		herramientas.crearBoton(BotonCroacia, 173, 335, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenDinamarca = new JLabel();
		herramientas.CargarImagen(ImagenDinamarca, "Imagenes\\dinamarca.jpg", 323, 260, 104, 66, frameInfoSeleccion);
		JButton BotonDinamarca = new JButton("DINAMARCA");
		herramientas.crearBoton(BotonDinamarca, 323, 335, 99, 23, frameInfoSeleccion,Color.WHITE, 11);
		
		JLabel ImagenEgipto = new JLabel();
		herramientas.CargarImagen(ImagenEgipto, "Imagenes\\egipto.jpg", 470, 260, 100, 66, frameInfoSeleccion);
		JButton BotonEgipto = new JButton("EGIPTO");
		herramientas.crearBoton(BotonEgipto, 470, 335, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenEspaña = new JLabel();
		herramientas.CargarImagen(ImagenEspaña, "Imagenes\\españa.jpg", 603, 260, 104, 66, frameInfoSeleccion);
		JButton BotonEspaña = new JButton("ESPAÑA");
		herramientas.crearBoton(BotonEspaña, 613, 335, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenFrancia = new JLabel();
		herramientas.CargarImagen(ImagenFrancia, "Imagenes\\francia.jpg", 742, 260, 112, 66, frameInfoSeleccion);
		JButton BotonFrancia = new JButton("FRANCIA");
		herramientas.crearBoton(BotonFrancia, 752, 335, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenInglaterra = new JLabel();
		herramientas.CargarImagen(ImagenInglaterra, "Imagenes\\inglaterra.jpg", 874, 260, 104, 66, frameInfoSeleccion);
		JButton BotonInglaterra = new JButton("INGLATERRA");
		herramientas.crearBoton(BotonInglaterra,874, 335, 104, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenIran = new JLabel();
		herramientas.CargarImagen(ImagenIran, "Imagenes\\iran.jpg", 1013, 260, 104, 66, frameInfoSeleccion);
		JButton BotonIran = new JButton("IRAN");
		herramientas.crearBoton(BotonIran, 1023, 335, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenIslandia = new JLabel();
		herramientas.CargarImagen(ImagenIslandia, "Imagenes\\islandia.jpg",27, 416, 100, 66, frameInfoSeleccion);
		JButton BotonIslandia = new JButton("ISLANDIA");
		herramientas.crearBoton(BotonIslandia, 27, 493, 106, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenJapon = new JLabel();
		herramientas.CargarImagen(ImagenJapon, "Imagenes\\japon.jpg",173, 416, 100, 66, frameInfoSeleccion);
		JButton BotonJapon = new JButton("JAPON");
		herramientas.crearBoton(BotonJapon,173, 493, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenMarruecos = new JLabel();
		herramientas.CargarImagen(ImagenMarruecos, "Imagenes\\marruecos.jpg", 323, 416, 104, 66, frameInfoSeleccion);
		JButton BotonMarruecos = new JButton("MARRUECOS");
		herramientas.crearBoton(BotonMarruecos, 323, 493, 99, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenMexico = new JLabel();
		herramientas.CargarImagen(ImagenMexico, "Imagenes\\mexico.jpg", 470, 416, 100, 66, frameInfoSeleccion);
		JButton BotonMexico = new JButton("MEXICO");
		herramientas.crearBoton(BotonMexico,481, 493, 89, 23, frameInfoSeleccion,  Color.WHITE, 11);
		
		JLabel ImagenNigeria = new JLabel();
		herramientas.CargarImagen(ImagenNigeria, "Imagenes\\nigeria.jpg", 603, 416, 104, 66, frameInfoSeleccion);
		JButton BotonNigeria = new JButton("NIGERIA");
		herramientas.crearBoton(BotonNigeria, 618, 493, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenPanama = new JLabel();
		herramientas.CargarImagen(ImagenPanama, "Imagenes\\panama.jpg", 742, 416, 112, 66, frameInfoSeleccion);
		JButton BotonPanama = new JButton("PANAMA");
		herramientas.crearBoton(BotonPanama, 752, 493, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenPeru = new JLabel();
		herramientas.CargarImagen(ImagenPeru, "Imagenes\\peru.jpg", 874, 416, 104, 66, frameInfoSeleccion);
		JButton BotonPeru = new JButton("PERU");
		herramientas.crearBoton(BotonPeru, 889, 493, 89, 23, frameInfoSeleccion,  Color.WHITE, 11);
		
		JLabel ImagenPolonia = new JLabel();
		herramientas.CargarImagen(ImagenPolonia, "Imagenes\\polonia.jpg", 1013, 416, 104, 66, frameInfoSeleccion);
		JButton BotonPolonia = new JButton("POLONIA");
		herramientas.crearBoton(BotonPolonia, 1023, 493, 89, 23, frameInfoSeleccion, Color.WHITE, 11);

		JLabel ImagenPortugal = new JLabel();
		herramientas.CargarImagen(ImagenPortugal, "Imagenes\\portugal.jpg", 27, 564, 104, 66, frameInfoSeleccion);
		JButton BotonPortugal = new JButton("PORTUGAL");
		herramientas.crearBoton(BotonPortugal, 27, 641, 95, 23, frameInfoSeleccion,  Color.WHITE, 11);
		
		JLabel ImagenRusia = new JLabel();
		herramientas.CargarImagen(ImagenRusia, "Imagenes\\rusia.jpg", 173, 564, 100, 66, frameInfoSeleccion);
		JButton BotonRusia = new JButton("RUSIA");
		herramientas.crearBoton(BotonRusia, 173, 641, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSenegal = new JLabel();
		herramientas.CargarImagen(ImagenSenegal, "Imagenes\\senegal.jpg", 323, 564, 104, 66, frameInfoSeleccion);
		JButton BotonSenegal = new JButton("SENEGAL");
		herramientas.crearBoton(BotonSenegal, 323, 641, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSerbia = new JLabel();
		herramientas.CargarImagen(ImagenSerbia, "Imagenes\\serbia.jpg", 470, 564, 100, 66, frameInfoSeleccion);
		JButton BotonSerbia = new JButton("SERBIA");
		herramientas.crearBoton(BotonSerbia, 481, 641, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSuecia = new JLabel();
		herramientas.CargarImagen(ImagenSuecia, "Imagenes\\suecia.jpg",603, 564, 104, 66, frameInfoSeleccion);
		JButton BotonSuecia = new JButton("SUECIA");
		herramientas.crearBoton(BotonSuecia, 618, 641, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenSuiza = new JLabel();
		herramientas.CargarImagen(ImagenSuiza, "Imagenes\\suiza.jpg", 742, 564, 112, 66, frameInfoSeleccion);
		JButton BotonSuiza = new JButton("SUIZA");
		herramientas.crearBoton(BotonSuiza, 752, 641, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenTunez = new JLabel();
		herramientas.CargarImagen(ImagenTunez, "Imagenes\\tunez.jpg",874, 564, 104, 66, frameInfoSeleccion);
		JButton BotonTunez = new JButton("TUNEZ");
		herramientas.crearBoton(BotonTunez, 889, 641, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenUruguay = new JLabel();
		herramientas.CargarImagen(ImagenUruguay, "Imagenes\\uruguay.jpg", 1013, 564, 104, 66, frameInfoSeleccion);
		JButton BotonUruguay = new JButton("URUGUAY");
		herramientas.crearBoton(BotonUruguay, 1023, 641, 89, 23, frameInfoSeleccion, Color.WHITE, 11);
		
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, frameInfoSeleccion);
		
		Botonatras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip1.start();
				frameInfoSeleccion.setVisible(false);
				Pantalla.setVisible(true);
			}
		});
		BotonAlemania.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoAlemania(frameInfoSeleccion);
			}
		});
		BotonArabia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoArabia(frameInfoSeleccion);
			}
		});
		BotonArgentina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoArgentina(frameInfoSeleccion);
			}
		});
		BotonAustralia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoAustralia(frameInfoSeleccion);
			}
		});
		BotonBelgica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoBelgica(frameInfoSeleccion);
			}
		});
		BotonBrasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoBrasil(frameInfoSeleccion);
			}
		});
		BotonColombia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoColombia(frameInfoSeleccion);
			}
		});
		BotonCoreaSur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info1.infoCoreaSur(frameInfoSeleccion);
			}
		});
		BotonCostaRica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoCostaRica(frameInfoSeleccion);
			}
		});
		BotonCroacia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoCroacia(frameInfoSeleccion);
			}
		});
		BotonDinamarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoDinamarca(frameInfoSeleccion);
			}
		});
		BotonEgipto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoEgipto(frameInfoSeleccion);
			}
		});
		BotonEspaña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoEspaña(frameInfoSeleccion);
			}
		});
		BotonFrancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoFrancia(frameInfoSeleccion);
			}
		});
		BotonInglaterra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoInglaterra(frameInfoSeleccion);
			}
		});
		BotonIran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info2.infoIran(frameInfoSeleccion);
			}
		});
		BotonIslandia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoIslandia(frameInfoSeleccion);
			}
		});
		BotonJapon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoJapon(frameInfoSeleccion);
			}
		});
		BotonMarruecos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoMarruecos(frameInfoSeleccion);
			}
		});
		BotonMexico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoMexico(frameInfoSeleccion);
			}
		});
		BotonNigeria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoNigeria(frameInfoSeleccion);
			}
		});
		BotonPanama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoPanama(frameInfoSeleccion);
			}
		});
		BotonPeru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoPeru(frameInfoSeleccion);
			}
		});
		BotonPolonia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info3.infoPolonia(frameInfoSeleccion);
			}
		});
		BotonPortugal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoPortugal(frameInfoSeleccion);
			}
		});
		BotonRusia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoRusia(frameInfoSeleccion);
			}
		});
		BotonSenegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoSenegal(frameInfoSeleccion);
			}
		});
		BotonSerbia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoSerbia(frameInfoSeleccion);
			}
		});
		BotonSuecia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoSuecia(frameInfoSeleccion);
			}
		});
		BotonSuiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoSuiza(frameInfoSeleccion);
			}
		});
		BotonTunez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoTunez(frameInfoSeleccion);
			}
		});
		BotonUruguay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info4.infoUruguay(frameInfoSeleccion);
			}
		});
	}

}
