package br.com.escola.locadora.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Diego Munhoz
 */
public class TesteGui1 {
	//Declara as Variaveis de Refer�ncia
	private static JFrame janela;
	private static JButton botao;
	
	public static void main(String[] args) {
		
		//Cria um nova Janela
		janela = new JFrame();
	//Cria um bot�o com o texto "Aperte aqui"
		botao = new JButton("Aperte Aqui");
		// Adiciona o bot�o ao painel da Janela
		janela.getContentPane().add(botao);
		
		//Configura o bot�o x para fechar a aplica��o
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Configura o tamanho da Tela
		janela.setSize(300,300);
		//Configura a visibilidade para true (mostra janela)
		janela.setVisible(true);
		janela.getContentPane().setLayout(null);
		
		
	}

}
