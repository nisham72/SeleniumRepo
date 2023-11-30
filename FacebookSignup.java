package assignments.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class FacebookSignup {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));				 
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aadh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("surkin");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("aadhsurkin12@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("test123");
		WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']")); 
		Select bday = new Select(birthday); bday.selectByIndex(6);
		WebElement birthmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select bmon=new Select(birthmonth); bmon.selectByIndex(3);
		WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select byr = new Select(birthyear);
		byr.selectByValue("1996");
        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	}


}
