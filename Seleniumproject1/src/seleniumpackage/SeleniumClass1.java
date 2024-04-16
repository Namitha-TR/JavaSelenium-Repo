package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass1
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		
		Thread.sleep(3000);
		
		driver.get("https://grotechminds.com/automate-me/");
		Thread.sleep(3000);
		//driver.close();
		//driver.quit();
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	

}
