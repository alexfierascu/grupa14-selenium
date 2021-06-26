import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTestEmag {

  @Test
  public void verifyThat2NumbersAreTheSame() {
    //declaram 2 numere
    int a = 1;
    int b = 1;

    //verificam gradul de adevar a urmatoarei linii de cod
    //assertEquals(dam ca parametrii 2 variabile)
    //daca functia assertEquals - va trece - testul va fi verde
    //daca functia assertEquals - va pica - testul va fi portocaliu/ rosu
    assertEquals(a, b);
  }

  @Test
  public void verifyThatUserCanNavigateToWebApp() {
    //pt cei cu chrome - windows
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

    //imi declar un string cu valoarea pe care ma astept sa o aiba pagina pe care am vizitat-o
    String expectedTitle = "eMAG.ro - Libertate în fiecare zi";

    //imi declar un string cu valoarea pe care o returneaza driverul (selenium)
    String actualTitle = driver.getTitle();

    //verific ca cele 2 stringuri(valori de titlu) sunt egale
    assertEquals(actualTitle, expectedTitle);

    //inchide instanta de Chrome
    driver.quit();
  }


  @Test
  public void verifyThatRegisterUserCanLogin() {
    //pt cei cu chrome - windows
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

    WebElement buttonContulMeu = driver.findElement(By.id("my_account"));
    buttonContulMeu.click();

    WebElement inputUsername = driver.findElement(By.id("user_login_email"));
    inputUsername.click();
    inputUsername.sendKeys("fier4jat@yahoo.com");

    WebElement buttonContinua = driver.findElement(By.id("user_login_continue"));
    buttonContinua.click();

    driver.quit();

//    WebElement inputPassword = driver.findElement(By.id("user_login_password"));
//    inputPassword.click();
//    inputPassword.sendKeys("hamleys,28.");
//
//    buttonContinua.click();

  }

}
