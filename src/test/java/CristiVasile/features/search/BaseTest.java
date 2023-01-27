package CristiVasile.features.search;

import CristiVasile.steps.serenity.HomepageSteps;
import CristiVasile.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
@Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
        protected HomepageSteps homepageSteps;
    @Test
    public void login(){
        homepageSteps.clickOnLoginBtn();
    }
    @Before
    public void initTest(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }
}
