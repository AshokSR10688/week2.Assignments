package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundRadioButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//label")).click();
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//label)[2]")).click();
		driver.findElement(By.xpath("//input[@name='news']/following-sibling::input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[1]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[1]/div[1]")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
	}

}
