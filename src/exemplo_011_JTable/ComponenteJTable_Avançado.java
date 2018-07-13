package exemplo_011_JTable;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Cursor;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;

/**
 * 
 * @author Diego Munhoz
 */
public class ComponenteJTable_Avançado extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JButton jButton = null;

	private JButton btnExcluir = null;

	private JTextField txtNome = null;

	private JLabel lblNome = null;

	private JLabel lblSigla = null;

	private JTextField txtSigla = null;

	private JLabel lblRegiao = null;

	private JTextField txtRegiao = null;

	private JButton btnAlterar = null;

	private JScrollPane scrollPaneTabelaEstado = null;

	private JTable tbEstado = null;

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton("Enviar");
			jButton.setBounds(new Rectangle(22, 164, 91, 27));
			jButton.setText("INCLUIR");
			jButton.setName("btnIncluir");
		}
		return jButton;
	}

	/**
	 * This method initializes btnExcluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton();
			btnExcluir.setBounds(new Rectangle(179, 165, 109, 23));
			btnExcluir.setText("EXCLUIR");
		}
		return btnExcluir;
	}

	/**
	 * This method initializes txtNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(new Rectangle(50, 5, 162, 20));
		}
		return txtNome;
	}

	/**
	 * This method initializes txtSigla	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSigla() {
		if (txtSigla == null) {
			txtSigla = new JTextField();
			txtSigla.setBounds(new Rectangle(257, 5, 43, 20));
		}
		return txtSigla;
	}

	/**
	 * This method initializes txtRegiao	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtRegiao() {
		if (txtRegiao == null) {
			txtRegiao = new JTextField();
			txtRegiao.setBounds(new Rectangle(353, 6, 119, 20));
		}
		return txtRegiao;
	}

	/**
	 * This method initializes btnAlterar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnAlterar() {
		if (btnAlterar == null) {
			btnAlterar = new JButton();
			btnAlterar.setBounds(new Rectangle(374, 164, 89, 29));
			btnAlterar.setText("ALTERAR");
		}
		return btnAlterar;
	}

	/**
	 * This method initializes scrollPaneTabelaEstado	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getScrollPaneTabelaEstado() {
		if (scrollPaneTabelaEstado == null) {
			scrollPaneTabelaEstado = new JScrollPane();
			scrollPaneTabelaEstado.setBounds(new Rectangle(11, 34, 466, 109));
			scrollPaneTabelaEstado.setViewportView(getTbEstado());
		}
		return scrollPaneTabelaEstado;
	}

	/**
	 * This method initializes tbEstado	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTbEstado() {
		if (tbEstado == null) {
			String[] cabecalho = {"Nome", "Sigla", "Região"};
			String[][] dados = {{"São Paulo","SP","Sudeste"},
								{"Rio de Janeiro","RJ","Sudeste"},
								{"Acre","AC","Norte",},
								{"Paraná", "PR","Sul"}};
			tbEstado = new JTable(dados, cabecalho);
			tbEstado.setBounds(new Rectangle(5, 0, 463, 80));
		}
		return tbEstado;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ComponenteJTable_Avançado thisClass = new ComponenteJTable_Avançado();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public ComponenteJTable_Avançado() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(491, 238);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		this.setVisible(true);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lblRegiao = new JLabel();
			lblRegiao.setBounds(new Rectangle(304, 8, 44, 16));
			lblRegiao.setText("Região");
			lblSigla = new JLabel();
			lblSigla.setBounds(new Rectangle(215, 6, 38, 16));
			lblSigla.setText("Sigla");
			lblNome = new JLabel();
			lblNome.setBounds(new Rectangle(5, 5, 45, 20));
			lblNome.setName("jNome");
			lblNome.setText("Nome:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getBtnExcluir(), null);
			jContentPane.add(getTxtNome(), null);
			jContentPane.add(lblNome, null);
			jContentPane.add(lblSigla, null);
			jContentPane.add(getTxtSigla(), null);
			jContentPane.add(lblRegiao, null);
			jContentPane.add(getTxtRegiao(), null);
			jContentPane.add(getBtnAlterar(), null);
			jContentPane.add(getScrollPaneTabelaEstado(), null);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="140,34"
