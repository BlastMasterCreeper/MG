import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import javax.swing.event.EventListenerList;
import java.text.DecimalFormat;
import java.util.HashMap;

@Data
public class Unit {

    private int id;
    protected EventListenerList eventListenerList = new EventListenerList();

    public void addListener(MyListener myListener) {
        eventListenerList.add(MyListener.class, myListener);
    }

    public void removeListener(MyListener myListener) {
        eventListenerList.remove(MyListener.class, myListener);
    }

    public void notifyEvent(UnitEvent event) {
        UnitListener[] listeners = eventListenerList.getListeners(MyListener.class);
        for (UnitListener listener : listeners) {
            listener.handleEvent(event);
        }
    }

    public void changeId(int newId) {
        if (newId != id) {
            id = newId;
            UnitEvent unitEvent = new UnitEvent(this, this.id);
            notifyEvent(unitEvent);
        }
    }

    public static void main(String[] args) {
        JSONObject json = new JSONObject(new HashMap<>());
        json.put("float", 13.125);
        System.out.println(new DecimalFormat("##.00").format(json.getFloat("float")));
    }

}
