package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by michaelhilton on 1/25/16.
 */

public class SpanishCard implements Serializable {
    public final int value;
    public final SpanishSuit spanishSuit;

    @JsonCreator
    public SpanishCard(@JsonProperty("value") int value, @JsonProperty("suit") SpanishSuit spanishSuit) {
        this.value = value;
        this.spanishSuit = spanishSuit;

    }

    public SpanishSuit getSuit() {
        return spanishSuit;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return this.value + this.spanishSuit.toString();
    }
}
