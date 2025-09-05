package tests.day04;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllCurrencyConPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;

public class AllCurrencyCon {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();

   AllCurrencyConPage page=new AllCurrencyConPage();

   @Test
    public void test01() throws InterruptedException, IOException {
       // AllCurrency Converter uygulamasinin yuklendigi dogulanir
       Assert.assertTrue(driver.isAppInstalled("com.smartwho.SmartAllCurrencyConverter"));

      // Uygulamanin acildigi dogrulanir
      Assert.assertTrue(page.UygulamaAdi.isDisplayed());

     // Cevirmek istedigimiz para birimi Kanada dolari olarak secilir
       ReusableMethods.koordinatTiklamaMethodu(400,450,500);
       Thread.sleep(2000);
       ReusableMethods.scrollWithUiScrollableAndClick("CAD");

     // Cevirilecek tutar 2300 tuslanir
       page.IkiTusu.click();
       Thread.sleep(2000);
       page.UcTusu.click();
       Thread.sleep(2000);
       page.ikiSifirTusu.click();

     // Cevirilecek olan para birimi Japanese Yen olarak secilir
       ReusableMethods.koordinatTiklamaMethodu(400,650,500);
       Thread.sleep(2000);
       ReusableMethods.scrollWithUiScrollableAndClick("Japanese Yen");

     // Cevirilen tutar screenshot olarak kaydedilir
       ReusableMethods.getScreenshot("CeviriSonucu");

       File screenshot=driver.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(screenshot,new File("screenshot.jpg"));

     // Ardindan Kanada dolarinin Japanese Yen karsiligi olan degeri kaydedilir
       String sonucDegeri=page.SonucAlani.getText();

     // Sonuc kullaniciya sms olarak bildirilir
       driver.sendSMS("11","2300 Kanada Dolarinin Japon Yeni karsiligi: "+sonucDegeri);
   }


}
