package exemplo_002_listener;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Diego Munhoz
 */
public class EventoBotaoAvancado extends JFrame{

	private JButton btnCliqueAqui;
	
	public final JButton getBtnCliqueAqui() {
		if(btnCliqueAqui == null){
			btnCliqueAqui = new JButton("Clique Aqui!");
			btnCliqueAqui.setFont(new Font("Comic Sans Ms", 3, 20));
			btnCliqueAqui.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
				 btnCliqueAqui.setText("Fui Clicado!!!");	
					
				}
				
			});
			
		}
		return  btnCliqueAqui;
		
	}
	
	
	//*****************************************************************\\
	//*********************************3  PARTE************************\\
	// CRIAÇÃO DO METODO QUE CONFIGURA A TELA (JRAME)********************\\
	//É NTES METODO QUE ADICIONAMOS OS COMPONENTES NA TELA **************\\
	//********************************************************************\\
	
	public void inicializarTela(){
		this.setSize(300 , 300);
		this.setTitle("Exemplo de Evento em botões");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(getBtnCliqueAqui());
		this.setVisible(true);
	}
	
	
		
	
	
	public static void main(String[] args) {
		EventoBotaoAvancado minhaJanela = new EventoBotaoAvancado();
		
		minhaJanela.inicializarTela();
	
		
		
		
		
	}

	/**
	 * Método repsonsável por executar algo quando algum
	 * componente que esteja sendo "ouvido" pelo ActionListener
	 * sofre uma ação .
	 * @param ActionEvent acao - Ação realizada.
	 */

}
