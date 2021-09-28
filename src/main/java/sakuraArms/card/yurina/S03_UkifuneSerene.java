package sakuraArms.card.yurina;

import sakuraArms.board.Board;
import sakuraArms.card.UtilityCard;
import sakuraArms.constant.Constant.*;

public class S03_UkifuneSerene extends UtilityCard {

    S03_UkifuneSerene() {
        super();
        this.setUltimate(true);
        UltimateInfo ultimateInfo = new UltimateInfo();
        ultimateInfo.setCost(2);
        ultimateInfo.setStatus(UltimateCardStatus.NotUsed);
        this.setUltimateInfo(ultimateInfo);
        this.setCode("NA-01-yurina-O-S-3");
    }

    @Override
    public void use(Board board, int position) {

    }

    @Override
    public void takeEffect(Board board, int position) {

    }
}
