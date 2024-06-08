package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreebiesPageObjectModel {
	
	WebDriver driver;
	
	//SignIn 
	    By sign = By.xpath("(//a[normalize-space()='Log In / Sign Up'])[1]");
		By login = By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary'])[2]");
		By emailf = By.xpath("//input[@placeholder='Email Address']");
		By login1 = By.xpath("//span[contains(text(),'Log in')]");
		By newpass = By.xpath("//input[@name='password']");
		By login3 = By.xpath("//span[contains(text(),'Log in')]");
		By child  = By.xpath("//a[@class='cat3NonAct']");
		By edit = By.xpath("//div[@class='all_children_close editInfoUpr 13']//a");
		By calender = By.xpath("(//input[@aria-invalid='false'])[2]");
		By mnthdate = By.xpath("//span[@class='MuiButton-label']//h4");
		By next = By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']//span)[3]");
		By month = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendarHeader-transitionContainer']");
		By date = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendar-transitionContainer']//div//div//div");
		By ok = By.xpath("//span[contains(text(),'OK')]");
		By continues = By.xpath("//span[contains(text(),'Continue')]");
		By confirm = By.xpath("//span[contains(text(),'Confirm Date')]");
		By plus = By.xpath("//div[@class='cstmChildPlus']");
		By addchild = By.xpath("//div[@class='unchild_rght expctChildLast']");
		By name2 = By.xpath("//input[@placeholder='Name']");
		By gender2 = By.xpath("//div[@class='addchild_gender']//button");
		By calender1 = By.xpath("(//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']//input)[2]");
		By mnthdate1 = By.xpath("//span[@class='MuiButton-label']//h4");
		By previous = By.xpath("(//span[@class='MuiIconButton-label'])[1]");
		By matchmonth1 = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']");
		By date1 = By.xpath("//div[@class='MuiPickersSlideTransition-transitionContainer MuiPickersCalendar-transitionContainer']//div//div//div");
		By ok1 = By.xpath("//span[contains(text(),'OK')]");
		By matchmonth2 = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']");
		
		
		
		
		
		public FreebiesPageObjectModel(WebDriver driver2)   {
			
			this.driver = driver2;
		}
		
		
		
		 public WebElement signuplogin()  {
				
				return driver.findElement(sign);
			} 
		   
	
		 public WebElement clicklogin()  {
				
				return driver.findElement(login);
			}
		   
		   
		   public WebElement enteremailf()  {
				
		 		return driver.findElement(emailf);
		 	}
		   
		   
		   public WebElement clicklogin1()  {
				
				return driver.findElement(login1);
			}
		   
		   public WebElement enternewpassword()  {
				
				return driver.findElement(newpass);
			}
		   
		   
		   public WebElement clicklogin3()   {
			   
			   
			   return driver.findElement(login3);
		   }
		   
		    
		   public WebElement clickchild()  {
				
				return driver.findElement(child);
			} 
		   
		    
		   public WebElement clickedit()  {
				
				return driver.findElement(edit);
			} 
		   
		   
		   public WebElement clickcalender()  {
				
				return driver.findElement(calender);
			} 
		   
		   
		   public WebElement clickmnthdate()  {
				
				return driver.findElement(mnthdate);
			} 
		   
		   
		   public WebElement clicknext()  {
				
				return driver.findElement(next);
			} 
		   
		   
		   public WebElement matchmonth()  {
				
				return driver.findElement(month);
			} 
		   
		   
		   public List<WebElement> selectdate ()  {
			   
			   return driver.findElements(date);
		   }
		   
		   
		   public WebElement clickok()  {
				
				return driver.findElement(ok);
			}  
		   
		   
		   public WebElement clickcontinue()  {
				
				return driver.findElement(continues);
			}  
		   
		   
		   
		   public WebElement clickconformdate()  {
				
				return driver.findElement(confirm);
			}  
		   
		   public WebElement clickplus()  {
				
				return driver.findElement(plus);
			}  
		   
		   
		   public WebElement clickaddchild()  {
				
				return driver.findElement(addchild);
			}  
		   
		   public WebElement entername2()  {
				
				return driver.findElement(name2);
			}
		   
		   
		   public List<WebElement> selectgender2 ()  {
			   
			   return driver.findElements(gender2);
		   }
		     
		   
		   public WebElement clickcanlender1()  {
				
		 		return driver.findElement(calender1);
		 	}
		   
		   
		   public WebElement clichmonthdate1()  {
				
		 		return driver.findElement(mnthdate1);
		 	}
		   
		   public WebElement clickprevious()  {
				
		 		return driver.findElement(previous);
		 	}
		   
		   
		   public WebElement matchingmonth1()  {
				
		 		return driver.findElement(matchmonth1);
		 	}
		   
           public List<WebElement> selectdate1 ()  {
			   
			   return driver.findElements(date1);
		   }
		   
           
           
		   public WebElement clickok1()  {
				
		 		return driver.findElement(ok1);
		 	}
		   
		   
		   public WebElement matchingmonth2()  {
				
				return driver.findElement(matchmonth2);
			} 
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
