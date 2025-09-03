package tests.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Arabam {
    AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void ayarlar() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4 T");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        capabilities.setCapability("appPackage","com.dogan.arabam");
        capabilities.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void test1() throws InterruptedException {

        // uygulamanin basarili bir sekilde yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.dogan.arabam"));

        // uygulamanin basarili bir sekilde acildigi dogrulanir
        Assert.assertTrue(driver.findElementById("com.dogan.arabam:id/ivArabamLogo").isDisplayed());

       // alt menuden ilan ara butonuna tiklanir
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@text='İlan Ara']").click();

        // kategori olarak Kiralık Araçlar secilir
        driver.findElementByXPath("//*[@text='Kiralık Araçlar']").click();

       // arac olarak Minivan&Panelvan secilir
        driver.findElementByXPath("//*[@text='Minivan & Panelvan']").click();

       // arac markasi olarak Mercedes benz secilir
        driver.findElementByXPath("//*[@text='Mercedes- Benz']").click();

       // Vito secilir
        driver.findElementByXPath("//*[@text='Vito']").click();

       // listenin geldigi dogrulanir
       String ilanSayisi= driver.findElementById("com.dogan.arabam:id/texViewSubtitle").getText();
       ilanSayisi=ilanSayisi.replaceAll("\\D","");

       Assert.assertTrue(Integer.parseInt(ilanSayisi)>0);


    }
}
