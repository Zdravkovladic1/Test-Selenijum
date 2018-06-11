
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://bvtest.school.cubes.rs/login");
        driver.manage().window().maximize();
        
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");
        
        WebElement emailPassword = driver.findElement(By.name("password"));
        emailPassword.sendKeys("cubesqa");
        
        WebElement emailSubmit = driver.findElement(By.className("btn-primary"));
        emailSubmit.click();
        
        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
        signaturesLink.click();

    }

}
