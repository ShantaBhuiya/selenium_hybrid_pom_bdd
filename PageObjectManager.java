package managers;

import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ProductDetailPage;
import pageobjects.ProductListPage;

public class PageObjectManager {
    private final WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductListPage productListPage;
    private ProductDetailPage productDetailPage;
    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public ProductListPage getProductListPage() {
        return (productListPage == null) ? productListPage = new ProductListPage(webDriver) : productListPage;
    }

    public ProductDetailPage getProductDetailPage() {
        if (productDetailPage == null) productDetailPage = new ProductDetailPage(webDriver);
        return productDetailPage;
    }
}