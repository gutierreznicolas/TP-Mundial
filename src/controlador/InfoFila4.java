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

public class InfoFila4 {
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
	
	public void infoPortugal(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		TextoPresentacion=new JLabel("INFORMACION DE PORTUGAL");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Cristiano Ronaldo");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 469, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El madridista Cristiano Ronaldo es el gran referente y abanderado de la 'Selecao'. El '7' es el maximo anotador historico de Portugal y fue uno de los grandes responsables del triunfo en la Eurocopa, aunque tuviera que retirarse lesionado antes de tiempo de la gran final. Ronaldo ha conseguido con el Real Madrid todos los titulos posibles a nivel de clubes. A este extenso palmares personal ha logrado sumarle un titulo continental con Portugal, primero en toda la historia del pais, por lo que la participacion en esta Copa del Mundo es un premio y una responsabilidad, dado que los 32 años del atacante pueden hacer pensar que sea uno de los ultimos, o el ultimo, Mundial de Ronaldo.");
		PanelEstrella.setBounds(10, 139, 409, 266);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\1153740.jpg",37, 431, 324, 305, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Fernando Santos");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,429, 170, 376, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Fernando Santos relevo en 2014 a Paulo Bento con el proposito de enderezar el rumbo de la nave portuguesa. La experiencia y ferrea disciplina del tecnico lisboeta, tanto en clubes como selecciones, como Grecia, fueron algunos de los avales para llevar la batuta de la 'Selecao'. No en vano, Fernando Santos es de los pocos entrenadores en el mundo que han dirigido a los tres grandes de Portugal -Sporting, Porto y Benfica-. Una hazaña al alcance de pocos estrategas que demuestra su calidad y capacidad.");
		PanelDT.setBounds(429, 206, 369, 210);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\3.jpg",467, 427, 202, 225, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Portugal se impuso en la ultima jornada a Suiza, adelantando a los helveticos en el liderato del grupo B, donde compartieron fase de clasificacion con Hungria, Islas Feroe, Letonia y Andorra.  ");
		PanelComoLLego.setBounds(865, 153, 319, 108);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,835, 262, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Portugal participo en 7 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(835, 322, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\los-jugadores-de-portugal-comienzan-el-festejo-tras-ingresar-a-las-semifinales-de-la-eurocopa-_970_540_1379032.jpg",706, 418, 478, 266, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,482, 683, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,482, 728, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoPortugal.wav");
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
	public void infoRusia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE RUSIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: No tiene");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 208, 376, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Es uno de los puntos debiles del combinado ruso. No existe una estrella que capitanee al resto de compañeros. Por los años de trayectoria, por el compromiso con su club -CSKA Moscu- y experiencia al mas alto nivel, el cancerbero Igor Akinfeev podria ser el que mas se acercara a la etiqueta de figura o referencia en Rusia.");
		PanelEstrella.setBounds(0, 265, 409, 139);
		FrameInfo.getContentPane().add(PanelEstrella);

		
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Stanislav Cherchesov");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,336, 127, 467, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El seleccionador es el tecnico Stanislav Cherchesov. Un entrenador gran conocedor del futbol local y que precisamente apuesta por jugadores que participan en el futbol ruso y que no tienen la etiqueta de estrellas. No en vano, algunos de los futbolistas que no participaron en la Copa Confederaciones eran de los mejores pagados en el balompie ruso.");
		PanelDT.setBounds(419, 176, 369, 152);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\4.jpg",454, 365, 270, 201, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Los rusos tienen la plaza asegurada por ser los organizadores del Mundial 2018.");
		PanelComoLLego.setBounds(865, 153, 319, 65);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,835, 229, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Rusia participo en 11 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(835, 289, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\confederaciones_reuters.jpg_1718483347.jpg",779, 397, 395, 225, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,75, 517, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,75, 599, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoRusia.wav");
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
	public void infoSenegal(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE SENEGAL");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Sadio Mane");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,10, 125, 376, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Sadio Mane, delantero del Liverpool quien registro dos anotaciones y tres asistencias durante las eliminatorias. Con la seleccion acumula 14 goles en 50 apariciones. En la campaña 2016-17 fue reconocido como parte del equipo ideal de la Premier League, asi como Jugador del Año por aficionados y ex futbolistas de los Reds. Tambien fue distinguido como parte del equipo del año 2015 y 2016 de la Confederacion Africana de Futbol.");
		PanelEstrella.setBounds(0, 176, 409, 176);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\thumb_63818_default_news_size_5.jpg",0, 372, 424, 270, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Aliou Cisse");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,419, 126, 358, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Aliou Cisse quien apenas tienen su segunda experiencia como entrenador y ya logro llevar a Senegal de nueva cuenta a una Copa del Mundo. De hecho, como jugador fue parte del equipo que tuvo su primera participacion en el Mundial de Corea-Japon 2002. Comenzo su carrera como director tecnico del representativo senegales Sub 23 (2013-15) y desde 2015 se hizo cargo del equipo mayor.  ");
		PanelDT.setBounds(419, 176, 369, 159);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\Aliou+Cisse+Ivory+Coast+v+Senegal+International+rnrhcNhG2K6l.jpg",471, 339, 270, 334, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Al terminar en el primer lugar del Grupo D de la eliminatoria africana al cosechar 14 puntos producto de cuatro partidos ganados y dos empates. Los Leones del Taringa se impusieron como visitantes a Sudafrica por 2-0 en la penultima jornada de juego del sector y asi se quedaron con el pase al Mundial.");
		PanelComoLLego.setBounds(865, 153, 319, 159);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,797, 332, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Senegal participo en 2 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(822, 392, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\5a05fbf07d6a7.jpg",834, 483, 312, 193, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,106, 653, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,106, 701, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoSenegal.wav");
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
	public void infoSerbia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE SERBIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Nemanja Matic");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,10, 125, 414, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Nemanja Matic lleva en el mejor momento a una cita deportiva. A sus 29 años, el mediocampista serbio se ha convertido en una de las piezas fundamentales del Manchester United tras haber ofrecido sus servicios en el Chelsea. Se trata de un futbolista siempre bien posicionado que abarca gran cantidad de metros en el terreno de juego, de los denominados 'box to box' que tanto gustan en la Premier, de ahi su popularidad en la liga inglesa.");
		PanelEstrella.setBounds(0, 176, 409, 176);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\a57f7976aa2c87c6490abde6abeb2a59.jpg",47, 363, 270, 379, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Mladen Krstajic");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,419, 163, 402, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Slavoljub Muslin fue el responsable de clasificar a Serbia para el Mundial pero termino siendo relevado de su cargo, sorprendentemente, a finales de octubre de 2017. Su sustituto es Mladen Krstajic, papel que ejercio inicialmente de forma provisional para ser confirmado en el cargo en diciembre de 2017. Krstajic colgo las botas en 2011 cuando defendia los colores de Partizan. Pese a su escasa experiencia como tecnico, sera el encargado de guiar el camino de Serbia en Rusia.");
		PanelDT.setBounds(418, 210, 369, 210);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\Serbio.jpg",419, 417, 368, 232, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Serbia termino con el liderato del grupo D, uno de los mas igualados, donde compartieron fase de clasificacion con Republica de Irlanda, Gales, Austria, Georgia y Moldavia.");
		PanelComoLLego.setBounds(865, 153, 319, 108);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,835, 272, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Serbia participo en 12 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(850, 346, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\15166960839c62d801.jpg",828, 412, 346, 232, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,494, 660, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,494, 708, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoSerbia.wav");
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
	public void infoSuecia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE SUECIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Marcus Berg");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,10, 125, 394, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("La ausencia en la seleccion del icono Zlatan Ibrahimovic ha dejado muy desierto el papel de figura en el cuadro amarillo. Ninguno de los miembros del actual plantel sueco tiene, obviamente, el magnetismo de la estrella del United. Es un equipo muy coral, donde si acaso brillan algo mas los goles de Berg o la experiencia que esta adquiriendo Lindelof en la Premier y Guidetti en LaLiga, aunque luego no cuente con minutos en la seleccion.");
		PanelEstrella.setBounds(0, 176, 394, 176);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\6.jpg",25, 401, 319, 186, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Jan Andersson");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,418, 126, 382, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Jan Andersson cuenta con una amplia experiencia en el futbol sueco, aunque sin haber entrenado a ninguno de los grandes clubes del pais, El tecnico, cuya imagen limpiando el vestuario de la seleccion se hizo viral, logro su mayor exito deportivo cuando hizo campeon contra todo pronostico al Norrkoping. Es desde 2016 el responsable de los exitos del equipo nacional.");
		PanelDT.setBounds(418, 162, 369, 166);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\Jan-Andersson-Manager.jpg",418, 382, 339, 262, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN,859, 101, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Suecia vencio por un global de 1-0 a la Italia (1-0 y 0-0) en una de las cuatro repescas europeas. El conjunto nordico quedo segundo en el grupo A, liderado por Francia y donde tambien participaban Paises Bajos, Bulgaria, Luxemburgo y Bielorrusia.");
		PanelComoLLego.setBounds(865, 153, 319, 125);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,835, 272, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Suecia participo en 12 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(850, 346, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\sueciaa.jpg",790, 412, 394, 274, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,85, 614, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,85, 663, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoSuecia.wav");
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
	public void infoSuiza(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE SUIZA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Xherdan Shaqiri");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,10, 125, 437, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Shaqiri llega al Mundial en la edad idonea para disputar una Copa del Mundo. A sus 26 años tiene la experiencia de haber formado parte de tres de las ligas profesionales mas fuertes del viejo continente -Bundesliga, Premier y Serie A- y todavia cuenta con margen para crecer.");
		PanelEstrella.setBounds(0, 176, 394, 108);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\maxresdefault.jpg",-71, 280, 465, 384, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Vladimir Petkovic");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,404, 163, 437, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Si la seleccion suiza se caracteriza por ser un combinado heterogeneo con jugadores nacidos en multiples lugares del viejo continente, el tecnico Vladimir Petkovic reune esas caracteristicas al ser bosnio-croata y suizo. Asumio el cargo en diciembre de 2013 al relevar a Ottmar Hitzfeld.");
		PanelDT.setBounds(418, 216, 369, 142);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\Vladimir+Petkovic+Lazio+v+Parma+FC+Serie+FWKeQ2F00eVl.jpg",484, 360, 196, 262, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN,859, 101, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Suiza vencio por un global de 0-1 a Irlanda del Norte (0-1 y 0-0) en una de las cuatro repescas europeas. El conjunto centroeuropeo quedo segundo en el grupo B, liderado por Portugal y donde tambien participaban Hungria, Islas Feroe, Letonia y Andorra.");
		PanelComoLLego.setBounds(865, 153, 319, 125);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,835, 300, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Suiza participo en 11 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(835, 365, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\suizaa.jpg",780, 415, 394, 249, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,494, 641, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,494, 706, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoSuiza.wav");
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
	public void infoTunez(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE TUNEZ");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Youssef Msakni");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,10, 125, 437, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Pese a contar con jugadores internacionales de mayor renombre, como Abdennour o Khazri, el papel de Youssef Msakni, quien puede ejercer de delantero, mediapunta o extremo izquierda, ha sido clave para llevar a las 'aguilas de Cartago' a la cita de Rusia. Estuvo cerca de ser traspasado a LaLiga este pasado verano, donde Espanyol y Celta fueron los mas interesados en contratarle. ");
		PanelEstrella.setBounds(0, 176, 394, 159);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\Youssef_Msakni_2015b_(2).jpg",57, 336, 203, 328, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Nabil Maaloul");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,404, 163, 380, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Nabil Maaloul vive la quinta etapa en la seleccion como tecnico. Fue ayudante de Roger Lemerre cuando lograron la CAN 2004 en casa. Ademas, clasifico al combinado olimpico para Atenas 2004 y luego volvio a coincidir con Lemerre en 2006. Desde 2007 es el seleccionador absoluto del pais norteafricano, al que ha llevado de nuevo a un Mundial.");
		PanelDT.setBounds(418, 216, 369, 159);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\468147758.jpg",470, 397, 196, 335, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN,859, 101, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Tunez lidero el grupo A de clasificacion de la zona africana al encabezar un tabla formada tambien por Congo, Libia y Guinea.");
		PanelComoLLego.setBounds(865, 153, 319, 79);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,845, 243, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Tunez participo en 5 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(850, 303, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\36_dep_1_afp.jpg",740, 408, 444, 270, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,80, 675, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,80, 709, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoTunez.wav");
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
	public void infoUruguay(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE URUGUAY");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Edinson Cavani");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,10, 125, 437, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Edinson Cavani, segundo lugar en la tabla de los goleadores historicos de la seleccion (39), tan solo por debajo de Luis Suarez (49). Fue el maximo anotador en la eliminatoria sudamericana con 10 tantos (por encima de Messi). Nominado al Balon de Oro para el 2017, es parte de la delantera del PSG, destaca por la potencia en sus remates, la tecnica de golpeo, velocidad y ubicacion en el area rival. Aunque suele jugar como centro delantero, tambien puede fungir como extremo o segundo punta. Tambien se encarga de ejecutar tiros libres y penales. Con Uruguay levanto la Copa America de 2011.");
		PanelEstrella.setBounds(0, 176, 394, 227);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\0012432123.jpg",-41, 396, 453, 284, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Oscar Tabarez");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,404, 163, 380, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Oscar Washington Tabarez quien lleva poco mas de diez años en su segunda etapa como entrenador del combinado charrua. Desde entonces ha ganado la Copa America 2011 y ha clasificado a los Mundiales de Sudafrica 2010 y Brasil 2014. En la edicion africana logro el cuarto lugar. En su primer ciclo dirigio en el Mundial de Italia 1990. Con selecciones juveniles consiguio la medalla de oro en los Juegos Panamericanos de Caracas 1983. En Peñarol obtuvo la Copa Libertadores de 1987 y su paso por Boca dejo dos titulos de liga (Clausura 1991 y Apertura 1992), asi como la Copa Masters (1992).");
		PanelDT.setBounds(418, 216, 369, 261);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\scar_Tab\u00E1rez_7493 (1).jpg",494, 470, 196, 335, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN,859, 101, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Acabo en la segunda posicion de la eliminatoria sudamerica con 31 puntos. Si bien consiguio la clasificacion hasta la ultima jornada, la verdad es que La Garra Charrua siempre estuvo en los primeros lugares sin peligro de quedar fuera de Rusia 2018 pero debido a lo apretado que resulto la competencia no pudo asegurar su asistencia al torneo hasta la conclusion de la eliminatoria.");
		PanelComoLLego.setBounds(865, 153, 319, 193);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,835, 377, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Uruguay participo en 13 mundiales de los cuales gano 2");
		PanelPresentaciones.setBounds(850, 441, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\142368.jpg",847, 520, 300, 193, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,102, 680, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,102, 728, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoUruguay.wav");
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
