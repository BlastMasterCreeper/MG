package sakuraArms.card.yurina;

import sakuraArms.board.Board;
import sakuraArms.board.Player;
import sakuraArms.card.UtilityCard;
import sakuraArms.constant.Constant.*;

public class S03_UkifuneSerene extends UtilityCard {

    S03_UkifuneSerene() {
        super();
        this.setUltimate(true);
        this.setUseCondition(false);
        UltimateInfo ultimateInfo = new UltimateInfo();
        ultimateInfo.setCost(2);
        ultimateInfo.setStatus(UltimateCardStatus.NotUsed);
        this.setUltimateInfo(ultimateInfo);
        this.setCode("NA-01-yurina-O-S-3");
        this.setName_chi("浮舟宿");
        this.setName_eng("Ukifune Serene");
    }

    @Override
    public void use() {

    }

    @Override
    public void takeEffect() {
        if (this.getPlayer().getPosition() == 1) this.getPlayer().getBoard().sakuraTransfer(areaType.Shadow, areaType.Aura1, 5);
        if (this.getPlayer().getPosition() == 2) this.getPlayer().getBoard().sakuraTransfer(areaType.Shadow, areaType.Aura2, 5);
    }
}
