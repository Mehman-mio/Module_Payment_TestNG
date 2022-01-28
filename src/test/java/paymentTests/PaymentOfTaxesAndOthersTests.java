package paymentTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.*;
import prePostConditions.BaseTest;
import java.io.IOException;

public class PaymentOfTaxesAndOthersTests extends BaseTest {

    @Test
    public void loginPageTest() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.LoginPageMethods();
    }
    @Test
    public void profileSelectionPageTest(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test
    public void mainPageTest(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickİnvoiceButton();
    }
    @Test
    public void paymentPageTest1(){
        PaymentPage paymentPage = PageFactory.initElements(driver, PaymentPage.class);
        paymentPage.paymentPageMethods();
    }
    @Test
    public void newPaymentModalWinTest(){
        NewPaymentModalWin newPaymentModalWin = PageFactory.initElements(driver, NewPaymentModalWin.class);
        newPaymentModalWin.newPaymentModalWinMethods();
    }
    @Test
    public void paymentPageTest2(){
        PaymentPage paymentPage = PageFactory.initElements(driver, PaymentPage.class);
        paymentPage.payForTaxMethods();
    }
    @Test
    public void gppPageTest() throws IOException{        // First Gpp Page
        GppPage gppPage = PageFactory.initElements(driver, GppPage.class);
        gppPage.gppPageMethods();
    }
    @Test
    public void assertExpectedWithActual(){
        GppPage gppPage = PageFactory.initElements(driver, GppPage.class);
        gppPage.assertValues();
    }
}