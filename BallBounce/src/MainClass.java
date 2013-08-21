import javax.swing.JFrame;

/**
 * 
 */

/**
 * <b>Main Class</b>
 * <p>Main Class</p>
 * <p></p>
 * @author Cooper Mahring
 */
public class MainClass {
	
	JFrame frame;
	GUI gui;

	public MainClass() {
		frame = new JFrame("Ball Bouncing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setResizable(false);
		frame.setVisible(true);
		
		gui = new GUI();
		frame.add(gui);
		
		while(true){
			gui.update();
			try {
				gui.repaint();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MainClass();
	}

}
