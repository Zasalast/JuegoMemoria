package Figurate;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Time.Timeout;
import Time.hilo;
import Time.time_System;

public class Jugador extends JPanel {

	JLabel labelVida1 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida2 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida3 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida4 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida5 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida6 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida7 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida8 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida9 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel labelVida10 = new JLabel(new ImageIcon(getClass().getResource("/Imagenes Vida/vida.png")));
	JLabel LBNivel = new JLabel();
	JLabel LBNombre = new JLabel();
	String pregunta1 = "ADVERTENCIA Evite figura que cambia";
	JLabel labelPregunta = new JLabel();
	JLabel puntos = new JLabel("Puntos=0");
	JLabel Chronos = new JLabel("00:00:00");
	JLabel Lhourt = new JLabel("00:00:00");
	JLabel Ldatet = new JLabel("dd/MM/yyyy");
	JLabel Ltimeout=new JLabel("00:00");
	String Vidas = "10";
	String Nombre = "Zanoni Salas Tobon";
	String NivelActual = "1";
	Random random = new Random();

	int aleatorioAnterior = -1, cont = 0, NivelActual2 = 1;
	hilo HiloChrono = new hilo(Chronos);
	time_System tShour = new time_System(Lhourt, Ldatet);
	Timeout tout=new Timeout(Ltimeout);
	
	// time_System tSdate = new time_System(Ldatet);
	public Jugador() {
		setLayout(null);
		setBackground(Color.GREEN);

		labelVida1.setBounds(490, 0, 26, 26);
		labelVida2.setBounds(518, 0, 26, 26);
		labelVida3.setBounds(546, 0, 26, 26);
		labelVida4.setBounds(574, 0, 26, 26);
		labelVida5.setBounds(602, 0, 26, 26);
		labelVida6.setBounds(362, 0, 26, 26);
		labelVida7.setBounds(332, 0, 26, 26);
		labelVida8.setBounds(302, 0, 26, 26);
		labelVida9.setBounds(272, 0, 26, 26);
		labelVida10.setBounds(242, 0, 26, 26);

		LBNivel.setText("Nivel: " + NivelActual);
		LBNivel.setBounds(0, 40, 250, 20);
		LBNivel.setForeground(Color.red);
		LBNombre.setText("Jugador: " + Nombre);
		LBNombre.setBounds(0, 0, 250, 20);
		LBNombre.setForeground(Color.red);
		puntos.setBounds(0, 20, 100, 20);
		puntos.setForeground(Color.red);
		Lhourt();
		Ldatet();
		Ltimeout();
		InChronos();
		add(labelVida1);
		add(labelVida2);
		add(labelVida3);
		add(labelVida4);
		add(labelVida5);
		add(labelVida6);
		add(labelVida7);
		add(labelVida8);
		add(labelVida9);
		add(labelVida10);
		add(Lhourt);
		add(Ldatet);
		add(Ltimeout);
		add(Chronos);
		add(puntos);
		add(LBNivel);
		add(LBNombre);
		// add(cronometro);
		// add(labelPregunta);
		tShour.start();
		HiloChrono.start();
		tout.start();
	}
	void Ltimeout() {
		Ltimeout.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		Ltimeout.setBounds(0, 91, 237, 15);
		// Chronos.setText("" + hora + ":" + minuto + ":" + segundo+" no");
		Ltimeout.setForeground(Color.red);
	}
	void Lhourt() {
		Lhourt.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		Lhourt.setBounds(455, 91, 237, 15);
		// Chronos.setText("" + hora + ":" + minuto + ":" + segundo+" no");
		Lhourt.setForeground(Color.red);
	}

	void Ldatet() {
		Ldatet.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		Ldatet.setBounds(450, 61, 237, 15);
		// Chronos.setText("" + hora + ":" + minuto + ":" + segundo+" no");
		Ldatet.setForeground(Color.red);
	}

	void InChronos() {
		Chronos.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		Chronos.setBounds(490, 35, 237, 15);
		// Chronos.setText("" + hora + ":" + minuto + ":" + segundo+" no");
		Chronos.setForeground(Color.red);
	}

	void SacarPreguntaAleatoria() {
		if (NivelActual.equals("1")) {
			labelPregunta.setText(pregunta1);

		} else if (NivelActual.equals("2")) {
			labelPregunta.setText(pregunta1);
		} else if (NivelActual.equals("3")) {
			labelPregunta.setText(pregunta1);
		} else if (NivelActual.equals("4")) {
			labelPregunta.setText(pregunta1);
		} else {
		}

	}

	public String getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public JLabel getPuntos() {
		return puntos;
	}

	public void setPuntos(JLabel puntos) {
		this.puntos = puntos;
	}

	public String getVidas() {
		return Vidas;
	}

	public void setVidas(String Vidas) {
		this.Vidas = Vidas;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getNivelActual() {
		return NivelActual;
	}

	public void setNivelActual(String NivelActual) {
		this.NivelActual = NivelActual;
	}

	public int getNivelActual2() {
		return NivelActual2;
	}

	public void setNivelActual2(int NivelActual2) {
		this.NivelActual2 = NivelActual2;
	}
}
