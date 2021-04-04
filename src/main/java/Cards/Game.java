package Cards;

public class Game {
    private int player_number;
    private PlayingCard[] cardDeck = new PlayingCard[52];

    public void setPlayer_number(int player_number) {
        this.player_number = player_number;
    }

    public void deckStart(){
        int temp = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                cardDeck[temp++] = new PlayingCard(PlayingCard.SUITS_LIST[i], PlayingCard.RANK_LIST[j]);
            }
        }
    }

    public void deckShuffle(){
        int temp1;
        int temp2;
        for(int i=0; i<2704; i++){
            temp1 = (int) (Math.random()*52);
            temp2 = (int) (Math.random()*52);
            PlayingCard tempCard = cardDeck[temp1];
            cardDeck[temp1] = cardDeck[temp2];
            cardDeck[temp2] = tempCard;
        }
    }

    public void cardDraw(){
        for(int i=1; i<=player_number; i++){
            System.out.println("Карты, выданные "+i+"-му игроку");
            for(int j=1; j<6; j++){
                System.out.print(cardDeck[i*5-j]+"  ");
            }
            System.out.println("\n");
        }
    }


}
