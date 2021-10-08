package sakuraArms.card.yurina;

import sakuraArms.board.Board;
import sakuraArms.card.AttackCard;
import sakuraArms.constant.Constant.*;

public class N02_Brandish extends AttackCard {

    N02_Brandish() {
        super();
        this.setUltimate(false);
        this.setUseCondition(true);
        this.setCode("NA-01-yurina-N-2");
        this.setName_chi("一闪");
        this.setName_eng("Brandish");
        this.setBelongs(Goddess.YURINA);
        this.setBaseRange(this.range(3));
        this.setBaseAuraDamage(2);
        this.setBaseLifeDamage(2);
    }

    @Override
    public Attack prepareToAttack() {
        int position = this.getPlayer().getPosition();
        int life = 0;
        if (position == 1) life = this.getPlayer().getBoard().getLife1();
        if (position == 2) life = this.getPlayer().getBoard().getLife2();
        if (life <= 3) this.setAuraDamageStrengthen(1);
        Attack attack = new Attack();
        attack.setAuraDamage(this.getBaseAuraDamage() + this.getAuraDamageStrengthen());
        attack.setLifeDamage(this.getBaseLifeDamage() + this.getLifeDamageStrengthen());
        return attack;
    }

    @Override
    public void use() {

    }
}
