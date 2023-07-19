import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {

//sout +enter
        //System.out.println(System.getProperty("user.dir"));
        String ChromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        //System.out.println(ChromePath);
        System.setProperty("webdriver.chrome.driver",ChromePath);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("Testing");
      //  driver.findElement(By.name("password")).sendKeys("5678");
        // Enter in field

        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

        //syntax for css selector tabgname[attribute="value"]
      //  driver.findElement(By.cssSelector("button[class=\"radius\"]")).click();
        //sytnax for xpath @TagName[@attribute="value"]

       // driver.findElement(By.xpath("//button[@class=\"radius\"]")).click();
       // driver.findElement(By.linkText("Elemental Selenium")).click();



        //driver.close();
       // driver.quit();
    }
}



