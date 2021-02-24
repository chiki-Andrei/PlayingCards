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

}
