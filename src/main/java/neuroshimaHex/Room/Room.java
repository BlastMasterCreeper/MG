package neuroshimaHex.Room;

import neuroshimaHex.Player.Player;
import neuroshimaHex.Constant.PublicParams;

import java.util.LinkedList;
import java.util.List;

public class Room {

    private Board board;

    private List<Player> players;

    public Room(int numbers) {
        BattleField battleField = new BattleField(2);
        this.board = new Board(battleField);
        this.board.initHands(numbers);
        this.board.initDrawDecks(numbers);
        this.board.initDiscardDecks(numbers);
        this.players = new LinkedList<Player>();
        for (int i = 0; i < numbers; i++) {
            players.add(new Player(numbers, this.board));
        }
    }

    public void deal(int index, PublicParams.Army army) {
    }

    public static void main(String[] args) {
    }
}
