
import framework.Helper;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://bvtest.school.cubes.rs/login");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("qa@cubes.rs");

        WebElement emailPassword = driver.findElement(By.name("password"));
        emailPassword.sendKeys("cubesqa");

        WebElement emailSubmit = driver.findElement(By.className("btn-primary"));
        emailSubmit.click();

        System.out.println("Page title is: " + driver.getTitle() + "!");

        WebElement signaturesLink = driver.findElement(By.linkText("Signatures"));
        signaturesLink.click();

        System.out.println("Page title is: " + driver.getTitle() + "!");

        WebElement categoriesLink = driver.findElement(By.partialLinkText("teg"));
        categoriesLink.click();

        System.out.println("Page title is: " + driver.getTitle() + "!");

        WebElement addCategoriesButton = driver.findElement(By.className("pull-right"));
        addCategoriesButton.click();

        WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys(Helper.getRandomText());

        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();

//        alternativni nacin
//        driver.findElement(By.id("save-category-button")).click();
        System.out.println("Page title is: " + driver.getTitle() + "!");
        //       REGIONS

        WebElement navBar = driver.findElement(By.className("navbar-nav"));
        List<WebElement> liTags = navBar.findElements(By.tagName("li"));
        liTags.get(4).click();
        
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement addPortalButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
        addPortalButton.click();
        
        Thread.sleep(7000);
        driver.quit();
        

    }

}
