package sakuraArms.card;

import lombok.Data;
import lombok.EqualsAndHashCode;
import sakuraArms.board.Board;
import sakuraArms.constant.Constant.*;

import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AttackCard extends Card{

    @Data
    public static class Attack {
        private int auraDamage;
        private int lifeDamage;
        private Set<AttackSpeciality> specialities;
    }

    private boolean[] baseRange;
    private int baseAuraDamage;
    private int baseLifeDamage;

    private int auraDamageStrengthen;
    private int lifeDamageStrengthen;

    private int rangeExpansion;
    private int rangeReduction;

    private Set<Speciality> specialities;

    protected AttackCard() {
        this.setType(Type.Attack);
        this.setSubType(null);
        this.setAuraDamageStrengthen(0);
        this.setLifeDamageStrengthen(0);
        this.setRangeExpansion(0);
        this.setRangeReduction(0);
        this.specialities = new HashSet<>();
    }

    public boolean inRange(Board board) {
        return baseRange[board.getDistance()];
    }

    protected boolean[] range(int... pos) {
        boolean[] range = new boolean[10];
        Arrays.fill(range, false);
        for (int p : pos) {
            range[p] = true;
        }
        return range;
    }

    public abstract Attack prepareToAttack();

}
