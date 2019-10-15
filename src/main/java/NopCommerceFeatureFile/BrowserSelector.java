package NopCommerceFeatureFile;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSelector extends UtilsPage {

    public void setUpBrowser(){

        String browser = getProperty("Browser");

        if(browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");

            driver = new ChromeDriver();

            }else if(browser.equalsIgnoreCase("firefox")){

            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowswerDriver\\geckodriver.exe");

            driver = new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("edge")){

            System.setProperty("webdriver.edge.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");

            driver = new EdgeDriver();


        }else{

            System.out.println("Browser Name is Empty or Wrong: " + browser);
        }


    }


}
