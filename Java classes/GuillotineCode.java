/**
 * Class that represents the Guillotine game code
 * @author Damario Hamilton
 */
import java.util.Random;
public class GuillotineCode {
 // this stores the number of cards the game will be played with
 private int cardsNumber;
 // An array that holds the set of 20 cards
 private int[] initialCards;
 // This stores the linked list of cards
 private LinkedList<Card> deck;
 // stores the players turn
 private boolean player1 = true;

 /** the method returns true if it's player 1 turn
 * @return boolean true or false
 */
 public boolean isPlayer1sTurn() {
 return player1;
 }
 /** this sets the player's turn(player 1s)
 * @param player1 the boolean the players turn
 */
 public void setPlayer1sTurn(boolean player1) {
 this.player1 = player1;
 }

 /** Constructor that initiailizes the game with a give number of cards(20
default)
 * @param the number of cards
 */
 public GuillotineCode(int cardsNumber) {
 this.cardsNumber = cardsNumber;
 drawCards();
 deck = createDeck();
 }

 /** returns the array of randomized cards
 * @return initalCards which is the array of cards
 */
 public int[] getInitialCards() {
 return initialCards;
 }

 /** sets the array of randomized numbers
 * @param initialCards array of integers
 */
 public void setInitialCards(int[] initialCards) {
 this.initialCards = initialCards;
 }

 /** returns the number of cards in the game
 * @return the number of cards in the deck
 */
 public int getCardsNumber() {
 return cardsNumber;
 }
 
 /** sets the number of cards
 * @param the number of cards being used
 */
 public void setCardsNumber(int cardsNumber){
 this.cardsNumber = cardsNumber;
 }

 /** returns the linked list of the cards left in the deck
 * @return the deck of cards being used
 */
 public LinkedList<Card> getDeck(){
 return deck;
 }

 /** sets the linked list of all the cards that are left in the deck
 * @param playingCards the deck the game is played with
 */
 public void setDeck(LinkedList<Card> deck){
 this.deck = deck;
 }

 /** shuffles the deck
 * @return a deck of shuffled cards
 */
 private LinkedList<Card> createDeck() {

 LinkedList<Card> cards = new LinkedList<Card>();
 int[] drawnCards = getInitialCards();

 for (int i = 0; i < drawnCards.length; i++) {

 if (drawnCards[i] >= 1 && drawnCards[i] <= 9)
 cards.addToEnd(new Royal(drawnCards[i]));

 else if (drawnCards[i] >= 10 && drawnCards[i] <= 16)
 cards.addToEnd(new Church(drawnCards[i]));

 else if (drawnCards[i] >= 17 && drawnCards[i] <=24)
 cards.addToEnd(new Civic(drawnCards[i]));

 else if (drawnCards[i] >= 25 && drawnCards[i] <= 34)
 cards.addToEnd(new Military(drawnCards[i]));

 else if (drawnCards[i] >= 35 && drawnCards[i] <= 40)
 cards.addToEnd(new Commoner(drawnCards[i]));
 }
 return cards;
 }

 /**
 * gets a random number for the cards
 * done from 1 to 40 inclusive
 */
 private void drawCards() {
 setInitialCards(new Random().ints(1,
41).distinct().limit(getCardsNumber()).toArray());
 }

 /**
 * taking the top card and updating the next card
 * @param p the player that draws the top card from the deck
 */
 public void takeFirst(Player p){
 if(!getDeck().isEmpty()){
 LinkedList<Card> list = p.getCardsCollected();
 Card cardToAdd = getDeck().removeFromFront();
 list.addToEnd(cardToAdd);
 UpdateSpecialCards(cardToAdd, p);
 p.UpdatePoints();
 }
 }

 /** Changes the params for specicla cards and
 * @param card the card that was drawn
 * @param p the player that drew the card
 */
 private void UpdateSpecialCards(Card card, Player p){
 //setting the values if the card is a special card
 if (card.getName().equals("Count")){
 p.setCountCollected();
 }
 else if(card.getName().equals("Countess")){
 p.setCountessCollected();
 }
 else if(card.getName().equals("Lord")){
 p.setLordCollected();
 }
 else if(card.getName().equals("Lady")){
 p.setLadyCollected();
 }
 else if(card.getName().equals("Heretic")){
 p.setHereticCollected();
 }
 else if(card.getName().equals("Tax Collector")){
 p.setTaxCollectorCollected();
 }
 else if (card.getName().equals("Tragic Figure")){
 p.setTragicFigureCollected();
 }
 else if(card.getName().equals("Palace Guard")){
 p.setPalaceGuardsCollected();
 }
 else
 ;

 //counting the number of church,civic,commoner cards
 // because of their special interactions
 if (card.getGroup().equals("Church") ){
 p.setChurchCardsCollected();
 }
 else if (card.getGroup().equals("Civic")){
 p.setCivicCardsCollected();
 }
 else if (card.getGroup().equals("Commoner")){
 p.setCommonerCardsCollected();
 }
 }
}
