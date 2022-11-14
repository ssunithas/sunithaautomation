package MavenProject.Mavennewproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass1 {
	
	@Test
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sunit\\Documents\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
		System.out.println();
	}

}
