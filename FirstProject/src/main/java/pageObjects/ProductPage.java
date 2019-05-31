package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ProductPage {



    public ProductPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindAll(@FindBy(how = How.CSS, using = ".noo-product-inner"))
    private List<WebElement> prd_List;

    @FindBy(how = How.CSS, using = "#pa_color")
    private WebElement drpdwn_Colour;

    @FindBy(how = How.XPATH, using = "//*[@value=\"white\"]")
    private WebElement drpdwn_ColourOption;

    @FindBy(how = How.CSS, using = "#pa_size")
    private WebElement drpdwn_Size;

    @FindBy(how = How.XPATH, using = "//*[@value=\"medium\"]")
    private WebElement drpdwn_SizeOption;

    @FindBy(how = How.CSS, using = ".entry-title")
    private WebElement chosenProductname;


    public void select_Product(int productNumber) {
        prd_List.get(productNumber).click();
    }

    public String getChosenProductName() {
        return chosenProductname.getText();
    }

    public String getProductName(int productNumber) {
        return prd_List.get(productNumber).findElement(By.cssSelector("h3")).getText();
    }

    public void select_Colour() {
        drpdwn_Colour.click();
        drpdwn_ColourOption.click();
    }

    public void select_Size() {
        drpdwn_Size.click();
        drpdwn_SizeOption.click();
    }

}
