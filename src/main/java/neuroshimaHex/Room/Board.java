package neuroshimaHex.Room;

import lombok.Data;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

public class Board {

    private List<Hand> hands;

    private List<DrawDeck> drawDecks;

    private List<DiscardDeck> discardDecks;

    @Getter
    private BattleField battleField;

    public Board(BattleField battleField) {
        this.hands = new LinkedList<>();
        this.drawDecks = new LinkedList<>();
        this.discardDecks = new LinkedList<>();
        this.battleField = battleField;
    }

    public Hand getHand(int index) {
        return hands.get(index);
    }

    public DrawDeck getDrawDeck(int index) {
        return drawDecks.get(index);
    }

    public DiscardDeck getDiscardDeck(int index) {
        return discardDecks.get(index);
    }

}
