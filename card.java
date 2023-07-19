
//import java.util.*;
 
class card{
    public int value;
    public String suit;
    public int s;
    String[] All_suits = {"Spade", "Heart", "Diamond", "Club"};
    card(){}
    card(int value, int suit) {
        this.value = value;
        this.suit = All_suits[suit];
        s=suit;
    }
    int cardSuit(card c){
           return c.s;
    }
 
    public String toString() {
        String final_card = " of " + suit;
        if (value == 1) {
            final_card = "Ace" + final_card;
        } else if (value == 11) {
            final_card = "Jack" + final_card;
        } else if (value == 12) {
            final_card = "Queen" + final_card;
        } else if (value == 13) {
            final_card = "King" + final_card;
        } else {
            final_card = value + final_card;
        }
        return final_card;
    }
    public int compareCards(card first,card second) {
		int firstcard = first.value;
		int secondcard =second.value;
		if (firstcard>secondcard) {
			return 1;
		}
		if (secondcard>firstcard) {
			return -1;
		}
		return 0;
	}
    
}
 
