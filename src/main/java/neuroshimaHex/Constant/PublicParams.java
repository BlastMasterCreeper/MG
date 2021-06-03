package neuroshimaHex.Constant;

public interface PublicParams {
    enum Army {

        DEFAULT(0),
        BORGO(1),
        MOLOCH(2),
        HEGEMONY(3),
        OUTPOST(4),
        STEEL_POLICE(5),
        URANOPOLIS(6),
        MISSISSIPI(7),
        SMART(8),
        VEGAS(9),
        DOOM_MACHINE(10),
        IRON_GANG(11),
        SHARRASH(12),
        MEPHISTO(13),
        DEATH_BREATH(14),
        NEW_YORK(15),
        NEOJUNGLE(16),
        DANCER(17),
        SAND_RUNNER(18),
        TROGLODYTES(19);

        private Integer value;

        Army(int value) {this.value = value;}

        public static Army getArmy(int value) {
            for (Army a : Army.values()) {
                if (value == a.value) {
                    return a;
                }
            }
            return null;
        }

        public Integer getValue() {
            return value;
        }
    }

    enum Clock {

        Twelve(0),
        One(1),
        Two(2),
        Three(3),
        Four(4),
        Five(5),
        Six(6),
        Seven(7),
        Eight(8),
        Nine(9),
        Ten(10),
        ELeven(11);

        private Integer value;

        Clock(int value) {this.value = value;}

        public static Clock getClock(int value) {
            for (Clock c : Clock.values()) {
                if (value == c.value) {
                    return c;
                }
            }
            return null;
        }

        public Integer getValue() {return value;}

        public void setValue(int value) {this.value = value;}

        public Integer getReversed() {return (value+6)%12;}

        public Integer getTurn(int ori) {return (value+ori)%12;}
    }
}
