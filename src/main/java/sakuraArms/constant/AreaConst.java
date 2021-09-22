package sakuraArms.constant;

public class AreaConst {

    public enum Area {

        Life("life", 0 , 10 , 10),
        Aura("aura", 0 , 5,0),
        Flare("flare", 0, Integer.MAX_VALUE, 0),
        DISTANCE("distance", 0, 10, 10),
        SHADOW("shadow", 0 , Integer.MAX_VALUE, 0);

        private final String name;
        private final int min;
        private final int max;
        private final int init;

        Area(String name, int min, int max, int init) {
            this.name = name;
            this.min = min;
            this.max = max;
            this.init = init;
        }

        public String getName() {
            return name;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public int getInit() {
            return init;
        }

    }

    public static final byte CLOSE_QUARTERS_BASE = 2;

}
