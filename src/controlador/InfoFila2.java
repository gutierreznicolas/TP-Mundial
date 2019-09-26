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

public class InfoFila2 {
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
	
	public void infoCostaRica(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
		
		TextoPresentacion=new JLabel("INFORMACION DE COSTA RICA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Keylor Navas");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 140, 430, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Keylor Navas, arquero del Real Madrid y quien fuera parte de la sorprendente actuacion de los ticos en la Copa del Mundo de Brasil 2014. En ese torneo, tres veces obtuvo el premio al Jugador Mas Valioso del Partido. Con los merengues ha ganado tres Champions League, dos Mundiales de Clubes, tres Supercopas europeas, una liga española y una Copa del Rey.");
		PanelEstrella.setBounds(25, 178, 340, 180);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\noticia-keylor-navas-chelsea.jpg",-162, 358, 619, 393, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Oscar Ramirez");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,440, 142, 391, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Oscar Ramirez 'El Machillo' consiguio cinco titulos de liga y la Supercopa de Costa Rica  para el Alajuelense. Fue parte del cuerpo tecnico de Hernan Medford como su auxiliar entre 2007 y 2008. Desde 2015 vive su primera experiencia como el entrenador principal de la seleccion. En su etapa como jugador formo parte del primer representativo tico que fue a una Copa del Mundo en Italia 1990.");
		PanelDT.setBounds(440, 178, 352, 136);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\\u00D3scar_Ram\u00EDrez_June_2016.jpg",509, 367, 220, 241, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 856, 135, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Termino en segundo lugar del Hexagonal final de la Concacaf al sumar 16 puntos (cuatro victorias, cuatro empates y dos derrotas) y fue la segunda seleccion de la region en obtener el boleto directo a Rusia 2018 en un proceso sin muchas complicaciones.");
		PanelComoLLego.setBounds(886, 178, 288, 157);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 835, 329, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Costa Rica participo de 4 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(850, 383, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\Costa-Michael-Umana-Foto-EFE_LRZIMA20140630_0022_11.jpg",750, 430, 424, 350, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 526, 638, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,526, 689, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoCostaRica.wav");
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
	public void infoCroacia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE CROACIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Luka Modric");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 140, 430, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Luka Modric es el lider de una seleccion experimentada que cuenta con jugadores habituados a la presion de la maxima competicion, como Rakitic o Mandzukic. Modric ha sufrido una transformacion deportiva desde que dejara el Tottenham y recalara en el Real Madrid, no solo peso deportivo por estar en el campeon de Europa sino su importancia en el esquema de cualquier equipo, multiplicando sus opciones como jugador, mas versatil y con mayor numero de matices. ");
		PanelEstrella.setBounds(25, 178, 369, 210);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\000_jl6j5.jpg_1151390924 (1).jpg",35, 402, 307, 230, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Zlatko Dalic");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,440, 142, 391, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Zlatko Dalic sustituyo al seleccionador Ante Cacic justo antes de celebrarse la repesca. La Federacion, presidida por Suker, decidio destituir a Cacic y dar el relevo provisionalmente a Dalic, quien podria ahora ser el entrenador croata para el Mundial.");
		PanelDT.setBounds(440, 178, 352, 125);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\859528438 (1).jpg",433, 314, 307, 400, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 856, 135, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Croacia vencio por un global de 4-1 a Grecia (4-1 y 0-0) en una de las cuatro repescas europeas. El conjunto ajedrezado quedo segundo en el Grupo I, liderado por Islandia y donde tambien participaban Ucrania, Turquia, Finlandia y Kosovo.");
		PanelComoLLego.setBounds(886, 178, 288, 142);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 835, 329, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Croacia participo en 5 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(850, 383, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\pic.jpg",808, 451, 366, 196, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 88, 643, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,88, 691, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoCroacia.wav");
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
	public void infoDinamarca(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE DINAMARCA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Christian Eriksen");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 459, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Eriksen apenas tiene 25 años, pero parece que tenga la experiencia de un veterano treinteañero. El futbolista danes, formado en la inagotable cantera del Ajax, no parece encontrar su techo en el Tottenham, donde ha dejado atras las dudas que existieron en algun momento sobre su rendimiento.  ");
		PanelEstrella.setBounds(10, 135, 369, 125);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\Christian-Ericksen.jpg",-15, 271, 391, 491, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Age Hareide");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,417, 152, 391, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Age Hareide es el seleccionador de Dinamarca. El veterano estratega noruego tuvo que relevar a toda una institucion como fue Morten Olsen, quien estuvo quince años al frente del combinado danes.");
		PanelDT.setBounds(427, 188, 352, 96);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\hareide.jpg",436, 316, 307, 232, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 856, 135, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Dinamarca vencio por un global de 5-1 a la Republica de Irlanda (0-0 y 1-5) en una de las cuatro repescas europeas. El conjunto nordico quedo segundo en el grupo E, liderado por Polonia y donde tambien participaban Montenegro, Rumania, Armenia y Kazajstan.");
		PanelComoLLego.setBounds(886, 178, 288, 142);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 835, 329, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Dinamarca participo en 5 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(850, 383, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\seleccion-de-dinamarca-reuters_34_0_904_562 (2).jpg",770, 445, 404, 280, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno, 513, 615, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,513, 669, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoDinamarca.wav");
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
	public void infoEgipto(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE EGIPTO");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Mohamed Salah");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 417, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("Mohamed Salah, ademas de ser el maximo goleador de toda la fase de clasificacion de la CAF, es tambien el futbolista mas internacional del conjunto de los 'faraones'. La carrera deportiva de Salah llego pronto a Europa, a los 20 años, siendo meteorica desde entonces. Salah, de 25 años de edad, ha defendido los colores del Basilea, Chelsea, Fiorentina, Roma y Liverpool, donde se ha convertido en una de las piezas claves del equipo de Klopp merced a su gran velocidad y el olfato goleador.");
		PanelEstrella.setBounds(10, 152, 369, 210);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\Mohamed+Salah+Tottenham+Hotspur+v+Liverpool+sT0Fiow2oNVl.jpg",31, 392, 300, 232, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Hector Cuper");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,416, 141, 391, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Hector Cuper es de esos tecnicos que apenas necesitan presentacion porque su curricula habla por si mismo. El entrenador argentino abandono el futbol de su pais para convertirse en un habitual de los banquillos españoles e ingleses, consiguiendo notables resultados en clubes como Mallorca o Valencia. Antes de dirigir a la seleccion de Egipto, Cuper habia probado la exotica experiencia del combinado de Georgia, en su primera experiencia con un equipo nacional. Cuper lleva dos años al frente del cuadro egipcio, al que ha conducido de nuevo a un Mundial. ");
		PanelDT.setBounds(416, 168, 349, 261);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\Cuper_Hector.jpg",449, 427, 245, 261, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 856, 135, 270, 36);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Egipto termino con el liderato del grupo E de la CAF (Confederacion Africana de Futbol), donde compartieron fase de clasificacion con Uganda, Ghana y Congo.");
		PanelComoLLego.setBounds(886, 178, 288, 91);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 825, 271, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Egipto participo en 3 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(835, 316, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\20180331170212-2017100918115645179.jpg",819, 397, 340, 227, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,99, 649, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,99, 695, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoEgipto.wav");
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
	public void infoEspaña(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE ESPAÑA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Sergio Ramos");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,10, 141, 406, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("La seleccion española dispone de grandes jugadores y de estrellas de renombre, como Iniesta, Pique o Silva. Quizas por su caracter y por el momento de juego que esta viviendo, Sergio Ramos podria ser el abanderado de España en Rusia.");
		PanelEstrella.setBounds(21, 189, 369, 108);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\sergio-ramos-real-madrid-dortmund-655x368.jpg",-30, 349, 446, 312, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Julen Lopetegui");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,416, 115, 409, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Exfutbolista y posteriormente entrenador, Lopetegui, empezo su carrera en los banquillos en el Rayo y posteriomente en el Castilla, junto antes de empezar a dirigir a las distintas categorias inferiores del equipo nacional, desde la sub-19 a los sub-21. El 21 de julio de 2016, despues de haber estado dirigiendo al Porto, fue el elegido por la RFEF para relevar la exitosa etapa de Vicente del Bosque como seleccionador español.");
		PanelDT.setBounds(426, 151, 349, 199);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\julen.jpg",416, 364, 360, 248, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 118, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("España lidero el grupo G de clasificacion de la zona europea superando a selecciones como: Italia, Albania, Israel, Macedonia Y Liechtenstein.");
		PanelComoLLego.setBounds(886, 178, 288, 91);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 825, 271, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("España participo de 15 mundiales de los cuales gano 1");
		PanelPresentaciones.setBounds(835, 316, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\1278845981_1.jpg",769, 385, 415, 227, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,494, 638, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,494, 684, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoEspaña.wav");
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
	public void infoFrancia(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE FRANCIA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Antoine Griezmann");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 467, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El rojiblanco Antoine Griezmann es una de las grandes figuras de Francia, compartiendo los focos con una pleyade de estrellas emergentes como Pogba y Mbappe, sin olvidar a Lemar. No en vano, Griezmann ocupo el tercer cajon en el galardon del 'Balon de Oro' en su edicion de 2016, tanto por su papel como internacional, como por ser uno de los responsables directos de los exitos del Atletico de Madrid.");
		PanelEstrella.setBounds(10, 139, 369, 176);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\n_20150222230629_cronica_comoda_tras_el_resbalon_y_su_resaca.jpg",0, 311, 400, 406, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Didier Deschamps");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,416, 152, 409, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("Didier Deschamps capitaneo la Francia campeona del mundo en 1998 junto a Blanc y Zidane y ahora quiere emular ese mismo papel desde el banquillo. La principal virtud que cuenta los 'bleus' es la posibilidad de disponer de varios jugadores para un mismo puesto y, por lo tanto, de grandes variantes tacticas. Los 'bleus' pueden optar por un 4-4-2 o por un 4-2-3-1, asi como una tactica ofensiva del calibre de una 4-3-3. Deschamps lleva desde 2012 asumiendo el cargo de seleccionador frances. Ha sido renovado recientemente de su cargo, en octubre, hasta 2020, pese a que todavia no ha conseguido ningun titulo de los disputados.");
		PanelDT.setBounds(437, 190, 378, 261);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\245px-Didier_Deschamps_in_2018.jpg",591, 464, 145, 212, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 835, 118, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Francia certifico el billete a Rusia en la ultima jornada a Suiza, adelantando al resto de integrantes del grupo A, donde compartieron fase de clasificacion con Suecia, Paises Bajos, Bulgaria, Luxemburgo y Bielorrusia.");
		PanelComoLLego.setBounds(886, 178, 288, 127);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 825, 316, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Francia participo en 15 mundiales de los cuales gano 1");
		PanelPresentaciones.setBounds(835, 376, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\1430894.jpg",759, 465, 415, 227, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,410, 561, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,410, 615, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoFrancia.wav");
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
	public void infoInglaterra(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE INGLATERRA");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Harry Kane");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 378, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El delantero Harry Kane es una de las grandes figuras de la seleccion inglesa. El delantero del Tottenham lleva cuatro temporadas consecutivas anotando mas de una veintena de goles en Premier League. Este vendaval de goles le ha valido para que su nombre se relacione con el de otros grandes equipos del viejo continente. Ademas, sus 24 años aseguran un futuro prometedor y una gran ristra de goles por anotar.");
		PanelEstrella.setBounds(10, 139, 369, 176);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\kane_3.jpg",-29, 318, 407, 406, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Gareth Southgate");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,410, 115, 415, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El tecnico ingles Southgate entro al principio como una alternativa provisional tras la marcha forzada del banquillo de los 'pross' de Sam Allardyce, involucrado en una trama de corrupcion de fichajes, para despues ser confirmado como el seleccionador nacional.");
		PanelDT.setBounds(420, 139, 378, 116);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\44D29DDE00000578-0-image-a-20_1506623406959.jpg",447, 293, 302, 227, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 868, 114, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Los 'pross' lideraron el grupo de clasificacion F con 26 puntos. El grupo estaba formado por Eslovaquia, Escocia, Eslovania, Lituania y Malta.");
		PanelComoLLego.setBounds(886, 178, 288, 91);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 825, 316, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Inglaterra participo en 15 mundiales de los cuales gano 1");
		PanelPresentaciones.setBounds(835, 376, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\ing.jpg",752, 436, 465, 288, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,513, 601, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,513, 669, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoInglaterra.wav");
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
	public void infoIran(JFrame frameInfoSeleccion) {
		herramientas.sonidoCorto(clip);
		frameInfoSeleccion.setVisible(false);
		FrameInfo=new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", FrameInfo);
		FrameInfo.setVisible(true);
		herramientas.CambiarColor(FrameInfo, Color.BLUE);
		FrameInfo.setBounds(100, 100, 1200, 800);
		FrameInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrameInfo.getContentPane().setLayout(null);
	
		TextoPresentacion=new JLabel("INFORMACION DE IRAN");
		herramientas.IngresarTexto(TextoPresentacion, FrameInfo, 65, Color.GREEN, 0, 0, 1184, 79);

		TextoEstrella=new JLabel("ESTRELLA DEL EQUIPO: Sardar Azmoun");
		herramientas.IngresarTexto(TextoEstrella, FrameInfo, 20, Color.GREEN,0, 114, 415, 27);

		PanelEstrella=new JTextPane();
		PanelEstrella.setBackground(Color.YELLOW);
		PanelEstrella.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelEstrella.setText("El delantero irani Azmoun es la gran estrella del combinado asiatico. Casi se puede decir que jugara en casa, ya que desde 2013 lleva participando en el futbol ruso, en las filas del Rubin Kazan, incluyendo el equipo filial y el primer conjunto, ademas del Rostov.");
		PanelEstrella.setBounds(10, 139, 369, 125);
		FrameInfo.getContentPane().add(PanelEstrella);

		ImagenEstrella=new JLabel();
		herramientas.CargarImagen(ImagenEstrella, "Imagenes\\11111111.jpg",46, 263, 259, 364, FrameInfo);
		
		TextoDT=new JLabel("DIRECTOR TECNICO: Carlos Queiroz");
		herramientas.IngresarTexto(TextoDT, FrameInfo, 20, Color.GREEN,410, 143, 396, 25);
		PanelDT= new JTextPane();
		PanelDT.setBackground(Color.YELLOW);
		PanelDT.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelDT.setText("El entrenador portugues Queiroz acumula seis años al frente de la seleccion irani. El tecnico luso ocupo el cargo tras haber dirigido a la seleccion portuguesa. Si bien, la trayectoria del mister es mas conocida por su paso por el banquillo del Real Madrid o su labor como asistente en el Manchester United junto a Ferguson. Pese al tiempo que lleva acumulado en la direccion de Iran, las relaciones del luso con la federacion y la liga del pais han sufrido vaivenes, llegando incluso a plantearse su salida en enero de 2017 por distintas desavenencias. ");
		PanelDT.setBounds(410, 179, 378, 227);
		FrameInfo.getContentPane().add(PanelDT);

		ImagenDT=new JLabel();
		herramientas.CargarImagen(ImagenDT, "Imagenes\\CarlosQueiroz.jpg",449, 417, 245, 343, FrameInfo);
		
		TextoComoLLego=new JLabel("COMO LLEGO AL MUNDIAL:");
		herramientas.IngresarTexto(TextoComoLLego, FrameInfo, 20, Color.GREEN, 868, 114, 349, 49);
		
		PanelComoLLego= new JTextPane();
		PanelComoLLego.setBackground(Color.YELLOW);
		PanelComoLLego.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelComoLLego.setText("Iran lidero el grupo D de la zona asiatica al encabezar un grupo formado por Oman, Turkeminstan, Guam e India.");
		PanelComoLLego.setBounds(886, 178, 288, 74);
		FrameInfo.getContentPane().add(PanelComoLLego);
		
		TextoPresentaciones=new JLabel("CANTIDAD DE PRESENTACIONES:");
		herramientas.IngresarTexto(TextoPresentaciones, FrameInfo, 20, Color.GREEN, 813, 263, 349, 49);
		
		PanelPresentaciones=new JTextPane();
		PanelPresentaciones.setBackground(Color.YELLOW);
		PanelPresentaciones.setFont(new Font("Unispace", Font.ITALIC, 13));
		PanelPresentaciones.setText("Iran participo en 5 mundiales de los cuales no gano ninguno");
		PanelPresentaciones.setBounds(835, 376, 324, 36);
		FrameInfo.getContentPane().add(PanelPresentaciones);
		
		ImagenPresentaciones=new JLabel();
		herramientas.CargarImagen(ImagenPresentaciones, "Imagenes\\irann.jpg",807, 407, 340, 254, FrameInfo);
		
		BotonHimno = new JButton("ESCUCHAR HIMNO");
		herramientas.crearBoton(BotonHimno,92, 649, 171, 23, FrameInfo, Color.WHITE, 11);
				
		BotonStop=new JButton("PARAR HIMNO");
		herramientas.crearBoton(BotonStop,92, 683, 158, 23, FrameInfo, Color.WHITE, 11);
		
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
					File a = new File("sonido\\HimnoIran.wav");
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
