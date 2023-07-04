/**
 * Class that represents a player
 * @author Damario Hamilton
 */
public class Player{
 // The name of the player
 private String name;
 // The score for the player
 private int score = 0;
 // the score for the player
 private LinkedList<Card> cardsCollected;

 /** Constructor to initialise the player's score, cards collected, and name
(based on user input)
 * @param name the name of the player
 */
 public Player(String name) {
 this.name = name;
 this.score = 0;
 this.cardsCollected = new LinkedList<Card>();
 }
 //values for certain special characters that have variable points
 /**If the count card has been collected */
 private boolean countCollected = false;
 /**If the countess card has been collected*/
 private boolean countessCollected = false;
 /**If the lord card has been collected */
 private boolean lordCollected = false;
 /**If the lady card has been collected */
 private boolean ladyCollected = false;
 /**if the heretic card has been collected */
 private boolean hereticCollected = false;
 /**number of church cards collected */
 private int churchCardsCollected = 0;
 /**if tax Collector has been collected */
 private boolean taxCollectorCollected = false;
 /**number of civic cards collected */
 private int civicCardsCollected = 0;
 /**number of palace Guards collected */
 private int palaceGuardsCollected = 0;
 /**if tragic figure has been collected */
 private boolean tragicFigureCollected = false;
 /**number of commoner cards collected */
 private int CommonerCardsCollected = 0;

 /**gives the string form of the player that has the name and their score
 * @return string representation of the player
 */
 @Override
 public String toString(){
 return (getName() + " : " + getScore());
 }
 /** returns if the count card has been collected by the player
 * @return if the count has been collected
 */
 public boolean isCountCollected() {
 return countCollected;
 }

 /**
 * Sets the count collected to true
 */
 public void setCountCollected() {
 countCollected = true;
 }


 /** returns if the countess card has been collected by the player
 * @return if the countess has been collected yet
 */
 public boolean isCountessCollected() {
 return countessCollected;
 }

 /**
 * Sets the countess collected to true
 */
 public void setCountessCollected() {
 countessCollected = true;
 }

 /** returns if the lord has been collected by the player
 * @return if the lord has been collected
 */
 public boolean isLordCollected() {
 return lordCollected;
 }

 /**
 * sets the lord collected to be true
 */
 public void setLordCollected() {
 lordCollected = true;
 }

 /** returns if the lady has been collected by the player
 * @return if the lady has been collected
 */
 public boolean isLadyCollected() {
 return ladyCollected;
 }

 /**
 * sets the lady collected to be true
 */
 public void setLadyCollected() {
 ladyCollected = true;
 }

 /** returns if the heretic has been collected by the player
 * @return if the heretic has been collected
 */
 public boolean isHereticCollected() {
 return hereticCollected;
 }

 /**
 * sets the heretic collected to be true
 */
 public void setHereticCollected() {
 hereticCollected = true;
 }

 /** returns the number of church cards collected by the player
 * @return the number of church cards collected
 */
 public int getChurchCardsCollected() {
 return churchCardsCollected;
 }

 /**
 * increments the number of church collected by 1
 */
 public void setChurchCardsCollected() {
 churchCardsCollected = churchCardsCollected + 1;
 }

 /** returns if the taxCollecter card has been collected by the player
 * @return if taxCollector has been collected
 */
 public boolean isTaxCollectorCollected() {
 return taxCollectorCollected;
 }

 /**
 * Sets the taxCollecterCollected to true
 */
 public void setTaxCollectorCollected() {
 taxCollectorCollected = true;
 }

 /** returns the number of civic cards collected by the player
 * @return the number of civic cards collected
 */
 public int getCivicCardsCollected() {
 return civicCardsCollected;
 }

 /**
 * increases the number of civic cards collected by the player by 1
 */
 public void setCivicCardsCollected() {
 civicCardsCollected = civicCardsCollected + 1;
 }

 /**returns the number of palace Guards collected by the player
 * @return the number of palace Guards collected
 */
 public int getPalaceGuardsCollected() {
 return palaceGuardsCollected;
 }

 /**
 * increases the number of palace guards collected by the player by 1
 */
 public void setPalaceGuardsCollected() {
 palaceGuardsCollected = palaceGuardsCollected + 1;
 }

 /**returns if the tragic player has been collected by the player
 * @return if the tragic player has been collected
 */
 public boolean isTragicFigureCollected() {
 return tragicFigureCollected;
 }

 /**
 * sets if tragic player has been collected to true
 */
 public void setTragicFigureCollected() {
 tragicFigureCollected = true;
 }

 /** returns the number of commoner cards collected by the player
 * @return the number of commoner cards collected
 */
 public int getCommonerCardsCollected() {
 return CommonerCardsCollected;
 }

 /**
 * increases the number of Commoner cards the player has collected by 1
 */
 public void setCommonerCardsCollected() {
 CommonerCardsCollected = CommonerCardsCollected + 1;
 }

 /** returns the score of the player
 * @return the score of the player
 */
 public int getScore() {
 return score;
 }

 /**sets the score of the player
 * @param score the score of the player
 */
 public void setScore(int score) {
 this.score = score;
 }

 /** gets the name of the player
 * @return name the name of the player
 */
 public String getName() {
 return name;
 }

 /**sets the name of the player
 * @param name the name of the player
 */
 public void setName(String name) {
 this.name = name;
 }

 /** returns the linked list of cards collected by the player
 * @return cardsCollecteed the cards that the player has in their hand
 */
 public LinkedList<Card> getCardsCollected() {
 return cardsCollected;
 }

 /** sets the collected hand of the player to a linked list of cards
 * @param cardsCollected the cards that the player has in their hand
 */
 public void setCardsCollected(LinkedList<Card> cardsCollected) {
 this.cardsCollected = cardsCollected;
 }

 /**
 * Updates the points of the player
 */
 public void UpdatePoints(){
 int points = 0;
 for (Card c : getCardsCollected()){
 points = points + c.getPoints();
 }
 points = points + specialPoints();
 setScore(points);
 }
 /** gives the amount of variable points due to special cards that are collected
by the player
 * @return the amount of variable points
 */
 private int specialPoints(){
 //variable to store amount of special points
 int sp = 0;
 //since each of the palaceguards will be worth points equal to the number of
palaceguards that are there
 sp = sp + getPalaceGuardsCollected() * getPalaceGuardsCollected();
 if (isCountCollected() && isCountessCollected()){
 sp = sp + 4;
 }
 if (isLordCollected() && isLadyCollected()){
 sp = sp + 4;
 }
 if ( isHereticCollected() ){
 sp = sp + getChurchCardsCollected();
 }
 if (isTaxCollectorCollected()){
 sp = sp + getCivicCardsCollected();
 }
 if (isTragicFigureCollected()){
 sp = sp - getCommonerCardsCollected();
 }
 return sp;
 }
}
