import java.util.*;
import javax.swing.*;
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


class war2 {

    static JLabel l2,l3,l4,l5,card1,card2,card3;
    static JFrame f=new JFrame("Game of War");
    static JButton b1p1,b2p1,b3p1,b4p1,b1p2,b2p2,b3p2,b4p2;
    

    public Queue<card> Qplayer1;
    public Queue<card> Qplayer2;

    war2(){
       
        f.getContentPane().setBackground(new Color(38, 176, 55));
		f.setBackground(new Color(41, 190, 61));
		f.setBounds(100, 100, 450, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
   
        Scanner sc=new Scanner(System.in);
        
        Qplayer1 = new LinkedList<card>();
		Qplayer2 = new LinkedList<card>();
        JLabel l2;
        l2=new JLabel("1.Press 1 to distribute a deck of 52 cards to each of you");  
        l2.setBounds(50,50, 100,30);  
        l2.setVisible(true);
        
        System.out.println("1.Press 1 to distribute a deck of 52 cards to each of you");
        System.out.println("2.Press 2 to distribute half of the deck to each of you");
        int ch=sc.nextInt();
        if(ch==1){
            MakeDeck m1=new MakeDeck();
        MakeDeck m2=new MakeDeck();
        m1.Shuffle();
        m2.Shuffle();
            for(int i=0;i<52;i++){
                Qplayer1.add(m1.drawCardFromDeck());
                Qplayer2.add(m2.drawCardFromDeck());
            }
            System.out.println("Now each of you have 52 cards");
            //System.out.println("Player 1 cards:");
            //System.out.println(Qplayer1);
        }
            if(ch==2){
                MakeDeck m1=new MakeDeck();
                m1.Shuffle();
                for (int i = 0; i < 52; i++) {
                    if (i % 2 != 0) {
                        Qplayer1.add(m1.drawCardFromDeck());
                    } else {
                        Qplayer2.add(m1.drawCardFromDeck());
                    }
            }
            System.out.println("Now each of you have 26 cards");
            //System.out.println("Player 1 cards:");
            //System.out.println(Qplayer1);
            //System.out.println("Player 1 cards:");
            //System.out.println(Qplayer2);
        }
    

    
}


public int WarGame(){
    card c=new card();
   
    

    if (Qplayer1.isEmpty()) {
        System.out.println("Player 2 wins!");
        return 0;
    } else if (Qplayer2.isEmpty()) {
        System.out.println("Player 1 wins!");
        return 0;
    }
     else {
        

    card1 = new JLabel("Player 1");
    card1.setBounds(10, 11, 100, 147);
    f.add(card1);
    
    
     card2 = new JLabel("Player 2");
    card2.setBounds(312, 11, 100, 147);
    f.add(card2);
        

        card one = Qplayer1.remove();
        card two = Qplayer2.remove();

        card one1=one;
        card two2=two;
        
       
		DeckImage deckImage = new DeckImage();

                int suit1=one1.s;
                
				int ordinal1 =one1.value-1;

                int suit2 = two2.s;
				int ordinal2 = two2.value-1;

                Icon ic1=new ImageIcon("A_S.png");  
                Icon ic2=new ImageIcon("A_H.png");  
                Icon ic3=new ImageIcon("A_D.jpg");  
                Icon ic4=new ImageIcon("A_C.png");  
                
                              if(suit1==0 ){
                                b1p1=new JButton(ic1);
                                b1p1.setBounds(10, 11, 100, 147);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              
                              }
                              if(suit1==1 ){
                                b2p1=new JButton(ic2);
                                b2p1.setBounds(10, 11, 100, 147); 
                                f.add(b2p1);
                                b2p1.revalidate();
                                b2p1.repaint();
                                 
                              }
                              if(suit1==2){
                                b3p1=new JButton(ic3);
                                b3p1.setBounds(10, 11, 100, 147);  
                                f.add(b3p1);
                                b3p1.revalidate();
                                b3p1.repaint();
                              }
                              if(suit1==3 ){
                                b4p1=new JButton(ic4);
                                b4p1.setBounds(10, 11, 100, 140);  
                                f.add(b4p1);
                                b4p1.revalidate();
                                b4p1.repaint();
                              }
                
                              if(suit2==0 ){
                                b1p2=new JButton(ic1);
                                b1p2.setBounds(312, 11, 100, 147);  
                                
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                              }
                              if(suit2==1 ){
                                b2p2=new JButton(ic2);
                                b2p2.setBounds(312, 11, 100, 147);
                                f.add(b2p2);
                                b2p2.revalidate();
                                b2p2.repaint();
                
                              }
                              if(suit2==2  ){
                                b3p2=new JButton(ic3);
                                b3p2.setBounds(312, 11, 100, 147);
                                f.add(b3p2);
                                b3p2.revalidate();
                                b3p2.repaint();
                              }
                              if(suit2==3 ){
                                b4p2=new JButton(ic4);
                                b4p2.setBounds(312, 11, 100, 140);
                                f.add(b4p2);
                                b4p2.revalidate();
                                b4p2.repaint();
                              }
                             

              
                  
                
		
			System.out.println("Card drawn by player 1: "+one);
			System.out.println("Card drawn by player 2: "+two);
            
			
			if (c.compareCards(one,two) > 0) {
				Qplayer1.add(one);
				Qplayer1.add(two);
                System.out.println("Player 1 takes both the cards");
			} else if (c.compareCards(one,two) < 0) {
				Qplayer2.add(one);
				Qplayer2.add(two);
                System.out.println("Player 2 takes both the cards");
			} else {
				tie(one, two);
			}
            
			//System.out.println("Player 1 cards:");
			//System.out.println(Qplayer1);
            //System.out.println("Player 2 cards:");
			//System.out.println(Qplayer2);
            return 1;
			
		}
    
}

public void tie(card one, card two) {
    card c=new card();
    Stack<card> tiebreaker = new Stack<card>();
    boolean isTie = false;
    if (Qplayer1.size() < 4) {
        card1=new JLabel("Player 2 wins!!");
        card1.setBounds(10,100, 250,40);
        f.add(card1);  
            System.out.println("Player 2 wins!!");
            return;
    } 
    if (Qplayer2.size() < 4) {
        System.out.println("Player 1 wins!!");
        card1=new JLabel("Player 1 wins!!");
        return;
    }
    do {
       
        tiebreaker.push(one);
        tiebreaker.push(two);
        System.out.println("One..");
        tiebreaker.push(Qplayer1.remove());
        tiebreaker.push(Qplayer2.remove());
        System.out.println("Two..");
        tiebreaker.push(Qplayer1.remove());
        tiebreaker.push(Qplayer2.remove());
        System.out.println("Three..");
        tiebreaker.push(Qplayer1.remove());
        tiebreaker.push(Qplayer2.remove());
        System.out.println("War declared");
        one = Qplayer1.remove();
        two = Qplayer2.remove();
        System.out.println("Player 1 card: "+one);
        System.out.println("Player 2 card: "+two);
        if (c.compareCards(one,two) > 0) {
            isTie = false;
            while(!tiebreaker.empty()){
                Qplayer1.add(tiebreaker.pop());
            }
            Qplayer1.add(one);
            Qplayer1.add(two);
            System.out.println("Player 1 takes all the 10 cards!!!");
            
        } else if (c.compareCards(one,two) < 0) {
            isTie = false;
            while(!tiebreaker.empty()){
                Qplayer2.add(tiebreaker.pop());
            }
            Qplayer2.add(one);
            Qplayer2.add(two);
            System.out.println("Player 2 takes all the 10 cards!!!");
        } else {
            isTie = true;
            System.out.println("Again tie...again a war");
        }
    } while (isTie);
}

public void abruptEnd(){
    int player1cards=Qplayer1.size(),player2cards=Qplayer2.size();
    
    System.out.println("Cards with player 1: "+player1cards);
    System.out.println("Cards with player 2: "+player2cards);
    if(player1cards>player2cards){
        System.out.println("Player 1 is the winner as he/she has more cards");

    }
    else if(player2cards>player1cards){
        System.out.println("Player 2 is the winner as he/she has more cards");
    }
    else{
        System.out.println("It's a tie");
    }

}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    war2 w=new war2();
    JLabel l1;  
    l1=new JLabel("Game starts!!");  
    l2=new JLabel("1.Play game with no user input");
    l3=new JLabel("2.Play game with continuous user input");
    l1.setBounds(10,50, 100,30);
    l2.setBounds(10,100, 250,40);  
    l3.setBounds(10,120, 250,40);  
    f.add(l1);
    f.add(l2);
    f.add(l3);
    
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    
    System.out.println("Game starts!!");
    int play=1;
    l1.setForeground(new Color(0, 0,0,0));
    l2.setForeground(new Color(0, 0,0,0));
    l3.setForeground(new Color(0, 0,0,0));

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
        l4=new JLabel("Press 1 to continue game and draw cards and 0 to quit game");  
        f.add(l4);
        l4.setBounds(10,150,350,40);  
     
        System.out.println("Press 1 to continue game and draw cards and 0 to quit game");
       

        int p=sc.nextInt();
        l4.setForeground(new Color(0, 0,0,0));
       
        if(p==1){
            
            play=w.WarGame();
            //card1.setVisible(false);
            System.out.println();
        }
        else if(p==0){
            l5=new JLabel("Game Ends!!");  
            f.add(l5);
            
            l5.setBounds(10,110,350,40); 
            
            System.out.println("Game ends");
            w.abruptEnd();
            
            
            return;
        }
        else{
            System.out.println("Enter valid key");
        }
        
    }
}
    
}
}
