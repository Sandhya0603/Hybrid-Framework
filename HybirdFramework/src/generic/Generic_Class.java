package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Generic_Class implements Framework_constant
{
public WebDriver driver;
@BeforeMethod
public void openApp()
{
	System.setProperty(gecko_key,Gecko_value);
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(URL);
}
@AfterMethod
public void closeApp()
{
	driver.close();
}
}
