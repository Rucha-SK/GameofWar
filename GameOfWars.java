//package GameOfWar;
import java.util.*;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

 class GameOfWars {
	
	Random random = new Random();
	

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOfWars window = new GameOfWars();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameOfWars() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		Scanner sc=new Scanner(System.in);
		war1 w=new war1();
		System.out.println("Game starts!!");
    int play=1;

    System.out.println("1.Play game with no user input\n2.Play game with continuous user input");
    System.out.println("Enter your choice");
    
    int ch=sc.nextInt();
    if(ch==1){
        while(play!=0){
            play=w.WarGame();
            System.out.println();
        }
    }
    if(ch==2){
       
    while(play!=0){
        
        System.out.println("Press 1 to continue game and draw cards and 0 to quit game");

        int p=sc.nextInt();
       
        
       
        if(p==1){
            
            play=w.WarGame();
            System.out.println();
        }
        else if(p==0){

            System.out.println("Game ends");
            w.abruptEnd();
            
            return;
        }
        else{
            System.out.println("Enter valid key");
        }
        
    }
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(38, 176, 55));
		frame.setBackground(new Color(41, 190, 61));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel card1 = new JLabel("Player 1");
		card1.setBounds(10, 11, 100, 147);
		frame.getContentPane().add(card1);
		
		
		JLabel card2 = new JLabel("Player 2");
		card2.setBounds(312, 11, 100, 147);
		frame.getContentPane().add(card2);
		
		
		
		JLabel lblNewLabel = new JLabel("GAME OF WARS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(148, 87, 135, 41);
		frame.add(lblNewLabel);
		
		DeckImage deckImage = new DeckImage();
				
				int suit1 = random.nextInt(4);
				int ordinal1 = random.nextInt(13);
				
				BufferedImage cardImage1 = deckImage.getImage(suit1, ordinal1);
				card1.setIcon(new ImageIcon("A_D.png"));
				
				int suit2 = random.nextInt(4);
				int ordinal2 = random.nextInt(13);
				
				BufferedImage cardImage2 = deckImage.getImage(suit2, ordinal2);
				card2.setIcon(new ImageIcon(cardImage2));
				
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int suit1 = random.nextInt(4);
				int ordinal1 = random.nextInt(13);
				
				BufferedImage cardImage1 = deckImage.getImage(suit1, ordinal1);
				card1.setIcon(new ImageIcon(cardImage1));
				
				int suit2 = random.nextInt(4);
				int ordinal2 = random.nextInt(13);
				
				BufferedImage cardImage2 = deckImage.getImage(suit2, ordinal2);
				card2.setIcon(new ImageIcon(cardImage2));
				
			}
		});
		

		
		
		
		
		
		
		
	}
}
 }

