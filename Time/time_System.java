package Time;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class time_System extends Thread {
	JLabel LDate, Lhour;
	Date date = new Date();
	DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	 int Hora = 0, Segundo = 0, Minuto = 0;
	public time_System(JLabel lDate, JLabel lhour) {
		 Hora=date.getHours();Minuto=date.getMinutes();Segundo=date.getSeconds();
		LDate = lDate;
		Lhour = lhour;
	}

//	public void hour() {
//		// Caso 3: obtenerhora y fecha y salida por pantalla con formato:
//		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
//		System.out.println("Hora y fecha: " + hourdateFormat.format(date));
//	}
	void hourdate() {
		Lhour.setText("Hora: " + hourFormat.format(date));
		System.out.println("Hora: " + hourFormat.format(date));
		// Caso 1: obtener la hora y salida por pantalla con formato:
//		Lhourm();
	}
	public void Lhourm() {
		Lhour.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
		Lhour.setBounds(220, 65, 237, 25);
		// Chronos.setText("" + hora + ":" + minuto + ":" + segundo+" no");
		Lhour.setForeground(Color.red);
		hourdate();
	}
	void datenow() {
		// Caso 2: obtener la fecha y salida por pantalla con formato:
		System.out.println("Fecha: " + dateFormat.format(date));
		LDate.setText("Fecha: " + dateFormat.format(date));
		Ldatenowm();
	}
	void Ldatenowm() {
		LDate.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
		LDate.setBounds(320, 90, 337, 25);
		LDate.setText("Fecha: " + dateFormat.format(date));
		LDate.setForeground(Color.red);
	}
	public void run() {
		try {
			datenow();
			System.out.println("1");
			while (true) {
			  
			ejecutarhilo();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("exception en el hilo : " + e.getMessage());
		}
	}

    private void ejecutarhilo() {
        System.out.println("7");
        setSegundo(getSegundo()+1);
        System.out.println("8");
        if (getSegundo()>59) {
            System.out.println("9");
           setSegundo(0);
            setMinuto(getMinuto()+1);
            if (getMinuto()>59) {
               setMinuto(0);
                setHora(getHora()+1);
            }
        }
        String Seg="",Min="",Hora="";
        if (getSegundo()<10) {
            Seg="0"+getSegundo();
            
        }else{
            Seg=""+getSegundo();
            
        } if (getMinuto()<10) {
            Min="0"+getMinuto();
            
        }else{
            Min=""+getMinuto();
            
        } if (getHora()<10) {
            Hora="0"+getHora();
            
        }else{
            Hora=""+getHora();
        }
        
        
//        TextSeg+=ventana.segundo;
//        TextMin+=ventana.minuto;
//        TextHora+=ventana.hora;
        String reloj=getHora()+":"+getMinuto()+":"+getSegundo();
        Lhour.setText(reloj);
     }

	public int getHora() {
		return Hora;
	}

	public void setHora(int hora) {
		Hora = hora;
	}

	public int getSegundo() {
		return Segundo;
	}

	public void setSegundo(int segundo) {
		Segundo = segundo;
	}

	public int getMinuto() {
		return Minuto;
	}

	public void setMinuto(int minuto) {
		Minuto = minuto;
	}


}
