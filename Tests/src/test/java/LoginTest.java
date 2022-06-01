import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginTest extends TestBase  {
    LoginPage loginPageObj;
    String projectPath= System.getProperty("user.dir");
    ProductsPage productsPageObj;

    @Test(priority = 1)
    public void userCanLogin() throws IOException {
    	DesiredCapabilities caps= new DesiredCapabilities();
        Properties prop= new Properties();
        InputStream inputStream= new FileInputStream(projectPath+"/src/test/java/config/config.properties");
        prop.load(inputStream);
        Android_setup();
        loginPageObj = new LoginPage(driver);
        loginPageObj.fillUsername(prop.getProperty("username"));
        loginPageObj.fillPassword(prop.getProperty("password"));
        loginPageObj.clickLogin();
        Assert.assertEquals(productsPageObj.productsPageTitle.getText(),"PRODUCTS");
    }
}
