package sakuraArms.card;

import lombok.Data;
import sakuraArms.board.Board;
import sakuraArms.constant.Constant.*;

@Data
public abstract class Card {

    @Data
    protected static class UltimateInfo {
        int cost;
        UltimateCardStatus status;
    }

    private boolean useCondition;
    private boolean isUltimate;
    private UltimateInfo ultimateInfo;
    private String code;
    private String name_chi;
    private String name_jpn;
    private String name_eng;
    private Goddess belongs;
    private Type type;
    private SubType subType;

    public abstract void use(Board board, int position);
}
