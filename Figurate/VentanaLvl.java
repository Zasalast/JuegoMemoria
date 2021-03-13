package Figurate;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.applet.AudioClip;
import javax.crypto.spec.PSource;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;

public class VentanaLvl extends javax.swing.JFrame implements MouseListener {

	int f = 0;
	// Thread hiloNumeros = new Thread(this);;
	String nombreImagen = "1231", NombreJugador = "1111";

	String Etivar = "Evitar.gif", FIGURAS1 = "Nivel1", FIGURAS2 = "Smileima";
	int NumeroFondo = 0, yTerminado = 600, NVidas = 5, yNombre = 300;

	Jugador J;

	ImageIcon fondo = new ImageIcon();
	boolean SiguientePrueba = false, MostrarNivel = false;
	int Ancho = 600, Alto = 600;
	private javax.swing.JLabel Ldios11;
	private javax.swing.JLabel Ldios10;
	private javax.swing.JLabel Ldios1;
	private javax.swing.JLabel Ldios12;
	private javax.swing.JLabel Ldios2;
	private javax.swing.JLabel Ldios3;
	private javax.swing.JLabel Ldios4;
	private javax.swing.JLabel Ldios5;
	private javax.swing.JLabel Ldios6;
	private javax.swing.JLabel Ldios7;
	private javax.swing.JLabel Ldios8;
	private javax.swing.JLabel Ldios9;
	private javax.swing.JLabel Ldios13;
	private javax.swing.JLabel Ldios14;
	private javax.swing.JLabel Ldios15;
	private javax.swing.JLabel Ldios16;
	private javax.swing.JLabel Ldios17;
	private javax.swing.JLabel Ldios18;
	private javax.swing.JLabel Ldios19;
	private javax.swing.JLabel Ldios20;
	private javax.swing.JLabel Ldios21;

	private javax.swing.JLabel lblPuntaje;
	private javax.swing.JLabel lblPuntos;
	private javax.swing.JPanel JPcentral;
	private javax.swing.JPanel JPDioses;

	private javax.swing.JPanel JPEstadisticas;

	private JButton Star, Exit, viwercard;

	int[] NImagenes = new int[20];
	JLabel[] LImagenes = new JLabel[20];
	int[] Control = new int[10];

	int[] Parejas = new int[20];
	int[] NClick = new int[20];// Arreglo que permitir� controlar los
	// eventos producidos cada que se de
	// clic en una imagen

	int clic = 0;
	int dios1, dios2;
	int puntos = 0;

	public VentanaLvl() {
		initComponents();
		inicializarArreglos();
		setSize(Ancho, Alto);
		// setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		J = new Jugador();
		Star = new JButton();
		Star.setFont(new java.awt.Font("Tahoma", 0, 10));
		Star.setText("Reset Card");
		Star.setBounds(10, 60, 70, 20);
		Star.addMouseListener(this);
		viwercard = new JButton();
		viwercard.setFont(new java.awt.Font("Tahoma", 0, 10));
		viwercard.setText("viwercard");
		viwercard.setBounds(90, 60, 70, 20);
		viwercard.addMouseListener(this);
		Exit = new JButton();
		Exit.setFont(new java.awt.Font("Tahoma", 0, 10));
		Exit.setText("Exit");
		Exit.setBounds(180, 60, 70, 20);
		Exit.addMouseListener(this);

		lblPuntaje = new JLabel();
		lblPuntaje.setForeground(Color.red);
		lblPuntaje.setFont(new java.awt.Font("Tahoma", 0, 20));
		lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblPuntaje.setText("Puntaje");
		lblPuntaje.setBounds(200, 90, 170, 20);

		lblPuntos = new JLabel();
		lblPuntos.setFont(new java.awt.Font("Tahoma", 0, 20));
		lblPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblPuntos.setForeground(Color.red);
		lblPuntos.setText("0");

		lblPuntos.setBounds(200, 60, 170, 20);

		Ldios11 = new JLabel();
		Ldios11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios11.setBounds(5, 0, 100, 100);

		Ldios2 = new JLabel();
		Ldios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios2.setBounds(113, 0, 100, 100);

		Ldios3 = new JLabel();
		Ldios3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios3.setBounds(220, 0, 100, 100);

		Ldios4 = new JLabel();
		Ldios4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios4.setBounds(327, 0, 100, 100);

		Ldios5 = new JLabel();
		Ldios5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios5.setBounds(434, 0, 100, 100);

		Ldios6 = new JLabel();
		Ldios6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios6.setBounds(5, 100, 100, 100);

		Ldios7 = new JLabel();
		Ldios7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios7.setBounds(113, 100, 100, 100);

		Ldios8 = new JLabel();
		Ldios8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios8.setBounds(220, 100, 100, 100);

		Ldios9 = new JLabel();
		Ldios9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios9.setBounds(327, 100, 100, 100);

		Ldios10 = new JLabel();
		Ldios10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios10.setBounds(434, 100, 100, 100);

		Ldios1 = new JLabel();
		Ldios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios1.setBounds(5, 200, 100, 100);

		Ldios12 = new JLabel();
		Ldios12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios12.setBounds(113, 200, 100, 100);

		Ldios13 = new JLabel();
		Ldios13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios13.setBounds(220, 200, 100, 100);
		Ldios14 = new JLabel();
		Ldios14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg"))); //
		Ldios14.setBounds(327, 200, 100, 100);

		Ldios15 = new JLabel();
		Ldios15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios15.setBounds(434, 200, 100, 100);

		Ldios16 = new JLabel();
		Ldios16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios16.setBounds(5, 300, 100, 100);

		Ldios17 = new JLabel();
		Ldios17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios17.setBounds(113, 300, 100, 100);

		Ldios18 = new JLabel();
		Ldios18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios18.setBounds(220, 300, 100, 100);

		Ldios19 = new JLabel();
		Ldios19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios19.setBounds(324, 300, 100, 100);

		Ldios20 = new JLabel();
		Ldios20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		Ldios20.setBounds(424, 300, 100, 100);

		Ldios21 = new JLabel();
		Ldios21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
		// NOI18N
		Ldios21.setBounds(113, 300, 100, 100);

		Ldios21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Fondo/12.jpg")));
		Ldios21.setBounds(0, 0, 750, 600);
		JPDioses = new JPanel();
		JPDioses.setBackground(new java.awt.Color(255, 204, 0));
//		JPDioses.setLayout(null);
//		JPDioses.setLayout(new GridLayout(5, 8));
		JPDioses.setBounds(0, 120, 600, 600);
		JPDioses.add(Ldios11);
		JPDioses.add(Ldios2);
		JPDioses.add(Ldios3);
		JPDioses.add(Ldios4);
		JPDioses.add(Ldios5);
		JPDioses.add(Ldios6);
		JPDioses.add(Ldios7);
		JPDioses.add(Ldios8);
		JPDioses.add(Ldios9);
		JPDioses.add(Ldios10);
		JPDioses.add(Ldios1);
		JPDioses.add(Ldios12);
		JPDioses.add(Ldios13);
		JPDioses.add(Ldios14);
		JPDioses.add(Ldios15);
		JPDioses.add(Ldios16);
		JPDioses.add(Ldios17);
		JPDioses.add(Ldios18);
		JPDioses.add(Ldios19);
		JPDioses.add(Ldios20);
		JPDioses.add(Ldios21);

		JPEstadisticas = new JPanel();
		JPEstadisticas.setBackground(new java.awt.Color(255, 255, 255));
		JPEstadisticas.setLayout(null);
		JPEstadisticas.setBounds(000, 0, 600, 120);
		JPEstadisticas.add(Star);
		JPEstadisticas.add(viwercard);
		JPEstadisticas.add(Exit);
		JPEstadisticas.add(lblPuntaje);
		JPEstadisticas.add(lblPuntos);
		JPEstadisticas.add(J.LBNombre);
		JPEstadisticas.add(J.Chronos);
		JPEstadisticas.add(J.Lhourt);
		JPEstadisticas.add(J.Ldatet);
		JPEstadisticas.add(J.Ltimeout);
		JPEstadisticas.add(J.LBNivel);
//		JPEstadisticas.add(J.labelVida1);
//		JPEstadisticas.add(J.labelVida2);
//		JPEstadisticas.add(J.labelVida3);
//		JPEstadisticas.add(J.labelVida4);
//		JPEstadisticas.add(J.labelVida5);
//		JPEstadisticas.add(J.labelVida6);
//		JPEstadisticas.add(J.labelVida7);
//		JPEstadisticas.add(J.labelVida8);
//		JPEstadisticas.add(J.labelVida9);
		// JPEstadisticas.add(J.puntos);

		JPcentral = new JPanel();
		JPcentral.setBackground(new java.awt.Color(0, 0, 0));
		JPcentral.setLayout(null);
		JPcentral.add(JPDioses);	
		JPcentral.add(JPEstadisticas, java.awt.BorderLayout.NORTH);
		add(JPcentral, java.awt.BorderLayout.CENTER);
	}

	private void inicializarArreglos() {

		inicializaArregloImagenes();

		llenaArreglosConCeros(Control);
		llenaArreglosConCeros(NImagenes);
		llenaArreglosConCeros(Parejas);
		llenaArreglosConCeros(NClick);

		Random r = new Random();
		int posicionImagen;
		for (int i = 0; i < 19; i++) {

			posicionImagen = r.nextInt(10);
			if (Control[posicionImagen] < 2) {
				NImagenes[i] = posicionImagen + 1;
				System.out.print(NImagenes[i] + " , ");
				Control[posicionImagen]++;
			} else {
				i--;
			}
		}

	}

	private void inicializaArregloImagenes() {
		LImagenes[0] = Ldios1;
		LImagenes[1] = Ldios2;
		LImagenes[2] = Ldios3;
		LImagenes[3] = Ldios4;
		LImagenes[4] = Ldios5;
		LImagenes[5] = Ldios6;
		LImagenes[6] = Ldios7;
		LImagenes[7] = Ldios8;
		LImagenes[8] = Ldios9;
		LImagenes[9] = Ldios10;
		LImagenes[10] = Ldios11;
		LImagenes[11] = Ldios12;
		LImagenes[12] = Ldios13;
		LImagenes[13] = Ldios14;
		LImagenes[14] = Ldios15;
		LImagenes[15] = Ldios16;
		LImagenes[16] = Ldios17;
		LImagenes[17] = Ldios18;
		LImagenes[18] = Ldios19;
		LImagenes[19] = Ldios20;
	
		for (int i = 0; i < 19; i++) {
			LImagenes[i].setIcon(new ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
			LImagenes[i].addMouseListener(this);
		}
	}

	private void llenaArreglosConCeros(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = 0;
		}
	}

	private void validaParejas(int vista1, int vista2, int i) {
AudioClip Song;
		if (NImagenes[vista1] == NImagenes[vista2]) {
			puntos += 10;
Song=java.applet.Applet.newAudioClip(getClass().getResource("/song/2.wav"));
Song.play();
			lblPuntos.setText(puntos + "");
			Parejas[vista1] = 1;
			Parejas[vista2] = 1;
		} else {
			if (puntos <= 2) {
				puntos -= 2;lblPuntos.setText(puntos + "");
			}
			
			Song=java.applet.Applet.newAudioClip(getClass().getResource("/song/1.wav"));
			Song.play();
			LImagenes[vista1].setIcon(new ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
			LImagenes[vista2].setIcon(new ImageIcon(getClass().getResource("/Smileima/quien.jpg")));
			NClick[vista1] = 0;
			NClick[vista2] = 0;
		}
	}

	private void viewcards(){
		for (int i = 0; i < 19; i++) {
			LImagenes[i].setIcon(new ImageIcon(getClass().getResource("/Smileima/" + "s" + NImagenes[i] + ".jpg")));
			LImagenes[NImagenes[i]].setVisible(true);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getSource() == Star) {
			inicializarArreglos();
			clic = 0;
			puntos = 0;
			lblPuntos.setText("0");
		} else if (e.getSource() == Exit) {
			System.exit(0);
		} else if (e.getSource() == viwercard) {
			for (int i = 0; i < LImagenes.length; i++) {
				// NImagenes[i].setVisible(true);
				viewcards();
			
			}
		}

		for (int i = 0; i < 19; i++) {

			if (e.getSource() == LImagenes[i] && verificaParejasEncontradas(i)) {
				NClick[i]++;
				if (NClick[i] < 2) {

					clic++;
					LImagenes[i]
							.setIcon(new ImageIcon(getClass().getResource("/Smileima/" + "s" + NImagenes[i] + ".jpg")));
					if (clic == 1) {
						dios1 = i;
					} else {
						dios2 = i;
					}
				}
			}

		}

	}

	private boolean verificaParejasEncontradas(int i) {

		if (Parejas[i] != 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {

		for (int i = 0; i < 20; i++) {
			if (e.getSource() == LImagenes[i]) {
				if (clic == 2) {
					validaParejas(dios1, dios2, i);
					clic = 0;
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
