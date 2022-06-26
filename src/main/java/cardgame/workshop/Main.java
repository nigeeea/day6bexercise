package cardgame.workshop;

public class Main {


    public static void main(String[] args){

        //Cards firstCard = new Cards();

        //create an String Array of values
        String[] value = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};

        //create a String Array of suits
        String[] suit = {"Diamonds","Clubs","Hearts","Spades"};

        int numCards = value.length*suit.length;

        System.out.println(numCards);

        Card[] deck = new Card[numCards];

        Card firstCard = new Card();
        
        for(int i=0; i<numCards;i++){
            deck[i] = new Card();
        }

        System.out.println(deck[0]);
    }
    
}
