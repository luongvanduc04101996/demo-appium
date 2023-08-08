package test;

import driver.DriverFactory;
import driver.Platforms;
import helper.HelperSwipe;
import helper.HelperUISelector;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class TestSwipe {
    public static void main(String[] args) {
        AppiumDriver<MobileElement> driver = DriverFactory.getDriver(Platforms.android);

        try {
            MobileElement swipeTabElement = driver.findElement(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("Swipe")));
            swipeTabElement.click();
            MobileElement swipeHorizontallyAreaElement = driver.findElement(MobileBy.AndroidUIAutomator(HelperUISelector.textContains("FULLY OPEN SOURCE")));
            int yHorizontally = swipeHorizontallyAreaElement.getLocation().getY();

            HelperSwipe helperSwipe = new HelperSwipe(driver);
            System.out.println("Swipe up long");
            Thread.sleep(3000L);
            helperSwipe.swipeUpLong();
            System.out.println("Swipe down long");
            Thread.sleep(3000L);
            helperSwipe.swipeDownLong();
            System.out.println("Swipe up short");
            Thread.sleep(3000L);
            helperSwipe.swipeUpShort();
            System.out.println("Swipe down short");
            Thread.sleep(3000L);
            helperSwipe.swipeDownShort();

            System.out.println("Swipe vertically long");
            Thread.sleep(3000L);
            helperSwipe.swipeVertically(80, 10);
            System.out.println("Swipe vertically long");
            Thread.sleep(3000L);
            helperSwipe.swipeVertically(20, 90);
            System.out.println("Swipe horizontally long");
            Thread.sleep(3000L);
            helperSwipe.swipeHorizontally(80, 10, yHorizontally);
            System.out.println("Swipe horizontally long");
            Thread.sleep(3000L);
            helperSwipe.swipeHorizontally(20, 90, yHorizontally);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // quit appium session
            driver.quit();
        }


    }
}
