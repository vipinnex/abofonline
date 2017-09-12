package Com.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.library.BaseClass;

public class SelectClass extends BaseClass{
	@Test
	
	public void Select() throws InterruptedException {
	
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("vipin");
		driver.findElement(By.xpath("//input[@ ng-model='LastName']")).sendKeys("nex");
	driver.findElement(By.tagName("textarea")).sendKeys("btm bangalore");
		
     driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("vipin.nex@gmail.com");	
     
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9656377998");	
	driver.findElement(By.name("radiooptions"));
	List<WebElement>element=driver.findElements(By.name("radiooptions"));
	int count=element.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		Thread.sleep(3000);
		element.get(i).click();
		Thread.sleep(4000);
		
	}
	
	driver.findElement(By.id("checkbox1"))	.click();
	
	
	driver.findElement(By.id("Skills")).click();
	Select select=new Select(driver.findElement(By.id("Skills")));
	
	Thread.sleep(3000);
	select.selectByVisibleText("C++");
	
	Thread.sleep(10000);
	driver.findElement(By.id("countries")).click();
	Select select1=new Select(driver.findElement(By.id("countries")));
	Thread.sleep(4000);
    select1.selectByVisibleText("India");
    Thread.sleep(4000);
    driver.findElement(By.id("firstpassword")).sendKeys("123456");
    driver.findElement(By.id("secondpassword")).sendKeys("123456");
    driver.findElement(By.id("submitbtn")).click();
    
			
	
	
	
	
	}
}
