package com.qacart.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    @Test
    public void launchApp() throws MalformedURLException {
        String url = "http://127.0.0.1:4723/wd/hub";

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a XL API 29");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//        caps.setCapability(MobileCapabilityType.APP, "/Users/james.best/code/lab/react-native/Appium_QAcart_To_Do_App/android/app/build/outputs/apk/debug/app-debug.apk");
        //AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL(url), caps);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        caps.setCapability(MobileCapabilityType.APP, "/Users/james.best/Library/Developer/Xcode/DerivedData/todoqacart-cpxudaranvfmnbhdkpiuuywasucf/Build/Products/Debug-iphonesimulator/todoqacart.app");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
    }
}
