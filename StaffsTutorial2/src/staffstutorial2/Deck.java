package staffstutorial2;

import java.util.ArrayList;

/**
 *
 * @author Alexandre Ravaux
 */
public class Deck {
    private ArrayList<Card> deck;
    public Deck(){
        deck=new ArrayList<Card>();
        for(Suit s:Suit.values()){
            for(Rank r:Rank.values()){
                deck.add(new Card(r,s));
            }
        }   
    }
    public String toString(){
        String out="";
        for(Card card:deck){
            out+=card.toString()+"\n";
        }
        if(out.equals("")) { out="No cards";}
        return out;
    }
}
