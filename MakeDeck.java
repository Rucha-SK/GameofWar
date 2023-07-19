import java.util.*;

class MakeDeck {
    
    Stack<card> DeckOfCards;
    MakeDeck(){
        DeckOfCards=new Stack<>();
        
        for(int suit=0;suit<4;suit++)
        {
            for(int value=0;value<13;value++){
                DeckOfCards.push(new card(value+1,suit));
            }
        }
    }

    public void Shuffle(){
        Collections.shuffle(DeckOfCards);
    }

    public void viewDeck(){
        for(int i=0;i<DeckOfCards.size();i++){
         System.out.println(DeckOfCards.get(i));
        }
    }

    public card drawCardFromDeck(){
        if(!DeckOfCards.empty()){
            return DeckOfCards.pop();
        }
        else{
            card c=new card(0,0);
            return c;
        }
    }

    public static void main(String args[]){
        MakeDeck d=new MakeDeck();
       
        d.Shuffle();
        d.viewDeck();
    }
}
