package exemplo_011_JTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * 
 * @author Diego Munhoz
 */
public class ComponenteJTableBasica extends JFrame {
	
	private JTable tbEstado = null;
	private JScrollPane scrollPanetabela = null;

	public JScrollPane getScrollPanetabela() {
		if (scrollPanetabela == null) {
			scrollPanetabela = new JScrollPane();
			scrollPanetabela.setBounds(5,5,283,256);
			scrollPanetabela.setViewportView(getTbEstado());
		}
		return scrollPanetabela;
	}

	public JTable getTbEstado() {
		if (tbEstado == null) {
			String[] cabecalho = {"Nome", "Sigla", "Região"};
			String[][] dados = {{"São Paulo","SP","Sudeste"},
								{"Rio de Janeiro","RJ","Sudeste"},
								{"Acre","AC","Norte",},
								{"Paraná", "PR","Sul"}};
			tbEstado = new JTable(dados, cabecalho);
		}
		return tbEstado;
	}

	public void iniciar() {
		this.setTitle("Exemplo JTable - Básica");
		this.setSize(300,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.getContentPane().add(getScrollPanetabela());
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComponenteJTableBasica().iniciar();
	}
}
