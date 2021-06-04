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
        this.hands = new LinkedList<Hand>();
        this.drawDecks = new LinkedList<DrawDeck>();
        this.discardDecks = new LinkedList<DiscardDeck>();
        this.battleField = battleField;
    }

    public void initHands(int numbers) {
        this.hands = new LinkedList<Hand>();
        for (int i = 0; i < numbers; i++) {
            hands.add(new Hand());
        }
    }

    public void initDrawDecks(int numbers) {
        this.discardDecks = new LinkedList<DiscardDeck>();
        for (int i = 0; i < numbers; i++) {
            this.drawDecks.add(new DrawDeck());
        }
    }

    public void initDiscardDecks(int numbers) {
        this.discardDecks = new LinkedList<DiscardDeck>();
        for (int i = 0; i < numbers; i++) {
            this.discardDecks.add(new DiscardDeck());
        }
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
