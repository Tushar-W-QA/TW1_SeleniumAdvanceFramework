package org.tusharwaraddtsw.tests.vwoLogin;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tusharwaraddtsw.pages.pageObjectModel.LoginPage_POM;

public class Test_VWOlogin_POM {

    @Description("Verify the Error message after try to login with Invalid Credential")
    @Test
    public void test_VWOLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg = loginPagePom.loginVWOWithInvalidCred("Admin12", "test123");

        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");

        driver.quit();
    }
}
