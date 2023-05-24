package pages;

import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public WebElement aramaKutusu;
    public JsonParser aramaSonucuElementi;

    //Page class lari suerekli kullandıgımız locate islemleri
    //ve varsa login gibi kucuk islevleri iceren method lar barindirir
    //Selenium ile locate islemi veya herjhengi bir islev gerceklestirmek istededigimizde
    //Webdriver objesine ihtiyac vardir

    //Pom de driver class inda olusturdugumuz
    //Webdriver driver objesini page class larina tanimlamak icin
    //PagaFactory class indan initElements() kullanilir
       public  AmazonPage(){
           PageFactory.initElements(Driver.getDriver(),this);
           //Bu ayari constructor icine koyma sebebimiz:
           //page sayfalarina obje olusturularak ulasildigi icin
           //kim page sayfasini kullanmak isterse
           //page sayfasindan obje olusturmak icin , constructor calisacak
           //ve bu constructor in icinde bulunan initElements() gerekli ayari yapmis olacak



       }

       @FindBy(id="twotabsearchtextbox")
    public  WebElement AramaKutusu;
       @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuEementi;





}
