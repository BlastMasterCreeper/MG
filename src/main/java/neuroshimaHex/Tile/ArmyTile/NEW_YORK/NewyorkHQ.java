package neuroshimaHex.Tile.ArmyTile.NEW_YORK;

import neuroshimaHex.Constant.PublicParams;
import neuroshimaHex.Tile.Base.tiles.HQ;

public abstract class NewyorkHQ extends HQ {

    public NewyorkHQ() {
        this.setId(1501);
        this.setName("HQ");
        this.setControlRight(PublicParams.Army.NEW_YORK);
    }

}
