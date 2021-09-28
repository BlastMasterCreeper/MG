package sakuraArms.card.yurina;

import sakuraArms.board.Board;
import sakuraArms.card.UtilityCard;
import sakuraArms.constant.Constant.*;

public class S03_UkifuneSerene extends UtilityCard {

    S03_UkifuneSerene() {
        super();
        this.setUltimate(true);
        this.setUseCondition(true);
        UltimateInfo ultimateInfo = new UltimateInfo();
        ultimateInfo.setCost(2);
        ultimateInfo.setStatus(UltimateCardStatus.NotUsed);
        this.setUltimateInfo(ultimateInfo);
        this.setCode("NA-01-yurina-O-S-3");
        this.setName_chi("浮舟宿");
        this.setName_eng("Ukifune Serene");
    }

    @Override
    public void use(Board board, int position) {

    }

    @Override
    public void takeEffect(Board board, int position) {
        if (position == 1) board.sakuraTransfer(areaType.Shadow, areaType.Aura1, 5);
        if (position == 2) board.sakuraTransfer(areaType.Shadow, areaType.Aura2, 5);
    }
}
