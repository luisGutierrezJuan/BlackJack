package blackjack;

import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    
    private final List<Card> banca;

    public BlackJack(ArrayList<Card> banca) {
        this.banca = banca;
    }
    
    public List<Player> getWinners(Player p1, Player p2, Player p3, Player croupier){
        if(croupier.isBlackJack()) return null;
        
        while(croupier.score() < 17) {
            croupier.addCard(banca.remove(0));
        }
        
        ArrayList<Player> ganadores = new ArrayList<>();
        
        if(isWinner(p1, croupier)){
            ganadores.add(p1);
        }
        
        if(isWinner(p2, croupier)){
            ganadores.add(p2);
        }
        
        if(isWinner(p3, croupier)){
            ganadores.add(p3);
        }
        
        return ganadores;
    }
    
    boolean isWinner(Player jugador, Player croupier){
        if (jugador.isBlackJack() || (jugador.score() > croupier.score() && jugador.score() <= 21)) return true;
        return false;
    }
}