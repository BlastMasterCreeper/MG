package neuroshimaHex.Tile.Base.tiles;

import lombok.Data;
import lombok.EqualsAndHashCode;
import neuroshimaHex.Room.BattleField;
import neuroshimaHex.Constant.PublicParams;
import neuroshimaHex.Tile.Base.tiles.Act.UnitAct;

@EqualsAndHashCode(callSuper = true)
@Data
public class Unit extends Tile implements UnitAct {

    private BattleField battleField;

    private int[] coordinates;

    private PublicParams.Clock orientation;

    private PublicParams.Army controlRight;

    public Unit(BattleField battleField) {
        this.battleField = battleField;
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
