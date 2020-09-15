package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CassinoController implements ActionListener{
	private JButton jogar;
	private JTextField texto0;
	private JTextField texto1;
	private JTextField texto2;
	
	public CassinoController(JButton jogar,JTextField texto0,JTextField texto1,JTextField texto2) {
		this.jogar=jogar;
		this.texto0=texto0;
		this.texto1=texto1;
		this.texto2=texto2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		botaoJogar();
		
	}

	private void botaoJogar() {
		
		Thread n1 = new ThreadCassino(jogar, texto0);
		Thread n2 = new ThreadCassino(jogar, texto1);
		Thread n3 = new ThreadCassino(jogar, texto2);
		
		n1.start();
		n2.start();
		n3.start();
		
		jogar.setEnabled(false);

	}
	
	
	

}
