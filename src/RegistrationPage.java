import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Raman
 * Date: 19/10/13
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegistrationPage {
    public RegistrationPage(){}
    public RegistrationPage(WebDriver driver){
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);
    }
    @FindBy(how = How.ID, using ="user_firstName")
    private static WebElement fName;

    @FindBy(id="user_lastName")
    private static WebElement lName;

    @FindBy(id="user_emailAddr")
    private static WebElement eMail;

    @FindBy(id="user_username")
    private static WebElement uName;

    @FindBy(id="user_password")
    private static WebElement password;

    @FindBy(id="user_phone")
    private static WebElement phone;

    @FindBy(id="user_postcode")
    private static WebElement postcode;

    @FindBy(id="user_dob_1i")
    private static WebElement birthYear;

    @FindBy(id="user_dob_2i")
    private static WebElement birthMonth;

    @FindBy(id="user_dob_3i")
    private static WebElement birthDay;

    @FindBy(id="user_sex")
    private static WebElement sex;

    @FindBy(id="user_tnc")
    private static WebElement agreement;

    @FindBy(how = How.ID, using ="user_comments")
    protected static WebElement comments;

    @FindBy(name="commit")
    private static WebElement submit;

    public void FillForm(
            String First,
            String Last,
            String Email,
            String User,
            String Pass,
            String Phone,
            String PCode,
            String BirthYr,
            String BirthMon,
            String BirthDay,
            String Comments
            )
    {
        fName.sendKeys(First);
        lName.sendKeys(Last);
        eMail.sendKeys(Email);
        uName.sendKeys(User);
        password.sendKeys(Pass);
        phone.sendKeys(Phone);
        postcode.sendKeys(PCode);
        birthYear.sendKeys(BirthYr);
        birthMonth.sendKeys(BirthMon);
        birthDay.sendKeys(BirthDay);
        agreement.click();
        comments.sendKeys(Comments);

    }

    public Homepage register()
    {
        Homepage hPage = new Homepage();
        submit.click();
        return hPage;
    }
}



