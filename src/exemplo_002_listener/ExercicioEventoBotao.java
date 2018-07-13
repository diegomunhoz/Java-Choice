package exemplo_002_listener;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
	
/**
 * 
 * @author Diego Munhoz
 */
public class ExercicioEventoBotao extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JButton btnBotao1;
	private JButton btnBotao2;
	
	public final JButton getBtnBota1() {
		if(btnBotao1 == null){
			btnBotao1 = new JButton("Botao 1");
			btnBotao1.setBounds(10,10,270,50);
			btnBotao1.setFont(new Font("Comic Sans Ms", 3, 15));
			btnBotao1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					btnBotao1.setBackground(Color.GREEN);
					btnBotao2.setBackground(Color.BLUE);	
					
				}
				
			});
			
		}
		return  btnBotao1;
		
	}
		
	public final JButton getBtnBota2() {
		if(btnBotao2 == null){
			btnBotao2 = new JButton("Botao 2!");
			btnBotao2.setBounds(10,70,270,50);
			btnBotao2.setFont(new Font("Comic Sans Ms", 3, 15));
			btnBotao2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					btnBotao1.setBackground(Color.BLUE);
					btnBotao2.setBackground(Color.GREEN);	
					
				}
				
			});
			
		}
		return  btnBotao2;
		
	}
		
	public void inicializarTela(){
		this.setSize(300 , 160);
		this.setTitle("Exemplo de Evento em botões");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.getContentPane().add(getBtnBota1());
		this.getContentPane().add(getBtnBota2());
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		ExercicioEventoBotao tela = new ExercicioEventoBotao();
		tela.inicializarTela();
	
	}
}