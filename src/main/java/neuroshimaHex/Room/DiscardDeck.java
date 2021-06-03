package neuroshimaHex.Room;

import neuroshimaHex.Tile.Base.tiles.Tile;
import neuroshimaHex.Tile.Base.tiles.Unit;

public class DiscardDeck extends Deck {

     public void addOne(Tile tile) {
        this.content.add(tile);
    }

}
