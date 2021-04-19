package neuroshimaHex.Public;

public interface PublicParams {
    enum Army {

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

        public Integer getValue() {
            return value;
        }
    }

    enum Location {

        PILE(1,35),

        HAND(101,103),

        DISCARD_PILE(201,235),

        BATTLE_FIELD(301,337);

        private Integer highLimit;

        private Integer lowLimit;

        Location(int highLimit, int lowLimit) {this.highLimit = highLimit; this.lowLimit = lowLimit;}

        public Integer getHighLimit() {return highLimit;}

        public Integer getLowLimit() {return lowLimit;}
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

        public Integer getValue() {return value;}
    }
}
