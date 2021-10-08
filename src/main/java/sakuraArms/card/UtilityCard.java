package sakuraArms.card;

import lombok.Data;
import lombok.EqualsAndHashCode;
import sakuraArms.board.Board;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class UtilityCard extends Card{

    public abstract void takeEffect();

}
