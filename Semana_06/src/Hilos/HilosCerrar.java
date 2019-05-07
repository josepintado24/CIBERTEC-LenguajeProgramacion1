package Hilos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import vista.Logueo;


public class HilosCerrar extends Thread {
	
	private JFrame ventana;
	
	public HilosCerrar(JFrame ventana){
		this.ventana = ventana;
	}
	
	public void run(){
		//Crear un Contador
		for (int i = 10; i >= 0; i--) {
			Logueo.lblTiempo.setText(i + "S");
		try{
		Thread.sleep(1000);
	   }
	catch(InterruptedException e){
		JOptionPane.showMessageDialog(null, "Iniciando Conteo...");
	      }
		}
		ventana.dispose();
	}
	

	public void IniciarTiempo(){
		
		HilosCerrar hc = new HilosCerrar(ventana);
		hc.start();
		
	}

}
