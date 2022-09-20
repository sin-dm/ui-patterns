package ru.yandex.uipattern;


import org.junit.Test;

import ru.yandex.uipattern.page.MainPage;
import static org.junit.Assert.assertTrue;

public class SeleniumTest extends BaseTest {

    @Test
    public void test() {
        int a = 1;
        assertTrue(new MainPage(driver)
                .clickOrderStatusButton()
                .typeOrderNumber("100")
                .clickFindOrderButton()
                .getOrderNotFoundBlockState());
    }
}
