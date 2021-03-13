package Figurate;

//import com.sun.awt.AWTUtilities;
//import com.sun.javafx.scene.LayoutFlags;

//import javafx.scene.text.Text;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import sun.awt.resources.awt;


public class VentanaHall extends JFrame implements ActionListener {

    private Fondo fondo;
    JLabel Texto;
    JButton Comenzar, siguienteNivel;
    VentanaLvl2 b;
//    Nivel2 b2;
    Jugador J;
private int con=1;
    VentanaHall() {
        this.setLayout(null);
        this.setTitle("Figurate ");
        this.setBounds(40, 40, 600, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        this.setOpacity(0.05f);
        setUndecorated(true);
        
        
        fondo = new Fondo("8");

        Comenzar = new JButton("1");
        ImageIcon x = new ImageIcon("src\\ImageButton\\Empezar.png");
        Comenzar.setIcon(x);
        Comenzar.setBounds(00, 350, 190, 105);
        Comenzar.setBackground(Color.WHITE);
        Comenzar.addActionListener(this);
        siguienteNivel = new JButton("2");
        ImageIcon a = new ImageIcon("src\\ImageButton\\s1.jpg");
        siguienteNivel.setIcon(a);
        siguienteNivel.setBounds(490,350, 120, 65);
        siguienteNivel.setBackground(Color.WHITE);
        siguienteNivel.addActionListener(this);
        
        Texto = new JLabel("Objetivo: Conseguir la mayor cantidad de pares, volteando cartas.\nl"
        		+ "cada vez que  no encuentra la pareja sera penalizado y obtendra puntos por \nl"
        		+ "encontrar cada pareja.");
        Texto.setBounds(00, 50, 300, 300);
        Texto.setBackground(Color.WHITE);
        
        getContentPane().isDisplayable();
//        getContentPane();
setLayout(new FlowLayout());
//        getContentPane().
               this.add(Comenzar);
        getContentPane().add(siguienteNivel);
        getContentPane().add(fondo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
//        AWTUtilities.setWindowOpaque(this, false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "1":
                b = new VentanaLvl2();
                b.setVisible(true);
                con++;
                dispose();
                break;
            case "2":
                System.exit(0);
                break;
        }
    }
}
