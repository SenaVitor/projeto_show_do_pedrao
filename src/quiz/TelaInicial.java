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
	// Botão de entrada
	JButton button = new JButton("Começar"); 
	// Botão para ativar o áudio
	JButton tocar = new JButton("Ativar Áudio");
	// Legenda com o título "Show do Pedrão"
	JLabel legenda = new JLabel("Show do Pedrão");
	// Edição de fonte que foi utilizada para o título
	Font fonte = new Font("century gothic", Font.BOLD, 50);
	// Fonte utilizada para o botão
	Font botao = new Font("century gothic", Font.BOLD, 20);
	
	public TelaInicial() {
		// Configurações para o título JLabel e o painel
		add(legenda);
		legenda.setFont(fonte);
		legenda.setForeground(Color.white);
		legenda.setBounds(250, 350,9,0);
		painel.setBackground(new Color(56, 103, 214));
		legenda.setBounds(190, 120, 500,60);
		button.addActionListener(new ActionListener() {
		// Não sei o porquê mas se não tiver isso não executa
			public void actionPerformed(ActionEvent e) {
				 
				setVisible(false);
				new Perguntas();
				
			}
		});
		
		// Configuração do botão para entrar
		button.setFont(botao);
		button.setBackground(new Color(234, 32, 39));
		button.setForeground(Color.white);
		button.setBorder(null);
		button.setBounds(275, 220, 200, 50);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		// Adicionar ação ao botão 'entrar' em outras classes
		
		// Edições para o botão que irá ativar o áudio 
		tocar.setFont(botao);
		tocar.setBackground(new Color(56, 103, 214));

		tocar.setForeground(Color.white);
		tocar.setBorder(null);
		tocar.setBounds(550, 400, 200, 50);
		tocar.setVisible(true);
		tocar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		// Ação do botão para ativar o áudio 
		tocar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				play("audio-con");
			}
		});
		
		// Adicionando as coisas ao painel
		getContentPane().add(tocar);
		getContentPane().add(button);
		getContentPane().add(painel);
		
		//Título do JFrame e suas edições
		setTitle("Show do Pedrão");
		setSize(750,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		/* Vitor se você quiser colocar um JTextField para pedir o
		   nome do usuário tente colocar ou me chama, mas senão tiver
		   tempo vamos colocar no JOptionPane
		*/
		/* Pesquisar sobre as bibliotecas 
		 * import java.applet.Applet;
		 * import java.applet.AudioClip; 
		 * import java.net.URL;
		*/
		// Ação do botão de chamar outra classe
	}
	public void play(String nomeDoAudio) {
		URL url = getClass().getResource(nomeDoAudio+".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();
	}
	
}