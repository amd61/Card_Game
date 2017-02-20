//package cardgame;


public class Runner {
  public static void main (String[] args) {
    System.out.println("Running");

    Game myGame = new Game();
    myGame.setupDeck();
    myGame.setupPlayers();
    myGame.deal();
    myGame.getWinner();
  }
}