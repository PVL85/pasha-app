package com.pashacompany.app;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;



public class AppTest {
    MainPage mainPage;

    @Before
    public void beforeTest () {
        mainPage = new MainPage();
        mainPage.openMainPage();
    }
    @Test
    public void testEmptyMiniCart() throws InterruptedException {
        Assert.assertEquals(mainPage.getMiniCartText(),
                "Your shopping cart is empty");
    }

    @After
    public void afterTest() {
        mainPage.closeDriver();
    }
}
