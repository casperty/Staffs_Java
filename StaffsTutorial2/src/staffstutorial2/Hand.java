package staffstutorial2;

import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class Hand {
    private ArrayList<Card> hand;
    public Hand(){
        hand=new ArrayList<Card>();    
    }
    public Hand(ArrayList<Card> hand){
        this.hand=hand;    
    }
    public void add(Card c){
        if(hand.size()<5){
            hand.add(c);
        }
    }
    public int getValue(){
        int value=0;
        for(Card c:hand){
           value+=c.getRank().showRank();
        }
        return value;
    }
    public String toString(){
        String list="";
        for(Card c:hand){
           list+=c.toString()+"\n";
        }
        if(list==null){
            list="No cards";
        }
        return list;
    }
    
    public static void main(String[] args) {
        Suit hearts=Suit.HEARTS;
        Suit clubs=Suit.CLUBS;
        Suit diamonds=Suit.DIAMONDS;
        Suit spades=Suit.SPADES;
        
        Rank ace=Rank.ACE;
        Rank queen=Rank.QUEEN;
        Rank two=Rank.valueOf("TWO");
        
        System.out.println("A suit :");
        System.out.println(hearts);
        System.out.println("\nA rank :");
        System.out.println(two);
        
        Card aceOfHeart=new Card("ace", "hearts");
        Card queenOfSpades=new Card(queen,spades);
        Card queenOfHearts=new Card(queen,hearts);
        Card queenOfDiamonds=new Card(queen,diamonds);
        Card queenOfClubs=new Card(queen,clubs);
        
        System.out.println("\nSome cards :");
        System.out.println(aceOfHeart);
        System.out.println(queenOfSpades);
        
        System.out.println("\nA hand :");
        Hand h=new Hand();
        h.add(aceOfHeart);
        h.add(queenOfSpades);
        h.add(queenOfHearts);
        h.add(queenOfClubs);
        h.add(queenOfDiamonds);
        h.add(new Card("ten","spades")); // won't be added because there's already 5 cards in the hand
        System.out.println(h);
        System.out.println("\nAnother hand :");
        ArrayList<Card> bunchOfCards=new ArrayList<Card>();
        bunchOfCards.add(new Card("ace","spades"));
        bunchOfCards.add(new Card("two","spades"));
        bunchOfCards.add(new Card("three","spades"));
        bunchOfCards.add(new Card("four","spades"));
        bunchOfCards.add(new Card("five","spades"));
        Hand h2=new Hand(bunchOfCards);
        System.out.println(h2.getValue());
        System.out.println("\nDeck :");
        Deck deck=new Deck();
        System.out.println(deck);
        
    }
    
}
