package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class testGame {

    @Test
    public void testGameCreation(){
        Game g = new Game();
        assertNotNull(g);
    }

    @Test
    public void testGameSpanish(){
        SpanishGame sg = new SpanishGame();
        assertNotNull(sg);
    }

    @Test
    public void testGameInit(){
        Game g = new Game();
        g.deck.shuffle();
        assertNotEquals(2,g.columns.get(0));
    }

    @Test
    public void testGameStart(){
        Game g = new Game();
        g.deck.shuffle();
        g.dealFour();
        assertEquals(1,g.columns.get(0).cards.size());
        assertEquals(1,g.columns.get(1).cards.size());
        assertEquals(1,g.columns.get(2).cards.size());
        assertEquals(1,g.columns.get(3).cards.size());
    }

    @Test
    public void testCustomDeal(){
        Game g = new Game();
        g.customDeal(0,3,6,9);
        assertEquals("2Clubs",g.columns.get(0).cards.get(0).toString());
        assertEquals("3Clubs",g.columns.get(1).cards.get(0).toString());
        assertEquals("4Clubs",g.columns.get(2).cards.get(0).toString());
        assertEquals("5Clubs",g.columns.get(3).cards.get(0).toString());
    }

    @Test
    public void testRemoveFunction(){
        Game g = new Game();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.columns.get(2).cards.size());
    }



}
