package quiz;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame{
	// Painel para o JFrame
	JPanel painel = new JPanel();
	// Bot�o de entrada
	JButton button = new JButton("Come�ar"); 
	// Bot�o para ativar o �udio
	JButton tocar = new JButton("Ativar �udio");
	// Legenda com o t�tulo "Show do Pedr�o"
	JLabel legenda = new JLabel("Show do Pedr�o");
	// Edi��o de fonte que foi utilizada para o t�tulo
	Font fonte = new Font("century gothic", Font.BOLD, 50);
	// Fonte utilizada para o bot�o
	Font botao = new Font("century gothic", Font.BOLD, 20);
	
	public TelaInicial() {
		// Configura��es para o t�tulo JLabel e o painel
		add(legenda);
		legenda.setFont(fonte);
		legenda.setForeground(Color.white);
		legenda.setBounds(250, 350,9,0);
		painel.setBackground(new Color(56, 103, 214));
		legenda.setBounds(190, 120, 500,60);
		button.addActionListener(new ActionListener() {
		// N�o sei o porqu� mas se n�o tiver isso n�o executa
			public void actionPerformed(ActionEvent e) {
				 
				setVisible(false);
				new Perguntas();
				
			}
		});
		
		// Configura��o do bot�o para entrar
		button.setFont(botao);
		button.setBackground(new Color(234, 32, 39));
		button.setForeground(Color.white);
		button.setBorder(null);
		button.setBounds(275, 220, 200, 50);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		// Adicionar a��o ao bot�o 'entrar' em outras classes
		
		// Edi��es para o bot�o que ir� ativar o �udio 
		tocar.setFont(botao);
		tocar.setBackground(new Color(56, 103, 214));

		tocar.setForeground(Color.white);
		tocar.setBorder(null);
		tocar.setBounds(550, 400, 200, 50);
		tocar.setVisible(true);
		tocar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		// A��o do bot�o para ativar o �udio 
		tocar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				play("audio-con");
			}
		});
		
		// Adicionando as coisas ao painel
		getContentPane().add(tocar);
		getContentPane().add(button);
		getContentPane().add(painel);
		
		//T�tulo do JFrame e suas edi��es
		setTitle("Show do Pedr�o");
		setSize(750,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		/* Vitor se voc� quiser colocar um JTextField para pedir o
		   nome do usu�rio tente colocar ou me chama, mas sen�o tiver
		   tempo vamos colocar no JOptionPane
		*/
		/* Pesquisar sobre as bibliotecas 
		 * import java.applet.Applet;
		 * import java.applet.AudioClip; 
		 * import java.net.URL;
		*/
		// A��o do bot�o de chamar outra classe
	}
	public void play(String nomeDoAudio) {
		URL url = getClass().getResource(nomeDoAudio+".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();
	}
	
}