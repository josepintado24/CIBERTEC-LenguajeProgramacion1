package Hilos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;

import vista.FrmPrincipal;

public class HilosHora extends Thread {

	String hora, minutos, segundos;
	Calendar calendario;
	Thread h1;
	private JFrame ventana;

	public HilosHora(JFrame ventana) {
		this.ventana = ventana;
	}

	public void run() {
		Thread ct = Thread.currentThread();
		while (ct == h1) {
			calcula();
			FrmPrincipal.lblReloj.setText(hora + ":" + minutos + ":" + segundos);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void calcula() {
		Calendar calendario = new GregorianCalendar();
		Date fechaHoraActual = new Date();

		calendario.setTime(fechaHoraActual);
		

			hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY)
					: "0" + calendario.get(Calendar.HOUR_OF_DAY);
		
		minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE)
				: "0" + calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND)
				: "0" + calendario.get(Calendar.SECOND);
	}

	public void IniciaTiempo() {
		h1 = new Thread(this);
		h1.start();
		HilosHora hilo = new HilosHora(ventana);

		hilo.start();
	}

}
