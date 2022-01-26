
package blackjack;

public class Card {
    
    private String valor;
    private boolean regular;
    
    public Card(String valor){
        this.valor = valor;
        this.regular = false;
    }
    
    public Card(int valor){
        this.valor = String.valueOf(valor);
        this.regular = true;
    }
    
    public int getValue(){
        if (this.regular) return Integer.parseInt(this.valor);
        if (!this.valor.equals("A")) return 10;
        return 11;
    }
}