package ru.yandex.uipattern.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage {

    WebDriver driver;

    public OrderStatusPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By orderNotFoundBlock = By.className("Track_NotFound__6oaoY");

    public boolean getOrderNotFoundBlockState() {
        return driver.findElement(orderNotFoundBlock).isDisplayed();
    }
}
