/**
* A class that holds the attributes for the church cards
*@author Damario Hamilton
*/
public class Church extends Card{
/**
* A constructor that creates one of the 7 Church cards
* @param the card number that is placd that is taken from the deck
*/
public Church(int cardNumber){
super("Church");
/**
* A Case structure is used to select the random card
*/
switch (cardNumber){
case 10 :
setName("Cardinal");
setPoints(5);
break;
case 11:
setName("ArchBishop");
setPoints(4);
break;
case 12:
setName("Nun");
setPoints(3);
break;
case 13:
setName("Bishop");
setPoints(2);
break;
case 14:
setName("Priest");
setPoints(1);
break;
case 15:
setName("Priest");
setPoints(1);
break;
case 16:
setName("Heretic");
/** the points from the heretic
* will be determined by the number of
* church card collected
*/
setPoints(0);
break;
}
}
}
