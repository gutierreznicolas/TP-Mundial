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

public class InfoFila3 {
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
	
	public void infoIslandia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE ISLANDIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Gylfi Sigurdsson");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 451, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Gylfi Sigurdsson es una de las estrellas de Islandia. Una seleccion muy coral que tiene al nuevo futbolista del Everton como uno de sus grandes referentes tras ser el fichaje mas caro del club, pagando 49 millones de euros por el. Aunque sus numeros ofensivos en la Premier no estan siendo nada buenos, con la seleccion esta consiguiendo ser uno de los responsables directos de esta clasificacion historica. No en vano, sumo 4 dianas en las 6 ultimas citas con el equipo nacional antes de sellar el billete a Rusia. Sin embargo, una lesion en su rodilla le impidio disputar los amistosos ante Mexico y Peru, el 23 y 27 de marzo respectivamente, en el marco de la preparacion para el Mundial de Rusia 2018.");
		PanelEstrella.setBounds(10, 139, 369, 295);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\gylfi-sigurdsson--490x578.jpg",20, 417, 259, 364, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Heimir Hallgrimsson");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,410, 143, 448, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Heimir Hallgrimsson empezo su cargo en la federacion de Islandia en 2011 como segundo tecnico del cuadro insular, como ayudante de Lars Lagerback, para despues asumir desde 2016 el cargo cuando el sueco dejo el banquillo principal. Este dentista islandes de 50 años de edad fue coprotagonista del exito de alcanzar los cuartos de final en la Eurocopa y ahora ha sido protagonista unico de llegar a la primera Copa del Mundo con Islandia. ");
		PanelDT.setBounds(410, 179, 378, 193);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\heimir_hallgrimsson_getty.jpg",399, 383, 378, 218, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 883, 114, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Islandia termino con el liderato del grupo I, uno de los mas igualados, donde compartieron fase de clasificacion con Croacia, Ucrania, Turquia, Finlandia y Kosovo.");
		PanelComoLLego.setBounds(893, 155, 288, 113);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 813, 263, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Islandia participo en 1 mundial y no gano");
		PanelPresentaciones.setBounds(823, 318, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\576c09b1df861.jpg",822, 393, 340, 186, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,501, 651, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,501, 697, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoIslandia.wav");
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
	public void infoJapon(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE JAPON");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Keisuke Honda");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 417, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Keisuke Honda disputara en Rusia su tercer Mundial. El polivalente futbolista japones, actualmente en el Pachuca tras una dilatada carrera profesional en el Milan, CSKA Moscu y VVV-Venlo, aportara experiencia a una seleccion nipona con la defensa asentada pero con variantes en el frente del ataque. Honda puede jugar en ambos extremos o mas centrado como punta. Ademas de su faceta en los terrenos de juego, se trata de una autentica estrella a todos los niveles en el pais del sol naciente. ");
		PanelEstrella.setBounds(10, 139, 369, 210);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\865174094.jpg",0, 360, 400, 360, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Akira Nishino");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,424, 115, 385, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("La Federacion nipona decidio despedir en abril de 2018, a falta de dos meses para el Mundial, al entrenador Vahid Halilhodzic y designo en su lugar a Akira Nishino, quien hasta ahora se desempeñaba como director deportivo de la JFA Federacion de Futbol de Japon. Vahid Halilhodzic habia sido el seleccionador de Japon desde 2015 hasta abril de 2018. El tecnico bosnio llego al puesto merced a su gran experiencia en los banquillos de distintas naciones como Bosnia, Marruecos, Francia pais en el que ya estuvo como jugador, defendiendo los colores de Nantes y PSG- Turquia, Arabia, Costa de Marfil y Argelia. ");
		PanelDT.setBounds(434, 139, 378, 257);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\asd1.jpg",525, 439, 134, 200, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Japon termino con el liderato del grupo segundo del lado asiatico, donde compartieron fase de clasificacion con Arabia Saudita, Australia, Emiratos arabes Unidos, Irak y Tailandia.");
		PanelComoLLego.setBounds(865, 153, 288, 108);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,813, 263, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Japon participo en 6 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(823, 318, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\japon-vs-senegal-festejo.jpg",736, 407, 417, 286, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,501, 651, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,501, 697, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoJapon.wav");
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
	public void infoMarruecos(JFrame frameInfoSeleccion) {

				herramientas.sonidoCorto(clip);
				frameInfoSeleccion.setVisible(false);
				FrameInfo=new JFrame();
				herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
				FrameInfo.setVisible(true);
				herramientas.CambiarColor(FrameInfo, Color.BLUE);
				FrameInfo.setBounds(100, 100, 1200, 800);
				FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				FrameInfo.getContentPane().setLayout(null);
			
				TextoPresentacion=new JLabel("INFORMACION DE MARRUECOS");
				herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);
		
				TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Mehdi Benatia");
				herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 417, 27);
		
				PanelEstrella=new JTextPane();
				PanelEstrella.setBackground(Color.YELLOW);
				PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
				PanelEstrella.setText("El defensor central Benatia es uno de los futbolistas con mas experiencia internacional del equipo marroqui. El zaguero se formo en las categorias inferiores del Olympique de Marsella para despues iniciar su carrera deportiva en el futbol galo. Pero fue su paso al 'Calcio' el que le hizo un nombre en el panorama europeo, en especial en su etapa en las filas de la Roma, para despues ser traspasado al Bayern y actualmente a la Juventus.");
				PanelEstrella.setBounds(10, 139, 369, 210);
				FrameInfo.getContentPane().add(PanelEstrella);
		
				ImagenEstrella=new JLabel();
				herramientas.CargarImagen(ImagenEstrella, "Imagenes\\1DX_9019 (1).jpg",0, 360, 400, 274, FrameInfo);
				
				TextoDT=new JLabel("DIRECTOR TECNICO: Herve Renard");
				herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,424, 115, 385, 25);
				PanelDT= new JTextPane();
				PanelDT.setBackground(Color.YELLOW);
				PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
				PanelDT.setText("El nombre de Herve Renard ira inevitablemente vinculado tanto al futbol de clubes de Francia como a la Confederacion Africana de Futbol. No en vano ha estado directa o indirectamente dirigiendo a cinco paises del continente africano. Ghana, Zambia -en dos etapas-, Angola, Costa de Marfil y Marruecos, cargo en el que lleva desde febrero de 2016.");
				PanelDT.setBounds(434, 139, 378, 153);
				FrameInfo.getContentPane().add(PanelDT);
		
				ImagenDT=new JLabel();
				herramientas.CargarImagen(ImagenDT, "Imagenes\\default.jpg",424, 290, 364, 228, FrameInfo);
				
				TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
				herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
				
				PanelComoLLego= new JTextPane();
				PanelComoLLego.setBackground(Color.YELLOW);
				PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
				PanelComoLLego.setText("Marruecos lidero el grupo C de clasificacion de la zona africana al encabezar un tabla formada tambien por Costa de Marfil, Gabon y Mali.");
				PanelComoLLego.setBounds(865, 153, 288, 91);
				FrameInfo.getContentPane().add(PanelComoLLego);
				
				TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
				herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,813, 263, 349, 49);
				
				PanelPresentaciones=new JTextPane();
				PanelPresentaciones.setBackground(Color.YELLOW);
				PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
				PanelPresentaciones.setText("Marruecos participo en 5 mundiales de los cuales no gano ninguno");
				PanelPresentaciones.setBounds(823, 318, 324, 36);
				FrameInfo.getContentPane().add(PanelPresentaciones);
				
				ImagenPresentaciones=new JLabel();
				herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\la-seleccion-marroqui-festeja-su-victoria-contra-los-elefantes-marfilenos-_660_385_1556117.jpg",798, 380, 417, 244, FrameInfo);
				
				BotonHimno = new JButton("ESCUCHAR HIMNO");
				herramientas.crearBoton(BotonHimno,499, 556, 171, 23, FrameInfo, Color.WHITE, 11);
						
				BotonStop=new JButton("PARAR HIMNO");
				herramientas.crearBoton(BotonStop,499, 622, 158, 23, FrameInfo, Color.WHITE, 11);
				
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
							File a = new File("sonido\\HimnoMarruecos.wav");
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
	
	public void infoMexico(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE MEXICO");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Chicharito Hernandez");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 499, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El delantero Javier Hernandez es la gran figura de la Seleccion mexicana. Se trata de un atacante que se destaca por su olfato goleador y sus movimientos sin pelota, lo que lo convierte en un jugador muy dificil de marcar para los defensas contrarios . El jugador del West Ham, de 29 años, afronta su segunda etapa en la Premier League, competicion que ya habia disputado con el Manchester United.");
		PanelEstrella.setBounds(10, 139, 369, 176);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\36255_Principal.jpg",0, 360, 414, 322, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Juan Osorio");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,403, 152, 385, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El tecnico colombiano  Juan Carlos Osorio es el seleccionador de Mexico. Osorio tiene una dilatada experiencia profesional, en especial en el futbol de su pais, donde dirigio a equipos como Millonarios, Once Caldas y Atletico Nacional.");
		PanelDT.setBounds(424, 216, 378, 108);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\Osorio-1-600x390.jpg",424, 368, 349, 228, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("El Tri tuvo un camino bastante tranquilo en las Eliminatorias. En el Grupo A, Mexico avanzo como lider tras conquistar 16 puntos de 18 posibles, siendo el empate sin goles ante Honduras su unico tropiezo. Las cosas no fueron distintas en el Hexagonal, donde los de Juan Carlos Osorio sellaron el pase a Rusia con tres fechas de anticipacion y de manera invicta .");
		PanelComoLLego.setBounds(865, 153, 319, 196);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,810, 360, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Mexico participo en 16 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(835, 431, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\Jesus-Corona-Honduras-Pedro-Sula_MEDIMA20151117_0457_5.jpg",824, 496, 305, 176, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,499, 649, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,499, 699, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoMexico.wav");
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
	public void infoNigeria(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE NIGERIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Victor Moses");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 402, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Victor Moses destaca en el frente de ataque de Nigeria donde tambien otros futbolistas como Obi Mikel o Ighalo suman minutos en las ligas profesionales del futbol europeo. El jugador del Chelsea llega con 26 años de edad en el momento idoneo de su carrera deportiva. Moses cuenta con una gran experiencia en la Premier, donde ha defendido, ademas de los colores 'bleus', los escudos de dos clubes tan historicos como Liverpool o West Ham. Moses destaca por su llegada desde el costado derecho hacia la porteria, a traves de su potencia fisica, buen regate y gran olfato goleador. Ademas de extremo, ha llegado a jugar de lateral, por exigencias del momento, demostrando que sabe adaptarse a varios roles. ");
		PanelEstrella.setBounds(10, 139, 369, 290);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\AV1.jpg",82, 440, 200, 259, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Gernot Rohr");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,429, 115, 385, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El entrenador franco-aleman Gernot Rohr tenia como objetivo llevar a Nigeria al Mundial. No solo consiguio el billete para las super aguilas, sino que lo hizo como la primera seleccion africana en conseguirlo. El tecnico es uno de los habituales de los banquillos africanos en esta ultima decada. No en vano, habia dirigido previamente a Burkina Faso, Niger y Gabon.");
		PanelDT.setBounds(412, 139, 378, 159);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\5ae59924266ce.jpg",424, 320, 349, 298, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Nigeria termino con el liderato del grupo B de la CAF (Confederacion Africana de Futbol), donde compartieron un duro grupo en la fase de clasificacion, considerado como el 'grupo de la muerte' con Zambia, Camerun y Argelia.");
		PanelComoLLego.setBounds(865, 153, 319, 125);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,825, 289, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Nigeria participo en 6 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(825, 338, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\seleccion_nigeria_festejo_gol_milenio_la_aficion_milima20170325_0276_11.jpg",829, 403, 401, 237, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,499, 649, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,499, 699, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoNigeria.wav");
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

	public void infoPanama(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE PANAMA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Jaime Penedo");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 402, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Jaime Penedo, arquero con 128 apariciones con la seleccion, cifra que lo ubica como el segundo jugador con mas partidos en la historia de los canaleros. Actualmente milita en el Dinamo Bucarest, campeon de la Copa de la liga de Rumania en 2017. Con Panama ha obtenido el segundo lugar de las Copas Oro en 2005 y 2013, mismas donde fue Guante de Oro del torneo. Tambien fue parte del tercer lugar en la edicion de 2015.");
		PanelEstrella.setBounds(10, 139, 369, 185);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\123123.jpg",41, 359, 299, 155, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Hernan Gomez");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,429, 115, 385, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Hernan Dario Gomez 'El Bolillo' es el segundo entrenador en clasificar a una Copa del Mundo con tres selecciones diferentes (Colombia para Francia 1998, Ecuador para Corea-Japon 2002 y ahora Panama para Rusia 2018) . Antes el frances Henri Michel habia logrado la hazaña (Camerun para Estados Unidos 1994, Marruecos a Francia 1998 y Tunez en Corea-Japon 2002. El entrenador colombiano asumio el cargo de director tecnico de los canaleros en febrero de 2014 a quienes ha dado el tercer lugar de la Copa Oro 2015, misma posicion en la Copa Centroamericana del 2014 y el subcampeonato de ese torneo en la edicion 2017.");
		PanelDT.setBounds(412, 139, 378, 261);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\1.jpg",508, 416, 183, 298, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Panama obtuvo el pase al Mundial de manera polemica al ganar 2-1 a Costa Rica en el ultimo partido del Hexagonal Final con un gol fantasma adjudicado a Blas Perez. Con la victoria se posicionaron en el tercer puesto del grupo eliminatoria al llegar a 13 puntos (tres victorias, cuatro empates y tres derrotas), mismos que Honduras pero al tener una mejor diferencia de goles (-1 contra los -6 de los catrachos) se quedaron con el ultimo boleto directo a Rusia 2018 y conderanon a la 'H' al repechaje intercontienental.");
		PanelComoLLego.setBounds(865, 153, 319, 261);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,797, 411, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Panama participo en 1 mundial y no lo gano");
		PanelPresentaciones.setBounds(807, 471, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\3f93a81c-d6bb-456a-802c-4b6fb127a04a_749_499.jpg",787, 525, 512, 298, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,97, 604, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,97, 673, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoPanama.wav");
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
	
	public void infoPeru(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE PERU");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Jefferson Farfan");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 461, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Jefferson Agustin Farfan Guadalupe (Villa El Salvador, Provincia de Lima, Peru, 26 de octubre de 1984) es un futbolista peruano. Juega como delantero en el FC Lokomotiv Moscu de la Liga Premier de Rusia. Tambien es internacional con la seleccion peruana de futbol desde 2003.");
		PanelEstrella.setBounds(10, 139, 369, 145);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\JF.jpg",56, 315, 259, 204, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Ricardo Gareca");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,429, 170, 385, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El argentino Ricardo Alberto Gareca 'El Tigre'  quien tiene experiencia como director tecnico desde 1995. Desde hace dos años trabaja con la Seleccion peruana a la cual llevo al tercer lugar de la Copa America de Chile 2015 y dio la clasificacion a una Copa del Mundo luego de 35 años de ausencia en la fase final del torneo. En la liga argentina suma tres titulos con Velez Sarsfield y uno en la liga peruana con Universitario . A nivel internacional consiguio la Copa Conmebol con Talleres en 1999, mismo club con el que fue campeon de la Primera B Nacional.");
		PanelDT.setBounds(429, 206, 369, 244);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\ricardo-gareca.jpg",439, 467, 319, 264, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Pese a estar en los ultimos lugares la mayor parte de la eliminatoria sudamericana, los Incas tuvieron un cierre de seis partidos sin perder (tres victorias y tres empates) que les permitio alcanzar el quinto lugar de la clasificacion que le dio la opcion de disputar el repechaje intercontinental ante Nueva Zelanda donde se impusieron por marcador global de 2-0.");
		PanelComoLLego.setBounds(865, 153, 319, 198);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,825, 362, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Peru participo en 5 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(835, 422, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\14315.jpg",776, 508, 355, 161, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,97, 604, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,97, 673, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoPeru.wav");
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
	public void infoPolonia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE POLONIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Robert Lewandowski");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 499, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El delantero Robert Lewandowski es, sin duda, la gran estrella de Polonia y su goleador historico. El atacante supero a Cristiano Ronaldo en la ultima jornada de la fase de grupos para convertirse, con 16 goles, en el maximo artillero de todas las selecciones de la zona europea en esta fase de grupos. Lewandowski ha desarrollado gran parte de su carrera profesional en la Bundesliga, desde que llegara en 2010 al Borussia Dortmund y siguiendo posteriormente con su traspaso al Bayern Munich a partir de 2014. ");
		PanelEstrella.setBounds(10, 139, 409, 193);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\MD_20140813_MAS_DEPORTE_D_54413031178-570x762@MundoDeportivo-Web.jpg",20, 322, 324, 435, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Adam Nawalka");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,429, 170, 376, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Adam Nawalka  asumio el cargo de la seleccion nacional polaca en 2013 tras haber sido entrenador en varios clubes de la 'Ekstraklasa' (Liga Polaca). Despues de haber llevado a Polonia a los cuartos de final de la Eurocopa, Nawalka ha logrado guiar a Lewandowski y compañia a una Copa del Mundo tras dos ausencias consecutivas.");
		PanelDT.setBounds(429, 206, 369, 149);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\2.jpg",476, 417, 245, 149, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 103, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Polonia logro el liderato del grupo E donde compartieron fase de clasificacion con: Dinamarca, Montenegro, Rumania, Armenia y Kazajstan.  ");
		PanelComoLLego.setBounds(865, 153, 319, 98);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN,835, 262, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Polonia participo en 8 mundiales y no gano ninguno");
		PanelPresentaciones.setBounds(835, 322, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\415127F500000578-4592274-image-a-79_1497138543780.jpg",743, 388, 441, 318, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,507, 615, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,507, 683, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoPolonia.wav");
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
