package tests.day03;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToDoListPage;
import utilities.Driver;

public class ToDoList {
    AndroidDriver<AndroidElement>driver= Driver.getAndroidDriver();
    ToDoListPage page=new ToDoListPage();

    @Test
    public void testToDoList() throws InterruptedException {
        // uygulamanin basarili bir sekilde yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("todolist.scheduleplanner.dailyplanner.todo.reminders"));

       // uygulaminin basarili bir sekilde acildigi dogrulanir
        //Assert.assertTrue(driver.findElementByXPath("//*[@text='Welcome to To-do List']").isDisplayed());
        Assert.assertTrue(page.UygulamaAdi.isDisplayed());

      // Ileri butonlarina tiklanir ve pop-up lar kapatilir
        Thread.sleep(2000);
        page.continueButton.click();
        Thread.sleep(2000);
        page.continueButton.click();
        Thread.sleep(2000);
        page.toolbarbackButton.click();
        Thread.sleep(2000);
        page.IkinciToolbarbackButton.click();


// görev ekleme adimina gecilir
// görev adi girilir
// görev kaydedilir
// görev silinir
// Görev olusturma sayfasina geri dönüldügü dogrulanir
    }


}
