package kww.visualTesting;

//import kww.shared.SomeSharedUtility;

public class Launcher {
    public static void main(String[] args) {
//        SomeSharedUtility.println("Dependency from VisualTesting launcher");
        new Launcher().createVisualTestingHost();
    }

    protected void createVisualTestingHost() {
        // originally, this method returns lwjgl application which can be configured by overriding this method and then used as libgdx app
        System.out.println("visualTesting host created");
    }
}
