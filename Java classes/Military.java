/**
 * A class that holds the attributes for the Military cards
 *@author Damario Hamilton
 */
public class Military extends Card{
 /**
 * A constructor that creates one of the 10 military cards
 * @param the card number that is taken from the deck
 */
 public Military(int cardNumber){
 super("Military");
 /**
 * A Case structure is used to select the random card
 */
 switch (cardNumber){
 case 25 :
 setName("Palace Guard");
 // depends on the ammount of Palace gaurds owned
 setPoints(1);
 break;
 case 26:
 setName("Palace Guard");
 // depends on the ammount of Palace gaurds owned
 setPoints(0);
 break;
 case 27:
 setName("Palace Guard");
 // depends on the ammount of Palace gaurds owned
 setPoints(0);
 break;
 case 28:
 setName("Palace Guard");
 // depends on the ammount of Palace gaurds owned
 setPoints(0);
 break;
 case 29:
 setName("Palace Guard");
 // depends on the ammount of Palace gaurds owned
 setPoints(0);
 break;
 case 30:
 setName("General");
 setPoints(4);
 break;
 case 31:
 setName("Colonel");
 setPoints(3);
 break;
 case 32:
 setName("Captain");
 setPoints(2);
 break;
 case 33:
 setName("Lieutenant");
 setPoints(1);
 break;
 case 34:
 setName("Lieutenant");
 setPoints(1);
 break;
 }
 }
}
