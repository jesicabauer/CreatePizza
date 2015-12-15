package pizza; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.JRadioButtonMenuItem;
 
public class CheckBoxes extends JFrame {
	
	protected static PrintWriter receipt; 
     
    public CheckBoxes() throws FileNotFoundException, UnsupportedEncodingException {
        
    	receipt = new PrintWriter("Receipt.txt", "UTF-8");
    	JLabel crust = new JLabel(new ImageIcon("base.png"));
    	add(crust);
        setTitle("Create Your Own Pizza");
        setSize(400, 534);
        setLocationRelativeTo(null);
        setResizable(false);
         
        // Creates a menubar for a JFrame
        JMenuBar menuBar = new JMenuBar();
         
        // Add the menubar to the frame
        setJMenuBar(menuBar);
         
        // Define and add two drop down menu to the menubar
        JMenu fileMenu = new JMenu("File");
        JMenu sauceMenu = new JMenu("Sauce");
        JMenu meatMenu = new JMenu("Meat");
        JMenu veggieMenu = new JMenu("Vegetables");
        JMenu premadeMenu = new JMenu("Premade");
        menuBar.add(fileMenu);
        menuBar.add(sauceMenu);
        menuBar.add(meatMenu);
        menuBar.add(veggieMenu);
        menuBar.add(premadeMenu);
         
        // Create and add simple menu item to one of the drop down menu
        JMenuItem newAction = new JMenuItem("New");
        //JMenuItem loadAction = new JMenuItem("Load");
        JMenuItem saveAction = new JMenuItem("Save"); 
        JMenuItem quitAction = new JMenuItem("Quit"); 
        
        JMenuItem redAction = new JMenuItem("Add Red Sauce");
        JMenuItem whiteAction = new JMenuItem("Add White Sauce");
        JMenuItem cheeseAction = new JMenuItem("Add Cheese");
        
        JMenuItem peppAction = new JMenuItem("Add Pepperoni");
        JMenuItem baconAction = new JMenuItem("Add Ham");
        JMenuItem sausageAction = new JMenuItem("Add Sausage");
        
        JMenuItem mushroomAction = new JMenuItem("Add Mushrooms");
        JMenuItem peppersAction = new JMenuItem("Add Peppers");
        JMenuItem olivesAction = new JMenuItem("Add Olives");
        JMenuItem pineappleAction = new JMenuItem("Add Pineapple");
        
        JMenuItem supremeAction = new JMenuItem("Supreme");
        JMenuItem hawaiianAction = new JMenuItem("Hawaiian"); 
        JMenuItem meatAction = new JMenuItem("Meat Lovers");
        JMenuItem veggeAction = new JMenuItem("Veggie Lovers"); 
         

        fileMenu.add(newAction);
        //fileMenu.add(loadAction);
        fileMenu.add(saveAction);
        fileMenu.addSeparator();
        fileMenu.add(quitAction);
        
        sauceMenu.add(redAction);
        sauceMenu.add(whiteAction);
        sauceMenu.add(cheeseAction);
        
        meatMenu.add(peppAction);
        meatMenu.add(baconAction);
        meatMenu.add(sausageAction);
        
        veggieMenu.add(mushroomAction);
        veggieMenu.add(peppersAction);
        veggieMenu.add(olivesAction);
        veggieMenu.add(pineappleAction); 
        
        premadeMenu.add(supremeAction); 
        premadeMenu.add(hawaiianAction); 
        premadeMenu.add(meatAction); 
        premadeMenu.add(veggeAction); 
        
        // Add a listener to the New menu item. actionPerformed() method will
        // invoked, if user triggred this menu item
        // fileMenu buttons
        newAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
            	crust.removeAll(); 
            	crust.revalidate();
        		crust.repaint(); 
        		receipt.close(); 
        		try {
					receipt = new PrintWriter("Receipt.txt", "UTF-8");
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
            }
        });
        
        saveAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
            	receipt.close(); 
                
            }
        });
        
        quitAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

            	receipt.close();
            	System.exit(0);
            	
            }
        });
        
        
        // sauceMenu buttons
        redAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Sauce.red(crust);
            	receipt.println("Red Sauce");
            	
            }
        });
        
        whiteAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Sauce.white(crust);
            	receipt.println("White Sauce");
            	
            }
        });
        
        cheeseAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Sauce.cheese(crust); 
            	receipt.println("Cheese");
            	
            }
        });
        
        //meatMenu buttons
        peppAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Meats.pepp(crust); 
            	receipt.println("Pepperoni");
            	
            }
        });
        
        baconAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Meats.bacon(crust); 
            	receipt.println("Canadian Bacon");
            	
            }
        });
        
        sausageAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Meats.sausage(crust); 
            	receipt.println("Sausage");
            	
            }
        });
        
        //veggieMenu buttons
        mushroomAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Vegetables.mushroom(crust); 
            	receipt.println("Mushrooms");
            	
            }
        });
        
        peppersAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Vegetables.peppers(crust); 
            	receipt.println("Peppers");
            	
            }
        });
        
        olivesAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Vegetables.olives(crust); 
            	receipt.println("Olives");
            	
            }
        });
        
        pineappleAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	Vegetables.pineapple(crust);
            	receipt.println("Pineapple");
            	
            }
        });
        
        supremeAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	crust.removeAll(); 
            	crust.revalidate();
        		crust.repaint(); 
            	JLabel[] supreme = new JLabel[]{Sauce.red(crust), Sauce.cheese(crust), Meats.pepp(crust), 
            			Meats.sausage(crust), Vegetables.mushroom(crust), Vegetables.olives(crust), Vegetables.peppers(crust)};
            	
            	for (int i=0; i<supreme.length; i++) {
            		JLabel make = supreme[i];
            	}
            	
            	receipt.close(); 
        		try {
					receipt = new PrintWriter("Receipt.txt", "UTF-8");
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            	receipt.println("(1) Supreme Pizza");
            	
            }
        });
        
        hawaiianAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	crust.removeAll(); 
            	crust.revalidate();
        		crust.repaint();  
            	JLabel[] hawaiian = new JLabel[]{Sauce.red(crust), Sauce.cheese(crust), Meats.bacon(crust), 
            			Vegetables.pineapple(crust)};
            	
            	for (int i=0; i<hawaiian.length; i++) {
            		JLabel make = hawaiian[i];
            	}
            	
            	
            	receipt.close(); 
        		try {
					receipt = new PrintWriter("Receipt.txt", "UTF-8");
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	receipt.println("(1) Hawaiian Pizza");
            	
            }
        });
        
        meatAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	crust.removeAll(); 
            	crust.revalidate();
        		crust.repaint();  
            	JLabel[] meatlovers = new JLabel[]{Sauce.red(crust), Sauce.cheese(crust), Meats.pepp(crust), 
            			Meats.bacon(crust), Meats.sausage(crust)};
            	
            	for (int i=0; i<meatlovers.length; i++) {
            		JLabel make = meatlovers[i];
            	}
            	
            	
            	receipt.close(); 
        		try {
					receipt = new PrintWriter("Receipt.txt", "UTF-8");
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	receipt.println("(1) Meat Lovers");
            	
            }
        });
        
        veggeAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	crust.removeAll(); 
            	crust.revalidate();
        		crust.repaint();  
            	JLabel[] veggieslovers = new JLabel[]{Sauce.red(crust), Sauce.cheese(crust), Vegetables.mushroom(crust), 
            			Vegetables.olives(crust), Vegetables.peppers(crust)};
            	
            	for (int i=0; i<veggieslovers.length; i++) {
            		JLabel make = veggieslovers[i];
            	}
            	
            	receipt.close(); 
        		try {
					receipt = new PrintWriter("Receipt.txt", "UTF-8");
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	receipt.println("(1) Veggie Lovers");
            	
            }
        });
        
    }
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    	
        CheckBoxes me = new CheckBoxes();
        me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        me.setVisible(true);
       
    }

    

}