package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/26/16.
 */
public class testCard {


    @Test
    public void testGetValue(){
        Card c = new Card(7,Suit.Clubs);
        assertEquals(7,c.getValue());
    }
    
    @Test
    public void testToString(){
        Card c = new Card(5,Suit.Clubs);
        assertEquals("5Clubs",c.toString());
    }

    @Test
    public void testMoveCard(){
        Game g = new Game();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.columns.get(2).cards.size());
        g.move(0,2);
        assertEquals(1,g.columns.get(2).cards.size());
        assertEquals(0,g.columns.get(0).cards.size());
    }


}
