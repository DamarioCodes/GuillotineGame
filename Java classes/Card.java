/**
 * A class for the Cards
 * @author Damario Hamilton
 */
public class Card{

 // stores the name of the card
 private String name;
 // stores the the point value of the card
 private int points;
 // stores the group of the card
 private String group;

 /** Constructor for cards,
 * cards attributes will be added in their own class
 * which is sectioned by groups
 */
 public Card(String group){
 this.group = group;
 }
 /**
 * return the group of the card
 */
 public String getGroup(){
 return this.group;
 }
 /** returns the string representation of the card
 * @retrun the string
 */
 public String toString(){
 if (getPoints() == 0)
 return (getName() + "\n"+ getGroup() + "\n *");
 else if (getName().equals("Count") || getName().equals("Lady")||
getName().equals("Countess")||getName().equals("Lord"))
 return(getName() + "\n" + getGroup() + "\n "+ getPoints() + "*");
 else
 return (getName() + "\n" + getGroup() +"\n "+ getPoints());

 }


 /**
 * return the name of the card
 * @return name
 */
 public String getName(){
 return this.name;
 }

 /**
 * Sets the name of the card
 */
 public void setName(String name){
 this.name = name ;
 }

 /**
 * Returns the point for the cards
 * @return points
 */
 public int getPoints(){
 return this.points;
 }

 /**
 * Sets the points of the cards
 */
 public void setPoints(int points){
 this.points = points;
 }
}
