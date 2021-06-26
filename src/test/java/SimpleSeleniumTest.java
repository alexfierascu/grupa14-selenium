import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSeleniumTest {

  public static void main(String[] args) {

    //pt cei cu chrome - windows
    //inca un comentariu
    System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");

    //pt cei cu chrome - mac
    //System.setProperty("webdriver.chrome.driver","src/test/resources/mac/chromedriver");

    //pt cei cu firefox - windows
    //System.setProperty("webdriver.gheckodriver.driver","src/test/resources/windows/geckodriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.emag.ro/");
    driver.quit();

  }

}
