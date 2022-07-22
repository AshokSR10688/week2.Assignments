package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundHyperLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//a")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//a)[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'large-6 small-12')]//a)[3]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/div[1]/div[1]/a[1]")).click();

	}

}
