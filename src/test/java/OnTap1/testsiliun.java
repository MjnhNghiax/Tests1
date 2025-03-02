package OnTap1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsiliun {
    ChromeDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testSeleium() throws InterruptedException {
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(2000);

        driver.findElement(By.xpath(""));

    }
}
