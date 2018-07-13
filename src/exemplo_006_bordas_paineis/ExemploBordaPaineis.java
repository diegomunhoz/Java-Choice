package exemplo_006_bordas_paineis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * 
 * @author Diego Munhoz
 */
public class ExemploBordaPaineis {

	//PRIVATE DAS VARIAVEIS

	private JFrame janela = new JFrame();
	private JPanel painel;
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;

	
		public final JPanel getPainel() {
			if(painel == null){
				painel = (JPanel) janela.getContentPane();
				painel.setLayout(null);

			}
		
		return painel;
	}

	public final JPanel getPainel1() {
		if(painel1 == null){
			painel1 = new JPanel();
			painel1.setBounds(4, 6, 200, 100);
			painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			painel1.setBorder(BorderFactory.createEtchedBorder());
		}
		return painel1;
	}
	public final JPanel getPainel2() {
		if(painel2 == null){
			painel2 = new JPanel();
			painel2.setBounds(208, 6, 200, 100);
			painel2.setLayout(new BorderLayout(0, 0));
			painel2.setBorder(BorderFactory.createLoweredBevelBorder());
		}
		return painel2;
	}


	public final JPanel getPainel3() {
		if(painel3 == null){
			painel3 = new JPanel();
			painel3.setBounds(3, 109, 200, 100);
			painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
			painel3.setBorder(BorderFactory.createRaisedBevelBorder());
		}
		
		return painel3;
	}


	public final JPanel getPainel4() {
		if(painel4 == null){
			painel4 = new JPanel();
			painel4.setBounds(208,110,200,100);
			painel4.setLayout(new GridLayout(1, 0, 0, 0));
			painel4.setBorder(new TitledBorder("Promoção"));
		}
		
		return painel4;
	}

	public void inicializarTela(){
		janela.setSize(422, 246);
		janela.setResizable(false);
		getPainel().add(getPainel1());
		getPainel().add(getPainel2());
		getPainel().add(getPainel3());
		getPainel().add(getPainel4());
		janela.setTitle("Montando Bordas!!!");
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}


public static void main(String[] args) {
	ExemploBordaPaineis aplicativo = new ExemploBordaPaineis();
	aplicativo.inicializarTela();
}

}



