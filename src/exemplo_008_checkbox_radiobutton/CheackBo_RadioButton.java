package exemplo_008_checkbox_radiobutton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * 
 * @author Diego Munhoz
 */
public class CheackBo_RadioButton extends JFrame {

	private JCheckBox cbAzul = null;
	private JCheckBox cbAmarela = null;
	
	private JRadioButton rbAmarelo = null;
	private JRadioButton rbVermelho = null;
	private JRadioButton rbNeutro = null;
	private ButtonGroup bgCores = null;
	private Color corPadrao = null;
	
	
	public ButtonGroup getBgCores() {
		if (bgCores == null) {
			bgCores = new ButtonGroup();
		}
		return bgCores;
	}
	
	
	public JCheckBox getCbAmarela() {
		if (cbAmarela == null) {
			cbAmarela = new JCheckBox("Amarela");
			cbAmarela.setBounds(100,45,100,20);
			cbAmarela.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					getRegraDeCoresCheckBox();
				}
				
			});
		}
		return cbAmarela;
	}


	public JCheckBox getCbAzul() {
		if (cbAzul == null) {
			cbAzul = new JCheckBox("Azul");
			cbAzul.setBounds(100,20,100,20);
			cbAzul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					getRegraDeCoresCheckBox();
				}
				
			});
		}
		return cbAzul;
	}


	public JRadioButton getRbAmarelo() {
		if (rbAmarelo == null) {
			rbAmarelo = new JRadioButton("Amarelo");
			rbAmarelo.setBounds(5,150,90,20);
			getBgCores().add(rbAmarelo);
			rbAmarelo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					controlerCheckBox(Color.YELLOW);
				}
			});
			
		}
		return rbAmarelo;
	}

	
	public JRadioButton getRbVermelho() {
		if (rbVermelho == null) {
			rbVermelho = new JRadioButton("Vermelho");
			rbVermelho.setBounds(100,150,90,20);
			getBgCores().add(rbVermelho);
			rbVermelho.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					controlerCheckBox(Color.RED);
				}
			});
		
		}
		return rbVermelho;
	}

	
	public JRadioButton getRbNeutro() {
		if (rbNeutro == null) {
			rbNeutro = new JRadioButton("Neutro");
			rbNeutro.setBounds(195,150,70,20);
			rbNeutro.setSelected(true);
			getBgCores().add(rbNeutro);
			rbNeutro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					controlerCheckBox(getCorPadrao());
				}
				
			});
		}
		return rbNeutro;
	}

	
	public Color getCorPadrao() {

		return corPadrao;
	}
	
	
	public void getRegraDeCoresCheckBox() {
		getRbNeutro().setSelected(true);
		
		if (getCbAmarela().isSelected() && !getCbAzul().isSelected()) {
			getContentPane().setBackground(Color.YELLOW);
		} else if (!getCbAmarela().isSelected() && getCbAzul().isSelected()){
			getContentPane().setBackground(Color.BLUE);
		} else if (getCbAmarela().isSelected() && getCbAzul().isSelected()) {
			getContentPane().setBackground(Color.GREEN);
		} else {
			getContentPane().setBackground(getCorPadrao());
		}
	}
	
	
	public void controlerCheckBox(Color cor) {
		getCbAmarela().setSelected(false);
		getCbAzul().setSelected(false);
		getContentPane().setBackground(cor);
	}
	
	
	public void setCorpadrao() {
		if (corPadrao == null) {
			corPadrao = getContentPane().getBackground();
		}
	}
	
	
	public void iniciarTela() {
		this.setSize(300,300);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setCorpadrao();
		
		this.getContentPane().add(getCbAmarela());
		this.getContentPane().add(getCbAzul());
		this.getContentPane().add(getRbAmarelo());
		this.getContentPane().add(getRbVermelho());
		this.getContentPane().add(getRbNeutro());
		
		this.setVisible(true);
	}


	public static void main(String[] args) {
		new CheackBo_RadioButton().iniciarTela();
	}


}
