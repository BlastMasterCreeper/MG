package neuroshimaHex.Room;

import java.util.ArrayList;
import java.util.List;

public class BattleField {

    private List<Hexagon> hexagons;

    /**
     * 战场构造函数
     * @param layers 战场圈数
     */
    public BattleField(int layers) {
        hexagons = new ArrayList<Hexagon>();
        for (int x = -layers; x <= layers; x++) {
            for (int y = -layers; y <= layers; y++) {
                if (x+y>=-layers && x+y<=layers) {
                    hexagons.add(new Hexagon(x, y));
                }
            }
        }
    }

    public Hexagon getHexagon(int pos) {
        for (Hexagon hexagon : hexagons) {
            if (pos == hexagon.getPosition()) {
                return hexagon;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BattleField battleField = new BattleField(2);
        System.out.println(battleField.hexagons.size());
        for (Hexagon hex : battleField.hexagons) {
            System.out.println(hex);
        }
    }

}
