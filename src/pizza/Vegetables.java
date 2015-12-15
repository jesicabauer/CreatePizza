package pizza;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Vegetables extends Toppings {
	
	String ToppingName = "redsauce.png"; 
	ImageIcon ToppingImage = new ImageIcon(ToppingName);


protected static JLabel mushroom(JLabel crust) {
	
	JLabel mushroom = new JLabel(new ImageIcon("mushrooms.png"));
	crust.add(mushroom,6,0);
	mushroom.setBounds(XPosition, YPosition, width, height);
	
	return(mushroom); 
} 

protected static JLabel peppers(JLabel crust) {
	
	JLabel peppers = new JLabel(new ImageIcon("peppers.png"));
	crust.add(peppers,7,0);
	peppers.setBounds(XPosition, YPosition, width, height);
	
	
	return(peppers); 
} 

protected static JLabel olives(JLabel crust) {
	
	JLabel olives = new JLabel(new ImageIcon("olive.png"));
	crust.add(olives,8,0);
	olives.setBounds(XPosition, YPosition, width, height);
	
	return(olives); 
} 

protected static JLabel pineapple(JLabel crust) {
	
	JLabel pineapple = new JLabel(new ImageIcon("pineapple.png"));
	crust.add(pineapple,9,0);
	pineapple.setBounds(XPosition, YPosition, width, height);
	
	return(pineapple); 
} 

}