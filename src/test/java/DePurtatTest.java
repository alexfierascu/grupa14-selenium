import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DePurtatTest {

  @Test
  @Order(1)
  public void verifyThatUserCanAccessWebApplication() {

    //pt cei cu chrome - windows
    //setez calea catre driver
    System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://www.depurtat.ro/");

    String expectedTitle = "dEpurtat.ro - Magazinul tău cu încălțăminte de damă";

    String actualTitle = driver.getTitle();

    assertEquals(actualTitle, expectedTitle);

    driver.quit();

  }

  @Test
  @Order(2)
  public void verifyThatRegisteredUserCanLogin() {
    //pt cei cu chrome - windows
    //setez calea catre driver
    System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://www.depurtat.ro/");

    WebElement buttonMyAccount = driver
        .findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div/a[3]"));
    buttonMyAccount.click();

    WebElement inputFieldUsername = driver.findElement(By.id("profile_email"));
    WebElement inputFieldPassword = driver.findElement(By.id("profile_password"));
    WebElement buttonContinue = driver
        .findElement(By.xpath("//*[@id=\"page_login_form\"]/div[4]/button"));

    inputFieldUsername.click();
    inputFieldUsername.sendKeys("barosanunumber1@gmail.com");

    inputFieldPassword.click();
    inputFieldPassword.sendKeys("Cemaifacetidragilor?");

    //apas butonul de continua pe pagina
    buttonContinue.click();

    String actualTitle = "dEpurtat - Vizualizare cont";

    String expectedTitle = driver.getTitle();

    assertEquals(actualTitle, expectedTitle);

    driver.quit();
  }


  @Test
  @Order(3)
  public void verifyThatLoggedInUserCanLogout() {

    //pt cei cu chrome - windows
    //setez calea catre driver
    System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://www.depurtat.ro/");

    WebElement buttonMyAccount = driver
        .findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div/a[3]"));
    buttonMyAccount.click();

    WebElement inputFieldUsername = driver.findElement(By.id("profile_email"));
    WebElement inputFieldPassword = driver.findElement(By.id("profile_password"));
    WebElement buttonContinue = driver
        .findElement(By.xpath("//*[@id=\"page_login_form\"]/div[4]/button"));

    inputFieldUsername.click();
    inputFieldUsername.sendKeys("barosanunumber1@gmail.com");

    inputFieldPassword.click();
    inputFieldPassword.sendKeys("Cemaifacetidragilor?");


    buttonContinue.click();

    String actualTitleMyAccount = "dEpurtat - Vizualizare cont";

    String expectedTitleMyAccount = driver.getTitle();

    assertEquals(actualTitleMyAccount, expectedTitleMyAccount);


    WebElement buttonLogout = driver.findElement(By.xpath("//*[@id=\"page_content\"]/div[4]/div[1]/div/ul/li[6]/a"));
    buttonLogout.click();


    String expectedTitleMainPage = "dEpurtat.ro - Magazinul tău cu încălțăminte de damă";

    String actualTitleMainPage  = driver.getTitle();

    assertEquals(actualTitleMainPage, expectedTitleMainPage);

    driver.quit();

  }

}
