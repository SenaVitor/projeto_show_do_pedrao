package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Perguntas extends JFrame {
	
	
	static String nome = JOptionPane.showInputDialog("Qual o seu nome?");
	static int erros = 0, acertos = 0;
	
	public String getNome(){
		return nome;
	}
	
	public int getAcertos(){
		return acertos;
	}
	
	public int getErros(){
		return erros;
	}

	JLabel pergunta = new JLabel("<html><center>1- No Microsoft Excel 2010 existem diversas funções matemáticas disponíveis <br> para o uso em fórmulas,"
			+ "dentre elas está a função INT. Qual é o resultado <br> desta função quando aplicada ao valor 2,85?</center></html>");
	Font fonte = new Font("century gothic", Font.TYPE1_FONT,18);
	Font texto = new Font("SansSerif", Font.PLAIN, 12);
	Font textbutton = new Font("frankiln gothic", Font.TYPE1_FONT, 16);
	
	JLabel usuario = new JLabel(nome);
	
	JButton a1 = new JButton(" Valor 3.");
	JButton b1 = new JButton(" Valor 2.");
	JButton c1 = new JButton(" Valor 2,9.");
	JButton d1 = new JButton(" Valor 0,85.");
	JPanel panel = new JPanel();

	JPanel panel2 = new JPanel();
	JLabel p2 = new JLabel("<html><center>2- Leia a afirmativa abaixo e assinale a alternativa que a complementa <br> corretamente."
				+ "A sigla SMTP significa Simple Mail Transfer Protocol <br> (Protocolo de Transferência de Correio Simples) que é…</center></html>");
	JButton a2 = new JButton("processo por trás do fluxo de email na internet.");
	JButton b2 = new JButton("responsável pela segurança contra vírus nos emails");
	JButton c2 = new JButton("responsável pelo bloqueio de emails enviados indevidamente.");
	JButton d2 = new JButton("responsável pelo gerenciamento de SPAM.");
	
	JPanel panel3 = new JPanel();
	JLabel p3 = new JLabel("<html><center>3- Para realizar a soma dos valores contidos nas células A1, A2, A3 e A4, <br> numa planilha do "
			+ "Microsoft Office Excel 2007, utiliza-se a função SOMA com <br> o seguinte formato:</center></html>");
	JButton a3 = new JButton("=SOMA(A1 , A4).");
	JButton b3 = new JButton("=SOMA(A1 >> A4).");
	JButton c3 = new JButton("=SOMA(A1 : A4).");
	JButton d3 = new JButton("=SOMA(A1 << A4).");
	
	JPanel panel4 = new JPanel();
	JLabel p4 = new JLabel("<html><center>4- Atalhos de teclado são úteis para a digitalizaçao de um texto, <br> no que se refere a MS Word assinale "
			+ "corretamente:</center></html>");
	JButton a4 = new JButton("A tecla F12 aciona a janela (abrir documento).");
	JButton b4 = new JButton("A combinaçao SHIFT + F3 aciona a formataçao de parágrafo.");
	JButton c4 = new JButton("A combinação SHIFT + F aciona a formataçao de fonte.");
	JButton d4 = new JButton("Para fazer uma análise ortográfica do seu arquivo aperte a tecla F7");
	
	JPanel panel5 = new JPanel();
	JLabel p5 = new JLabel("<html><center>5- Um tipo de memória cujo conteúdo é gravado pelo fabricante, <br> podendo ser lido, mas não modificado é"
			+ " denominado:</center></html>");
	JButton a5 = new JButton("Rom.");
	JButton b5 = new JButton("Ram.");
	JButton c5 = new JButton("Sdram.");
	JButton d5 = new JButton("DDR.");
	
	JPanel panel6 = new JPanel();
	JLabel p6 = new JLabel("<html><center>6- O armazenamento de informações em computadores é feito pela <br> utilização de dispositivos chamados de memória,"
			+ " que as mantêm de forma <br> volátil ou permanente. Entre esses dispositivos, está a memória <br> RAM ou memória </center></html>");
	JButton a6 = new JButton("magnética.");
	JButton b6 = new JButton("secundária.");
	JButton c6 = new JButton("cache.");
	JButton d6 = new JButton("principal.");
	
	JPanel panel7 = new JPanel();
	JLabel p7 = new JLabel("<html><center>7- A memória aleatória do computador é chamada</center></html>");
	JButton a7 = new JButton("SIMM (Single Inline Memory Module).");
	JButton b7 = new JButton("ROM (Read Only Memory).");
	JButton c7 = new JButton("LLC (Logical Link Control).");
	JButton d7 = new JButton("RAM (Ramdom Access Memory).");
	
	JPanel panel8 = new JPanel();
	JLabel p8 = new JLabel("<html><center>8- Considere que num computador de 32 bits o barramento de endereço <br> comporta palavras"
				+ "de 32 dígitos 0 ou 1, logo o tamanho da memória deste <br> computador corresponde ao número de palavras"
				+ "possíveis de serem <br> formadas. Considere também que 1M = , 1G = e 1T = . Um      220   230    240 <br>  computador​"
				+ "​de​ ​32​ ​bits​ ​é​ ​capaz​ ​de​ ​endereçar​ ​quantos​ ​bytes​ ​de​ ​memória? </center></html>");
	JButton a8 = new JButton("4GB;");
	JButton b8 = new JButton("2GB;");
	JButton c8 = new JButton("4MB");
	JButton d8 = new JButton("2MB");
	
	JPanel panel9 = new JPanel();
	JLabel p9 = new JLabel("<html><center>9- or help desk entende-se uma atividade que está relacionada à <br> configuração e manutenção de "
			+ "microcomputadores e redes. Essa atividade <br> comporta funções específicas de </center></html>");
	JButton a9 = new JButton("assessoria gerencial.");
	JButton b9 = new JButton("assessoria de processo.");
	JButton c9 = new JButton("suporte técnico.");
	JButton d9 = new JButton("suporte de vendas.");
	
	JPanel panel10 = new JPanel();
	JLabel p10 = new JLabel("<html><center>10- Para conectar sua estação de trabalho a uma rede local de <br> computadores controlada por um servidor "
			+ "de domínios, o usuário <br> dessa rede deve informar uma senha e um[a] </center></html>");
	JButton a10 = new JButton("endereço de FTP válido para esse domínio.");
	JButton b10 = new JButton("endereço MAC de rede registrado na máquina cliente.");
	JButton c10 = new JButton("porta válida para a intranet desse domínio.");
	JButton d10 = new JButton("conta cadastrada e autorizada nesse domínio.");
	
//Começa o do Vini		

	public Perguntas(){
		
		JPanel panelAux = new JPanel();
		JPanel panelAux2 = new JPanel();
		JPanel panelAux3 = new JPanel();
		JPanel panelAux4 = new JPanel();
		JPanel panelAux5 = new JPanel();
		JPanel panelAux6 = new JPanel();
		JPanel panelAux7 = new JPanel();
		JPanel panelAux8 = new JPanel();
		JPanel panelAux9 = new JPanel();
		JPanel panelAux10 = new JPanel();
		
		panelAux.setBounds(20,240,700,50);
		panelAux.setBackground(new Color(220, 25, 25));
		panelAux.add(a1);
		add(panelAux);	
		panelAux.setVisible(true);
		JPanel pb1 = new JPanel();
		pb1.setBounds(20,295,700,50);
		pb1.setBackground(new Color(220, 25, 25));
		pb1.add(b1);
		add(pb1);
		pb1.setVisible(true);
		JPanel pc1 = new JPanel();
		pc1.setBounds(20,350,700,50);
		pc1.setBackground(new Color(220, 25, 25));
		pc1.add(c1);
		add(pc1);
		pc1.setVisible(true);
		JPanel pd1 = new JPanel();
		pd1.setBounds(20,405,700,50);
		pd1.setBackground(new Color(220, 25, 25));
		pd1.add(d1);
		add(pd1);
		pd1.setVisible(true);	
		
		panelAux2.setBounds(20,240,700,50);
		panelAux2.setBackground(new Color(220, 25, 25));
		panelAux2.add(a2);
		add(panelAux2);
		panelAux2.setVisible(false);
		JPanel pb2 = new JPanel();
		pb2.setBounds(20,295,700,50);
		pb2.setBackground(new Color(220, 25, 25));
		pb2.add(b2);
		add(pb2);
		pb2.setVisible(false);
		JPanel pc2 = new JPanel();
		pc2.setBounds(20,350,700,50);
		pc2.setBackground(new Color(220, 25, 25));
		pc2.add(c2);
		add(pc2);
		pc2.setVisible(false);
		JPanel pd2 = new JPanel();
		pd2.setBounds(20,405,700,50);
		pd2.setBackground(new Color(220, 25, 25));
		pd2.add(d2);
		add(pd2);
		pd2.setVisible(false);
	
		panelAux3.setBounds(20,240,700,50);
		panelAux3.setBackground(new Color(220, 25, 25));
		panelAux3.add(a3);
		add(panelAux3);	
		panelAux3.setVisible(false);
		JPanel pb3 = new JPanel();
		pb3.setBounds(20,295,700,50);
		pb3.setBackground(new Color(220, 25, 25));
		pb3.add(b3);
		add(pb3);
		pb3.setVisible(false);
		JPanel pc3 = new JPanel();
		pc3.setBounds(20,350,700,50);
		pc3.setBackground(new Color(220, 25, 25));
		pc3.add(c3);
		add(pc3);
		pc3.setVisible(false);
		JPanel pd3 = new JPanel();
		pd3.setBounds(20,405,700,50);
		pd3.setBackground(new Color(220, 25, 25));
		pd3.add(d3);
		add(pd3);
		pd3.setVisible(false);
		
		panelAux4.setBounds(20,240,700,50);
		panelAux4.setBackground(new Color(220, 25, 25));
		panelAux4.add(a4);
		add(panelAux4);
		panelAux4.setVisible(false);
		JPanel pb4 = new JPanel();
		pb4.setBounds(20,295,700,50);
		pb4.setBackground(new Color(220, 25, 25));
		pb4.add(b4);
		add(pb4);
		pb4.setVisible(false);
		JPanel pc4 = new JPanel();
		pc4.setBounds(20,350,700,50);
		pc4.setBackground(new Color(220, 25, 25));
		pc4.add(c4);
		add(pc4);
		pc4.setVisible(false);
		JPanel pd4 = new JPanel();
		pd4.setBounds(20,405,700,50);
		pd4.setBackground(new Color(220, 25, 25));
		pd4.add(d4);
		add(pd4);
		pd4.setVisible(false);
		
		panelAux5.setBounds(20,240,700,50);
		panelAux5.setBackground(new Color(220, 25, 25));
		panelAux5.add(a5);
		add(panelAux5);
		JPanel pb5 = new JPanel();
		pb5.setBounds(20,295,700,50);
		pb5.setBackground(new Color(220, 25, 25));
		pb5.add(b5);
		add(pb5);
		pb5.setVisible(false);
		JPanel pc5 = new JPanel();
		pc5.setBounds(20,350,700,50);
		pc5.setBackground(new Color(220, 25, 25));
		pc5.add(c5);
		add(pc5);
		pc5.setVisible(false);
		JPanel pd5 = new JPanel();
		pd5.setBounds(20,405,700,50);
		pd5.setBackground(new Color(220, 25, 25));
		pd5.add(d5);
		add(pd5);
		pd5.setVisible(false);
		
		panelAux6.setBounds(20,240,700,50);
		panelAux6.setBackground(new Color(220, 25, 25));
		panelAux6.add(a6);
		add(panelAux6);
		panelAux6.setVisible(false);
		JPanel pb6 = new JPanel();
		pb6.setBounds(20,295,700,50);
		pb6.setBackground(new Color(220, 25, 25));
		pb6.add(b6);
		add(pb6);
		pb6.setVisible(false);
		JPanel pc6 = new JPanel();
		pc6.setBounds(20,350,700,50);
		pc6.setBackground(new Color(220, 25, 25));
		pc6.add(c6);
		add(pc6);
		pc6.setVisible(false);
		JPanel pd6 = new JPanel();
		pd6.setBounds(20,405,700,50);
		pd6.setBackground(new Color(220, 25, 25));
		pd6.add(d6);
		add(pd6);
		pd6.setVisible(false);

		
		panelAux7.setBounds(20,240,700,50);
		panelAux7.setBackground(new Color(220, 25, 25));
		panelAux7.add(a7);
		add(panelAux7);
		panelAux7.setVisible(false);
		JPanel pb7 = new JPanel();
		pb7.setBounds(20,295,700,50);
		pb7.setBackground(new Color(220, 25, 25));
		pb7.add(b7);
		add(pb7);
		pb7.setVisible(false);
		JPanel pc7 = new JPanel();
		pc7.setBounds(20,350,700,50);
		pc7.setBackground(new Color(220, 25, 25));
		pc7.add(c7);
		add(pc7);
		pc7.setVisible(false);
		JPanel pd7 = new JPanel();
		pd7.setBounds(20,405,700,50);
		pd7.setBackground(new Color(220, 25, 25));
		pd7.add(d7);
		add(pd7);
		pd7.setVisible(false);

		
		panelAux8.setBounds(20,240,700,50);
		panelAux8.setBackground(new Color(220, 25, 25));
		panelAux8.add(a8);
		add(panelAux8);
		panelAux8.setVisible(false);
		JPanel pb8 = new JPanel();
		pb8.setBounds(20,295,700,50);
		pb8.setBackground(new Color(220, 25, 25));
		pb8.add(b8);
		add(pb8);
		pb8.setVisible(false);
		JPanel pc8 = new JPanel();
		pc8.setBounds(20,350,700,50);
		pc8.setBackground(new Color(220, 25, 25));
		pc8.add(c8);
		add(pc8);
		pc8.setVisible(false);
		JPanel pd8 = new JPanel();
		pd8.setBounds(20,405,700,50);
		pd8.setBackground(new Color(220, 25, 25));
		pd8.add(d8);
		add(pd8);
		pd8.setVisible(false);

		
		panelAux9.setBounds(20,240,700,50);
		panelAux9.setBackground(new Color(220, 25, 25));
		panelAux9.add(a9);
		add(panelAux9);
		panelAux9.setVisible(false);
		JPanel pb9 = new JPanel();
		pb9.setBounds(20,295,700,50);
		pb9.setBackground(new Color(220, 25, 25));
		pb9.add(b9);
		add(pb9);
		pb9.setVisible(false);
		JPanel pc9 = new JPanel();
		pc9.setBounds(20,350,700,50);
		pc9.setBackground(new Color(220, 25, 25));
		pc9.add(c9);
		add(pc9);
		pc9.setVisible(false);
		JPanel pd9 = new JPanel();
		pd9.setBounds(20,405,700,50);
		pd9.setBackground(new Color(220, 25, 25));
		pd9.add(d9);
		add(pd9);
		pd9.setVisible(false);

		
		panelAux10.setBounds(20,240,700,50);
		panelAux10.setBackground(new Color(220, 25, 25));
		panelAux10.add(a10);
		add(panelAux10);
		panelAux10.setVisible(false);
		JPanel pb10 = new JPanel();
		pb10.setBounds(20,295,700,50);
		pb10.setBackground(new Color(220, 25, 25));
		pb10.add(b10);
		add(pb10);
		pb10.setVisible(false);
		JPanel pc10 = new JPanel();
		pc10.setBounds(20,350,700,50);
		pc10.setBackground(new Color(220, 25, 25));
		pc10.add(c10);
		add(pc10);
		pc10.setVisible(false);
		JPanel pd10 = new JPanel();
		pd10.setBounds(20,405,700,50);
		pd10.setBackground(new Color(220, 25, 25));
		pd10.add(d10);
		add(pd10);
		pd10.setVisible(false);

		
		getContentPane().setBackground(new Color(56, 103, 214));
		a1.setBorder(null);
		b1.setBorder(null);
		c1.setBorder(null);
		d1.setBorder(null);
		a1.setFont(textbutton);
		b1.setFont(textbutton);
		c1.setFont(textbutton);
		d1.setFont(textbutton);
		
		a1.setBackground(new Color(220, 25, 25));
		b1.setBackground(new Color(220, 25, 25));
		c1.setBackground(new Color(220, 25, 25));
		d1.setBackground(new Color(220, 25, 25));
		
		a1.setForeground(new Color(238, 238, 238));
		b1.setForeground(new Color(238, 238, 238));
		c1.setForeground(new Color(238, 238, 238));
		d1.setForeground(new Color(238, 238, 238));
		
		setLayout(null);
		
		panel.add(pergunta);
		pergunta.setFont(fonte);
		pergunta.setForeground(Color.white);
		panel.setBounds(20, 20, 700, 200);
		panel.setBackground(new Color(220, 25, 25));
		
		add(panel);
		panel.setVisible(true);

		
	
//Acaba o do Vini		
		
		add(panel2);
		panelAux2.add(a2);
			
		a2.setBorder(null);
		b2.setBorder(null);
		c2.setBorder(null);
		d2.setBorder(null);
		a2.setFont(textbutton);
		b2.setFont(textbutton);
		c2.setFont(textbutton);
		d2.setFont(textbutton);
		
		a2.setBackground(new Color(220, 25, 25));
		b2.setBackground(new Color(220, 25, 25));
		c2.setBackground(new Color(220, 25, 25));
		d2.setBackground(new Color(220, 25, 25));
		
		a2.setForeground(new Color(238, 238, 238));
		b2.setForeground(new Color(238, 238, 238));
		c2.setForeground(new Color(238, 238, 238));
		d2.setForeground(new Color(238, 238, 238));
		
		panel2.add(p2);
		p2.setFont(fonte);
		p2.setForeground(Color.white);
		panel2.setBounds(20, 20, 700, 200);
		panel2.setBackground(new Color(220, 25, 25));
		
		panelAux2.setVisible(false);
		panel2.setVisible(false);		
		
		add(panel3);
		panel3.add(p3);
		panelAux3.add(a3);
		
		p3.setFont(fonte);
		p3.setForeground(Color.white);
		panel3.setBounds(20, 20, 700, 200);
		panel3.setBackground(new Color(220, 25, 25));
		
		panelAux3.setVisible(false);
		panel3.setVisible(false);	
		
		a3.setBorder(null);
		b3.setBorder(null);
		c3.setBorder(null);
		d3.setBorder(null);
		a3.setFont(textbutton);
		b3.setFont(textbutton);
		c3.setFont(textbutton);
		d3.setFont(textbutton);
		
		a3.setBackground(new Color(220, 25, 25));
		b3.setBackground(new Color(220, 25, 25));
		c3.setBackground(new Color(220, 25, 25));
		d3.setBackground(new Color(220, 25, 25));
		
		a3.setForeground(new Color(238, 238, 238));
		b3.setForeground(new Color(238, 238, 238));
		c3.setForeground(new Color(238, 238, 238));
		d3.setForeground(new Color(238, 238, 238));
		
		add(panel4);
		panelAux4.add(a4);
			
		a4.setBorder(null);
		b4.setBorder(null);
		c4.setBorder(null);
		d4.setBorder(null);
		a4.setFont(textbutton);
		b4.setFont(textbutton);
		c4.setFont(textbutton);
		d4.setFont(textbutton);
		
		a4.setBackground(new Color(220, 25, 25));
		b4.setBackground(new Color(220, 25, 25));
		c4.setBackground(new Color(220, 25, 25));
		d4.setBackground(new Color(220, 25, 25));
		
		a4.setForeground(new Color(238, 238, 238));
		b4.setForeground(new Color(238, 238, 238));
		c4.setForeground(new Color(238, 238, 238));
		d4.setForeground(new Color(238, 238, 238));
		
		panel4.add(p4);
		p4.setFont(fonte);
		p4.setForeground(Color.white);
		panel4.setBounds(20, 20, 700, 200);
		panel4.setBackground(new Color(220, 25, 25));
		
		panelAux4.setVisible(false);
		panel4.setVisible(false);		
		
		add(panel5);
		panel5.add(p5);
		panelAux5.add(a5);
		
		p5.setFont(fonte);
		p5.setForeground(Color.white);
		panel5.setBounds(20, 20, 700, 200);
		panel5.setBackground(new Color(220, 25, 25));
		
		panelAux5.setVisible(false);
		panel5.setVisible(false);	
		
		a5.setBorder(null);
		b5.setBorder(null);
		c5.setBorder(null);
		d5.setBorder(null);
		a5.setFont(textbutton);
		b5.setFont(textbutton);
		c5.setFont(textbutton);
		d5.setFont(textbutton);
		
		a5.setBackground(new Color(220, 25, 25));
		b5.setBackground(new Color(220, 25, 25));
		c5.setBackground(new Color(220, 25, 25));
		d5.setBackground(new Color(220, 25, 25));
		
		a5.setForeground(new Color(238, 238, 238));
		b5.setForeground(new Color(238, 238, 238));
		c5.setForeground(new Color(238, 238, 238));
		d5.setForeground(new Color(238, 238, 238));
		
		add(panel6);
		panel6.add(p6);
		panelAux6.add(a6);
		
		p6.setFont(fonte);
		p6.setForeground(Color.white);
		panel6.setBounds(20, 20, 700, 200);
		panel6.setBackground(new Color(220, 25, 25));
		
		a6.setBorder(null);
		b6.setBorder(null);
		c6.setBorder(null);
		d6.setBorder(null);
		a6.setFont(textbutton);
		b6.setFont(textbutton);
		c6.setFont(textbutton);
		d6.setFont(textbutton);
		
		a6.setBackground(new Color(220, 25, 25));
		b6.setBackground(new Color(220, 25, 25));
		c6.setBackground(new Color(220, 25, 25));
		d6.setBackground(new Color(220, 25, 25));
		
		a6.setForeground(new Color(238, 238, 238));
		b6.setForeground(new Color(238, 238, 238));
		c6.setForeground(new Color(238, 238, 238));
		d6.setForeground(new Color(238, 238, 238));	
		
		panelAux6.setVisible(false);
		panel6.setVisible(false);	
		
		add(panel7);
		panel7.add(p7);
		panelAux7.add(a7);
		
		panelAux7.setVisible(false);
		panel7.setVisible(false);	
		
		p7.setFont(fonte);
		p7.setForeground(Color.white);
		panel7.setBounds(20, 20, 700, 200);
		panel7.setBackground(new Color(220, 25, 25));
		
		a7.setBorder(null);
		b7.setBorder(null);
		c7.setBorder(null);
		d7.setBorder(null);
		a7.setFont(textbutton);
		b7.setFont(textbutton);
		c7.setFont(textbutton);
		d7.setFont(textbutton);
		
		a7.setBackground(new Color(220, 25, 25));
		b7.setBackground(new Color(220, 25, 25));
		c7.setBackground(new Color(220, 25, 25));
		d7.setBackground(new Color(220, 25, 25));
		
		a7.setForeground(new Color(238, 238, 238));
		b7.setForeground(new Color(238, 238, 238));
		c7.setForeground(new Color(238, 238, 238));
		d7.setForeground(new Color(238, 238, 238));
		
		add(panel8);
		panel8.add(p8);
		panelAux8.add(a8);
		
		panelAux8.setVisible(false);
		panel8.setVisible(false);	
		
		p8.setFont(fonte);
		p8.setForeground(Color.white);
		panel8.setBounds(20, 20, 700, 200);
		panel8.setBackground(new Color(220, 25, 25));
		
		a8.setBorder(null);
		b8.setBorder(null);
		c8.setBorder(null);
		d8.setBorder(null);
		a8.setFont(textbutton);
		b8.setFont(textbutton);
		c8.setFont(textbutton);
		d8.setFont(textbutton);
		
		a8.setBackground(new Color(220, 25, 25));
		b8.setBackground(new Color(220, 25, 25));
		c8.setBackground(new Color(220, 25, 25));
		d8.setBackground(new Color(220, 25, 25));
		
		a8.setForeground(new Color(238, 238, 238));
		b8.setForeground(new Color(238, 238, 238));
		c8.setForeground(new Color(238, 238, 238));
		d8.setForeground(new Color(238, 238, 238));
		
		add(panel9);
		panel9.add(p9);
		panelAux9.add(a9);
		
		panelAux9.setVisible(false);
		panel9.setVisible(false);	
		
		p9.setFont(fonte);
		p9.setForeground(Color.white);
		panel9.setBounds(20, 20, 700, 200);
		panel9.setBackground(new Color(220, 25, 25));
		
		a9.setBorder(null);
		b9.setBorder(null);
		c9.setBorder(null);
		d9.setBorder(null);
		a9.setFont(textbutton);
		b9.setFont(textbutton);
		c9.setFont(textbutton);
		d9.setFont(textbutton);
		
		a9.setBackground(new Color(220, 25, 25));
		b9.setBackground(new Color(220, 25, 25));
		c9.setBackground(new Color(220, 25, 25));
		d9.setBackground(new Color(220, 25, 25));
		
		a9.setForeground(new Color(238, 238, 238));
		b9.setForeground(new Color(238, 238, 238));
		c9.setForeground(new Color(238, 238, 238));
		d9.setForeground(new Color(238, 238, 238));
		
		add(panel10);
		panel10.add(p10);
		panelAux10.add(a10);
		
		panelAux10.setVisible(false);
		panel10.setVisible(false);	
		
		p10.setFont(fonte);
		p10.setForeground(Color.white);
		panel10.setBounds(20, 20, 700, 200);
		panel10.setBackground(new Color(220, 25, 25));
		
		a10.setBorder(null);
		b10.setBorder(null);
		c10.setBorder(null);
		d10.setBorder(null);
		a10.setFont(textbutton);
		b10.setFont(textbutton);
		c10.setFont(textbutton);
		d10.setFont(textbutton);
		
		a10.setBackground(new Color(220, 25, 25));
		b10.setBackground(new Color(220, 25, 25));
		c10.setBackground(new Color(220, 25, 25));
		d10.setBackground(new Color(220, 25, 25));
		
		a10.setForeground(new Color(238, 238, 238));
		b10.setForeground(new Color(238, 238, 238));
		c10.setForeground(new Color(238, 238, 238));
		d10.setForeground(new Color(238, 238, 238));
		
		setTitle("SHOW DO PEDRÃO");
		setSize(750,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);	
		
		a1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a1) {
					a1.setBackground(Color.red);
					a1.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel.setVisible(false);
					panel2.setVisible(true);
					panelAux.setVisible(false);
					panelAux2.setVisible(true);
					pb1.setVisible(false);
					pb2.setVisible(true);
					pc1.setVisible(false);
					pc2.setVisible(true);
					pd1.setVisible(false);
					pd2.setVisible(true);
					
				}
			}
		});
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b1) {
					b1.setBackground(Color.green);
					b1.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel.setVisible(false);
					panel2.setVisible(true);
					panelAux.setVisible(false);
					panelAux2.setVisible(true);
					pb1.setVisible(false);
					pb2.setVisible(true);
					pc1.setVisible(false);
					pc2.setVisible(true);
					pd1.setVisible(false);
					pd2.setVisible(true);
					
				}
			}
			
		});
		
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c1) {
					c1.setBackground(Color.red);
					c1.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel.setVisible(false);
					panel2.setVisible(true);
					panelAux.setVisible(false);
					panelAux2.setVisible(true);
					pb1.setVisible(false);
					pb2.setVisible(true);
					pc1.setVisible(false);
					pc2.setVisible(true);
					pd1.setVisible(false);
					pd2.setVisible(true);

				}
			}
			
		});
		
		d1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d1) {
					d1.setBackground(Color.red);
					d1.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel.setVisible(false);
					panel2.setVisible(true);
					panelAux.setVisible(false);
					panelAux2.setVisible(true);
					pb1.setVisible(false);
					pb2.setVisible(true);
					pc1.setVisible(false);
					pc2.setVisible(true);
					pd1.setVisible(false);
					pd2.setVisible(true);

				}
			}
			
		});
		
		a2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a2) {
					a2.setBackground(Color.green);
					a2.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel2.setVisible(false);
					panel3.setVisible(true);
					panelAux2.setVisible(false);
					panelAux3.setVisible(true);					
					pb2.setVisible(false);
					pb3.setVisible(true);
					pc2.setVisible(false);
					pc3.setVisible(true);
					pd2.setVisible(false);
					pd3.setVisible(true);

				}
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b2) {
					b2.setBackground(Color.red);
					b2.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel2.setVisible(false);
					panel3.setVisible(true);
					panelAux2.setVisible(false);
					panelAux3.setVisible(true);
					pb2.setVisible(false);
					pb3.setVisible(true);
					pc2.setVisible(false);
					pc3.setVisible(true);
					pd2.setVisible(false);
					pd3.setVisible(true);

				}
		}
		});
		
		c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c2) {
					c2.setBackground(Color.red);
					c2.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel2.setVisible(false);
					panel3.setVisible(true);
					panelAux2.setVisible(false);
					panelAux3.setVisible(true);
					pb2.setVisible(false);
					pb3.setVisible(true);
					pc2.setVisible(false);
					pc3.setVisible(true);
					pd2.setVisible(false);
					pd3.setVisible(true);

				}
			}
			
		});
		
		d2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d2) {
					d2.setBackground(Color.red);
					d2.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel2.setVisible(false);
					panel3.setVisible(true);
					panelAux2.setVisible(false);
					panelAux3.setVisible(true);
					pb2.setVisible(false);
					pb3.setVisible(true);
					pc2.setVisible(false);
					pc3.setVisible(true);
					pd2.setVisible(false);
					pd3.setVisible(true);

				}
			}
			
		});
		
		a3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a3) {
					a3.setBackground(Color.red);
					a3.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel3.setVisible(false);
					panel4.setVisible(true);
					panelAux3.setVisible(false);
					panelAux4.setVisible(true);
					pb3.setVisible(false);
					pb4.setVisible(true);
					pc3.setVisible(false);
					pc4.setVisible(true);
					pd3.setVisible(false);
					pd4.setVisible(true);
					
				}
			}
		});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b3) {
					b3.setBackground(Color.red);
					b3.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel3.setVisible(false);
					panel4.setVisible(true);
					panelAux3.setVisible(false);
					panelAux4.setVisible(true);
					pb3.setVisible(false);
					pb4.setVisible(true);
					pc3.setVisible(false);
					pc4.setVisible(true);
					pd3.setVisible(false);
					pd4.setVisible(true);
				}
		}
		});
		
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c3) {
					c3.setBackground(Color.green);
					c3.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel3.setVisible(false);
					panel4.setVisible(true);
					panelAux3.setVisible(false);
					panelAux4.setVisible(true);
					pb3.setVisible(false);
					pb4.setVisible(true);
					pc3.setVisible(false);
					pc4.setVisible(true);
					pd3.setVisible(false);
					pd4.setVisible(true);
				}
			}
			
		});
		
		d3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d3) {
					d3.setBackground(Color.red);
					d3.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel3.setVisible(false);
					panel4.setVisible(true);
					panelAux3.setVisible(false);
					panelAux4.setVisible(true);
					pb3.setVisible(false);
					pb4.setVisible(true);
					pc3.setVisible(false);
					pc4.setVisible(true);
					pd3.setVisible(false);
					pd4.setVisible(true);
				}
			}
			
		});
		
		a4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a4) {
					a4.setBackground(Color.red);
					a4.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel4.setVisible(false);
					panel5.setVisible(true);
					panelAux4.setVisible(false);
					panelAux5.setVisible(true);
					pb4.setVisible(false);
					pb5.setVisible(true);
					pc4.setVisible(false);
					pc5.setVisible(true);
					pd4.setVisible(false);
					pd5.setVisible(true);
				}
			}
		});
		
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b4) {
					b4.setBackground(Color.red);
					b4.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}


					panel4.setVisible(false);
					panel5.setVisible(true);
					panelAux4.setVisible(false);
					panelAux5.setVisible(true);
					pb4.setVisible(false);
					pb5.setVisible(true);
					pc4.setVisible(false);
					pc5.setVisible(true);
					pd4.setVisible(false);
					pd5.setVisible(true);
				}
		}
		});
		
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c4) {
					c4.setBackground(Color.red);
					c4.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel4.setVisible(false);
					panel5.setVisible(true);
					panelAux4.setVisible(false);
					panelAux5.setVisible(true);
					pb4.setVisible(false);
					pb5.setVisible(true);
					pc4.setVisible(false);
					pc5.setVisible(true);
					pd4.setVisible(false);
					pd5.setVisible(true);
				}
			}
			
		});
		
		d4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d4) {
					d4.setBackground(Color.green);
					d4.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel4.setVisible(false);
					panel5.setVisible(true);
					panelAux4.setVisible(false);
					panelAux5.setVisible(true);
					pb4.setVisible(false);
					pb5.setVisible(true);
					pc4.setVisible(false);
					pc5.setVisible(true);
					pd4.setVisible(false);
					pd5.setVisible(true);
				}
			}
			
		});
		
		a5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a5) {
					a5.setBackground(Color.green);
					a5.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel5.setVisible(false);
					panel6.setVisible(true);
					panelAux5.setVisible(false);
					panelAux6.setVisible(true);
					pb5.setVisible(false);
					pb6.setVisible(true);
					pc5.setVisible(false);
					pc6.setVisible(true);
					pd5.setVisible(false);
					pd6.setVisible(true);
				}
			}
		});
		
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b5) {
					b5.setBackground(Color.red);
					b5.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel5.setVisible(false);
					panel6.setVisible(true);
					panelAux5.setVisible(false);
					panelAux6.setVisible(true);
					pb5.setVisible(false);
					pb6.setVisible(true);
					pc5.setVisible(false);
					pc6.setVisible(true);
					pd5.setVisible(false);
					pd6.setVisible(true);
				}
		}
		});
		
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c5) {
					c5.setBackground(Color.red);
					c5.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel5.setVisible(false);
					panel6.setVisible(true);
					panelAux5.setVisible(false);
					panelAux6.setVisible(true);
					pb5.setVisible(false);
					pb6.setVisible(true);
					pc5.setVisible(false);
					pc6.setVisible(true);
					pd5.setVisible(false);
					pd6.setVisible(true);
				}
			}
			
		});
		
		d5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d5) {
					d5.setBackground(Color.red);
					d5.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel5.setVisible(false);
					panel6.setVisible(true);
					panelAux5.setVisible(false);
					panelAux6.setVisible(true);
					pb5.setVisible(false);
					pb6.setVisible(true);
					pc5.setVisible(false);
					pc6.setVisible(true);
					pd5.setVisible(false);
					pd6.setVisible(true);
				}
			}
			
		});
		
		a6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a6) {
					a6.setBackground(Color.red);
					a6.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel6.setVisible(false);
					panel7.setVisible(true);
					panelAux6.setVisible(false);
					panelAux7.setVisible(true);
					pb6.setVisible(false);
					pb7.setVisible(true);
					pc6.setVisible(false);
					pc7.setVisible(true);
					pd6.setVisible(false);
					pd7.setVisible(true);
				}
			}
		});
		
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b6) {
					b6.setBackground(Color.red);
					b6.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel6.setVisible(false);
					panel7.setVisible(true);
					panelAux6.setVisible(false);
					panelAux7.setVisible(true);
					pb6.setVisible(false);
					pb7.setVisible(true);
					pc6.setVisible(false);
					pc7.setVisible(true);
					pd6.setVisible(false);
					pd7.setVisible(true);
				}
		}
		});
		
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c6) {
					c6.setBackground(Color.red);
					c6.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel6.setVisible(false);
					panel7.setVisible(true);
					panelAux6.setVisible(false);
					panelAux7.setVisible(true);
					pb6.setVisible(false);
					pb7.setVisible(true);
					pc6.setVisible(false);
					pc7.setVisible(true);
					pd6.setVisible(false);
					pd7.setVisible(true);
				}
			}
			
		});
		
		d6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d6) {
					d6.setBackground(Color.green);
					d6.setForeground(Color.white);			
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel6.setVisible(false);
					panel7.setVisible(true);
					panelAux6.setVisible(false);
					panelAux7.setVisible(true);
					pb6.setVisible(false);
					pb7.setVisible(true);
					pc6.setVisible(false);
					pc7.setVisible(true);
					pd6.setVisible(false);
					pd7.setVisible(true);
				}
			}
			
		});
		
		a7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a7) {
					a7.setBackground(Color.red);
					a7.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel7.setVisible(false);
					panel8.setVisible(true);
					panelAux7.setVisible(false);
					panelAux8.setVisible(true);
					pb7.setVisible(false);
					pb8.setVisible(true);
					pc7.setVisible(false);
					pc8.setVisible(true);
					pd7.setVisible(false);
					pd8.setVisible(true);

				}
			}
		});
		
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b7) {
					b7.setBackground(Color.red);
					b7.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel7.setVisible(false);
					panel8.setVisible(true);
					panelAux7.setVisible(false);
					panelAux8.setVisible(true);
					pb7.setVisible(false);
					pb8.setVisible(true);
					pc7.setVisible(false);
					pc8.setVisible(true);
					pd7.setVisible(false);
					pd8.setVisible(true);
				}
		}
		});
		
		c7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c7) {
					c7.setBackground(Color.red);
					c7.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel7.setVisible(false);
					panel8.setVisible(true);
					panelAux7.setVisible(false);
					panelAux8.setVisible(true);
					pb7.setVisible(false);
					pb8.setVisible(true);
					pc7.setVisible(false);
					pc8.setVisible(true);
					pd7.setVisible(false);
					pd8.setVisible(true);
				}
			}
			
		});
		
		d7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d7) {
					d7.setBackground(Color.green);
					d7.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel7.setVisible(false);
					panel8.setVisible(true);
					panelAux7.setVisible(false);
					panelAux8.setVisible(true);
					pb7.setVisible(false);
					pb8.setVisible(true);
					pc7.setVisible(false);
					pc8.setVisible(true);
					pd7.setVisible(false);
					pd8.setVisible(true);
				}
			}
			
		});
		
		a8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a8) {
					a8.setBackground(Color.green);
					a8.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel8.setVisible(false);
					panel9.setVisible(true);
					panelAux8.setVisible(false);
					panelAux9.setVisible(true);
					pb8.setVisible(false);
					pb9.setVisible(true);
					pc8.setVisible(false);
					pc9.setVisible(true);
					pd8.setVisible(false);
					pd9.setVisible(true);
				}
			}
		});
		
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b8) {
					b8.setBackground(Color.red);
					b8.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel8.setVisible(false);
					panel9.setVisible(true);
					panelAux8.setVisible(false);
					panelAux9.setVisible(true);
					pb8.setVisible(false);
					pb9.setVisible(true);
					pc8.setVisible(false);
					pc9.setVisible(true);
					pd8.setVisible(false);
					pd9.setVisible(true);
				}
		}
		});
		
		c8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c8) {
					c8.setBackground(Color.red);
					c8.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel8.setVisible(false);
					panel9.setVisible(true);
					panelAux8.setVisible(false);
					panelAux9.setVisible(true);
					pb8.setVisible(false);
					pb9.setVisible(true);
					pc8.setVisible(false);
					pc9.setVisible(true);
					pd8.setVisible(false);
					pd9.setVisible(true);
				}
			}
			
		});
		
		d8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d8) {
					d8.setBackground(Color.red);
					d8.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel8.setVisible(false);
					panel9.setVisible(true);
					panelAux8.setVisible(false);
					panelAux9.setVisible(true);
					pb8.setVisible(false);
					pb9.setVisible(true);
					pc8.setVisible(false);
					pc9.setVisible(true);
					pd8.setVisible(false);
					pd9.setVisible(true);
				}
			}
			
		});
		
		a9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a9) {
					a9.setBackground(Color.red);
					a9.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel9.setVisible(false);
					panel10.setVisible(true);
					panelAux9.setVisible(false);
					panelAux10.setVisible(true);
					pb9.setVisible(false);
					pb10.setVisible(true);
					pc9.setVisible(false);
					pc10.setVisible(true);
					pd9.setVisible(false);
					pd10.setVisible(true);
				}
			}
		});
		
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b9) {
					b9.setBackground(Color.red);
					b9.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel9.setVisible(false);
					panel10.setVisible(true);
					panelAux9.setVisible(false);
					panelAux10.setVisible(true);
					pb9.setVisible(false);
					pb10.setVisible(true);
					pc9.setVisible(false);
					pc10.setVisible(true);
					pd9.setVisible(false);
					pd10.setVisible(true);
				}
		}
		});
		
		c9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c9) {
					c9.setBackground(Color.green);
					c9.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel9.setVisible(false);
					panel10.setVisible(true);
					panelAux9.setVisible(false);
					panelAux10.setVisible(true);
					pb9.setVisible(false);
					pb10.setVisible(true);
					pc9.setVisible(false);
					pc10.setVisible(true);
					pd9.setVisible(false);
					pd10.setVisible(true);
				}
			}
			
		});
		
		d9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d9) {
					d9.setBackground(Color.red);
					d9.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;
					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					panel9.setVisible(false);
					panel10.setVisible(true);
					panelAux9.setVisible(false);
					panelAux10.setVisible(true);
					pb9.setVisible(false);
					pb10.setVisible(true);
					pc9.setVisible(false);
					pc10.setVisible(true);
					pd9.setVisible(false);
					pd10.setVisible(true);
				}
			}
			
		});
		
		a10.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == a10) {
					a10.setBackground(Color.red);
					a10.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
						Thread.sleep(400);
						
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel10.setVisible(false);
					pb10.setVisible(false);
					pc10.setVisible(false);
					pd10.setVisible(false);
					panelAux10.setVisible(false);
					new TelaFinal();
					setVisible(false);
				}
			}
		});
		
		b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == b10) {
					b10.setBackground(Color.red);
					b10.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
						Thread.sleep(400);
						
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel10.setVisible(false);
					panelAux10.setVisible(false);
					pb10.setVisible(false);
					pc10.setVisible(false);
					pd10.setVisible(false);
					new TelaFinal();
					
				}
		}
		});
		
		c10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == c10) {
					c10.setBackground(Color.red);
					c10.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					erros = erros + 1;

					try {
					Thread.sleep(400);
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					panel10.setVisible(false);
					panelAux10.setVisible(false);
					pb10.setVisible(false);
					pc10.setVisible(false);
					pd10.setVisible(false);
					
					new TelaFinal();
					
				}
			}
			
		});
		
		d10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == d10) {
					d10.setBackground(Color.green);
					d10.setForeground(Color.white);
					JOptionPane.showMessageDialog(null, "Resposta correta!");
					acertos = acertos + 1;

					try {
						Thread.sleep(400);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel10.setVisible(false);
					panelAux10.setVisible(false);
					pb10.setVisible(false);
					pc10.setVisible(false);
					pd10.setVisible(false);
					
					new TelaFinal();
					
				}
			}
			
		});
		
	}
}