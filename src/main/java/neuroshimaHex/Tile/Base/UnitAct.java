package neuroshimaHex.Tile.Base;

import neuroshimaHex.Room.BattleField;
import neuroshimaHex.Tile.Base.tiles.Unit;

public interface UnitAct {

    public void moveTo(int pos, BattleField bt);

    public void rotateTo(int ori, BattleField bt);
}
