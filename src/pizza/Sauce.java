package pizza;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sauce extends Toppings {
	
	String ToppingName = "redsauce.png"; 
	ImageIcon ToppingImage = new ImageIcon(ToppingName);



protected static JLabel red(JLabel crust) {
	
	JLabel redsauce = new JLabel(new ImageIcon("redsauce.png"));
	crust.add(redsauce,2,0);
	redsauce.setBounds(XPosition, YPosition, width, height);
	
	return(redsauce); 
} 

protected static JLabel white(JLabel crust) {
	
	JLabel whitesauce = new JLabel(new ImageIcon("whitesauce.png"));
	crust.add(whitesauce,1,0);
	whitesauce.setBounds(XPosition, YPosition, width, height);
	
	return(whitesauce); 
} 

protected static JLabel cheese(JLabel crust) {
	
	JLabel cheese = new JLabel(new ImageIcon("cheese.png"));
	crust.add(cheese,3,0);
	cheese.setBounds(XPosition, YPosition, width, height);
	
	
	return(cheese); 
} 

}