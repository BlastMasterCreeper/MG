package sakuraArms.board;

import sakuraArms.constant.Constant.*;

public class Board {

    private final int base_masterDistance = 2;
    private int masterDistance = base_masterDistance;
    private int extraDistance = 0;
    private int extraMasterDistance = 0;

    private Area life1 = new Area(areaType.Life1,10, 10);
    private Area life2 = new Area(areaType.Life2,10, 10);
    private Area aura1 = new Area(areaType.Aura1,5, 3);
    private Area aura2 = new Area(areaType.Aura2,5, 3);
    private Area flare1 = new Area(areaType.Flare1, Integer.MAX_VALUE, 0);
    private Area flare2 = new Area(areaType.Flare2, Integer.MAX_VALUE, 0);
    private Area distance = new Area(areaType.Distance,10, 10);
    private Area shadow = new Area(areaType.Shadow, Integer.MAX_VALUE, 0);

    public int getLife1() {
        return life1.getNumber();
    }

    public int getLife2() {
        return life2.getNumber();
    }

    public int getAura1() {
        return aura1.getNumber();
    }

    public int getAura2() {
        return aura2.getNumber();
    }

    public int getFlare1() {
        return flare1.getNumber();
    }

    public int getFlare2() {
        return flare2.getNumber();
    }

    public void setExtraDistance(int extraDistance) {
        this.extraDistance = extraDistance;
    }

    public int getDistance() {
        return distance.getNumber() + extraDistance;
    }

    public void setExtraMasterDistance(int extraMasterDistance) {
        this.extraMasterDistance = extraMasterDistance;
    }

    public int getMasterDistance() {
        return masterDistance + extraMasterDistance;
    }

    public void setAuraMax(int max, int position) {
        if (position == 1) {
            aura1.setMax(Math.min(max, aura1.getNumber()));
        }
        if (position == 2) {
            aura2.setMax(Math.min(max, aura2.getNumber()));
        }
    }

    public int getAvailable(areaType source, areaType target) {
        int ans = 0;
        switch (source) {
            case Life1: {
                ans = life1.getNumber();
                break;
            }
            case Life2: {
                ans = life2.getNumber();
                break;
            }
            case Aura1: {
                ans = aura1.getNumber();
                break;
            }
            case Aura2: {
                ans = aura2.getNumber();
                break;
            }
            case Flare1: {
                ans = flare1.getNumber();
                break;
            }
            case Flare2: {
                ans = flare2.getNumber();
                break;
            }
            case Distance: {
                ans = distance.getNumber();
                break;
            }
            case Shadow: {
                ans = shadow.getNumber();
                break;
            }
        }
        switch (target) {
            case Life1: {
                ans = Math.min(life1.getMax() - life1.getNumber(), ans);
                break;
            }
            case Life2: {
                ans = Math.min(life2.getMax() - life2.getNumber(), ans);
                break;
            }
            case Aura1: {
                ans = Math.min(aura1.getMax() - aura1.getNumber(), ans);
                break;
            }
            case Aura2: {
                ans = Math.min(aura2.getMax() - aura2.getNumber(), ans);
                break;
            }
            case Distance: {
                ans = Math.min(distance.getMax() - distance.getNumber(), ans);
                break;
            }
        }
        return ans;
    }

    public int sakuraTransfer(areaType source, areaType target, int number) {
        int ans = 0;
        if (number < 0) return 1;
        int number2 = getAvailable(source, target);
        if (number > number2) {
            number = number2;
            ans = 2;
        }
        switch (source) {
            case Life1: {
                life1.setNumber(life1.getNumber() - number);
                break;
            }
            case Life2: {
                life2.setNumber(life2.getNumber() - number);
                break;
            }
            case Aura1: {
                aura1.setNumber(aura1.getNumber() - number);
                break;
            }
            case Aura2: {
                aura2.setNumber(aura2.getNumber() - number);
                break;
            }
            case Flare1: {
                flare1.setNumber(flare1.getNumber() - number);
                break;
            }
            case Flare2: {
                flare2.setNumber(flare2.getNumber() - number);
                break;
            }
            case Distance: {
                distance.setNumber(distance.getNumber() - number);
                break;
            }
            case Shadow: {
                shadow.setNumber(shadow.getNumber() - number);
                break;
            }
        }
        switch (target) {
            case Life1: {
                life1.setNumber(life1.getNumber() + number);
                break;
            }
            case Life2: {
                life2.setNumber(life2.getNumber() + number);
                break;
            }
            case Aura1: {
                aura1.setNumber(aura1.getNumber() + number);
                break;
            }
            case Aura2: {
                aura2.setNumber(aura2.getNumber() + number);
                break;
            }
            case Flare1: {
                flare1.setNumber(flare1.getNumber() + number);
                break;
            }
            case Flare2: {
                flare2.setNumber(flare2.getNumber() + number);
                break;
            }
            case Distance: {
                distance.setNumber(distance.getNumber() + number);
                break;
            }
            case Shadow: {
                shadow.setNumber(shadow.getNumber() + number);
                break;
            }
        }
        return ans;
    }


}
