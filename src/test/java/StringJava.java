import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class StringJava {
    @Test
    public void tesString() throws InterruptedException {
        String expectedlTitle =  new String("Human Resource Management System");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://hrms.cmcglobal.com.vn/login");
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedlTitle,actualTitle);
    }

}
