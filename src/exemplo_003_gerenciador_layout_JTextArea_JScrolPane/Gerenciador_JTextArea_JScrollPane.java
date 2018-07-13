package exemplo_003_gerenciador_layout_JTextArea_JScrolPane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import exemplo_002_listener.ExercicioEventoBotao;

/**
 * 
 * @author Diego Munhoz
 */
public class Gerenciador_JTextArea_JScrollPane extends JFrame{
	private static final long serialVersionUID = -8219241343617095214L;

	private JTextField txtMensagem;
	private JTextArea txtAreaMensagens;
	private JScrollPane scrollTxtAreaMensagem;
	private JButton btnEnviar;
	
	public final JButton getBtnEnviar() {
		if(btnEnviar == null){
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				adicionarTexto();
				txtMensagem.requestFocus(true);
			}
					
		});	
		
		
		}
		
		return btnEnviar;
	}




	public final JScrollPane getScrollTxtAreaMensagem() {
		if(scrollTxtAreaMensagem == null){
		scrollTxtAreaMensagem = new JScrollPane();
		scrollTxtAreaMensagem.setViewportView(getTxtAreaMensagens());
		}
		
		return scrollTxtAreaMensagem;
	}




	public final JTextArea getTxtAreaMensagens() {
		if(txtAreaMensagens == null){
		txtAreaMensagens = new JTextArea();
		txtAreaMensagens.setEditable(false);
		}
		
		return txtAreaMensagens;
	}



	public final JTextField getTxtMensagem() {
		if(txtMensagem == null){
		txtMensagem = new JTextField();
		txtMensagem.setToolTipText("DIGITE SUA MENSAGEM");	
		txtMensagem.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent arg0) {
					 adicionarTexto();
					
				}
				
			});
			
				}
		
		return txtMensagem;
	}
	
	public void inicializarTela(){
		this.setSize(300 , 300);
		this.setResizable(false);
		this.setTitle("Exemplo de Evento em botões");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(BorderLayout.NORTH,getTxtMensagem());
		this.getContentPane().add(BorderLayout.CENTER,getScrollTxtAreaMensagem());
		this.getContentPane().add(BorderLayout.SOUTH,getBtnEnviar());
		this.setVisible(true);
	}
	
	
	public void adicionarTexto(){
		if (!"".equals(getTxtMensagem().getText().trim())){
		String texto = getTxtMensagem().getText();
		String toLocaleString2 = new Date().toLocaleString();
		String toLocaleString = toLocaleString2;
		String dataAtual = toLocaleString;
		String rotulo = dataAtual + " - Julio diz:";
		//String rotulo = ;
		getTxtAreaMensagens().append(rotulo + texto+"\n");
		}
		getTxtMensagem().setText("");
	}
	
	public static void main(String[] args) {
		Gerenciador_JTextArea_JScrollPane tela = new Gerenciador_JTextArea_JScrollPane();
		tela.inicializarTela();

	}






	

}
