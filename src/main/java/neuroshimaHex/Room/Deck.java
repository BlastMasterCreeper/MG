package neuroshimaHex.Room;

import lombok.Data;
import neuroshimaHex.Tile.Base.tiles.Tile;

import java.util.LinkedList;
import java.util.List;

@Data
public class Deck {

    protected List<Tile> content;

    public Deck() {

        content = new LinkedList<Tile>();
    }

    public Tile popOne() {
        if (!content.isEmpty()) {
            Tile tile = content.get(0);
            content.remove(0);
            return tile;
        }
        return null;
    }

    public void shuffle() {
        java.util.Collections.shuffle(content);
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.content.add(new Tile("1", 100));
        deck.content.add(new Tile("2", 1));
        deck.content.add(new Tile("3", 101));
        System.out.println("***ORIIGIN***\n" + deck.content);
        deck.shuffle();
        System.out.println("***SHUFFLE***\n" + deck.content);
        Tile tile = deck.popOne();
        System.out.println("***POPONE***\n" + tile.getArmy() + deck.content);
    }

}
