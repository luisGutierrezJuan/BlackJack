package blackjack;

import java.util.List;

public class Player {
    List<Card> mazo;

    public Player(List<Card> mazo) {
        this.mazo = mazo;
    }

    public List<Card> getMazo() {
        return this.mazo;
    }
    
    public boolean isBlackJack() {
        if(this.mazo.size() == 2){
            if (this.mazo.get(0).getValue() < 10 || this.mazo.get(1).getValue() < 10) return false;
            return this.mazo.get(0).getValue() != this.mazo.get(1).getValue();
        }
        return false;
    }
    
    public int score() {
        int puntuacion = 0;
        boolean huboAs = false;
        for (Card carta : this.mazo) {
            puntuacion += carta.getValue();
            if (puntuacion > 21 && huboAs){
                puntuacion -= 10;
                huboAs = false;
                continue;
            }
            if (carta.getValue() == 11){
                if (puntuacion > 21){
                    puntuacion -= 10;
                    huboAs = false;
                    continue;
                }
                huboAs = true;
            }
        }
        return puntuacion; 
    }
    
    public void addCard(Card carta) {
        mazo.add(carta);
    }
    
    /*@Override 
    public String toString() {
        String cards = "";
        int suma = 0;
        for(Card card: this.mazo) {
            suma += card.getValue();
            if (this.mazo.indexOf(card) == this.mazo.size() - 1){
                cards += '"' + String.valueOf(card.getValue());
            }
            else{
                cards += '"' + String.valueOf(card.getValue())+ '"';
            }
        }
        return cards +"("+String.valueOf(suma)+")";
    }*/
}