package neuroshimaHex.Tile.Base.tiles;

import neuroshimaHex.Room.BattleField;
import neuroshimaHex.Tile.Base.tiles.Act.ModuleAct;
import neuroshimaHex.Tile.Base.tiles.Act.WarriorAct;

public abstract class HQ extends Unit implements ModuleAct, WarriorAct {

    public HQ(BattleField battleField) {
        super(battleField);
    }

    public HQ() {
        super();
    }
}
