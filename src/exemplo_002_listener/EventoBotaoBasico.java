package exemplo_002_listener;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author Diego Munhoz
 */
public class EventoBotaoBasico extends JFrame implements ActionListener{
	private static final long serialVersionUID = 8544508324769939260L;


	public final JButton getBtnCliqueAqui() {
		Object btnCliqueAqui = null;
		if(btnCliqueAqui == null){
			btnCliqueAqui = new JButton("Clique Aqui!");
			((AbstractButton) btnCliqueAqui).addActionListener(this);
			}
		
		((JComponent) btnCliqueAqui).setFont(new Font("Comic Sans Ms", 3, 20));
		return (JButton) btnCliqueAqui;
	}
	
	
	//*****************************************************************\\
	//*********************************3  PARTE************************\\
	// CRIA��O DO METODO QUE CONFIGURA A TELA (JRAME)********************\\
	//� NTES METODO QUE ADICIONAMOS OS COMPONENTES NA TELA **************\\
	//********************************************************************\\
	
	public void inicializarTela(){
		this.setSize(300 , 300);
		this.setTitle("Exemplo de Evento em bot�es");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(getBtnCliqueAqui());
		this.setVisible(true);
	}
	
	
		
	
	
	public static void main(String[] args) {
		EventoBotaoBasico minhaJanela = new EventoBotaoBasico();
		
		minhaJanela.inicializarTela();
	
		
		
		
		
	}

	/**
	 * M�todo repsons�vel por executar algo quando algum
	 * componente que esteja sendo "ouvido" pelo ActionListener
	 * sofre uma a��o .
	 * @param ActionEvent acao - A��o realizada.
	 */
	
	public void actionPerformed(ActionEvent acao) {
		JOptionPane.showMessageDialog(this, "Dono da A��o: "+ acao.getActionCommand());
		getBtnCliqueAqui().setText("!!!Fui clicado!!!");
	}

	

}
