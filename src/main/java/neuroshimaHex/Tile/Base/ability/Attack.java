package neuroshimaHex.Tile.Base.ability;

import lombok.Data;
import neuroshimaHex.Constant.PublicParams;

@Data
public class Attack {

    PublicParams.Attack_Type attackType;
    PublicParams.Clock direction;
    int damage;

}
