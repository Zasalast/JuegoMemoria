package Figurate;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class Fondo extends JDesktopPane {

  private Image imagen1;
  private String fondo="Fondo.png";
     public Fondo(String x) {  
       this.setLayout(null); 
       this.setBounds(0, 0, 600, 500);  
  try {
       imagen1=ImageIO.read(getClass().getResource("/Imagenes Fondo/"+x+".jpg"));
  }
 catch (IOException e) {
   e.printStackTrace();
  }

  }
 
 public void paintComponent(Graphics g){
  
     super.paintComponent(g);
     g.drawImage(imagen1, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
 }

}
