import java.util.*;
import javax.swing.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;



class war1 {

    static JLabel l2,l3,l4,l5,card1,card2,card3;
    static JFrame f=new JFrame("Game of War");
    static JButton b1p1,b2p1,b3p1,b4p1,b1p2,b2p2,b3p2,b4p2;
    

    public Queue<card> Qplayer1;
    public Queue<card> Qplayer2;

    war1(){
       
         
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
    card1.setBounds(20, 40, 100, 147);
    f.add(card1);
    
    
     card2 = new JLabel("Player 2");
    card2.setBounds(322, 40, 100, 147);
    f.add(card2);
        

        card one = Qplayer1.remove();
        card two = Qplayer2.remove();

        card one1=one;
        card two2=two;
       
                int suit1=one1.s;
                
				int r1 =one1.value;

                int suit2 = two2.s;
				int r2 = two2.value;

                Icon ic1=new ImageIcon("A_S.png");  
                Icon ic2=new ImageIcon("A_H.png");  
                Icon ic3=new ImageIcon("A_D.jpg");  
                Icon ic4=new ImageIcon("A_C.png");  
                Icon s2=new ImageIcon("s2.png"); 
                Icon s3=new ImageIcon("s3.png"); 
                Icon s4=new ImageIcon("s4.png");
                Icon s5=new ImageIcon("s5.png"); 
                Icon s6=new ImageIcon("s6.png");  
                Icon s7=new ImageIcon("s7.png"); 
                Icon s8=new ImageIcon("s8.png"); 
                Icon s9=new ImageIcon("s9.png"); 
                Icon s10=new ImageIcon("s10.png"); 
                Icon s11=new ImageIcon("s11.png"); 
                Icon s12=new ImageIcon("s12.png"); 
                Icon s13=new ImageIcon("s13.png"); 
                Icon h2=new ImageIcon("h2.png"); 
                Icon h3=new ImageIcon("h3.png"); 
                Icon h4=new ImageIcon("h4.png");
                Icon h5=new ImageIcon("h5.png"); 
                Icon h6=new ImageIcon("h6.png");  
                Icon h7=new ImageIcon("h7.png"); 
                Icon h8=new ImageIcon("h8.png"); 
                Icon h9=new ImageIcon("h9.png"); 
                Icon h10=new ImageIcon("h10.png"); 
                Icon h11=new ImageIcon("h11.png"); 
                Icon h12=new ImageIcon("h12.png"); 
                Icon h13=new ImageIcon("h13.png"); 
                Icon d2=new ImageIcon("d2.png"); 
                Icon d3=new ImageIcon("d3.png"); 
                Icon d4=new ImageIcon("d4.png");
                Icon d5=new ImageIcon("d5.png"); 
                Icon d6=new ImageIcon("d6.png");  
                Icon d7=new ImageIcon("d7.png"); 
                Icon d8=new ImageIcon("d8.png"); 
                Icon d9=new ImageIcon("d9.png"); 
                Icon d10=new ImageIcon("d10.png"); 
                Icon d11=new ImageIcon("d11.png"); 
                Icon d12=new ImageIcon("d12.png"); 
                Icon d13=new ImageIcon("d13.png"); 
                Icon c2=new ImageIcon("c2.png"); 
                Icon c3=new ImageIcon("c3.png"); 
                Icon c4=new ImageIcon("c4.png");
                Icon c5=new ImageIcon("c5.png"); 
                Icon c6=new ImageIcon("c6.png");  
                Icon c7=new ImageIcon("c7.png"); 
                Icon c8=new ImageIcon("c8.png"); 
                Icon c9=new ImageIcon("c9.png"); 
                Icon c10=new ImageIcon("c10.png"); 
                Icon c11=new ImageIcon("c11.png"); 
                Icon c12=new ImageIcon("c12.png"); 
                Icon c13=new ImageIcon("c13.png"); 
                
                              if(suit1==0 && r1==1){
                                b1p1=new JButton(ic1);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              
                              }
                              if(suit1==0 && r1==2){
                                b1p1=new JButton(s2);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==3){
                                b1p1=new JButton(s3);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==4){
                                b1p1=new JButton(s4);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==5){
                                b1p1=new JButton(s5);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==6){
                                b1p1=new JButton(s6);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==7){
                                b1p1=new JButton(s7);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==8){
                                b1p1=new JButton(s8);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==9){
                                b1p1=new JButton(s9);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==10){
                                b1p1=new JButton(s10);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==11){
                                b1p1=new JButton(s11);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==12){
                                b1p1=new JButton(s12);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==0 && r1==13){
                                b1p1=new JButton(s13);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==1){
                                b1p1=new JButton(ic2);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              
                              }
                              if(suit1==1 && r1==2){
                                b1p1=new JButton(h2);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==3){
                                b1p1=new JButton(h3);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==4){
                                b1p1=new JButton(h4);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==5){
                                b1p1=new JButton(h5);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==6){
                                b1p1=new JButton(h6);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==7){
                                b1p1=new JButton(h7);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==8){
                                b1p1=new JButton(h8);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==9){
                                b1p1=new JButton(h9);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==10){
                                b1p1=new JButton(h10);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==11){
                                b1p1=new JButton(h11);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==12){
                                b1p1=new JButton(h12);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==1 && r1==13){
                                b1p1=new JButton(h13);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==1){
                                b1p1=new JButton(ic3);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              
                              }
                              if(suit1==2 && r1==2){
                                b1p1=new JButton(d2);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==3){
                                b1p1=new JButton(d3);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==4){
                                b1p1=new JButton(d4);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==5){
                                b1p1=new JButton(d5);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==6){
                                b1p1=new JButton(d6);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==7){
                                b1p1=new JButton(d7);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==8){
                                b1p1=new JButton(d8);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==9){
                                b1p1=new JButton(d9);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==10){
                                b1p1=new JButton(d10);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==11){
                                b1p1=new JButton(d11);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==12){
                                b1p1=new JButton(d12);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                                
                              }
                              if(suit1==2 && r1==13){
                                b1p1=new JButton(d13);
                                b1p1.setBounds(10, 11, 71, 96);  
                                f.add(b1p1);
                                b1p1.revalidate();
                                b1p1.repaint();
                            }
                                
                                if(suit1==3 && r1==1){
                                    b1p1=new JButton(ic4);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  
                                  }
                                  if(suit1==3 && r1==2){
                                    b1p1=new JButton(c2);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==3){
                                    b1p1=new JButton(c3);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==4){
                                    b1p1=new JButton(c4);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==5){
                                    b1p1=new JButton(c5);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==6){
                                    b1p1=new JButton(c6);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==7){
                                    b1p1=new JButton(c7);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==8){
                                    b1p1=new JButton(c8);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==9){
                                    b1p1=new JButton(c9);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==10){
                                    b1p1=new JButton(c10);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==11){
                                    b1p1=new JButton(c11);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==12){
                                    b1p1=new JButton(c12);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }
                                  if(suit1==3 && r1==13){
                                    b1p1=new JButton(c13);
                                    b1p1.setBounds(10, 11, 71, 96);  
                                    f.add(b1p1);
                                    b1p1.revalidate();
                                    b1p1.repaint();
                                    
                                  }

                              if(suit2==1 && r2==1){
                                b1p2=new JButton(ic2);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              
                              }
                              if(suit2==1 && r2==2){
                                b1p2=new JButton(h2);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==3){
                                b1p2=new JButton(h3);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==4){
                                b1p2=new JButton(h4);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==5){
                                b1p2=new JButton(h5);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==6){
                                b1p2=new JButton(h6);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==7){
                                b1p2=new JButton(h7);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==8){
                                b1p2=new JButton(h8);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==9){
                                b1p2=new JButton(h9);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==10){
                                b1p2=new JButton(h10);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==11){
                                b1p2=new JButton(h11);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==12){
                                b1p2=new JButton(h12);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==1 && r2==13){
                                b1p2=new JButton(h13);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }

                              if(suit2==2 && r2==1){
                                b1p2=new JButton(ic3);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              
                              }
                              if(suit2==2 && r2==2){
                                b1p2=new JButton(d2);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==3){
                                b1p2=new JButton(d3);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==4){
                                b1p2=new JButton(d4);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==5){
                                b1p2=new JButton(d5);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==6){
                                b1p2=new JButton(d6);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==7){
                                b1p2=new JButton(d7);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==8){
                                b1p2=new JButton(d8);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==9){
                                b1p2=new JButton(d9);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==10){
                                b1p2=new JButton(d10);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==11){
                                b1p2=new JButton(d11);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==12){
                                b1p2=new JButton(d12);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2 && r2==13){
                                b1p2=new JButton(d13);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }


                              if(suit2==3 && r2==1){
                                b1p2=new JButton(ic4);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              
                              }
                              if(suit2==3 && r2==2){
                                b1p2=new JButton(c2);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==3){
                                b1p2=new JButton(c3);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==4){
                                b1p2=new JButton(c4);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==5){
                                b1p2=new JButton(c5);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==6){
                                b1p2=new JButton(c6);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==7){
                                b1p2=new JButton(c7);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==8){
                                b1p2=new JButton(c8);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==9){
                                b1p2=new JButton(c9);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==10){
                                b1p2=new JButton(c10);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==11){
                                b1p2=new JButton(c11);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==12){
                                b1p2=new JButton(c12);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==3 && r2==13){
                                b1p2=new JButton(c13);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==1){
                                b1p2=new JButton(ic1);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              
                              }
                              if(suit2==0 && r2==2){
                                b1p2=new JButton(s2);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==3){
                                b1p2=new JButton(s3);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==4){
                                b1p2=new JButton(s4);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==5){
                                b1p2=new JButton(s5);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==6){
                                b1p2=new JButton(s6);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==7){
                                b1p2=new JButton(s7);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==8){
                                b1p2=new JButton(s8);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==9){
                                b1p2=new JButton(s9);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==10){
                                b1p2=new JButton(s10);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==11){
                                b1p2=new JButton(s11);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==12){
                                b1p2=new JButton(s12);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==0 && r2==13){
                                b1p2=new JButton(s13);
                                b1p2.setBounds(312, 11, 71, 96);  
                                f.add(b1p2);
                                b1p2.revalidate();
                                b1p2.repaint();
                                
                              }
                              if(suit2==2  ){
                                b3p2=new JButton(ic3);
                                b3p2.setBounds(312, 11, 71, 96);
                                f.add(b3p2);
                                b3p2.revalidate();
                                b3p2.repaint();
                              }               
                                      

			System.out.println("Card drawn by player 1: "+one);
			System.out.println("Card drawn by player 2: "+two);
            
            
			
			if (c.compareCards(one,two) > 0) {
				Qplayer1.add(one);
				Qplayer1.add(two);
                card3=new JLabel("Player 1 takes both the cards");
                card3.setBounds(10,120, 250,40);  
                //f.add(card3);

                System.out.println("Player 1 takes both the cards");
			} else if (c.compareCards(one,two) < 0) {
				Qplayer2.add(one);
				Qplayer2.add(two);
                System.out.println("Player 2 takes both the cards");
                card3=new JLabel("Player 2 takes both the cards");
                card3.setBounds(10,120, 250,40);  
                //f.add(card3);
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
            System.out.println("Player 2 wins!!");
            f.add(card1);
            return;
    } 
    if (Qplayer2.size() < 4) {
        System.out.println("Player 1 wins!!");
        card1=new JLabel("Player 1 wins!!");
        f.add(card2);
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
        card3=new JLabel("Player 1 is the winner as he/she has more cards");
        System.out.println("Player 1 is the winner as he/she has more cards");
        f.add(card3);

    }
    else if(player2cards>player1cards){
        System.out.println("Player 2 is the winner as he/she has more cards");
        card3=new JLabel("Player 2 is the winner as he/she has more cards");
        f.add(card3);
    }
    else{
        System.out.println("It's a tie");
        card3=new JLabel("It's a tie as both have same number of cards");
        f.add(card3);
    }

}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    f.getContentPane().setBackground(new Color(40, 176, 55));
    // f.setBackground(new Color(41, 190, 61));
    f.setBounds(100, 100, 600, 500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setLayout(null);
    war1 w=new war1();
    JLabel l1;  
    l1=new JLabel("Game starts!!");  
    l2=new JLabel("1.Play game with no user input");
    l3=new JLabel("2.Play game with continuous user input");
    l1.setBounds(10,50, 100,30);
    l2.setBounds(10,100, 250,40);  
    l3.setBounds(10,110, 250,40);  
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
