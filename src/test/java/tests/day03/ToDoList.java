package tests.day03;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToDoListPage;
import utilities.Driver;
import utilities.ReusableMethods;

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
        Thread.sleep(2000);
        page.TaskAddButton.click();

     // görev adi girilir
        Thread.sleep(2000);
        //page.TaskButton.sendKeys("Yolda hiz yapma");

        if (driver.isKeyboardShown()){
            driver.getKeyboard().pressKey("Yolda hiz yapma");
        }else {
            page.TaskButton.sendKeys("Nazik davran");
        }

      // görev kaydedilir
        Thread.sleep(2000);
        page.TaskCreateButton.click();

        TouchAction action=new TouchAction<>(driver);
        Thread.sleep(2000);
        for (int i = 0; i < 3; i++) {
            //action.press(PointOption.point(800,1200)).release().perform();
            ReusableMethods.koordinatTiklamaMethodu(800,1200,300);
        }

       // görev silinir
        Thread.sleep(2000);
        page.TaskOpenButton.click();
        Thread.sleep(2000);
        page.TaskDeleteDreiPunktButton.click();
        Thread.sleep(2000);
        page.TaskDeleteButton.click();
        Thread.sleep(2000);
        page.ConfirmDeleteButton.click();

       // Görev olusturma sayfasina geri dönüldügü dogrulanir
        Assert.assertTrue(page.TaskAddButton.isDisplayed());
    }


}
