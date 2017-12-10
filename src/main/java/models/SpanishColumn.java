package models;

import java.util.ArrayList;

public class SpanishColumn {

    public int id;
    public java.util.List<SpanishCard> cards = new ArrayList<>();

    public SpanishColumn() {
    }

    public SpanishColumn(int id) {
        this.id = id;
    }
}
