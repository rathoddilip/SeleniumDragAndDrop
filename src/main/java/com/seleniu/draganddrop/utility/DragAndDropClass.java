package com.seleniu.draganddrop.utility;

import com.seleniu.draganddrop.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropClass extends BaseClass {


    @FindBy(xpath = "//*[@id='credit2']/a")
    WebElement source;
    @FindBy(xpath = "//*[@id='bank']/li")
    WebElement destination;

    public DragAndDropClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void drag_and_drop_method() throws InterruptedException {

        Actions actions = new Actions(driver);
        //Dragged and dropped.
        actions.dragAndDrop(source, destination).build().perform();
        Thread.sleep(5000);

    }
}
