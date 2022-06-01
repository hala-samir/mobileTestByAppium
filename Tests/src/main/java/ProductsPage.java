import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductsPage extends PageBase {
    public ProductsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    AndroidElement productsPageTitle;
/*
    @AndroidFindBy (id="editTextCategoryName") AndroidElement accountName;
    public void insertAccountName(String name)
    {
        fillTxtField(accountName, name);
    }

    @AndroidFindBy (id="initialAmount")AndroidElement initialAmount;
    public void insertInitialAmount(String value)
    {
        fillTxtField(initialAmount, value);
    }

    @AndroidFindBy(id="save")AndroidElement addBtn;
    public void clickAddBtn()
    {
       clickBtn(addBtn);
    }
    @AndroidFindBy(accessibility = "Navigate up") AndroidElement backBtn;
    public void clickBackBtn()
    {
        clickBtn(backBtn);
    }

    public void selectAccountImage()
    {
        clickBtn(image);
    }
*/
}
