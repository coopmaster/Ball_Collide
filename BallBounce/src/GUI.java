import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * <b>Main Class</b>
 * <p>Main Class</p>
 * <p></p>
 * @author Cooper Mahring
 */
public class GUI extends JPanel{
	
	Ball ball1 = new Ball(15,250,5,0);
	Ball ball2 = new Ball(475,250,-5,0);
	

	public GUI() {
		super(null);
		setSize(500,500);
		setVisible(true);
		
		add(ball1);
		add(ball2);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.black);
		ball1.draw(g,Color.black);
		ball2.draw(g,Color.blue);
	}
	
	public void update(){
		ball1.updateMath(ball2.getX(),ball2.getY());
		ball2.updateMath(ball1.getX(), ball1.getY());
		System.out.println(ball1.getX()+"  "+ball1.getY());
		System.out.println(ball2.getX()+"  "+ball2.getY());
	}

}
