package neuroshimaHex.Tile.Base.tiles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import neuroshimaHex.Room.BattleField;
import neuroshimaHex.Public.PublicParams;
import neuroshimaHex.Room.Board;
import neuroshimaHex.Tile.Base.UnitAct;

@EqualsAndHashCode(callSuper = true)
@Data
public class Unit extends Tile implements UnitAct {

    private int[] coordinates;

    private PublicParams.Clock orientation;

    private PublicParams.Army controlRight;

    public Unit() {
        this.coordinates = new int[3];
        this.orientation = PublicParams.Clock.ELeven;
        this.controlRight = this.getArmy();
    }

    @Override
    public void moveTo(int pos, BattleField bt) {

    }

    @Override
    public void rotateTo(int ori, BattleField bt) {
        this.setOrientation(PublicParams.Clock.getClock(ori));
    }
}
