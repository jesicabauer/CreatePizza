package pizza;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Toppings {
	
	protected JLabel ToppingsLabel = new JLabel(); 
	protected String ToppingName = new String(); 
	protected ImageIcon ToppingImage = new ImageIcon(); 
	protected static int XPosition = 0;
	protected static int YPosition = -30;
	protected static int width = 400;
	protected static int height = 534; 
	
	protected void addTopping() {
		
		ToppingsLabel.setIcon(ToppingImage);
		ToppingsLabel.setBounds(XPosition, YPosition,ToppingImage.getIconWidth(),ToppingImage.getIconHeight());
		ToppingsLabel.setVisible(true);
		
	}
	
}
