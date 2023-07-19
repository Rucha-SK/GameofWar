import java.util.*;
import javax.swing.*;

class War {
    public Queue<card> Qplayer1;
    public Queue<card> Qplayer2;

    War(){
        Scanner sc=new Scanner(System.in);
        
        Qplayer1 = new LinkedList<card>();
		Qplayer2 = new LinkedList<card>();
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
			card one = Qplayer1.remove();
			card two = Qplayer2.remove();
			System.out.println("Card drawn by palyer 1: "+one);
			System.out.println("Card drawn by palyer 2: "+two);
			
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
            System.out.println("Player 2 wins!!");
            return;
    } 
    if (Qplayer2.size() < 4) {
        System.out.println("Player 1 wins!!");
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
   
    War w=new War();
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
}
    
}
}
