package sakuraArms.board;

import lombok.Data;
import sakuraArms.constant.AreaConst;

@Data
public class Board {

    byte life1, life2;
    byte aura1, aura2;
    byte flare1, flare2;
    byte dust;
    byte distance;
    byte closeQuarters;

    public Board() {
        this.life1 = AreaConst.LIFE_INIT;
        this.life2 = AreaConst.LIFE_INIT;
        this.aura1 = AreaConst.AURA_INIT;
        this.aura2 = AreaConst.AURA_INIT;
        this.flare1 = AreaConst.FLARE_INIT;
        this.flare2 = AreaConst.FLARE_INIT;
        this.dust = AreaConst.DUST_INIT;
        this.distance = AreaConst.DISTANCE_INIT;
        this.closeQuarters = AreaConst.CLOSE_QUARTERS_BASE;
    }

    public void setFlare1(byte flare1) {
        if (flare1 < 0) return;
        this.flare1 = flare1;
    }

    public void setFlare2(byte flare2) {
        if (flare2 < 0) return;
        this.flare2 = flare2;
    }



}
