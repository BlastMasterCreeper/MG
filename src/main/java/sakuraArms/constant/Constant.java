package sakuraArms.constant;

public class Constant {

    public enum Goddess {
        YURINA(1,"yurina", "摇波"),
        SAINE(2,"saine", "细音"),
        HIMIKA(3,"himika", "绯弥香"),
        TOKOYO(4, "tokoyo", "常世"),
        OBORO(5, "oboro", "胧"),
        YUKIHI(6, "yukihi", "雪灯"),
        SHINRA(7, "shinra", "森罗"),
        HAGANE(8, "hagene", "破钟"),
        CHIKAGE(9, "chikage", "千影"),
        KURURU(10, "kururu", "枢"),
        THALLYA(11, "thallya", "萨莉亚"),
        RAIRA(12, "raira", "雷螺"),
        UTSURO(13, "utsuro", "虚路"),
        HONOKA(14, "honoka", "仄佳"),
        KORUNU(15, "korunu", "凝努"),
        YATSUHA(16, "yatsuha", "八叶"),
        HATSUMI(17, "hatsumi", "初海"),
        MIZUKI(18, "mizuki", "水津城"),
        MEGUMI(19, "megumi", "泷河希"),
        KANAWE(20, "kanawe", "叶慧");

        private final int number;
        private final String name;
        private final String chsName;
        Goddess(int number, String name, String chsName) {
            this.number = number;
            this.name = name;
            this.chsName = chsName;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getChsName() {
            return chsName;
        }
    }

    public enum areaType {Life1, Life2, Aura1, Aura2, Flare1, Flare2, Distance, Shadow};

    public enum Speciality {
        Overkill, Inevitable, Limited, FullForce, Concentration,
    }

    public enum Type {
        Attack, Utility, Enchantment
    }

    public enum SubType {
        Reaction, FullPower
    }

    public enum UltimateCardStatus {
        NotUsed, InUse, Used
    }

    public enum AttackSpeciality {
        OverKill, Inevitable, UnableToReact_Normal, Penetration
    }

}
