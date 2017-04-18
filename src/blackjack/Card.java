package blackjack;

/**
 * Created by Viktor on 2017-04-18.
 */
public class Card {
  String[] colorsOfCard = {"Spades", "Hearts", "Diamonds", "Clubs"};;
  String[] valueOfCard = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  int color;
  int value;

  public Card(int color, int value) {
      this.color = color;
      this.value = value;
  }

  public @Override String toString()
  {
    return valueOfCard[value] + " " + colorsOfCard[color];
  }

  public int getRank() {
    return color;
  }

  public int getSuit() {
    return value;
  }
}
