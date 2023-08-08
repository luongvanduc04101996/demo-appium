package helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public class HelperSwipe {
    AppiumDriver<MobileElement> appiumDriver;
    int screenHeight;
    int screenWidth;

    public HelperSwipe(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        Dimension windownSize = appiumDriver.manage().window().getSize();
        screenHeight = windownSize.getHeight();
        screenWidth = windownSize.getWidth();
    }

    public void swipeUpLong (){
        int xStartPoint = screenWidth * 50 / 100;
        int xEndPoint = screenWidth * 50/ 100;

        int yStartPoint = screenHeight * 80 / 100;
        int yEndPoint = screenHeight * 20 / 100;

        PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
        PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yEndPoint);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }

    public void swipeUpShort (){
        int xStartPoint = screenWidth * 50 / 100;
        int xEndPoint = screenWidth * 50 / 100;

        int yStartPoint = screenWidth * 75 / 100;
        int yEndPoint = screenWidth * 45 / 100;

        PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
        PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yEndPoint);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }

    public void swipeDownLong (){
        int xStartPoint = screenWidth * 50 / 100;
        int xEndPoint = screenWidth * 50/ 100;

        int yStartPoint = screenHeight * 20 / 100;
        int yEndPoint = screenHeight * 80 / 100;

        PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
        PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yEndPoint);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }

    public void swipeDownShort (){
        int xStartPoint = screenWidth * 50 / 100;
        int xEndPoint = screenWidth * 50 / 100;

        int yStartPoint = screenWidth * 45 / 100;
        int yEndPoint = screenWidth * 75 / 100;

        PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
        PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yEndPoint);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }

    public void swipeVertically (int yStartPercent, int yEndPercent){
        int xStartPoint = screenWidth * 50 / 100;
        int xEndPoint = screenWidth * 50 / 100;

        int yStartPoint = screenWidth * yStartPercent / 100;
        int yEndPoint = screenWidth * yEndPercent / 100;

        PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
        PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yEndPoint);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }

    public void swipeVertically (int yStartPercent, int yEndPercent, int xPosition){
        int yStartPoint = screenWidth * yStartPercent / 100;
        int yEndPoint = screenWidth * yEndPercent / 100;

        PointOption startPoint = new PointOption().withCoordinates(xPosition, yStartPoint);
        PointOption endPoint = new PointOption().withCoordinates(xPosition, yEndPoint);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }

    public void swipeHorizontally (int xStartPercent, int xEndPercent){
        int xStartPoint = screenWidth * xStartPercent / 100;
        int xEndPoint = screenWidth * xEndPercent / 100;

        int yStartPoint = screenWidth * 50 / 100;
        int yEndPoint = screenWidth * 50 / 100;

        PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
        PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yEndPoint);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }

    public void swipeHorizontally (int xStartPercent, int xEndPercent, int yPosition){
        int xStartPoint = screenWidth * xStartPercent / 100;
        int xEndPoint = screenWidth * xEndPercent / 100;

        PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yPosition);
        PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yPosition);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(startPoint).moveTo(endPoint).release().perform();
    }
}
