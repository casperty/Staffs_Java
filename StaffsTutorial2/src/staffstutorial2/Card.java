package staffstutorial2;

/**
 *
 * @author Alexandre Ravaux
 */
public class Card {
    private Suit suit;
    private Rank rank;
    public Card (String theRank) {
	this(theRank,"Hearts");
    }

    public Card (String theRank, String theSuit) {
        this.rank = Rank.valueOf(theRank.toUpperCase()); 
        this.suit = Suit.valueOf(theSuit.toUpperCase());
    }
    public Card(Rank rank, Suit suit){
        this.rank = rank; 
        this.suit = suit;
    }

    public Rank getRank( ){ return rank; }
    public String getSuit ( )  { return suit.name(); }
    public String toString ( ) { return ( rank.name() + " OF " + suit.name() ); }
}