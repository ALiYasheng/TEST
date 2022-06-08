package com.unitedcoder.classconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaharaLogin {
    public static void main(String[] args) throws InterruptedException {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver1\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //define chromedriver object instance
        WebDriver driver = new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        driver.navigate().to("https://demo.mahara.org/");

        LoginUser user = new LoginUser();
        user.setUserName("Admin");
        user.setPassWord("MaharaDemo");

        WebElement userNameField = driver.findElement(By.id("login_login_username"));
        userNameField.sendKeys(user.getUserName());

        WebElement passWord = driver.findElement(By.id("login_login_password"));
        passWord.sendKeys(user.getPassWord());

        WebElement loginButton = driver.findElement(By.id("login_submit"));
        loginButton.click();

        driver.findElement(By.cssSelector("span[class='icon icon-chevron-down collapsed']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("logoutbutton")).click();
        driver.close();
        driver.quit();



    }
}
