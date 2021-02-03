package quiz;

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

public class TelaFinal extends JFrame{
	
	JPanel painel = new JPanel();
	JButton sair = new JButton("Sair");
	JLabel certas = new JLabel("Certas: " + Perguntas.acertos); 
	JLabel erradas = new JLabel("Erradas: " + Perguntas.erros);
	JLabel legenda = new JLabel(Perguntas.nome + " seu placar foi de:");
	
	// Edi��o de fonte que foi utilizada para o t�tulo
	Font fonte = new Font("century gothic", Font.BOLD, 35);
	// Fonte utilizada para o label
	Font label = new Font("century gothic", Font.BOLD, 20);
	//Fonte do nome do usuario
	
	public TelaFinal(){
		
		// Configura��es para o t�tulo JLabel e o painel
		add(legenda);
		add(certas);
		add(erradas);
		legenda.setFont(fonte);
		legenda.setForeground(Color.white);
		painel.setBackground(new Color(56, 103, 214));
		legenda.setBounds(200, 120, 500,100);
		sair.addActionListener(new ActionListener() {
		// N�o sei o porqu� mas se n�o tiver isso n�o executa
			public void actionPerformed(ActionEvent e) {
				 
				System.exit(0);
					
			}
		});
				
		// Configura��o do bot�o para entrar
		certas.setFont(label);
		erradas.setFont(label);
		sair.setFont(label);
		
		certas.setBackground(new Color(234, 32, 39));
		certas.setForeground(Color.green);
		certas.setBorder(null);
		certas.setBounds(275, 270, 200, 50);
		certas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		erradas.setBackground(new Color(234, 32, 39));
		erradas.setForeground(Color.red);
		erradas.setBorder(null);
		erradas.setBounds(375, 270, 200, 50);
		erradas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		sair.setBackground(new Color(234, 32, 39));
		sair.setForeground(Color.white);
		sair.setBorder(null);
		sair.setBounds(275, 420, 200, 50);
		sair.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		// Adicionar a��o ao bot�o 'entrar' em outras classes
	
		// Adicionando as coisas ao painel
		getContentPane().add(certas);
		getContentPane().add(erradas);
		getContentPane().add(sair);
		getContentPane().add(painel);
		
		//T�tulo do JFrame e suas edi��es
		setTitle("Show do Pedr�o");
		setSize(750,500);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		}
}