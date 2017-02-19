

import java.util.ArrayList;

public class Game {

private ArrayList<Player> players;
private ArrayList<Card> deck;

public Game() {
  this.players = new ArrayList<Player>();
  this.deck = new ArrayList<Card>();
}

public void addCard(Card newCard) {
  this.deck.add( newCard);
}


public void setupDeck() {
  for ( Suits.Suit thisSuit : Suits.Suit.values() ) {
    for (int num=1; num<14; num++) {
      Card newCard = new Card(num, thisSuit);
        this.addCard(newCard);
        System.out.println("suit: " + thisSuit + ", value: " + num);
    }
  }

}

}