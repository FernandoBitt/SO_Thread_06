package controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ThreadCassino extends Thread{

	Random gerador = new Random();
	
	private JButton jogar;
	private JTextField texto;

	
	public ThreadCassino(JButton jogar, JTextField texto) {
		this.jogar=jogar;
		this.texto=texto;

	
	}
	
	@Override
	public void run() {
		geraNum();
	}



	private void geraNum() {
	String num="";	
	int limite = gerador.nextInt(150)+1;
		

		for(int i=0;i<=limite;i++) {
			num = Integer.toString(gerador.nextInt(7)+1);
			texto.setText(num);
			try {
				sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		jogar.setEnabled(true);
		
	}
	
	
	
}
