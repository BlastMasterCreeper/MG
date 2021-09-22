package neuroshimaHex.Tile.Base.tiles;

import neuroshimaHex.Room.BattleField;
import neuroshimaHex.Tile.Base.tiles.Act.WarriorAct;

public abstract class Warrior extends Unit implements WarriorAct {


    public Warrior(BattleField battleField) {
        super(battleField);
    }
}
