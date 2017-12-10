package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testSpanish {

    @Test
    public void testSpanishDeckCreation(){
        SpanishGame sg = new SpanishGame();
        assertEquals(50,sg.deck.spanishCards.size());
    }
}
