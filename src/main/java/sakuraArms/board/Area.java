package sakuraArms.board;

import lombok.Data;
import sakuraArms.constant.Constant.*;

@Data
public class Area {

    private areaType areaType;
    private int max;
    private final int init;
    private int number;

    Area(areaType areaType, int max, int init) {
        this.areaType = areaType;
        this.max = max;
        this.init = init;
        this.number = init;
    }

}
