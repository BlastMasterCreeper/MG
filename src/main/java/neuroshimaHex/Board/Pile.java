package neuroshimaHex.Board;

import lombok.Data;
import neuroshimaHex.Tile.Base.tiles.Tile;

import java.util.List;

@Data
public class Pile {

    private static List<Tile> content;

    public Tile popOne() {
        if (!content.isEmpty()) {
            Tile tile = content.get(0);
            content.remove(0);
            return tile;
        }
        return null;
    }

    public static void shuffle() {
        java.util.Collections.shuffle(content);
    }

    public static void main(String[] args) {
        content.add(new Tile("1"));
        content.add(new Tile("2"));
        content.add(new Tile("3"));
        System.out.println("***ORIIGIN***\n" + content);
        this.shuffle();
    }

}
