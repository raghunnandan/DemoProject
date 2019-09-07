
package demo.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailLogin {
    
    private WebDriver driver;
    
    @FindBy(how=How.XPATH,using="//input[@id='identifierId']")
    WebElement emailField;
    
    @FindBy(how = How.ID, using  ="identifierNext")
    WebElement next;
        
    @FindBy(how=How.XPATH,using="//input[@name='password']")
    WebElement passwordField;
    
    @FindBy(how = How.ID, using  ="passwordNext")
    WebElement pwdnext;
    
    @FindBy(how=How.XPATH,using="//span[@class='bog']")
    List<WebElement> emailThreads;
    
    
    public gmailLogin(WebDriver driver) {
        this.driver=driver;
    }
    
    public void enterUsername(String userID) {
          emailField.sendKeys(userID);
        
    }
    
    public void clickNext() {
        next.click();      
    }
    
    public void enterPassword(String password) {
      
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
      
    }
    
    public void clickpwdNext() throws InterruptedException {
        pwdnext.click(); 
        Thread.sleep(5000);
    }

}
