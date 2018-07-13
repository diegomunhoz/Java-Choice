package exemplo_007_JTabbedPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import exemplo_002_listener.ExercicioEventoBotao;

/**
 * 
 * @author Diego Munhoz
 */
public class Abas extends JFrame{
	//DECLARANDO AS VARIAVEIS
	private JTabbedPane abas;
	private JPanel painelCliente;
	private JButton btnMensagemCliente;
	private JLabel lblMensagemCliente;

	public final JTabbedPane getAbas() {
		if(abas == null){
			abas = new JTabbedPane();
			abas.setBounds(5,5,585,350);
			abas.add(getPainelCliente());	
			abas.addTab("Cliente", getPainelCliente());
			abas.addTab("Funcionario", new FuncionarioView().getTelaFuncionario());
		}


		return abas;
	}
	public final JButton getBtnMensagemCliente() {

		if (btnMensagemCliente == null ){
			btnMensagemCliente = new JButton("Exibir Mensagem");
			btnMensagemCliente.setBounds(10,10,150,30);
			btnMensagemCliente.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
					getLblMensagemCliente().setText("Bem Vindo ao Universo JAVA - Cliente");
					
				}
				
			});
		}

		return btnMensagemCliente;
	}

	public final JLabel getLblMensagemCliente() {
		if (lblMensagemCliente == null){
			lblMensagemCliente = new JLabel();
			lblMensagemCliente.setBounds(10,50,585,20);
			
		}



		return lblMensagemCliente;
	}


	public final JPanel getPainelCliente() {
		if(painelCliente == null){
			painelCliente = new JPanel();
			painelCliente.setLayout(null);
			painelCliente.add(getBtnMensagemCliente());
			painelCliente.add(getLblMensagemCliente());
			painelCliente.setName("Cliente");

		}


		return painelCliente;
	}




	public void inicializarTela(Date dataAtual){
		this.setSize(600 , 400);
		this.setTitle("Exemplo de Abas ");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.getContentPane().add(getAbas());
		this.setVisible(true);
	}



	public static void main(String[] args) {
		new Abas().inicializarTela(new Date());

	}

}
