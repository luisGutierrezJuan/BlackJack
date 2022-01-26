package blackjack;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Test {
 @Test
    public void return_Player1_with_CASE_1(){
        
        List<Card> betPlayer1 = new ArrayList<Card>();
        betPlayer1.add(new Card("J"));
        betPlayer1.add(new Card("A"));
        
        List<Card> betPlayer2 = new ArrayList<Card>();
        betPlayer2.add(new Card(10));
        betPlayer2.add(new Card(5));
        betPlayer2.add(new Card(6));
        
        List<Card> betPlayer3 = new ArrayList<Card>();
        betPlayer3.add(new Card(3));
        betPlayer3.add(new Card(6));
        betPlayer3.add(new Card("A"));
        betPlayer3.add(new Card(3));
        betPlayer3.add(new Card("A"));
        betPlayer3.add(new Card("J"));
        
        List<Card> betCrupier = new ArrayList<Card>();
        betCrupier.add(new Card(9));
        betCrupier.add(new Card(7));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player crupier = new Player(betCrupier);
        
        List<Player> listTestPlayer = new ArrayList<Player>();
        listTestPlayer.add(player1);
        
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Card(5));
        deck.add(new Card(4));
        deck.add(new Card("J"));
        deck.add(new Card(2));
        
        List<Player> listWinners;
        BlackJack blackjack = new BlackJack(deck);
        
        listWinners = blackjack.getWinners(player1, player2, player3, crupier);
               
        assert(listWinners.equals(listTestPlayer));
    }
    
    @Test
    public void return_Player1_and_Player3_with_CASE_2(){
        List<Card> betPlayer1 = new ArrayList<Card>();
        betPlayer1.add(new Card("J"));
        betPlayer1.add(new Card(10));
        
        List<Card> betPlayer2 = new ArrayList<Card>();
        betPlayer2.add(new Card(10));
        betPlayer2.add(new Card(2));
        betPlayer2.add(new Card(6));
        
        List<Card> betPlayer3 = new ArrayList<Card>();
        betPlayer3.add(new Card(8));
        betPlayer3.add(new Card(8));
        betPlayer3.add(new Card(5));
        
        List<Card> betCrupier = new ArrayList<Card>();
        betCrupier.add(new Card(5));
        betCrupier.add(new Card(10));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player crupier = new Player(betCrupier);
        
        List<Player> listTestPlayer = new ArrayList<Player>();
        listTestPlayer.add(player1);
        listTestPlayer.add(player3);
        
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Card("A"));
        deck.add(new Card(3));
        deck.add(new Card("J"));
        deck.add(new Card(2));
        
        List<Player> listWinners;
        BlackJack blackjack = new BlackJack(deck);
        
        
        listWinners = blackjack.getWinners(player1, player2, player3, crupier);
        
        assert(listWinners.equals(listTestPlayer));
    }
}
