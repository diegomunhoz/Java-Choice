package exemplo_007_JTabbedPane;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Diego Munhoz
 */
public class FuncionarioView extends JFrame{
	//DECLARANDO AS VARIAVEIS
	private JButton btnMensagemFuncionario;
	private JLabel lblMensagemFuncionario;

		
	public final JButton getBtnMensagemFuncionario() {
		if (btnMensagemFuncionario == null ){
			btnMensagemFuncionario = new JButton("Exibir Mensagem");
			btnMensagemFuncionario.setBounds(10,10,150,30);		
			btnMensagemFuncionario.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
					getLblMensagemFuncionario().setText("Bem Vindo ao Universo JAVA - Funcionario");
					
				}
				
			});
		}
		return btnMensagemFuncionario;
	}

	public final JLabel getLblMensagemFuncionario() {
		if (lblMensagemFuncionario == null){
			lblMensagemFuncionario = new JLabel();
			lblMensagemFuncionario.setBounds(10,50,585,20);
			
		}
		return lblMensagemFuncionario;
	}

	
	public Container getTelaFuncionario(){		
		this.setLayout(null);
		this.getContentPane().add(getBtnMensagemFuncionario());
		this.getContentPane().add(getLblMensagemFuncionario());
		
		return this.getContentPane();
	}

}



