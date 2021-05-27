package neuroshimaHex.Tile.Base.tiles;

import lombok.Data;
import neuroshimaHex.Public.PublicParams;
import neuroshimaHex.Tile.Base.TileAct;

@Data
public class Tile implements TileAct {

    private int id;

    private String name;

    public Tile() {
        this.id = 0;
        this.name = "DEFAULT";
    }

    public Tile(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public PublicParams.Army getArmy() {
        return PublicParams.Army.getArmy(id/100);
    }

}
