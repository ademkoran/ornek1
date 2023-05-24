package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
    public WebElement password;
    public WebElement basariligiris;

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//*[@class='btn btn-sign-in-simple']")
    public WebElement ilkLoginLinki;

     @FindBy(xpath ="//input[@type='email']")
    public WebElement emailKutusu;

     @FindBy(xpath ="//input[@type='password']")
    public WebElement passwordKutusu;
@FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;
@FindBy(xpath ="//a[text()='Instructor']")
    public WebElement basariliGirisKontrolElementi;
}
