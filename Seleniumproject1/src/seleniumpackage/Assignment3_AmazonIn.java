package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_AmazonIn 
{

	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&gclid=CjwKCAjwoPOwBhAeEiwAJuXRh1DeJfoJoqS0Lhh_ABqLxyVrzTudbNIyJxcK6QfWBOTCYaahJ8zEdhoCiWYQAvD_BwE&hvadid=590652406969&hvdev=c&hvlocphy=9185294&hvnetw=g&hvqmt=b&hvrand=1873737958889295160&hvtargid=kwd-294882733100&hydadcr=24542_2265395&tag=googinhydr1-21&ref=pd_sl_2cwzc6x246_b");
		driver.findElement(By.className("nav-a  ")).sendKeys("Customer Service");
	}

}
