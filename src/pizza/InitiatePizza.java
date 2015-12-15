package pizza; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InitiatePizza extends JFrame {
	
	static InitiatePizza pizza = new InitiatePizza();
	
	Sauce red = new Sauce(); 
	JButton start = new JButton("New");
	JButton load = new JButton("Load");
	
    public static void main(String[] args) {
        
        	pizza.setLocationRelativeTo(null);
            pizza.setVisible(true);
            pizza.setSize(400,534);
       
    }
    
    protected InitiatePizza() {
    	
    	JLabel crust = new JLabel(new ImageIcon("base.png"));
    	add(crust);
    	start.setPreferredSize(new Dimension(40, 40));
    	//add(start);
    	//add(load);
    	pack(); 
    	setTitle("Create a New Pizza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        
    }
}