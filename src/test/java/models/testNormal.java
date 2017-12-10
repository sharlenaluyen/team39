package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testNormal {
    @Test
    public void testNormalDeckCreation(){
        Game g = new Game();
        assertEquals(52,g.deck.cards.size());
    }
}
