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

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/iv_task_add")
    public WebElement TaskAddButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_input")
    public WebElement TaskButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_btn")
    public WebElement TaskCreateButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_text")
    public WebElement TaskOpenButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_detail_more")
    public WebElement TaskDeleteDreiPunktButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/detail_delete")
    public WebElement TaskDeleteButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_confirm")
    public WebElement ConfirmDeleteButton;



}
