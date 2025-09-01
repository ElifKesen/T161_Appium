package tests.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HesapMak {
    AndroidDriver<AndroidElement> driver;
    // oncden tek bir driver vardi. o da appiumDriver di. zamanla appium kendini gelistirdi
    // android icin ayri ios icin ayri ozellikleri bulunan driverlar uretti. IOSDriver<IOSElement> iosDriver;


    @Test
    public void HesapMak() throws MalformedURLException {
        // kullanici gerekli kurulumlari yapar
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4 T");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T161_Appium\\Apps\\Calculator_8.4 (503542421)_Apkpure (3).apk");
        //App capability bir uygulama eger yuklu degilse uygulamayi cihaza yuklemek icin kullanilir
        //Eger uygulama yukluyse ve tekrardan test calistirilirsa App capability uygulama yuklu mu diye kontrol eder
        // eger yuklu degilse uygulamayi yukler, eger yukluyse uygulamayi acar


        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



        // uygulamanin yuklendigini dogrular(isInstalled)
        Assert.assertTrue(driver.isAppInstalled("com.google.android.calculator"));

        // uygulamanin acildigini dogrular


        // 400 un 3 katininin 1200 oldugunu hesap makinasindan dogrulayalim

    }


}
