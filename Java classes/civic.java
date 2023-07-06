/**
 * A class that holds the attributes for the church cards
 *@author Damario Hamilton
 */
public class Civic extends Card{
 /**
 * A constructor that creates one of the 8 Civic cards
 * @param the card number that is placd that is taken from the deck
 */
 public Civic(int cardNumber){
 super("Civic");
 /**
 * A Case structure is used to select the random card
 */
 switch (cardNumber){
 case 17 :
 setName("Governor");
 setPoints(4);
 break;
 case 18:
 setName("Mayor");
 setPoints(3);
 break;
 case 19:
 setName("Councilman");
 setPoints(3);
 break;
 case 20:
 setName("Judge");
 setPoints(2);
 break;
 case 21:
 setName("Judge");
 setPoints(2);
 break;
 case 22:
 setName("Tax Collector");
 // points will equal the total ammount of civic
 setPoints(0);
 break;
 case 23:
 setName("Sheriff");
 setPoints(1);
 break;
 case 24:
 setName("Sheriff");
 setPoints(1);
 break;
 }
 }
}
 
