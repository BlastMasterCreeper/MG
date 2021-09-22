import java.util.EventListener;

public interface UnitListener extends EventListener {

    void handleEvent(UnitEvent e);

}
