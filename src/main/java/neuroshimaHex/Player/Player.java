package neuroshimaHex.Player;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import neuroshimaHex.Room.BattleField;
import neuroshimaHex.Room.Board;
import neuroshimaHex.Room.Hand;

public class Player {

    private int index;

    @Getter @Setter
    private String name;

    private Board board;

    public Player(int index, Board board) {
        this.index = index;
        this.board = board;
    }

    public void drawCard() {
        board.getHand(index).putIn(board.getDrawDeck(index).popOne());
    }

    public void discard(int i) {
        board.getDiscardDeck(index).addOne(board.getHand(index).drawOut(i));
    }

    public static void main(String[] args) {
        BattleField battleField = new BattleField(1);
        Board board = new Board(battleField);
        Player player1 = new Player(0, board);
    }

}
