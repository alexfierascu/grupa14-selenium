import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleSeleniumTest {

  public static void main(String[] args) {

    //pt cei cu chrome - windows
    //setez calea catre driver
    System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");

    //pt cei cu chrome - mac
    //System.setProperty("webdriver.chrome.driver","src/test/resources/mac/chromedriver");

    //pt cei cu firefox - windows
    //System.setProperty("webdriver.gheckodriver.driver","src/test/resources/windows/geckodriver.exe");


    //creaza o instanta noua de ChromeDriver
    WebDriver driver = new ChromeDriver();

    //maximizeaza browserul
    driver.manage().window().maximize();

    //navigheaza catre url
    driver.get("https://www.emag.ro/");

    //inchide instanta de Chrome
    driver.quit();

  }

}
