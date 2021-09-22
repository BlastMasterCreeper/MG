package neuroshimaHex.Tile.Base.tiles;

import neuroshimaHex.Room.BattleField;
import neuroshimaHex.Tile.Base.tiles.Act.ModuleAct;

public abstract class Module extends Unit implements ModuleAct {
    public Module(BattleField battleField) {
        super(battleField);
    }
}
