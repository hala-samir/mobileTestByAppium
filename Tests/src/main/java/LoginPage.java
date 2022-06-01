import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase{
    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(accessibility="test-Username") MobileElement usernameField;
    public void fillUsername(String username) {
        fillTxtField(usernameField, username);
    }
    @AndroidFindBy(accessibility="test-Password") MobileElement passwordField;
    public void fillPassword(String password) {
        fillTxtField(passwordField,  password);
    }
    @AndroidFindBy(accessibility="test-LOGIN") MobileElement loginBtn;
    public void clickLogin(){
        clickBtn(loginBtn);
    }
}
