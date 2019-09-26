package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class InfoFila1 {
	
	HerramientasInterface herramientas=new HerramientasInterface();
	Clip clip;
	JFrame FrameInfo;
	JLabel TextoPresentacion;
	JLabel TextoEstrella;
	JTextPane PanelEstrella;
	JLabel ImagenEstrella;
	JLabel TextoDT;
	JTextPane PanelDT;
	JLabel ImagenDT;
	JLabel TextoComoLLego;
	JTextPane PanelComoLLego;
	JLabel TextoPresentaciones;
	JTextPane PanelPresentaciones;
	JLabel ImagenPresentaciones; 
	JButton BotonHimno;
	JButton BotonStop;
	JButton BotonAtras;
	
	public void infoAlemania(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
		
		TextoPresentacion=new JLabel("INFORMACION DE ALEMANIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 65);
		
		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: TONI KROOS");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN, 20, 118, 385, 50);
		
		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El madridista Toni Kroos es una de las grandes estrellas del equipo aleman. Este estatus de referente lo lleva a la par con el guardameta Manuel Neuer, al que las lesiones le han mantenido en el dique seco durante buena parte del 2017.");
		PanelEstrella.setBounds(30, 161, 367, 113);
		FrameInfo.getContentPane().add(PanelEstrella);
		
		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\120783_570x369.jpg", -68, 240, 499, 477, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Joachim Low");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN, 478, 125, 367, 36);
		
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("La trayectoria de los seleccionadores en los banquillos suele ser de corto recorrido, menos en el caso de la relacion de la Federacion de Alemania de Futbol (DFB) y Joachim Low, cuyo vinculo ya ha superado la decada. Low llego al banquillo de la 'Mannschaft' en 2006 para relevar a Klinsmann. Desde entonces, en sus mas de 150 partidos como seleccionador, ha conseguido el Mundial de Brasil y la Copa Confederaciones de Rusia, a la que acudio con un equipo alternativo donde probo algunos futbolistas.");
		PanelDT.setBounds(523, 172, 311, 253);
		FrameInfo.getContentPane().add(PanelDT);
		
		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\download.jpg", 521, 437, 292, 173, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 884, 125, 273, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Alemania domino con autoridad su grupo de clasificacion al conseguir un pleno de victorias que significaron 30 puntos. Los germanos compartian grupo con: Irlanda del Norte, Republica Checa, Noruega, Azerbaiyen y San Marino.");
		PanelComoLLego.setBounds(903, 183, 250, 183);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 844, 389, 330, 48);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Alemania participo de 18 mundiales de los cuales se consagro campeon en 4.");
		PanelPresentaciones.setBounds(854, 436, 278, 50);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\58db9b4badb1c.jpg", 823, 486, 361, 276, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 590, 633, 137, 23, FrameInfo, Color.WHITE, 11);
		
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop, 590, 696, 137, 23, FrameInfo, Color.WHITE, 11);
		
		BotonAtras=new JButton("ATRAS");
		herramientas.crearBoton(BotonAtras,0, 76, 89, 23, FrameInfo,  Color.YELLOW, 11);
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				FrameInfo.setVisible(false);
				frameInfoSeleccion.setVisible(true);
			}
		});
		BotonHimno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\HimnoAlemania.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				}
		});
		BotonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
			}
		});
		
	}
	public void infoArabia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
		
		TextoPresentacion=new JLabel("INFORMACION DE ARABIA S.");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);
		
		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Mohammed Al-Sahlawi");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN, 0, 150, 490, 17);
		
		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El delantero Mohammed Al-Sahlawi es la gran figura de la seleccionn saudita. Llega a la Copa del Mundo con la madurez que otorga los 30 años de edad y con el aval de ser el maximo anotador de la zona asiatica con 16 dianas. Es el delantero titular del Al-Nassr saudita, donde juega desde 2009. Su debut llego en un partido amistoso ante España en 2010. En aquel partido, el ariete ya dejo muestras de su calidad al marcar un gol a la seleccion que seria meses despues campeona del mundo en Sudafrica.");
		PanelEstrella.setBounds(25, 178, 360, 216);
		FrameInfo.getContentPane().add(PanelEstrella);
		
		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\2506670_large-lnd.jpg",54, 431, 320, 209, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO:  Antonio Pizzi");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,463, 192, 396, 23);
		
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El tecnico argentino Edgardo Bauza habia sustituido recientemente, en septiembre de 2017, al holandes Bert van Marwijk en el cargo, despues de que el tulipan hubiera conducido a la seleccion a Rusia. La aventura de Bauza al frente del combinado ha durado apenas dos meses y sera otro compatriota, Pizzi, el que tome el relevo desde noviembre. El mister hispano-argentino ha firmado en Tokio como nuevo seleccionador, avalado por su experiencia con Chile y la altas ambiciones, segun desvelo el presidente de la Federacion Saudi, Adel bin Mohamed Ezat, a la agencia SPA.");
		PanelDT.setBounds(473, 226, 352, 267);
		FrameInfo.getContentPane().add(PanelDT);
		
		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\images.jpg", 547, 493, 180, 180, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 886, 140, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Los 'halcones' quedaron segundos en la segunda fase del grupo de clasificacion con 19 puntos. Por debajo de Japon y superando a Australia, el cual tendra que disputar una repesca. ");
		PanelComoLLego.setBounds(912, 205, 262, 147);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 835, 396, 349, 23);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("El seleccionado arabe participo en 5 mundiales y no gano ninguno.");
		PanelPresentaciones.setBounds(868, 445, 306, 49);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\2676739h160.jpg",897, 515, 240, 173, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 155, 651, 171, 23, FrameInfo, Color.WHITE, 11);
		
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop, 155, 697, 158, 23, FrameInfo, Color.WHITE, 11);
		
		BotonAtras=new JButton("ATRAS");
		herramientas.crearBoton(BotonAtras,10, 65, 89, 23, FrameInfo,  Color.YELLOW, 11);
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				FrameInfo.setVisible(false);
				frameInfoSeleccion.setVisible(true);
			}
		});
		BotonHimno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\HimnoArabia.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				}
		});
		BotonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
			}
		});
	}
	
	public void infoArgentina(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
		
		TextoPresentacion=new JLabel("INFORMACION DE ARGENTINA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);
		
		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Lionel Messi");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN, 0, 150, 408, 17);
		
		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Lionel Messi, goleador historico de la Seleccion (61 anotaciones) y uno de los mejores jugadores en la historia del futbol. Ganador de cuatro Balones de Oro de la FIFA, con el Barcelona ha conseguido cualquier cantidad de titulos (Liga española, Copa del Rey, Supercopa española, Champions League, Supercopa de Europa, Mundial de Clubes), mientras que con representativos juveniles de la Albiceleste levanto la Copa del Mundo Sub 20 (2005) y obtuvo medalla de oro en los Juegos Olipicos de Beiging 2008. Ha impuesto diferentes marcas de goleo en su club, en la liga española y en Champions. Con 30 años de edad buscara ganar un Mundial.");
		PanelEstrella.setBounds(25, 178, 360, 278);
		FrameInfo.getContentPane().add(PanelEstrella);
		
		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\280px-Lionel_Andr\u00E9s_Messi_Cuccittini.jpg",49, 467, 280, 295, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Jorge Sampaoli");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,451, 147, 396, 23);
		
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Jorge Sampaoli llego en junio pasado para sustituir al 'Paton' Bauza. Consiguio para la Seleccion chilena su primer titulo oficial (Copa America 2015). Es admirador del estilo de Marcelo Bielsa. Suele jugar con una formacion 3-3-1-3. Dirige desde 1994 y sus mayores exitos los tuvo con la Universidad de Chile al ganar tres veces la liga (Apertura y Clausura 2011, Apertura 2012) y la Copa Sudamericana (2011). En Europa dirigio al Sevilla.");
		PanelDT.setBounds(461, 178, 352, 202);
		FrameInfo.getContentPane().add(PanelDT);
		
		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\Sampaoli.jpg", 460, 412, 318, 173, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 886, 140, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Termino en la tercera posicion de la eliminatoria sudamerica con 28 puntos luego de un proceso complicado que por momentos puso en zona de repechaje a la Albicelese e incluso llego a quedar fuera del Mundial, situacion que provoco la salida de Gerardo 'Tata' Martino y despues de Edgardo 'El Paton' Bauza de la direccion tecnica. Al final, se consiguio el pase con una victoria 3-1 sobre Ecuador bajo las ordenes de Jorge Sampaoli.");
		PanelComoLLego.setBounds(912, 187, 262, 261);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 825, 463, 349, 23);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Argentina participo en 16 copas del mundo de las cuales gano 2");
		PanelPresentaciones.setBounds(868, 497, 306, 49);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\Seleccion_argentina_1_1-2qhsuk1q0tm0-520x245.jpg",793, 549, 391, 202, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 527, 621, 171, 23, FrameInfo, Color.WHITE, 11);
		
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop, 527, 701, 158, 23, FrameInfo, Color.WHITE, 11);
		
		BotonAtras=new JButton("ATRAS");
		herramientas.crearBoton(BotonAtras,10, 65, 89, 23, FrameInfo,  Color.YELLOW, 11);
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				FrameInfo.setVisible(false);
				frameInfoSeleccion.setVisible(true);
			}
		});
		BotonHimno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\HimnoArgentina.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				}
		});
		BotonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
			}
		});
	}
	public void infoAustralia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE AUSTRALIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Tim Cahill");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN, 0, 150, 405, 17);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El veterano Tim Cahill disputara su cuarto Mundial en Rusia 2018. Actualmente Cahill ha regresado a Australia para defender los colores del Melbourne City, despues de haber triunfado en la Premier League, principalmente en el Everton, y haber seguido su carrera en el futbol estadounidense y chino. Destaca por su caracter, ambicion y poderoso juego aereo, pese a no poseer una gran estatura. Ademas, tiene el hito de haber sido el primer australiano en marcar un gol para su seleccion en una Copa del Mundo, ademas de ser el maximo goleador de la seleccion.");
		PanelEstrella.setBounds(25, 178, 360, 278);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\123.jpg",59, 467, 259, 202, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Vacante ");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,451, 147, 396, 23);
		
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Ange Postecoglou renuncio al cargo como seleccionador en noviembre de 2017, pese a haber logrado la clasificacion para la Copa del Mundo. 'Entrenar a tu propio pais es el mayor de los privilegios, pero tambien supone una gran responsabilidad', para añadir que 'ahora es el momento adecuado para pasarle esta responsabilidad a alguien que tenga la energia que esto requiere'. El puesto de los 'Socceroos' esta en estos momentos vacante.");
		PanelDT.setBounds(461, 178, 352, 202);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\signo.png", 482, 391, 239, 194, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 886, 140, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Australia se clasifico como tercera del grupo B en la confederacion asiatica. Por este motivo, tuvo que jugar una ronda con el otro tercero -Siria- para ganarse una plaza en la repesca intercontinental. Australia finalmente elimino a Honduras en dicho repechaje por un global de 3-1 (3-1 y 0-0).\"");
		PanelComoLLego.setBounds(912, 187, 262, 185);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 823, 365, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Australia participo en 5 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(843, 402, 306, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\Australia_Getty.jpg",731, 438, 453, 408, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 482, 620, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop, 482, 701, 158, 23, FrameInfo, Color.WHITE, 11);
		
		BotonAtras=new JButton("ATRAS");
		herramientas.crearBoton(BotonAtras,10, 65, 89, 23, FrameInfo,  Color.YELLOW, 11);
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				FrameInfo.setVisible(false);
				frameInfoSeleccion.setVisible(true);
			}
		});
		BotonHimno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\HimnoAustralia.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				}
		});
		BotonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
			}
		});
	}
	public void infoBelgica(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE BELGICA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Eden Hazard");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 150, 405, 17);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El mediapunta Eden Hazard es la gran figura de la seleccion belga. Abanderando la mejor generacion del futbol belga. Se trata de un futbolista ambidiestro, muy vertical y que puede participar en todo el frente del ataque. El jugador del Chelsea, de 26 años de edad, afronta su sexta temporada consecutiva en la Premier League, competicion a la que llego procedente del Lille.");
		PanelEstrella.setBounds(25, 178, 352, 194);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\1233.jpg",63, 383, 259, 194, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Roberto Martinez");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,429, 147, 425, 23);
		
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El tecnico español Roberto Martinez es el seleccionador de Belgica. Martinez tiene una dilatada experiencia profesional, en especial en el futbol britanico, donde termino su carrera como jugador para dar despues sus inicios en los banquillos.");
		PanelDT.setBounds(461, 178, 352, 116);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\martinez.jpg",387, 302, 415, 408, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 886, 140, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Los 'diablos rojos' lideraron el grupo de clasificacion H con 22 puntos. El grupo estaba formado por Bosnia, Grecia, Chipre, Estonia y Gibraltar. ");
		PanelComoLLego.setBounds(912, 187, 262, 103);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 812, 283, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Belgica participo en 13 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(822, 325, 306, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\3568788_n_vir3.jpg",805, 416, 453, 230, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 106, 611, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop, 106, 671, 158, 23, FrameInfo, Color.WHITE, 11);
		
		BotonAtras=new JButton("ATRAS");
		herramientas.crearBoton(BotonAtras,10, 65, 89, 23, FrameInfo,  Color.YELLOW, 11);
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				FrameInfo.setVisible(false);
				frameInfoSeleccion.setVisible(true);
			}
		});
		BotonHimno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\HimnoBelgica.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				}
		});
		BotonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
			}
		});
	}
	public void infoBrasil(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE BRASIL");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Neymar Junior");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 140, 419, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("No hay dudas: Neymar es el crack de Brasil. Desequilibrante, veloz, goleador, participa de practicamente todas las jugadas ofensivas de Brasil. El delantero de PSG, de 26 años, disputa su primera temporada en la Ligue 1, despues de ser comprado al Barcelona por 222 millones de euros, la transferencia mas grande de la historia.");
		PanelEstrella.setBounds(25, 178, 352, 154);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\Neymar-1.jpg",-67, 343, 538, 419, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Tite Bacchi");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,429, 147, 425, 23);
		
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El brasilero Tite es el tecnico de la Verdeamreala. Con una gran experiencia en el pais, con 27 años de profesion, se destaco en Corinthians despues de conquistar la Copa Libertadores (2012), el Mundial de Clubes del mismo año y el campeonato local (en el 2011 y 2015). Comenzo a entrenar en 1990, poco despues de terminar su carrera como jugador profesional.");
		PanelDT.setBounds(439, 178, 352, 154);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\ECUADOR_vs_BRASIL_-_ARCO_SUR_(29393658575)_(cropped).jpg",481, 343, 245, 306, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 834, 140, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("El conjunto de Tite consiguio la clasificacion con mucha anticipacion, en marzo del 2017, cuando quedaban aun cuatro fechas para el final de las Eliminatorias sudamericanas. Ademas, tras vencer a Ecuador en la fecha 15 se aseguro el primer lugar.");
		PanelComoLLego.setBounds(871, 187, 288, 157);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 810, 339, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Brasil participo en 21 mundiales  y salio campeon 5 veces");
		PanelPresentaciones.setBounds(820, 383, 306, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\1496687541_592124_1496687704_noticia_normal.jpg",774, 453, 400, 230, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 522, 660, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop, 522, 707, 158, 23, FrameInfo, Color.WHITE, 11);
		
		BotonAtras=new JButton("ATRAS");
		herramientas.crearBoton(BotonAtras,10, 65, 89, 23, FrameInfo,  Color.YELLOW, 11);
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				FrameInfo.setVisible(false);
				frameInfoSeleccion.setVisible(true);
			}
		});
		BotonHimno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\HimnoBrasil.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				}
		});
		BotonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
			}
		});
		
	}
	
	public void infoColombia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE COLOMBIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: James Rodrigez");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 140, 430, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Colombia tiene un plantel muy equilibrado con grandes jugadores, pero, sin lugar a dudas, la maxima figura del combinado cafetero en Rusia sera James Rodriguez, quien buscara revalidar lo hecho en Brasil 2014, en donde fue la gran revelacion, una de las maximas figuras y el ganador del Botin de Oro con seis tantos. ");
		PanelEstrella.setBounds(25, 178, 352, 154);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\111111 (1).jpg",42, 360, 300, 246, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Jose Pekerman");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,447, 142, 377, 23);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El argentino Jose Pekerman estara en el banquillo Tricolor en Rusia 2018, su tercer Mundial y segundo al mando de Colombia. Don Jose es un tecnico experimentado que ha sabido sacar a relucir lo mejor de la generacion dorada del futbol colombiano. El gaucho cambio para siempre la ideologia del balompie cafetero y ya es considerado como uno de los mejores tecnicos en la historia de la Seleccion al lado de Francisco Maturana.");
		PanelDT.setBounds(439, 178, 352, 193);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\jose-pekerman-es-el-dt-que-mas-cobra-en-suramerica-497065.jpg",450, 377, 518, 450, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 856, 135, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("El conjunto de Jose Pekerman tuvo un andar regular durante todo el clasificatorio de la Conmebol, solo hasta la ultima fecha logro el anhelado cupo a Rusia tras empatar con Peru en Lima .  El combinado cafetero se quedo con el cuarto cupo sudamericano con 27 puntos.  ");
		PanelComoLLego.setBounds(886, 178, 288, 157);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 810, 339, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Colombia participo en 6 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(820, 383, 306, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\selecci\u00F3n-colombia-james.jpg",800, 430, 594, 332, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 77, 636, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop, 77, 691, 158, 23, FrameInfo, Color.WHITE, 11);
		
		BotonAtras=new JButton("ATRAS");
		herramientas.crearBoton(BotonAtras,10, 65, 89, 23, FrameInfo,  Color.YELLOW, 11);
		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				FrameInfo.setVisible(false);
				frameInfoSeleccion.setVisible(true);
			}
		});
		BotonHimno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				try{
					clip= AudioSystem.getClip();
					File a = new File("sonido\\HimnoColombia.wav");
					clip.open(AudioSystem.getAudioInputStream(a));
					clip.start();
					
					}
					catch (Exception tipoerror) {
						System.out.println("" + tipoerror);
					}
				}
		});
		BotonStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
			}
		});
	}


	
public void infoCoreaSur(JFrame frameInfoSeleccion) {
	herramientas.sonidoCorto(clip);
	frameInfoSeleccion.setVisible(false);
	FrameInfo=new JFrame();
	herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
	FrameInfo.setVisible(true);
	herramientas.CambiarColor(FrameInfo, Color.BLUE);
	FrameInfo.setBounds(100, 100, 1200, 800);
	FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	FrameInfo.getContentPane().setLayout(null);

	TextoPresentacion=new JLabel("INFORMACION DE COREA DEL SUR");
	herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

	TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Son Heung-Min");
	herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 140, 430, 27);

	PanelEstrella=new JTextPane();
	PanelEstrella.setBackground(Color.YELLOW);
	PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
	PanelEstrella.setText("El delantero Son Heung-Min ha desarrolado la mayor parte de su carrera deportiva en el futbol europeo, tras empezar en las filas del Hamburgo. Precisamente fue la Bundesliga su gran escaparte, primero con el club haseatico y luego con el Bayer Leverkusen, para recalar definitivamente en el Tottenham, donde es una de las grandes estrellas de los 'Spurs'. ");
	PanelEstrella.setBounds(25, 178, 352, 154);
	FrameInfo.getContentPane().add(PanelEstrella);

	ImagenEstrella=new JLabel();
	herramientas.CargarImagen(ImagenEstrella, "Imagenes\\Son_Heung-min_2016.jpg",42, 369, 245, 234, FrameInfo);
	
	TextoDT=new JLabel("DIRECTOR TECNICO:  Shin Tae-yong");
	herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,440, 142, 391, 25);
	PanelDT= new JTextPane();
	PanelDT.setBackground(Color.YELLOW);
	PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
	PanelDT.setText("El tecnico local Shin Tae-yong es el seleccionador desde julio de 2017 al sustituyar al aleman Uli Stielike. El entrenador accede al cargo debido a su experiencia anterior tanto con el equipo olimpico como con las categorias inferiores del combinado asiatico.");
	PanelDT.setBounds(440, 178, 352, 136);
	FrameInfo.getContentPane().add(PanelDT);

	ImagenDT=new JLabel();
	herramientas.CargarImagen(ImagenDT, "Imagenes\\1234.jpg",336, 334, 469, 357, FrameInfo);
	
	TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
	herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 856, 135, 270, 36);
	
	PanelComoLLego= new JTextPane();
	PanelComoLLego.setBackground(Color.YELLOW);
	PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
	PanelComoLLego.setText("Los 'rojos' quedaron segundos en la segunda fase de la clasificacion por el lado asiatico, con 15 puntos en 10 partidos, por detras de los iranies. El grupo estaba formado por Iran, Siria, Uzbekistan, China y Catar.");
	PanelComoLLego.setBounds(886, 178, 288, 157);
	FrameInfo.getContentPane().add(PanelComoLLego);
	
	TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
	herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 835, 329, 349, 49);
	
	PanelPresentaciones=new JTextPane();
	PanelPresentaciones.setBackground(Color.YELLOW);
	PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
	PanelPresentaciones.setText("Corea Del Sur participo en 10 mundiales de los cuales no gano ninguno");
	PanelPresentaciones.setBounds(850, 383, 324, 36);
	FrameInfo.getContentPane().add(PanelPresentaciones);
	
	ImagenPresentaciones=new JLabel();
	herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\seleccion-corea-del-sur.jpg",834, 446, 340, 245, FrameInfo);
	
	BotonHimno = new JButton("ESCUCHAR HIMNO");
	herramientas.crearBoton(BotonHimno, 77, 636, 171, 23, FrameInfo, Color.WHITE, 11);
			
	BotonStop=new JButton("PARAR HIMNO");
	herramientas.crearBoton(BotonStop, 77, 691, 158, 23, FrameInfo, Color.WHITE, 11);
	
	BotonAtras=new JButton("ATRAS");
	herramientas.crearBoton(BotonAtras,0, 80, 89, 23, FrameInfo,  Color.YELLOW, 11);
	JLabel ImagenFondo = new JLabel();
	herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, FrameInfo);
	BotonAtras.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			herramientas.sonidoCorto(clip);
			FrameInfo.setVisible(false);
			frameInfoSeleccion.setVisible(true);
		}
	});
	BotonHimno.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			herramientas.sonidoCorto(clip);
			try{
				clip= AudioSystem.getClip();
				File a = new File("sonido\\HimnoCoreaSur.wav");
				clip.open(AudioSystem.getAudioInputStream(a));
				clip.start();
				
				}
				catch (Exception tipoerror) {
					System.out.println("" + tipoerror);
				}
			}
	});
	BotonStop.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			herramientas.sonidoCorto(clip);
			clip.stop();
		}
	});
	
}

}



