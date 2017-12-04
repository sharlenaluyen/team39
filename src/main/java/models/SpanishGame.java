package models;

import java.util.ArrayList;

public class SpanishGame {

    public SpanishDeck deck = new SpanishDeck();
    public java.util.List<SpanishColumn> columns = new ArrayList<>();

    public SpanishGame(){
        columns.add(new SpanishColumn(1));
        columns.add(new SpanishColumn(2));
        columns.add(new SpanishColumn(3));
        columns.add(new SpanishColumn(4));
    }

    public void dealFour() {
        ArrayList<SpanishCard> deal = deck.dealFour();
        for (int i = 0; i < deal.size(); i++) {
            SpanishCard c = deal.get(i);
            columns.get(i).cards.add(c);
        }
    }

    //customDeal to setup game for testing purposes (i.e. shuffled cards are random and hard to test)
    public void customDeal(int c1, int c2, int c3, int c4) {
        columns.get(0).cards.add(deck.spanishCards.get(c1));
        deck.spanishCards.remove(c1);
        columns.get(1).cards.add(deck.spanishCards.get(c2));
        deck.spanishCards.remove(c2);
        columns.get(2).cards.add(deck.spanishCards.get(c3));
        deck.spanishCards.remove(c3);
        columns.get(3).cards.add(deck.spanishCards.get(c4));
        deck.spanishCards.remove(c4);
    }

    public void remove(int columnNumber) {
        if(columnHasCards(columnNumber)) {
            SpanishCard c = getTopCard(columnNumber);
            boolean removeCard = false;
            for (int i = 0; i < 4; i++) {
                if (i != columnNumber) {
                    if (columnHasCards(i)) {
                        if(getTopCard(0).getValue() == 13 || getTopCard(1).getValue() == 13  || getTopCard(2).getValue() == 13 || getTopCard(3).getValue() == 13) {
                            removeCard = true;
                            break;
                        }else{
                            SpanishCard compare = getTopCard(i);
                            if (compare.getSuit() == c.getSuit()) {
                                if (compare.getValue() > c.getValue()) {
                                    removeCard = true;
                                }
                            }
                        }
                    }
                }
            }
            if (removeCard) {
                this.columns.get(columnNumber).cards.remove(this.columns.get(columnNumber).cards.size() - 1);
            }
        }
    }


    private boolean columnHasCards(int columnNumber) {
        if (this.columns.get(columnNumber).cards.size()>0) {
            return true;
        }
        return false;
    }

    private SpanishCard getTopCard(int columnNumber) {
        return this.columns.get(columnNumber).cards.get(this.columns.get(columnNumber).cards.size()-1);
    }


    public void move(int columnFrom, int columnTo) {
        SpanishCard cardToMove = getTopCard(columnFrom);
        this.removeCardFromCol(columnFrom);
        this.addCardToCol(columnTo,cardToMove);
    }

    private void addCardToCol(int columnTo, SpanishCard cardToMove) {
        columns.get(columnTo).cards.add(cardToMove);
    }

    private void removeCardFromCol(int colFrom) {
        this.columns.get(colFrom).cards.remove(this.columns.get(colFrom).cards.size()-1);
    }
}