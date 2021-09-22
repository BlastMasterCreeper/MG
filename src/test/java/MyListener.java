public class MyListener implements UnitListener {

    @Override
    public void handleEvent(UnitEvent e) {
        System.out.println("unitId: "+ e.getUnitId());
    }
}
