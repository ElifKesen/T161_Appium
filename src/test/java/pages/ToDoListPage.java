package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ToDoListPage {
    public ToDoListPage(){PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

    @FindBy(xpath = "//*[@text='Welcome to To-do List']")
    public WebElement UygulamaAdi;

    @FindBy(xpath = "//*[@text='CONTINUE']")
    public WebElement continueButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/toolbar_back")
    public WebElement toolbarbackButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_pro_first_close")
    public WebElement IkinciToolbarbackButton;

}
