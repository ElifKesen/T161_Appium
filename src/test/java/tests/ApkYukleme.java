package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApkYukleme {
    AndroidDriver<AndroidElement>driver;

    @Test
    public void ApkYuklme() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4 T");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
       // capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T161_Appium\\Apps\\Calculator_8.4 (503542421)_Apkpure (3).apk");
       // capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T161_Appium\\Apps\\Apk Bilgisi_2.3.4_apkcombo.com.apk");
       // capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T161_Appium\\Apps\\arabam-com-5-4-1.apk");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T161_Appium\\Apps\\To-Do List - Schedule Planner_1.02.61.0928_APKPure.apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

}
