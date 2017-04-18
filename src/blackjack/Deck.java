package blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Viktor on 2017-04-18.
 */
public class Deck {

  ArrayList<Card> cards;

  public Deck() {
    int x = 0;
    cards = new ArrayList<>();
    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j <= 12; j++) {
        cards.add(x, new Card(i,j));
        x++;
      }
    }
  }

  public Deck(int numberOfCards) {
    int x = 0;
    cards = new ArrayList<>();
    for (int i = 0; i < numberOfCards ; i++) {
      cards.add(x, new Card(randomColor(),randomValue()));
      x++;
    }
  }

  public int randomColor() {
    int randomColor = (int) ((Math.random() * 4) + 1);
    return randomColor;
  }

  public int randomValue() {
    int randomValue = (int) ((Math.random() * 13) + 1);
    return randomValue;
  }

  public void shuffleDeck() {
    Collections.shuffle(cards);
  }

}
