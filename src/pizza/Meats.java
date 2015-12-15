package pizza;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Meats extends Toppings {
	
	String ToppingName = "redsauce.png"; 
	ImageIcon ToppingImage = new ImageIcon(ToppingName);


protected static JLabel pepp(JLabel crust) {
	
	
	JLabel pepperoni = new JLabel(new ImageIcon("pepperoni.png"));
	crust.add(pepperoni,4,0);
	pepperoni.setBounds(XPosition, YPosition, width, height);
	
	return(pepperoni); 
} 

protected static JLabel bacon(JLabel crust) {
	
	JLabel bacon = new JLabel(new ImageIcon("canadianbacon.png"));
	crust.add(bacon,5,0);
	bacon.setBounds(XPosition, YPosition, width, height);
	
	return(bacon); 
} 

protected static JLabel sausage(JLabel crust) {
	
	JLabel sausage = new JLabel(new ImageIcon("sausage.png"));
	crust.add(sausage,6,0);
	sausage.setBounds(XPosition, YPosition, width, height);
	
	return(sausage); 
} 

}