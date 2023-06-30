/**
 * class that holds the attributes for Royal cards
 * @author Damario Hamilton
 */
public class Royal extends Card{

 /**
 * A constructor that creates one of the 9 Royal cards
 * @param the card number that is placd that is taken from the deck
 */
 public Royal(int cardNumber){
 super("Royal");
 /**
 * A Case structure is used to select the card the random card
 */
 switch (cardNumber){
 case 1:
 setName("King Louis XIV");
 setPoints(5);
 break;
 case 2:
 setName("Marie Antoinette");
 setPoints(5);
 break;
 case 3:
 setName("Regent");
 setPoints(4);
 break;
 case 4:
 setName("Duke");
 setPoints(3);
 break;
 case 5:
 setName("Baron");
 setPoints(3);
 break;
 case 6:
 setName("Count");
 setPoints(2);
 break;
 case 7:
 setName("Countess");
 setPoints(2);
 break;
 case 8:
 setName("Lord");
 setPoints(2);
 break;
 case 9:
 setName("Lady");
 setPoints(2);
 break;
 }
 }
}
