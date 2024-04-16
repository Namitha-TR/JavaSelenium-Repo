package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook
{

	public static void main(String[] args) 
	{

      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      driver.findElement(By.id("email")).sendKeys("namithagowda.tr@gmail.com");
      driver.findElement(By.id("pass")).sendKeys("Nammi@29");
      driver.findElement(By.id("loginbutton")).click();
     }

}
