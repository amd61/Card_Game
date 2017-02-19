
public class Card {

private int value;
private Suits.Suit suit;

public Card(int value, Suits.Suit suit) {
  this.setValue(value);
  this.setSuit(suit);
}

public int getValue(){
  return this.value;
}

public Suits.Suit getSuit(){
  return this.suit;
}

public void setValue(int value) {
  this.value = value;
}

public void setSuit(Suits.Suit suit) {
  this.suit = suit;
}

}
