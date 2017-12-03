package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SpanishDeck {

    public java.util.List<SpanishCard> spanishCards = new ArrayList<>();

    public SpanishDeck() {
        for(int i = 2; i < 15; i++){
            spanishCards.add(new SpanishCard(i,SpanishSuit.Bastos));
            spanishCards.add(new SpanishCard(i,SpanishSuit.Copas));
            spanishCards.add(new SpanishCard(i,SpanishSuit.Oros));
            spanishCards.add(new SpanishCard(i,SpanishSuit.Espadas));
        }
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(spanishCards, new Random(seed));
    }

    public ArrayList<SpanishCard> dealFour() {
        ArrayList<SpanishCard> four = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (spanishCards.size() > 0) {
                four.add(spanishCards.get(i));
                spanishCards.remove(i);
            }
        }
        return four;
    }
}
