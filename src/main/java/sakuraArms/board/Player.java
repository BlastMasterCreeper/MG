package sakuraArms.board;

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
                    board.getAvailable(Area.areaType.Distance, Area.areaType.Aura1) > 0) {
                board.sakuraTransfer(Area.areaType.Distance, Area.areaType.Aura1, 1);
            }
            if (position == 2 &&
                    board.getAvailable(Area.areaType.Distance, Area.areaType.Aura2) > 0) {
                board.sakuraTransfer(Area.areaType.Distance, Area.areaType.Aura2, 1);
            }
        }
    }

    //后退 自[装](1)->[距]
    public void retreat() {
        if (board.getDistance() > board.getMasterDistance()) {
            if (position == 1 &&
                    board.getAvailable(Area.areaType.Aura1, Area.areaType.Distance) > 0) {
                board.sakuraTransfer(Area.areaType.Aura1, Area.areaType.Distance, 1);
            }
            if (position == 2 &&
                    board.getAvailable(Area.areaType.Aura2, Area.areaType.Distance) > 0) {
                board.sakuraTransfer(Area.areaType.Aura2, Area.areaType.Distance, 1);
            }
        }
    }

    //装附 [虚](1)->自[装]
    public void recover() {
        if (position == 1 &&
                board.getAvailable(Area.areaType.Shadow, Area.areaType.Aura1) > 0) {
            board.sakuraTransfer(Area.areaType.Shadow, Area.areaType.Aura1, 1);
        }
        if (position == 2 &&
                board.getAvailable(Area.areaType.Shadow, Area.areaType.Aura2) > 0) {
            board.sakuraTransfer(Area.areaType.Shadow, Area.areaType.Aura2, 1);
        }
    }

    //聚气 自[装](1)->自[气]
    public void focus() {
        if (position == 1 &&
                board.getAvailable(Area.areaType.Aura1, Area.areaType.Flare1) > 0) {
            board.sakuraTransfer(Area.areaType.Aura1, Area.areaType.Flare1, 1);
        }
        if (position == 2 &&
                board.getAvailable(Area.areaType.Aura2, Area.areaType.Flare2) > 0) {
            board.sakuraTransfer(Area.areaType.Aura2, Area.areaType.Flare2, 1);
        }
    }

    //脱离 [虚](1)->[距]
    public void breakaway() {
        if (board.getDistance() <= board.getMasterDistance() &&
                board.getAvailable(Area.areaType.Shadow, Area.areaType.Distance) > 0) {
            board.sakuraTransfer(Area.areaType.Shadow, Area.areaType.Distance, 1);
        }
    }



}
