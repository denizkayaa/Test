import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class projetesti {

    ChromeDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();


    }

    @Test
    public void tests() {

        driver.get("https://www.gittigidiyor.com/uye-girisi");

        driver.findElement(By.name("sifre")).sendKeys("deniz1234");
        driver.findElement(By.id("L-UserNameField")).sendKeys("denizkaya574@gmail.com");
        driver.findElement(By.id("gg-login-enter")).click();

        driver.findElement(By.name("k")).sendKeys("bilgisayar");
        driver.findElement(By.tagName("button")).click();


        driver.findElement(By.xpath("//*[@id=\"item-info-block-532779150\"]/p/img")).click();


    }

    @After
    public void tearDown() {

    }

}
