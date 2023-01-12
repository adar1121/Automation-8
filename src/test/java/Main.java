import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {

    private static ChromeDriver driver;
    private static FirefoxDriver firefoxdriver;
    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Automation Course\\chromedriver.exe");
        driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Automation Course\\geckodriver.exe");
        firefoxdriver = new FirefoxDriver();
    }

    @Test
    public void openChromeAndFireFox_1(){
    driver.get("https://www.walla.co.il");
    firefoxdriver.get("https://www.ynet.co.il");
    }


    @Test
    public void openChromeBrowser_2(){
        driver.navigate().to("https://translate.google.com/");
        System.out.println(driver.findElement(By.className("er8xn")));
        System.out.println(driver.findElement(By.cssSelector("textarea[jsname=BJE2fc")));
    }

    @Test
    public void openFireFoxBrowser_3(){
        firefoxdriver.get("https://www.youtube.com/");
        System.out.println(driver.findElement(By.id("logo-icon")));
    }

    @Test
    public void fireFoxSeleniumWeb_4(){
        firefoxdriver.navigate().to("http://www.seleniumhq.org/");
        firefoxdriver.findElement(By.className("DocSearch-Button-Placeholder")).click();
        firefoxdriver.findElement(By.id("docsearch-input")).sendKeys("selenium");
    }

    @Test
    public void amazonTests_5(){
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("field-keywords")).sendKeys("Leather shoes");
    }

    @Test
    public void googleTranslateTest_6(){
        driver.get("https://translate.google.com/");
        driver.findElement(By.cssSelector("textarea[spellcheck=false")).sendKeys("בדיקות אוטומטיות");
    }

    @Test
    public void youTubeTest_7(){
        WebElement youtube;
        driver.get("https://www.youtube.com/");
        youtube = driver.findElement(By.cssSelector("input[autocomplete=off]"));
        youtube.sendKeys("despacito");
        youtube.submit();
    }

    @Test
    public void FBLogin_8(){
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(".......");
        driver.findElement(By.name("pass")).sendKeys(".......");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void jsexecuterInterface_9(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("https://www.amazon.com/");
        jse.executeScript("document.getElementById('nav-link-accountList').click()");
    }


/////10/////
    // is it possible to run multiple browsers with TestNG

    @AfterClass
    public void close(){
        driver.close();
    }

}
