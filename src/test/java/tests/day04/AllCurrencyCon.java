package tests.day04;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllCurrencyConPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AllCurrencyCon {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();

   AllCurrencyConPage page=new AllCurrencyConPage();

   @Test
    public void test01() throws InterruptedException {
       // AllCurrency Converter uygulamasinin yuklendigi dogulanir
       Assert.assertTrue(driver.isAppInstalled("com.smartwho.SmartAllCurrencyConverter"));

      // Uygulamanin acildigi dogrulanir
      Assert.assertTrue(page.UygulamaAdi.isDisplayed());

     // Cevirmek istedigimiz para birimi Kanada dolari olarak secilir
       ReusableMethods.koordinatTiklamaMethodu(400,450,500);
       Thread.sleep(2000);
       ReusableMethods.scrollWithUiScrollableAndClick("CAD");

     // Cevirilecek tutar tuslanir


// Cevirilecek olan para birimi Jepanese Yen olarak secilir
// Cevirilen tutar screenshot olarak kaydedilir
// Ardindan Kanada dolarinin Jepannese Yen karsiligi olan degeri kaydedilir
// Sonuc kullaniciya sms olarak bildirilir
   }


}
