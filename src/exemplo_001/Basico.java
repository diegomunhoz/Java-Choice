package exemplo_001;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Diego Munhoz
 */
public class Basico {
	public static void main(String[] args) {
		JFrame janela = new JFrame();
		janela.setTitle("Minha primeira Tela em Swing");
		janela.getContentPane().setLayout(null);
		janela.setSize(300,200);
		janela.setLocationRelativeTo(null);
		
		//Criando um componente JButton(BOTÃO) para adicionar na tela.
		JButton btnCliqueAqui = new JButton();
		btnCliqueAqui.setText("Clique Aqui");
		btnCliqueAqui.setBounds(10,10,100,20);
		
		//Criando um componente JLabel(Campo de rotulo)para adicionar na tela.
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome");
		lblNome.setBounds(10,40,40,20);
		
		// Criando um componente JTextField(Campo de Texto) para adiocionar da Tela
		
		JTextField txtNome = new JTextField();
		janela.setVisible(true);
		txtNome.setBounds(50,40,100,20);
		txtNome.setForeground(Color.RED);
		txtNome.setBackground(Color.GREEN);
		
		//ADICIONANDO OS COMPONENTES NA TELA.
		janela.getContentPane().add(btnCliqueAqui);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(txtNome);
		
	}

}
