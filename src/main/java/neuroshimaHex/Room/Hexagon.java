package neuroshimaHex.Room;

import lombok.Data;
import neuroshimaHex.Tile.Base.tiles.Foundation;
import neuroshimaHex.Tile.Base.tiles.Unit;

@Data
public class Hexagon {

    //六方格所在圈层
    private int layer;
    //六方位置编号
    private int position;
    //六方格坐标
    private int[] coordinate;
    //该格所部属单位板块
    private Unit occupiedUnit;

    private Foundation placedFoundation;

    public Hexagon() {
        layer = 0;
        coordinate = new int[]{0,0,0};
        position = 0;
        occupiedUnit = null;
        placedFoundation = null;
    }

    public Hexagon(int x, int y) {
        layer = Math.max(Math.max(Math.abs(x), Math.abs(y)), Math.abs(-x-y));
        coordinate = new int[]{x, y, -x-y};
        position = getPos();
    }

    private int getPos() {
        int result = 0;
        int x = coordinate[0];
        int y = coordinate[1];
        if (x == 0 && y == 0) {
            result = 1;
        } else if (x > -layer && y == layer) {
            result = 1 + layer*(layer - 1)*3 + x + layer;
        } else if (x > 0 && y >= 0) {
            result = 1 + layer*(layer - 1)*3 + layer + x;
        } else if (x == layer && y < 0) {
            result = 1 + layer*(layer - 1)*3 + layer*2 - y;
        } else if (x < layer && y == -layer) {
            result = 1 + layer*(layer - 1)*3 + layer*4 - x;
        } else if (x < 0 && y <= 0) {
            result = 1 + layer*(layer - 1)*3 + layer*4 - x;
        } else if (x == -layer && y > 0) {
            result = 1 + layer*(layer - 1)*3 + layer*5 + y;
        }
        return result;
    }

}
