package exemplo_002;

import java.awt.Color;
import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Diego Munhoz
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		Calculadora minhaTela = new Calculadora();
		minhaTela.gerarTela();
		
		}


		public final JButton getbtnSomar() {
			Object btnSomar = null;
			if(btnSomar == null){
				btnSomar = new JButton("Somar");
				((Component) btnSomar).setBounds(10,10,100,20);
			}
			return (JButton) btnSomar;
		}


		public final JLabel getLblX() {
			Object lblX = null;
			if(lblX == null){
				lblX = new JLabel("X");
				((Component) lblX).setBounds(10,50,100,20);
			}
			
			return (JLabel) lblX;
		}

		
		public final JLabel getLblY() {
			Object lblY = null;
			if(lblY == null){
				lblY = new JLabel("Y");
				((Component) lblY).setBounds(10,50,100,20);
			}
			
			return (JLabel) lblY;
		}
		

		public final JTextField getTxtNome() {
			Object txtNome = null;
			if(txtNome == null){
				txtNome = new JTextField();
				((Component) txtNome).setBounds(50,40,100,20);
				((Component) txtNome).setForeground(Color.RED);
				((Component) txtNome).setBackground(Color.GREEN);
			}
			return (JTextField) txtNome;
		}
		
		public void gerarTela(){
			this.setTitle("Calculadora");
			this.getContentPane().setLayout(null);
			this.setSize(300, 200);
			this.setLocationRelativeTo(null);
			//Criando Botão para Fechar a janela 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.getContentPane().add(getBtnCliqueAqui());
			this.getContentPane().add(getLblX());
			this.getContentPane().add(getTxtNome());
									
			this.setTitle(true);
				

	}


		private Component getBtnCliqueAqui() {
			// TODO Stub de método gerado automaticamente
			return null;
		}


		private void setTitle(String string) {
			// TODO Stub de método gerado automaticamente
			
		}


		private void setDefaultCloseOperation(int exit_on_close) {
			// TODO Stub de método gerado automaticamente
			
		}


		private void setLocationRelativeTo(Object object) {
			// TODO Stub de método gerado automaticamente
			
		}


		private void setSize(int i, int j) {
			// TODO Stub de método gerado automaticamente
			
		}


		private AbstractButton getContentPane() {
			// TODO Stub de método gerado automaticamente
			return null;
		}


		private void setTitle(boolean b) {
			// TODO Stub de método gerado automaticamente
			
		}

}
