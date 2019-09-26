package controlador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;




public class Cronograma  {
	
	HerramientasInterface herramientas=new HerramientasInterface();
	Clip clip;
	
	
	public void cronograma(JFrame Pantalla) {
		Pantalla.setVisible(false);
		try{
			clip= AudioSystem.getClip();
			File a = new File("sonido\\cancion rusia 2018.wav");
			clip.open(AudioSystem.getAudioInputStream(a));
			clip.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		
		JFrame frameCronograma = new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", frameCronograma);
		frameCronograma.getContentPane().setFont(new Font("Unispace", Font.ITALIC, 20));
		frameCronograma.setBounds(100, 100, 1200, 800);
		frameCronograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCronograma.getContentPane().setLayout(null);
		frameCronograma.setVisible(true);
		
		JLabel TextoCronograma = new JLabel("CRONOGRAMA RUSIA 2018");
		herramientas.IngresarTexto(TextoCronograma, frameCronograma, 40, java.awt.Color.GREEN, 0, 11, 1184, 81);
		JLabel ImagenCopa = new JLabel();
		herramientas.CargarImagen(ImagenCopa, "Imagenes\\Copa_mundial_FIFA (1).jpg", 10, 76, 203, 182, frameCronograma);
		JLabel ImagenAnimal = new JLabel("");
		herramientas.CargarImagen(ImagenAnimal, "Imagenes\\3a96afc7342364378c75a3ade743f1a7 (1).jpg",882, 290, 302, 449, frameCronograma);

		JButton btnJunio14 = new JButton("JUNIO 14");
		herramientas.crearBoton(btnJunio14, 10, 290, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio15 = new JButton("JUNIO 15");
		herramientas.crearBoton(btnJunio15, 10, 343, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio16 = new JButton("JUNIO 16");
		herramientas.crearBoton(btnJunio16, 10, 396, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio17 = new JButton("JUNIO 17");
		herramientas.crearBoton(btnJunio17, 10, 455, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio18= new JButton("JUNIO 18");
		herramientas.crearBoton(btnJunio18, 10, 515, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio19 = new JButton("JUNIO 19");
		herramientas.crearBoton(btnJunio19, 10, 575, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio20 = new JButton("JUNIO 20");
		herramientas.crearBoton(btnJunio20, 10, 634, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio21 = new JButton("JUNIO 21");
		herramientas.crearBoton(btnJunio21, 10, 696, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio22= new JButton("JUNIO 22");
		herramientas.crearBoton(btnJunio22,307, 139, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio23 = new JButton("JUNIO 23");
		herramientas.crearBoton(btnJunio23, 307, 185, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio24 = new JButton("JUNIO 24");
		herramientas.crearBoton(btnJunio24, 307, 235, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio25= new JButton("JUNIO 25");
		herramientas.crearBoton(btnJunio25, 307, 290, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio26= new JButton("JUNIO 26");
		herramientas.crearBoton(btnJunio26, 307, 343, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio27= new JButton("JUNIO 27");
		herramientas.crearBoton(btnJunio27, 307, 396, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio28= new JButton("JUNIO 28");
		herramientas.crearBoton(btnJunio28, 307, 455, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio29= new JButton("JUNIO 29");
		herramientas.crearBoton(btnJunio29, 307, 515, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJunio30= new JButton("JUNIO 30");
		herramientas.crearBoton(btnJunio30,307, 575, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio1= new JButton("JULIO 1");
		herramientas.crearBoton(btnJulio1, 307, 634, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio2 = new JButton("JULIO 2");
		herramientas.crearBoton(btnJulio2, 307, 696, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio3= new JButton("JULIO 3");
		herramientas.crearBoton(btnJulio3, 655, 139, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio4 = new JButton("JULIO 4");
		herramientas.crearBoton(btnJulio4, 655, 185, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio5 = new JButton("JULIO 5");
		herramientas.crearBoton(btnJulio5, 655, 235, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio6= new JButton("JULIO 6");
		herramientas.crearBoton(btnJulio6, 655, 290, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio7= new JButton("JULIO 7");
		herramientas.crearBoton(btnJulio7, 655, 343, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio8= new JButton("JULIO 8");
		herramientas.crearBoton(btnJulio8, 655, 396, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio9= new JButton("JULIO 9");
		herramientas.crearBoton(btnJulio9, 655, 455, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio10 = new JButton("JULIO 10");
		herramientas.crearBoton(btnJulio10,655, 515, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio11 = new JButton("JULIO 11");
		herramientas.crearBoton(btnJulio11, 655, 575, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio12= new JButton("JULIO 12");
		herramientas.crearBoton(btnJulio12, 655, 634, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio13= new JButton("JULIO 13");
		herramientas.crearBoton(btnJulio13, 655, 696, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio14= new JButton("JULIO 14");
		herramientas.crearBoton(btnJulio14, 955, 139, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnJulio15 = new JButton("JULIO 15");
		herramientas.crearBoton(btnJulio15,955, 185, 175, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JButton btnAtras = new JButton("ATRAS");
		herramientas.crearBoton(btnAtras, 0, 0, 141, 23, frameCronograma, java.awt.Color.WHITE, 20);
		JLabel ImagenFondo=new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, frameCronograma);
		
		btnJunio14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Rusia vs Arabia S.(Grupo A/12:00)");
			}
		});
		btnJunio15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Egipto vs Uruguay(Grupo A/09:00)"+"\n Marruecos vs Iran (Grupo B/12:00)"+"\n Portugal vs España(Grupo B/15:00)");
			}
		});
		btnJunio16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Francia vs Australia(Grupo C/07:00)"+"\n Peru vs Dinamarca(Grupo C/13:00)"+"\n Argentina vs Islandia(Grupo D/10:00)"+
				"\n Croacia vs Nigeria(Grupo D/16:00)");
			}
		});
		btnJunio17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Costa Rica vs Serbia(Grupo E/09:00)"+"\n Brasil vs Suiza(Grupo E/15:00)"+"\n Alemania vs Mexico(Grupo F/12:00)");
			}
		});
		btnJunio18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Suecia vs Corea Sur(Grupo F/09:00)"+"\n Belgica vs Panama(Grupo G/12:00)"+"\n Tunez vs Inglaterra(Grupo G/15:00)");
			}
		});
		btnJunio19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Rusia vs Egipto(Grupo A/15:00)"+"\n Colombia vs Japon(Grupo H/09:00)"+"\n Polonia vs Senegal(Grupo H/12:00)");
			}
		});
		btnJunio20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Uruguay vs Arabia S.(Grupo A/12:00)"+"\n Portugal vs Marruecos(Grupo B/09:00)"+"\n Iran vs España(Grupo B/15:00)");
			}
		});
		btnJunio21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Dinamarca vs Australia(Grupo C/09:00)"+"\n Francia vs Peru(Grupo C/12:00)"+"\n Argentina vs Croacia(Grupo D/15:00)");
			}
		});
		btnJunio22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Nigeria vs Islandia(Grupo D/12:00)"+"\n Brasil vs Costa Rica(Grupo E/09:00)"+"\n Serbia vs Suiza(Grupo E/15:00)");
			}
		});
		btnJunio23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Corea Sur vs Mexico(Grupo F/12:00)"+"\n Alemania vs Suecia(Grupo F/15:00)"+"\n Belgica vs Tunez(Grupo G/09:00)");
			}
		});
		btnJunio24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Inglaterra vs Panama(Grupo G/09:00)"+"\n Japon vs Senegal(Grupo H/12:00)"+"\n Polonia vs Colombia(Grupo H/15:00)");
			}
		});
		btnJunio25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Arabia S. vs Egipto(Grupo A/11:00)"+"\n Uruguay vs Rusia(Grupo A/11:00)"+"\n España vs Marruecos(Grupo B/15:00)"+
				"\n Iran vs Portugal(Grupo B/15:00)");
			}
		});
		btnJunio26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Dinamarca vs Francia(Grupo C/11:00)"+"\n Australia vs Peru(Grupo C/11:00)"+"\n Nigeria vs Argentina(Grupo D/15:00)"+
				"\n Islandia vs Croacia(Grupo D/15:00)");
			}
		});
		btnJunio27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Serbia vs Brasil(Grupo E/15:00)"+"\n Suiza vs Costa Rica(Grupo E/15:00)"+"\n Mexico vs Suecia(Grupo F/11:00)"+
				"\n Corea Sur vs Alemania(Grupo F/11:00)");
			}
		});
		btnJunio28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Inglaterra vs Belgica(Grupo G/15:00)"+"\n Panama vs Tunez(Grupo G/15:00)"+"\n Senegal vs Colombia(Grupo H/11:00)"+
				"\n Japon vs Polonia(Grupo H/11:00)");
			}
		});
		btnJunio29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null,"DESCANSO");
			}
		});
		btnJunio30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," 1C vs 2D(Octavos de final 1/11:00)"+"\n 1A vs 2B(Octavos de final 2/15:00)");
			}
		});
		btnJulio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," 1B vs 2A(Octavos de final 3/11:00)"+"\n 1D vs 2C(Octavos de final 4/15:00)");
			}
		});
		btnJulio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," 1E vs 2F(Octavos de final 5/11:00)"+"\n 1G vs 2H(Octavos de final 6/15:00)");
			}
		});
		btnJulio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," 1F vs 2E(Octavos de final 7/11:00)"+"\n 1G vs 2H(Octavos de final 8/15:00)");
			}
		});
		btnJulio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null,"DESCANSO");
			}
		});
		btnJulio5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," DESCANSO");
			}
		});
		btnJulio6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Ganador Oct. 1 vs Ganador Oct. 2(Cuartos de final 1/11:00)"+"\n Ganador Oct. 5 vs Ganador Oct. 6(Cuartos de final 2/15:00)");
			}
		});
		btnJulio7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Ganador Oct. 7 vs Ganador Oct. 8(Cuartos de final 3/11:00)"+"\n Ganador Oct. 3 vs Ganador Oct. 4(Cuartos de final 4/15:00)");
			}
		});
		btnJulio8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null,"DESCANSO");
			}
		});
		btnJulio9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null,"DESCANSO");
			}
		});
		btnJulio10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Ganador Cuart. 1 vs Ganador Cuart. 2(Semefinal 1/15:00)");
			}
		});
		btnJulio11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Ganador Cuart. 3 vs Ganador Cuart. 4(Semefinal 2/15:00)");
			}
		});
		btnJulio12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null,"DESCANSO");
			}
		});
		btnJulio13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null,"DESCANSO");
			}
		});
		btnJulio14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Perdedor Semi. 1 vs Perdedor Semi. 2(Tercer Puesto/11:00)");
			}
		});
		btnJulio15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				JOptionPane.showMessageDialog(null," Ganador Semi. 1 vs Ganador Semi. 2(Final/12:00)");
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				clip.stop();
				frameCronograma.setVisible(false);
				Pantalla.setVisible(true);
			}
		});
		}

}
