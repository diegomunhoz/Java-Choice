package exemplo_009_JList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Diego Munhoz
 */
public class ComponenteJList extends JFrame {

	private JList listVeiculos = null;
	private JLabel lblExibicao = null;
	private JScrollPane scrollPaneListVeiculo = null;
	
	
	public JLabel getLblExibicao() {
		if (lblExibicao == null) {
			lblExibicao = new JLabel();
			lblExibicao.setBounds(10, 160, 280, 60);
		}
		return lblExibicao;
	}


	public JList getListVeiculos() {
		if (listVeiculos == null) {
			listVeiculos = new JList(new String[]{"Gol", "Palio", "Corsa", "Vectra", "Fusca", "Passat"});
			listVeiculos.setBounds(10, 10, 275, 200);
			listVeiculos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			
			listVeiculos.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent arg0) {
					String texto = "";
					
					for (Object item : listVeiculos.getSelectedValues()) {
						texto += (String) item + " / ";
					}
					
					getLblExibicao().setText(texto.substring(0, texto.trim().length() - 2));
				}
			});
			
		}
		return listVeiculos;
	}


	public JScrollPane getScrollPaneListVeiculo() {
		if (scrollPaneListVeiculo == null) {
			scrollPaneListVeiculo = new JScrollPane(getListVeiculos());
			scrollPaneListVeiculo.setBounds(10, 10, 275, 100);
		}
		return scrollPaneListVeiculo;
	}
	
	public void inicializarJanela() {
		this.setTitle("Utilizando JList");
		this.setSize(300,300);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().add(getScrollPaneListVeiculo());
		this.getContentPane().add(getLblExibicao());
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ComponenteJList().inicializarJanela();
	}

}
