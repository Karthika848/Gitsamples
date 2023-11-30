package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestPage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver ();
driver.get("https://the-internet.herokuapp.com/login");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
driver.findElement(By.className("radius")).click();


		
		
	}

}
