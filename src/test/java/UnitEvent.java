import java.util.EventObject;

public class UnitEvent extends EventObject {

    private Object unit;
    private int unitId;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public UnitEvent(Object source, int id) {
        super(source);
        this.unit = source;
        this.unitId = id;
    }

    Unit getUnit() {
        return (Unit)unit;
    }

    int getUnitId() {
        return unitId;
    }

}
