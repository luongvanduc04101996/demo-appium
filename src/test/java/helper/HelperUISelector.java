package helper;

public class HelperUISelector {
    //Information: https://developer.android.com/reference/androidx/test/uiautomator/UiSelector

    private static String defaultDeclare = "new UiSelector()";
    
    public static String textContains(String text) {
        return defaultDeclare + ".textContains(\"" + text + "\")";
    }
}
