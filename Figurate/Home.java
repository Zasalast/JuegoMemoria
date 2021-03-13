package Figurate;

//import com.sun.awt.AWTUtilities;
//import com.sun.javafx.scene.LayoutFlags;
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

public class Home extends JFrame implements ActionListener {

    private Fondo fondo;
    JLabel Texto;
    JButton Comenzar, Autor,Instrucciones,salir;
    VentanaLvl miVentana;
//    Nivel2 b2;
    Jugador J;
private int con=1;
    Home() {
        this.setLayout(null);
        this.setTitle("Figurate ");
        this.setBounds(40, 40, 600, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        this.setOpacity(0.05f);
        setUndecorated(true);
        
        
        fondo = new Fondo("9");

        Comenzar = new JButton();
        ImageIcon x = new ImageIcon("src\\Imagenes\\Empezar.png");
        Comenzar.setIcon(x);
        Comenzar.setBounds(00, 350, 70, 65);
        Comenzar.setBackground(Color.WHITE);
        Comenzar.addActionListener(this);
        Autor = new JButton();
        ImageIcon a = new ImageIcon("src\\ImagenButton\\au1.png");
        Autor.setIcon(a);
        Autor.setBounds(190, 350, 120, 65);
        Autor.setBackground(Color.WHITE);
        Autor.addActionListener(this);
//        getContentPane().isDisplayable();
        Instrucciones = new JButton("3");
        ImageIcon c = new ImageIcon("src\\ImagenButton\\ins1.png");
        Instrucciones.setIcon(a);
        Instrucciones.setBounds(290, 350, 120, 65);
        Instrucciones.setBackground(Color.WHITE);
        Instrucciones.addActionListener(this);
//        getContentPane().isDisplayable();
        salir = new JButton("4");
        ImageIcon d = new ImageIcon("src\\ImagenButton\\s2.png");
        salir.setIcon(a);
        salir.setBounds(390, 350, 120, 65);
        salir.setBackground(Color.WHITE);
        salir.addActionListener(this);
//        getContentPane().isDisplayable();
//        getContentPane();
//setLayout(new FlowLayout());
//        AWTUtilities.setWindowOpacity(this, 0.5f);\\\
//        getContentPane().
               this.add(Comenzar);
        getContentPane().add(Autor);
        getContentPane().add(salir);
        getContentPane().add(Instrucciones);
        getContentPane().add(fondo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "1":
            	 miVentana=new VentanaLvl();
        		miVentana.setVisible(true);
                con++;
                dispose();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
            	System.exit(0);
                break;
        }
    }
}
