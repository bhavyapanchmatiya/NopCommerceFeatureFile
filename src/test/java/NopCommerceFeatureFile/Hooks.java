package NopCommerceFeatureFile;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {


BrowserSelector browserSelector = new BrowserSelector();

@Before
    public void setUpBroswer(){


    browserSelector.setUpBrowser();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.get("https://demo.nopcommerce.com/");

}
    @After
    public void closeBrowser(Scenario scenario){

        if(scenario.isFailed()){

            UtilsPage.takeSnapShot(scenario.getName());
        }
        //driver.quit();
    }

}
