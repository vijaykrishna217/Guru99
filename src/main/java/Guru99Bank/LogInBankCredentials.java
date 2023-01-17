package Guru99Bank;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInBankCredentials {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr470601");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("EqabEbA");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		String title = driver.getTitle();
		String ExpectedTitle = "Guru99 Bank Manager HomePage";
		if (title.equals(ExpectedTitle)) {
			System.out.println("successfully logged in");
		} else {
			System.out.println("error while login");
		}
		System.out.println(title);
	}
}
