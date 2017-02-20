

import java.util.ArrayList;
import java.util.Random;

public class Game {
private Random randomGenerator;
private ArrayList<Player> players;
private ArrayList<Card> deck;

public Game() {
  this.players = new ArrayList<Player>();
  this.deck = new ArrayList<Card>();
  randomGenerator = new Random();
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


public void setupPlayers() {
  Player playerOne = new Player("Bob");
  this.players.add(playerOne);
  Player playerTwo = new Player("Marley");
  this.players.add(playerTwo);

}

public void deal() {
  for (Player recipient : this.players) {
    // make a random card to deal
    int index = randomGenerator.nextInt(this.deck.size());
    Card dealtCard = this.deck.get(index);
    System.out.println("Dealt " + dealtCard.getValue() + " of " + dealtCard.getSuit());
    this.deck.remove(index);
    recipient.addCard(dealtCard);
  }


}

public void getWinner() {
  int currentWinningScore = 0;
  Player currentWinner = new Player("dummy");
  for (Player thisPlayer : this.players ) {
    int thisScore = thisPlayer.getScore();
    if (thisScore > currentWinningScore) {
      currentWinningScore = thisScore;
      currentWinner = thisPlayer;
    }
}
// we know winner
System.out.println(currentWinner.getName() + " ... wins");

}


}