package Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Game someGame = new Game();

        System.out.println("Введите кол-во игроков в диапазоне от 1-6.");
        byte player_number = input.nextByte();
        while(player_number < 0 || player_number > 6){
            System.out.println("Указано неверное кол-во игроков. Повторите ввод.");
            player_number = input.nextByte();
        }
        someGame.setPlayer_number(player_number);
    }

}
