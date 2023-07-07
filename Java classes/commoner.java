**
 * A class that holds the attributes for the Commoner cards
 *@author Damario Hamilton
 */
public class Commoner extends Card{
 /**
 * A constructor that creates one of the 6 Commoner cards
 * @param the card number that is taken from the deck
 */
 public Commoner(int cardNumber){
 super("Commoner");
 /**
 * A Case structure is used to select the random card
 */
 switch (cardNumber){
 case 35 :
 setName("Tragic Figure");
 // -1 for each commoner card owned
 setPoints(0);
 break;
 case 36:
 setName("Heroic Figure");
 setPoints(-3);
 break;
 case 37:
 setName("student");
 setPoints(-1);
 break;
 case 38:
 setName("student");
 setPoints(-1);
 break;
 case 39:
 setName("student");
 setPoints(-1);
 break;
 case 40:
 setName("student");
 setPoints(-1);
 break;
 }
 }
}
