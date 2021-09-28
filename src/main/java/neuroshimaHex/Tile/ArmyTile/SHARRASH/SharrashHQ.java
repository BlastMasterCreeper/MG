package neuroshimaHex.Tile.ArmyTile.SHARRASH;

import neuroshimaHex.Constant.PublicParams;
import neuroshimaHex.Tile.Base.tiles.HQ;

public abstract class SharrashHQ extends HQ {

    public SharrashHQ() {
        this.setId(1201);
        this.setName("HQ");
        this.setControlRight(PublicParams.Army.SHARRASH);
    }

}
