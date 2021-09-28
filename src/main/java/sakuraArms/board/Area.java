package sakuraArms.board;

import lombok.Data;

@Data
public class Area {

    enum areaType {Life1, Life2, Aura1, Aura2, Flare1, Flare2, Distance, Shadow};

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
