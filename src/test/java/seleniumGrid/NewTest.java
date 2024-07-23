package seleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class NewTest 
{
	public WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void crossBrowserTest(String bname) 
  {
	  if(bname.equals("Chrome")) 
	  {
		 driver=new ChromeDriver(); 
	  }else if(bname.equals("Firefox")) 
	  {
		 driver=new FirefoxDriver(); 
	  }else if(bname.equals("Edge")) 
	  {
		 driver=new EdgeDriver(); 
	  }
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is:"+driver.getTitle());
	  }
  }

