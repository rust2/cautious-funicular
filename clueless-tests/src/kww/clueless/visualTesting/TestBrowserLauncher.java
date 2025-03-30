package kww.clueless.visualTesting;

import kww.shared.SomeSharedUtility;
import kww.visualTesting.Launcher;

public class TestBrowserLauncher extends Launcher {
    public static void main(String[] args) {
        SomeSharedUtility.println("Dependency from TestBrowserLauncher launcher (clueless-tests)");
        new TestBrowserLauncher().createVisualTestingHost();
    }

    @Override
    protected void createVisualTestingHost() {
        // originally, I overrided this method and configured visualTesting host
        System.out.println("customized visualTesting host created");
    }
}
