package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Naukri 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.name("google-register")).click();
		}

}
