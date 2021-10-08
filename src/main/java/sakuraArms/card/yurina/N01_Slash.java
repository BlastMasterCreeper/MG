package sakuraArms.card.yurina;

import sakuraArms.board.Board;
import sakuraArms.card.AttackCard;
import sakuraArms.constant.Constant;

public class N01_Slash extends AttackCard {

    N01_Slash() {
        super();
        this.setUltimate(false);
        this.setUseCondition(true);
        this.setCode("NA-01-yurina-N-1");
        this.setName_chi("斩");
        this.setName_eng("Slash");
        this.setBelongs(Constant.Goddess.YURINA);
        this.setBaseRange(this.range(3,4));
        this.setBaseAuraDamage(3);
        this.setBaseLifeDamage(1);
    }

    @Override
    public Attack prepareToAttack() {
         Attack attack = new Attack();
         attack.setAuraDamage(this.getBaseAuraDamage() + this.getAuraDamageStrengthen());
         attack.setLifeDamage(this.getBaseLifeDamage() + this.getLifeDamageStrengthen());
         return attack;
    }

    @Override
    public void use() {

    }
}
