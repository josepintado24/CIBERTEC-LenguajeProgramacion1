package Hilos;

import javax.swing.JTextArea;

import vista.Editor;

public class HiloEnvio extends Thread {
	String texto;
	JTextArea txtS;
	
	public HiloEnvio(String texto, JTextArea txtS){
		this.texto=texto;
		this.txtS=txtS;
	}
	public  void run(){
		synchronized (Editor.class) {
			for(int i=0;i<10;i++){
			txtS.append(texto +" "+i+"\n");
		}
			} 
		
	}
}
