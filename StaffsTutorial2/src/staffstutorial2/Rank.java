package staffstutorial2;

/**
 *
 * @author Alexandre Ravaux
 */
public enum Rank{
    ACE(1), 
    TWO(2), 
    THREE(3), 
    FOUR(4), 
    FIVE(5),
    SIX(6), 
    SEVEN(7), 
    EIGHT(8), 
    NINE(9), 
    TEN(10), 
    Jack(10), 
    QUEEN(10), 
    King(10);
    
    private int rankNumber;
    
    Rank(int rankNumber){
        this.rankNumber = rankNumber;
    }
    int showRank() {
      return rankNumber;
   }

}