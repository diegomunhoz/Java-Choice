package exemplo_001;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Diego Munhoz
 */
public class BasicoArquiteturadoFinal extends JFrame {
		
	private static final long serialVersionUID = -6773480472037957884L;

	public static void main(String[] args) {
		BasicoArquiteturado minhaTela = new BasicoArquiteturado();
		minhaTela.gerarTela();
		
		}


		public final JButton getBtnCliqueAqui() {
			Object btnCliqueAqui = null;
			if(btnCliqueAqui == null){
				btnCliqueAqui = new JButton("Clique Aqui");
				((Component) btnCliqueAqui).setBounds(10,10,100,20);
			}
			return (JButton) btnCliqueAqui;
		}


		public final JLabel getLblNome() {
			Object lblNome = null;
			if(lblNome == null){
				lblNome = new JLabel("Nome");
				((Component) lblNome).setBounds(10,50,100,20);
			}
			
			return (JLabel) lblNome;
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
			this.setTitle("Minha Terceira Tela em Swing");
			this.getContentPane().setLayout(null);
			this.setSize(300, 200);
			this.setLocationRelativeTo(null);
			//Criando Botão para Fechar a janela 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.getContentPane().add(getBtnCliqueAqui());
			this.getContentPane().add(getLblNome());
			this.getContentPane().add(getTxtNome());
									
			this.setVisible(true);
				

	}

}
