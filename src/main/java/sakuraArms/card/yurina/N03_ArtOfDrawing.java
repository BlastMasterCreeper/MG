package sakuraArms.card.yurina;

import sakuraArms.card.AttackCard;
import sakuraArms.constant.Constant.*;

public class N03_ArtOfDrawing extends AttackCard {

    N03_ArtOfDrawing() {
        super();
        this.setSubType(SubType.FullPower);
        this.setUltimate(false);
        this.setUseCondition(true);
        this.setCode("NA-01-yurina-N-3");
        this.setName_chi("居合");
        this.setName_eng("Art Of Drawing");
        this.setBelongs(Goddess.YURINA);
        this.setBaseRange(this.range(2,3,4));
        this.setBaseAuraDamage(4);
        this.setBaseLifeDamage(3);
    }

    @Override
    public Attack prepareToAttack() {
        int distance = this.getPlayer().getBoard().getDistance();
        if (distance <= 2) {
            this.setAuraDamageStrengthen(-1);
            this.setLifeDamageStrengthen(-1);
        }
        Attack attack = new Attack();
        attack.setAuraDamage(this.getBaseAuraDamage() + this.getAuraDamageStrengthen());
        attack.setLifeDamage(this.getBaseLifeDamage() + this.getLifeDamageStrengthen());
        return attack;
    }

    @Override
    public void use() {

    }
}
