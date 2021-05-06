package neuroshimaHex.Tile.Base.tiles;

import lombok.Data;
import neuroshimaHex.Public.PublicParams;
import neuroshimaHex.Tile.Base.TileAct;

@Data
public class Tile implements TileAct {

    PublicParams.Army army;

    private int placed;

    private String name;

    public Tile(String name) {
        this.name = name;
    }

    @Override
    public PublicParams.Location getLocation() {
        for (PublicParams.Location loc : PublicParams.Location.values()) {
            if (placed >= loc.getLowLimit() && placed <= loc.getHighLimit()) {
                return loc;
            }
        };
        return null;
    }
}
