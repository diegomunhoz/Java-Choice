package exemplo_005_Plus_Java;

/**
 * Classe Responsavel por exemplificar a utilização do JAVA2D junta bolinha 
 * @author Diego Munhoz
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java2D {

		private int x = 70;
		private int y = 70;
		private int a = 200;
		private int b = 200;
		private int c = 70;
		private int d = 70;
		private JFrame frame;
		public static void main(String args[]) {
			Java2D gui = new Java2D();
			gui.iniciaGui();
		}
		public void iniciaGui() {
			MeuPainel painel = new MeuPainel();
			frame = new JFrame("Aprendendo GUI");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(painel);
			frame.setSize(350, 380);
			frame.setVisible( true );
			for(int i=0; i < 150; i++) {
				x++;
				y++;
				painel.repaint();
				try {
					Thread.sleep(1);
				} catch (Exception ex) {}
			}
			for(int i=0; i < 150; i++) {
				a--;
				b--;
				painel.repaint();
				try {
					Thread.sleep(1);
				} catch (Exception ex) {}
			}
			
			for(int i=0; i < 150; i++) {
				c--;
				d++;
				painel.repaint();
				try {
					Thread.sleep(1);
				} catch (Exception ex) {}
			}
		}
		public class MeuPainel extends JPanel {
			/**
			 * 
			 */
			private static final long serialVersionUID = -6589230233551585308L;

			public void paintComponent(Graphics g) {
//				Apaga da posição atual
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
//				Desenha na nova posição
				g.setColor(Color.BLACK);
				g.fillOval(x, y, 50, 50);
				
//				Desenha na nova posição
				g.setColor(Color.RED);
				g.fillOval(a, b, 50, 50);
				
				g.setColor(Color.BLUE);
				g.fillOval(c, d, 50, 50);
			}
			
		}
	}




