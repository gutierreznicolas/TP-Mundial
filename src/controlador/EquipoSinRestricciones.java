package controlador;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import modelo.Equipo;
import modelo.Jugador;
import modelo.SolverGoloso;

public class EquipoSinRestricciones {
	HerramientasInterface herramientas=new HerramientasInterface();
	SolverGoloso equipo1=new SolverGoloso();
	SolverGoloso equipo2=new SolverGoloso();
	Clip clip;
	double puntaje1=0;
	double puntaje2=0;
	
	
	public void EquiposSinRestricciones(JFrame Pantalla){
		Pantalla.setVisible(false);
		JFrame frameEquipoSinRestricciones = new JFrame();
		herramientas.ponerIcono("Imagenes\\mundial-rusia-2018-el-tigre-si-bmp_604x0.jpg", frameEquipoSinRestricciones);
		frameEquipoSinRestricciones.getContentPane().setBackground(Color.WHITE);
		frameEquipoSinRestricciones.setBounds(100, 100, 1200, 800);
		frameEquipoSinRestricciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEquipoSinRestricciones.getContentPane().setLayout(null);
		frameEquipoSinRestricciones.setVisible(true);
		
		JLabel TextoEquiSinRestricciones = new JLabel("EQUIPO IDEAL SIN RESTRICCIONES");
		herramientas.IngresarTexto(TextoEquiSinRestricciones, frameEquipoSinRestricciones, 60, Color.GREEN, 0, 11, 1184, 79);

		
		JButton btnAtras = new JButton("ATRAS");
		herramientas.crearBoton(btnAtras, 0, 80, 89, 23, frameEquipoSinRestricciones, Color.GREEN, 11);

		
		JLabel TextoEquipo1 = new JLabel("EQUIPO 1");
		herramientas.IngresarTexto(TextoEquipo1, frameEquipoSinRestricciones, 20, Color.GREEN, 10, 146, 118, 25);

		
		JLabel TextoArquero = new JLabel("ARQUERO");
		herramientas.IngresarTexto(TextoArquero, frameEquipoSinRestricciones, 11, Color.GREEN,10, 203, 61, 23);

		
		JLabel TextoCentralD = new JLabel("CENTRAL D.");
		herramientas.IngresarTexto(TextoCentralD, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 247, 79, 14);
		
		
		JLabel TextoCentralI = new JLabel("CENTRAL I.");
		herramientas.IngresarTexto(TextoCentralI, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 284, 79, 14);

		
		JLabel TextoLateralD = new JLabel("LATERAL D.");
		herramientas.IngresarTexto(TextoLateralD, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 326, 79, 14);

		
		JLabel TextoLateralI = new JLabel("LATERAL I.");
		herramientas.IngresarTexto(TextoLateralI, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 361, 70, 14);

		
		JLabel TextoVolanteD = new JLabel("VOLANTE D.");
		herramientas.IngresarTexto(TextoVolanteD, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 400, 79, 14);

		
		JLabel TextoVolanteI = new JLabel("VOLANTE I.");
		herramientas.IngresarTexto(TextoVolanteI, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 438, 79, 14);

		
		JLabel TextoVolanteC = new JLabel("VOLANTE C.");
		herramientas.IngresarTexto(TextoVolanteC, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 476, 79, 14);

		
		JLabel TextoPunteroD = new JLabel("PUNTERO D.");
		herramientas.IngresarTexto(TextoPunteroD, frameEquipoSinRestricciones, 11, Color.GREEN,10, 524, 79, 14 );

		
		JLabel TextoPunteroI = new JLabel("PUNTERO I.");
		herramientas.IngresarTexto(TextoPunteroI, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 566, 79, 14);

		
		JLabel TextoDelanteroC = new JLabel("DELANTERO C.");
		herramientas.IngresarTexto(TextoDelanteroC, frameEquipoSinRestricciones, 11, Color.GREEN, 10, 590, 89, 14);

		
		JComboBox<String> Arquero1 = new JComboBox<String>();
		Arquero1.setBounds(127, 204, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(Arquero1);
		herramientas.LLenarJComboBoxPosicion(Arquero1, "arquero", equipo1);
		
		JComboBox<String> CentralD1 = new JComboBox<String>();
		CentralD1.setBounds(127, 244, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(CentralD1);
		herramientas.LLenarJComboBoxPosicion(CentralD1, "central derecho", equipo1);
		
		JComboBox<String> CentralI1 = new JComboBox<String>();
		CentralI1.setBounds(127, 281, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(CentralI1);
		herramientas.LLenarJComboBoxPosicion(CentralI1, "central izquierdo", equipo1);
		
		JComboBox<String> LateralD1 = new JComboBox<String>();
		LateralD1.setBounds(127, 323, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(LateralD1);
		herramientas.LLenarJComboBoxPosicion(LateralD1, "lateral derecho", equipo1);
		
		JComboBox<String> LateralI1 = new JComboBox<String>();
		LateralI1.setBounds(127, 358, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(LateralI1);
		herramientas.LLenarJComboBoxPosicion(LateralI1, "lateral izquierdo", equipo1);
		
		JComboBox<String> VolanteD1 = new JComboBox<String>();
		VolanteD1.setBounds(127, 397, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(VolanteD1);
		herramientas.LLenarJComboBoxPosicion(VolanteD1, "volante derecho", equipo1);
		
		JComboBox<String> VolanteI1 = new JComboBox<String>();
		VolanteI1.setBounds(127, 435, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(VolanteI1);
		herramientas.LLenarJComboBoxPosicion(VolanteI1, "volante izquierdo", equipo1);
		
		JComboBox<String> VolanteC1 = new JComboBox<String>();
		VolanteC1.setBounds(127, 476, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(VolanteC1);
		herramientas.LLenarJComboBoxPosicion(VolanteC1, "volante central", equipo1);
		
		JComboBox<String> PunteroD1 = new JComboBox<String>();
		PunteroD1.setBounds(127, 521, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(PunteroD1);
		herramientas.LLenarJComboBoxPosicion(PunteroD1, "puntero derecho", equipo1);
		
		JComboBox<String> PunteroI1 = new JComboBox<String>();
		PunteroI1.setBounds(127, 563, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(PunteroI1);
		herramientas.LLenarJComboBoxPosicion(PunteroI1, "puntero izquierdo", equipo1);
		
		JComboBox<String> DelanteroC1 = new JComboBox<String>();
		DelanteroC1.setBounds(127, 590, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(DelanteroC1);
		herramientas.LLenarJComboBoxPosicion(DelanteroC1, "centro delantero", equipo1);
		
		JLabel TextoEquipo2 = new JLabel("EQUIPO 2");
		herramientas.IngresarTexto(TextoEquipo2, frameEquipoSinRestricciones, 20, Color.GREEN, 828, 147, 118, 23);

		

		
		JLabel TextoArquero2 = new JLabel("ARQUERO");
		herramientas.IngresarTexto(TextoArquero2, frameEquipoSinRestricciones, 11, Color.GREEN,828, 203, 61, 23);
 
		
		JLabel TextoCentralD2 = new JLabel("CENTRAL D.");
		herramientas.IngresarTexto(TextoCentralD2, frameEquipoSinRestricciones, 11, Color.GREEN, 828, 247, 79, 14);
		

		
		JLabel TextoCentralI2 = new JLabel("CENTRAL I.");
		herramientas.IngresarTexto(TextoCentralI2, frameEquipoSinRestricciones, 11, Color.GREEN,828, 284, 79, 14);


		
		JLabel TextoLateralD2 = new JLabel("LATERAL D.");
		herramientas.IngresarTexto(TextoLateralD2, frameEquipoSinRestricciones, 11, Color.GREEN, 828, 326, 79, 14);

		
		JLabel TextoLateralI2 = new JLabel("LATERAL I.");
		herramientas.IngresarTexto(TextoLateralI2, frameEquipoSinRestricciones, 11, Color.GREEN,828, 361, 70, 14);

		
		JLabel TextoVolanteD2 = new JLabel("VOLANTE D.");
		herramientas.IngresarTexto(TextoVolanteD2, frameEquipoSinRestricciones, 11, Color.GREEN, 828, 400, 79, 14);

		
		JLabel TextoVolanteI2 = new JLabel("VOLANTE I.");
		herramientas.IngresarTexto(TextoVolanteI2, frameEquipoSinRestricciones, 11, Color.GREEN, 828, 438, 79, 14);

		
		JLabel TextoVolanteC2 = new JLabel("VOLANTE C.");
		herramientas.IngresarTexto(TextoVolanteC2, frameEquipoSinRestricciones, 11, Color.GREEN, 828, 476, 79, 14);

		
		JLabel TextoPunteroD2 = new JLabel("PUNTERO D.");
		herramientas.IngresarTexto(TextoPunteroD2, frameEquipoSinRestricciones, 11, Color.GREEN, 828, 524, 79, 14);

		
		JLabel TextoPunteroI2 = new JLabel("PUNTERO I.");
		herramientas.IngresarTexto(TextoPunteroI2, frameEquipoSinRestricciones, 11, Color.GREEN,828, 566, 79, 14);

		
		JLabel TextoDelanteroC2 = new JLabel("DELANTERO C.");
		herramientas.IngresarTexto(TextoDelanteroC2, frameEquipoSinRestricciones, 11, Color.GREEN, 828, 590, 89, 14);

		
		
		JComboBox<String> Arquero2 = new JComboBox<String>();
		Arquero2.setBounds(945, 204, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(Arquero2);
		herramientas.LLenarJComboBoxPosicion(Arquero2, "arquero", equipo2);
		
		JComboBox<String> CentralD2 = new JComboBox<String>();
		CentralD2.setBounds(945, 244, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(CentralD2);
		herramientas.LLenarJComboBoxPosicion(CentralD2, "central derecho", equipo2);
		
		JComboBox<String> CentralI2 = new JComboBox<String>();
		CentralI2.setBounds(945, 281, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(CentralI2);
		herramientas.LLenarJComboBoxPosicion(CentralI2, "central izquierdo", equipo2);
		
		JComboBox<String> LateralD2 = new JComboBox<String>();
		LateralD2.setBounds(945, 323, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(LateralD2);
		herramientas.LLenarJComboBoxPosicion(LateralD2, "lateral derecho", equipo2);
		
		JComboBox<String> LateralI2 = new JComboBox<String>();
		LateralI2.setBounds(945, 358, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(LateralI2);
		herramientas.LLenarJComboBoxPosicion(LateralI2, "lateral izquierdo", equipo2);
		
		JComboBox<String> VolanteD2 = new JComboBox<String>();
		VolanteD2.setBounds(945, 397, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(VolanteD2);
		herramientas.LLenarJComboBoxPosicion(VolanteD2, "volante derecho", equipo2);
		
		JComboBox<String> VolanteI2 = new JComboBox<String>();
		VolanteI2.setBounds(945, 435, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(VolanteI2);
		herramientas.LLenarJComboBoxPosicion(VolanteI2, "volante izquierdo", equipo2);
		
		JComboBox<String> VolanteC2 = new JComboBox<String>();
		VolanteC2.setBounds(945, 476, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(VolanteC2);
		herramientas.LLenarJComboBoxPosicion(VolanteC2, "volante central", equipo2);
		
		JComboBox<String> PunteroD2 = new JComboBox<String>();
		PunteroD2.setBounds(945, 521, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(PunteroD2);
		herramientas.LLenarJComboBoxPosicion(PunteroD2, "puntero derecho", equipo2);
		
		JComboBox<String> PunteroI2 = new JComboBox<String>();
		PunteroI2.setBounds(945, 563, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(PunteroI2);
		herramientas.LLenarJComboBoxPosicion(PunteroI2, "puntero izquierdo", equipo2);
		
		JComboBox<String> DelanteroC2 = new JComboBox<String>();
		DelanteroC2.setBounds(945, 590, 125, 20);
		frameEquipoSinRestricciones.getContentPane().add(DelanteroC2);
		herramientas.LLenarJComboBoxPosicion(DelanteroC2, "centro delantero", equipo2);
		
		JButton BotonVerEquipo1 = new JButton("VER EQUIPO 1");
		herramientas.crearBoton(BotonVerEquipo1, 370, 182, 328, 101, frameEquipoSinRestricciones, Color.WHITE, 30);

		JButton BotonVerEquipo2 = new JButton("VER EQUIPO 2");
		herramientas.crearBoton(BotonVerEquipo2, 370, 337, 328, 101, frameEquipoSinRestricciones, Color.WHITE, 30);

		
		JButton BotonPartido = new JButton("PARTIDO!!!");
		herramientas.crearBoton(BotonPartido,370, 501, 328, 101, frameEquipoSinRestricciones, Color.WHITE, 30);
		
		JButton BotonCrearEquipos = new JButton("CREAR EQUIPOS");
		herramientas.crearBoton(BotonCrearEquipos, 432, 111, 201, 23, frameEquipoSinRestricciones, Color.WHITE, 18);

		JLabel ImagenFondo = new JLabel();
		herramientas.CargarImagen(ImagenFondo, "Imagenes\\mundial-rusia-2018.jpg", -302, 0, 1486, 762, frameEquipoSinRestricciones);
		
		BotonCrearEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				puntaje1=0;
				puntaje2=0;
				ArrayList<Jugador> jugadoresElegidos=new ArrayList<Jugador>();
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)Arquero1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)LateralD1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)LateralI1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)CentralI1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)CentralD1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)VolanteI1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)VolanteD1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)VolanteC1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)PunteroD1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)PunteroI1.getSelectedItem()));
				jugadoresElegidos.add(equipo1.obtenerJugadorPorNombre((String)DelanteroC1.getSelectedItem()));
				
				for(int i=0;i<jugadoresElegidos.size();i++) {
					puntaje1=puntaje1+jugadoresElegidos.get(i).obtenerPuntaje();
				}
				
				Equipo equiponro1=new Equipo();
				equiponro1.equipo=jugadoresElegidos;
				SolverGoloso Equipo1=new SolverGoloso();
				Equipo1.equipoIdeal=equiponro1;
				equipo1=Equipo1;
				
				
				ArrayList<Jugador> jugadoresElegidos2=new ArrayList<Jugador>();
				
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)Arquero2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)LateralD2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)LateralI2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)CentralI2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)CentralD2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)VolanteI2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)VolanteD2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)VolanteC2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)PunteroD2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)PunteroI2.getSelectedItem()));
				jugadoresElegidos2.add(equipo2.obtenerJugadorPorNombre((String)DelanteroC2.getSelectedItem()));
				
				for(int i=0;i<jugadoresElegidos2.size();i++) {
					puntaje2=puntaje2+jugadoresElegidos2.get(i).obtenerPuntaje();
				}
				
				Equipo equiponro2=new Equipo();
				equiponro2.equipo=jugadoresElegidos2;
				SolverGoloso Equipo2=new SolverGoloso();
				Equipo2.equipoIdeal=equiponro2;
				equipo2=Equipo2;
				
			}
			});
		BotonVerEquipo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				herramientas.mostrarEquipo(equipo1.equipoIdeal, frameEquipoSinRestricciones, clip);
			}
		});
		BotonVerEquipo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				herramientas.mostrarEquipo(equipo2.equipoIdeal, frameEquipoSinRestricciones, clip);
			}
		});
		BotonPartido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);

				if(puntaje1>puntaje2) {
					JOptionPane.showMessageDialog(null,"A ganado el equipo 1 con un puntaje de: "+puntaje1+" contra el equipo 2 con un puntaje de: "
							+puntaje2);
				}
				if(puntaje1<puntaje2) {
					JOptionPane.showMessageDialog(null,"A ganado el equipo 2 con un puntaje de: "+puntaje2+" contra el equipo 1 con un puntaje de: "
							+puntaje1);
				}
				if(puntaje1==puntaje2) {
					JOptionPane.showMessageDialog(null,"empataron con un puntaje de: "+puntaje2);
				}
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				herramientas.sonidoCorto(clip);
				frameEquipoSinRestricciones.setVisible(false);
				Pantalla.setVisible(true);
			}
		});
	
	
}
}