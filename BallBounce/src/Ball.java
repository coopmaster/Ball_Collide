import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 *<b>Ball Object</b>
 *<p>Ball that moves accrossed the screen until it meets another ball.</p>
 *<p></p>
 * @author Cooper Mahring
 */
public class Ball extends JComponent{
	
	int x = 150;
	int y = 150;
	int speedX;
	int speedY;
	Rectangle ball;

	public Ball(int startx, int starty, int speedx, int speedy) {
		super();
		speedX = speedx;
		speedY = speedy;
		x = startx;
		y = starty;
		setBounds(x,y,10,10);
		ball = new Rectangle(100,100,10,10);
		
	}
	
	public void draw(Graphics g, Color color){
		g.setColor(color);
		setBounds(x,y,10,10);
		g.fillOval(x,y,10,10);
	}
	
	public void updateMath(int testforX,int testforY){
		setBounds(x,y,10,10);
		if((testforX+10>x&&testforX-10<x)){
			System.out.println("Whoa");
			speedX = speedX * -1;
			speedY = speedY * -1;
		}
		x+=speedX;
		y+=speedY;
	}

}
