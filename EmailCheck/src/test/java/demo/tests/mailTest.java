
package demo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demo.pages.browserFactory;
import demo.pages.gmailInbox;
import demo.pages.gmailLogin;

public class mailTest {
    
@DataProvider(name = "EmailAddress")
    
    public static Object[][] credentials() {
   
         return new Object[][] { { "seleniumruntest@gmail.com","test@1234" }, { "blr.raghunandan@gmail.com","test@1234mypwd" }};
     
    }
 
 @Test(dataProvider = "EmailAddress")
 public void checkEmail(String username, String pwd) throws InterruptedException
 {
  
     WebDriver driver=browserFactory.startBrowser();
     
     gmailLogin login=PageFactory.initElements(driver, gmailLogin.class);
     login.enterUsername(username);
     login.clickNext();
     login.enterPassword(pwd);
     login.clickpwdNext();
     
     gmailInbox emailbox=PageFactory.initElements(driver, gmailInbox.class);
     emailbox.validateEmailSubject("Test mail");
     emailbox.validateEmailBody("Welcome to Selenium Session");
     driver.quit();
     
      
 }

}
