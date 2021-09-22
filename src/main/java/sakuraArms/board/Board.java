package sakuraArms.board;

import lombok.Data;
import sakuraArms.constant.AreaConst;

@Data
public class Board {

    int life1, life2;
    int aura1, aura2;
    int flare1, flare2;
    int shadow;
    int distance;
    int closeQuarters;

    public Board() {
        this.life1 = AreaConst.Area.Life.getInit();
        this.life2 = AreaConst.Area.Life.getInit();
        this.aura1 = AreaConst.Area.Aura.getInit();
        this.aura2 = AreaConst.Area.Aura.getInit();
        this.flare1 = AreaConst.Area.Flare.getInit();
        this.flare2 = AreaConst.Area.Flare.getInit();
        this.shadow = AreaConst.Area.SHADOW.getInit();
        this.distance = AreaConst.Area.DISTANCE.getInit();
        this.closeQuarters = AreaConst.CLOSE_QUARTERS_BASE;
    }

    public void setFlare1(int flare1) {
        if (flare1 < 0) return;
        this.flare1 = flare1;
    }

    public void setFlare2(int flare2) {
        if (flare2 < 0) return;
        this.flare2 = flare2;
    }

    //[装]<->[虚]
    public void auraToShadow(int sakura, int position) {
        if (sakura == 0) return;
        int n = 0;
        if (position == 1) {
            n = sakura > 0 ? Math.min(aura1, sakura) : Math.max(-shadow, Math.max(aura1 - AreaConst.Area.Flare.getInit(), sakura));
            aura1 -= n;
        }
        if (position == 2) {
            n = sakura > 0 ? Math.min(aura2, sakura) : Math.max(-shadow, Math.max(aura2 - AreaConst.Area.Flare.getInit(), sakura));
            aura2 -= n;
        }
        shadow += n;
    }

    //[命]<->[气]

}
