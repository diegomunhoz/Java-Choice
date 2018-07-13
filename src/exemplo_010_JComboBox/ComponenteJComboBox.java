package exemplo_010_JComboBox;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import exemplo_002_listener.ExercicioEventoBotao;

/**
 * 
 * @author Diego Munhoz
 */
public class ComponenteJComboBox extends JFrame{
	private static final long serialVersionUID = 60763906604436862L;
	private JComboBox cbSexo = null;
	private JButton btnMostrar =  null;
	private JLabel lblSexo = null;
	private JLabel lblSexoMostrar = null;		
	
	public final JButton getBtnMostrar() {
		if(btnMostrar == null){
			btnMostrar = new JButton("Mostrar");
			btnMostrar.setBounds(100,140,100,30);
			btnMostrar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String sexoSelecionado = (String) getCbSexo().getSelectedItem();
					if("Masculino".equals(sexoSelecionado) || "Feminino".equals(sexoSelecionado)){
						getLblSexoMostrar().setText(sexoSelecionado);	
					}
					else {
						AbstractButton getLblSexoMostrar;
						getLblSexoMostrar().setText("");
					}
				}
			});
	
		}		
		return btnMostrar;
	}

	public final JComboBox getCbSexo() {
		if(cbSexo == null){
			String sexo[]= new String[] {"Selecione um...","Masculino","Feminino"};
			cbSexo = new JComboBox(sexo);
			cbSexo.setBounds(10,10,280,20);
			cbSexo.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent arg0) {
				if(getCbSexo().getSelectedIndex() == 1){
					getContentPane().setBackground(Color.GREEN);
				}else if(getCbSexo().getSelectedIndex() ==2 )
				{
					getContentPane().setBackground(Color.PINK);
				}else{
					getContentPane().setBackground(new JFrame().getContentPane().getBackground());
				}
					
				}
				
			});
			
		}
		return cbSexo;
	}

	public final JLabel getLblSexo() {
		if(lblSexo == null){
			lblSexo = new JLabel("Sexo");
			lblSexo.setBounds(10,40,280,20);
			
		}
		return lblSexo;
	}

	public final JLabel getLblSexoMostrar() {
		if(lblSexoMostrar == null){
			lblSexoMostrar = new JLabel("...");
			lblSexoMostrar.setBounds(10,70,280,20);
		}
		return lblSexoMostrar;
	}
	
	public void inicializarTela(){
		this.setSize(300 , 300);
		this.setTitle("Cadastro de Sexo ");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.getContentPane().add(getBtnMostrar());
		this.getContentPane().add(getCbSexo());
		this.getContentPane().add(getLblSexo());
		this.getContentPane().add(getLblSexoMostrar());
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		ComponenteJComboBox tela = new ComponenteJComboBox();
		tela.inicializarTela();
		
	}

}
