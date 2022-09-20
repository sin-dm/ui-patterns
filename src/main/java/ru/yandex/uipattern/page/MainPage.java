package ru.yandex.uipattern.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class MainPage {

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(pageUrl);
    }

    WebDriver driver;
    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    @FindBy(className = "Header_Link__1TAG7")
    private WebElement orderStatusButton;

    @FindBy(xpath = ".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private WebElement orderNumberInput;

    @FindBy(xpath = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private WebElement findOrderButton;

    public MainPage clickOrderStatusButton() {
        orderStatusButton.click();
        return this;
    }

    public MainPage typeOrderNumber(String orderNumber) {
        orderNumberInput.sendKeys(orderNumber);
        return this;
    }

    public OrderStatusPage clickFindOrderButton() {
        findOrderButton.click();
        return new OrderStatusPage(driver);
    }

//    public void clickOrderStatusButton() {
//        driver.findElement(orderStatusButton).click();
//    }
//
//    public void typeOrderNumber(String orderNumber) {
//        driver.findElement(orderNumberInput).sendKeys(orderNumber);
//    }
//
//    public void clickFindOrderButton() {
//        driver.findElement(findOrderButton).click();
//    }
}
