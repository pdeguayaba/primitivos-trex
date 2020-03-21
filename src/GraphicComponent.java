/*
 * Edwin J. Estrella Ayala
 * A00549508
 * Graficas por Computadoras - COMP 3600 (70858)
 * Introducción a los Primitivos Gráficos 
 */
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class GraphicComponent extends JComponent{
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		/*
		 * Head
		 */
		Rectangle head = new Rectangle(50, 50, 60, 35);
		g2.draw(head);
		Rectangle eye = new Rectangle(90, 55, 10, 10);
		g2.draw(eye);
		Rectangle mouth1 = new Rectangle(110, 50, 40, 12);
		g2.draw(mouth1);
		Rectangle mouth2 = new Rectangle(110, 72, 40, 13);
		g2.draw(mouth2);
		
		/*
		 * Body
		 */
		Rectangle body = new Rectangle(50, 95, 60, 200);
		g2.draw(body);
		Rectangle arm = new Rectangle(90, 170, 50, 12);
		g2.draw(arm);
		Rectangle hand1 = new Rectangle(140, 160, 30, 10);
		g2.draw(hand1);
		Rectangle hand2 = new Rectangle(140, 180, 30, 10);
		g2.draw(hand2);
		
		/*
		 * Leg
		 */
		Rectangle leg1 = new Rectangle(65, 245, 30, 70);
		g2.draw(leg1);
		Rectangle leg2 = new Rectangle(75, 315, 10, 50);
		g2.draw(leg2);
		Rectangle foot = new Rectangle(85, 355, 30, 10);
		g2.draw(foot);

	}
	
	public static void main(String[] args) {
		JFrame marco = new JFrame("Marco");
		marco.setSize(640, 480);
		marco.setTitle("Introduccion a los Primitivos Graficos");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
		GraphicComponent grafico = new GraphicComponent();
		marco.add(grafico);
	}

}
