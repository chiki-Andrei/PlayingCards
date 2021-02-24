package Cards;

public class Game {
    private byte player_number;
    private String[] cardDeck = new String[52];

    public void setPlayer_number(byte player_number) {
        this.player_number = player_number;
    }

    public void deckStart(){
        int temp = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                cardDeck[temp++] = new PlayingCard(PlayingCard.SUITS_LIST[i], PlayingCard.RANK_LIST[j]).toString();
            }
        }
    }

    public void deckShuffle(){
        int temp1;
        int temp2;
        String tempString;
        for(int i=0; i<4000; i++){
            temp1 = (int) (Math.random()*52);
            temp2 = (int) (Math.random()*52);
            tempString = cardDeck[temp1];
            cardDeck[temp1] = cardDeck[temp2];
            cardDeck[temp2] = tempString;
        }
    }

}
