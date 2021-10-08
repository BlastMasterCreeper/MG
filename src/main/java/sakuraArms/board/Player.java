package sakuraArms.board;

import lombok.Data;
import sakuraArms.constant.Constant.*;

@Data
public class Player {

    private int position;
    private Board board;

    Player(Board board, int position) {
        this.board = board;
        this.position = position;
    }

    //前进 [距](1)->自[装]
    public void advance() {
        if (board.getDistance() > board.getMasterDistance()) {
            if (position == 1 &&
                    board.getAvailable(areaType.Distance, areaType.Aura1) > 0) {
                board.sakuraTransfer(areaType.Distance, areaType.Aura1, 1);
            }
            if (position == 2 &&
                    board.getAvailable(areaType.Distance, areaType.Aura2) > 0) {
                board.sakuraTransfer(areaType.Distance, areaType.Aura2, 1);
            }
        }
    }

    //后退 自[装](1)->[距]
    public void retreat() {
        if (board.getDistance() > board.getMasterDistance()) {
            if (position == 1 &&
                    board.getAvailable(areaType.Aura1, areaType.Distance) > 0) {
                board.sakuraTransfer(areaType.Aura1, areaType.Distance, 1);
            }
            if (position == 2 &&
                    board.getAvailable(areaType.Aura2, areaType.Distance) > 0) {
                board.sakuraTransfer(areaType.Aura2, areaType.Distance, 1);
            }
        }
    }

    //装附 [虚](1)->自[装]
    public void recover() {
        if (position == 1 &&
                board.getAvailable(areaType.Shadow, areaType.Aura1) > 0) {
            board.sakuraTransfer(areaType.Shadow, areaType.Aura1, 1);
        }
        if (position == 2 &&
                board.getAvailable(areaType.Shadow, areaType.Aura2) > 0) {
            board.sakuraTransfer(areaType.Shadow, areaType.Aura2, 1);
        }
    }

    //聚气 自[装](1)->自[气]
    public void focus() {
        if (position == 1 &&
                board.getAvailable(areaType.Aura1, areaType.Flare1) > 0) {
            board.sakuraTransfer(areaType.Aura1, areaType.Flare1, 1);
        }
        if (position == 2 &&
                board.getAvailable(areaType.Aura2, areaType.Flare2) > 0) {
            board.sakuraTransfer(areaType.Aura2, areaType.Flare2, 1);
        }
    }

    //脱离 [虚](1)->[距]
    public void breakaway() {
        if (board.getDistance() <= board.getMasterDistance() &&
                board.getAvailable(areaType.Shadow, areaType.Distance) > 0) {
            board.sakuraTransfer(areaType.Shadow, areaType.Distance, 1);
        }
    }



}
