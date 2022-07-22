package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='example']//label")).click();
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		driver.findElement(By.xpath("(//div[@class='example']//label)[2]")).click();
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/input[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/input[4]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/input[5]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/input[6]")).click();

	}

}
