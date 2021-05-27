package neuroshimaHex.Room;

import neuroshimaHex.Tile.Base.tiles.Tile;

public class DiscardDeck extends Deck {

     public void addOne(Tile tile) {
        this.content.add(tile);
    }

}
