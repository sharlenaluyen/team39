package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testColumn {
    @Test
    public void spanishHasColumns(){
        SpanishGame sg = new SpanishGame();
        sg.dealFour();
        assertNotNull(sg);
    }

    @Test
    public void normalHasColumns(){
        Game g = new Game();
        g.dealFour();
        assertNotNull(g);
    }

}
