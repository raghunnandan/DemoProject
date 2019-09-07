
package demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {
    
    static WebDriver driver;
    
    public static WebDriver startBrowser() {
        
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", path + "/windowgecko.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String url = "https://mail.google.com/mail";
        driver.get(url);
        
        return driver;
        
    }

}
