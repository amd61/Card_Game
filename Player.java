

import java.util.ArrayList;

public class Player {
private String name;
private ArrayList<Card> hand;

public Player(String name) {
  this.setName(name);
  this.hand = new ArrayList<Card>();
}

public String getName(){
  return this.name;
}

public void setName(String name){
  this.name = name;
}

public void addCard(Card newCard) {
  this.hand.add( newCard);
}

public int getScore(){
  return this.hand.get(0).getValue();
}

}

