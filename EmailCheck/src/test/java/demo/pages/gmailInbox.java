
package demo.pages;


import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class gmailInbox {
    
    @FindBy(how=How.XPATH,using="//span[@class='bog']")
    List<WebElement> emailThreads;
    
    @FindBy(how=How.XPATH,using="//div[contains(text(),'Selenium Session')]")
    WebElement emailBodyString;
    
    
    public void validateEmailSubject(String str)
    {
        for(int i=0;i<emailThreads.size();i++) {
            if(emailThreads.get(i).getText().contains(str)) {
                assertEquals(emailThreads.get(i).getText(), str);
                emailThreads.get(i).click();
                 break;
            }
        }
       
    }
    
    public void validateEmailBody(String strg)
    {  
       assertEquals(emailBodyString.getText().trim(), strg.trim());
    }
   
    
    
    

}
