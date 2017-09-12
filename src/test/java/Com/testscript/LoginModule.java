package Com.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.library.BaseClass;

public class LoginModule extends BaseClass{
@Test
public void logintoabofapplication() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='Sign In/Register']")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Already Registered?')]")).click();
Thread.sleep(2000);



driver.findElement(By.xpath("//input[@name='emailAddress'])[2]")).sendKeys("vipin.nex@gmail.com");
Thread.sleep(6000);
}
}

