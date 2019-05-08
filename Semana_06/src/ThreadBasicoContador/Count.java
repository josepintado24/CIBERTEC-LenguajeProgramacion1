package ThreadBasicoContador;

import javax.swing.JLabel;

public class Count extends Thread{
	JLabel lblTiempo;
	
	public Count(JLabel lblTiempo){
		this.lblTiempo= lblTiempo;
	}
	
	public void run(){
		for (int i=0;i<=10;i++){
			lblTiempo.setText(""+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
