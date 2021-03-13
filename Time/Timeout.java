package Time;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Timeout extends Thread {
	JLabel Ltimeout;
	int Hora = 0, Segundo = 3, Minuto = 3;
	Boolean isTimerRunning = true;

	public Timeout(JLabel crono) {
		this.Ltimeout = crono;
		Segundo = 3;
		Minuto =3;
	}

	void Intimeout() {
		Ltimeout.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
		Ltimeout.setBounds(47, 11, 137, 45);
		Ltimeout.setText("" + getHora() + ":" + getMinuto() + ":" + getSegundo() + " no");
		Ltimeout.setForeground(Color.red);
	}

	public Timeout(int minuto, int segundo,JLabel crono) {
		Intimeout();
		this.Ltimeout = crono;
		Segundo = segundo;
		Minuto = minuto;
	}

	// public Timeout() {
	// timer = new Timer();
	// // display = new Display();
	// }
	@Override
	public void run() {
		while (isTimerRunning) {
			ejecutarhilo();
			String time = (Minuto + ":" + Segundo);
			System.out.println(time);
			Ltimeout.setText(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private void ejecutarhilo() {
		// try {
		//// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		isTimerRunning = true;
		if (getSegundo() > 0) {
			Segundo--;
		} else {
			Segundo = 59;
			if (Minuto > 0)
				Minuto--;
			else {
				Minuto = 59;
				if (Hora > 0)
					Hora--;
				// si segundo = 0, minuto = 0 y hora = 0,
				// cancelamos el timer
				else {
					isTimerRunning = false;
					// timer.cancel();
					// timer.purge();
				}
			}
		}
		if (isTimerRunning) {
			String time2 = (getMinuto() + ":" + getSegundo());
			System.out.println(time2);
			Ltimeout.setText(time2);
			// LTIMEOUT.SETTEXT(TIME);
		}

		// isTimerRunning = true;
		// if (getSegundo() > 0) {
		// setSegundo(getSegundo() - 1);
		//
		// } else {
		// setSegundo(59);
		// if (getMinuto() > 0) {
		// setMinuto(getMinuto() - 1);
		// } else {
		// Minuto=59;
		// if (getMinuto() == 0) {
		// isTimerRunning = false;
		// }
		//
		// }
		//
		// String reloj = getHora() + " : " + getMinuto() + " : " +
		// getSegundo();
		// System.out.println(reloj);
		// Ltimeout.setText(reloj);
		// }
	}

	public JLabel getLtimeout() {
		return Ltimeout;
	}

	public void setLtimeout(JLabel ltimeout) {
		Ltimeout = ltimeout;
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

	public Boolean getIsTimerRunning() {
		return isTimerRunning;
	}

	public void setIsTimerRunning(Boolean isTimerRunning) {
		this.isTimerRunning = isTimerRunning;
	}
}