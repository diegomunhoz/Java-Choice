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
public class BasicoArquiteturado {
	private JButton btnCliqueAqui;
	private JLabel lblNome;
	private JTextField txtNome;
	
	
	public static void main(String[] args) {
	BasicoArquiteturado minhaTela = new BasicoArquiteturado();
	minhaTela.gerarTela();
	
	}


	public final JButton getBtnCliqueAqui() {
		if(btnCliqueAqui == null){
			btnCliqueAqui = new JButton("Clique Aqui");
			btnCliqueAqui.setBounds(10,10,100,20);
		}
		return btnCliqueAqui;
	}


	public final JLabel getLblNome() {
		if(lblNome == null){
			lblNome = new JLabel("Nome");
			lblNome.setBounds(10,50,100,20);
		}
		
		return lblNome;
	}


	public final JTextField getTxtNome() {
		if(txtNome == null){
			txtNome = new JTextField();
			txtNome.setBounds(50,40,100,20);
			txtNome.setForeground(Color.RED);
			txtNome.setBackground(Color.GREEN);
		}
		return txtNome;
	}
	
	public void gerarTela(){
		JFrame janela = new JFrame("Minha segunda tela em Sweing");
		janela.getContentPane().setLayout(null);
		janela.setSize(300, 200);
		janela.setLocationRelativeTo(null);
		//Criando Botão para Fechar a janela 
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.getContentPane().add(getBtnCliqueAqui());
		janela.getContentPane().add(getLblNome());
		janela.getContentPane().add(getTxtNome());
		
		
		
		janela.setVisible(true);
	}
	

	
	
	
	
}
