package sakuraArms.card;

import sakuraArms.board.Board;

public abstract class UtilityCard extends Card{

    public abstract void takeEffect(Board board, int position);

}
