package br.com.escola.locadora.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Diego Munhoz
 */
public class TesteGui1 {
	//Declara as Variaveis de Referência
	private static JFrame janela;
	private static JButton botao;
	
	public static void main(String[] args) {
		
		//Cria um nova Janela
		janela = new JFrame();
	//Cria um botão com o texto "Aperte aqui"
		botao = new JButton("Aperte Aqui");
		// Adiciona o botão ao painel da Janela
		janela.getContentPane().add(botao);
		
		//Configura o botão x para fechar a aplicação
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Configura o tamanho da Tela
		janela.setSize(300,300);
		//Configura a visibilidade para true (mostra janela)
		janela.setVisible(true);
		janela.getContentPane().setLayout(null);
		
		
	}

}
