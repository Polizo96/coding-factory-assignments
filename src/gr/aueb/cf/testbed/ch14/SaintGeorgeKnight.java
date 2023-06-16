package gr.aueb.cf.testbed.ch14;
/**
 * Eager instantiation.
 * Singleton Pattern.
 */
public class SaintGeorgeKnight {

    public static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {}

    public static SaintGeorgeKnight getInstance() {
        return INSTANCE;
    }

    public void embarkOnMission() {
        System.out.println("Embarked on mission");
    }
}
