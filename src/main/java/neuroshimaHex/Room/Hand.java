package neuroshimaHex.Room;

import lombok.Data;
import neuroshimaHex.Tile.Base.tiles.Tile;

import java.util.LinkedList;
import java.util.List;

@Data
public class Hand {

    List<Tile> tiles;

    public Hand() {
        tiles = new LinkedList<Tile>();
    }

    public Tile drawOut(int i) {
        if (i < 1 || i > 3) return null;
        else {
            Tile tile = tiles.get(i);
            if (null != tile) {
                tiles.remove(i - 1);
            }
            return tile;
        }
    }

    public void putIn(Tile tile) {
        if (tiles.size() < 3)
        tiles.add(tile);
    }

    public static void main(String[] args) {
        Hand hand = new Hand();
        Tile tile1 = new Tile("tile1", 1),
                tile2 = new Tile("tile2",2),
                tile3 = new Tile("tile3",3);
        hand.putIn(tile1);
        hand.putIn(tile2);
        hand.putIn(tile3);
        System.out.println(hand.getTiles());
        hand.drawOut(2);
        System.out.println(hand.getTiles());
    }

}
