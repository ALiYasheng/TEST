package com.unitedcoder.classconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionLibrary {
    WebDriver driver;
    public void openBrowser (String url){

        //define chrome diver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver1\\chromedriver.exe");
        //define chromedriver object instance
        driver= new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void logIn(String userName, String password){
        WebElement userNameField = driver.findElement(By.id("userName"));
        userNameField.sendKeys(userName);
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement logInButton = driver.findElement(By.id("login"));
        logInButton.click();
    }

    public boolean verifyLogin(){
        WebElement logoutLink=driver.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
        if(logoutLink.isDisplayed()){
            System.out.println("Login Successfully!");
            return true;
        }
        else {
            System.out.println("Login Failed!!");
            return false;
        }
    }
    public void addNewsLetter(String subject,String name,String email,String htmlContent){
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletters"));
        newsLetterLink.click();
        WebElement addNewsLetterLink=driver.findElement(By.linkText("Create Newsletter"));
        addNewsLetterLink.click();
        WebElement subjectField=driver.findElement(By.id("email_subject"));
        subjectField.sendKeys(subject);
        WebElement sendersNameField=driver.findElement(By.id("sender_name"));
        sendersNameField.sendKeys(name);
        WebElement mailAddressField=driver.findElement(By.id("sender_email"));
        mailAddressField.sendKeys(email);
        WebElement htmlContentLink=driver.findElement(By.xpath("//div[@id=\"tab_email_html\"]/a"));
        htmlContentLink.click();
        driver.switchTo().frame(0);
        WebElement contentField=driver.findElement(By.xpath("/html/body/p"));
        contentField.sendKeys(htmlContent);
        driver.switchTo().defaultContent();
        WebElement saveButton=driver.findElement(By.xpath("//input[@value=\"Save\"]"));
        saveButton.click();
    }

    public boolean verifyNewsLetterAddedSuccessfully(){
        String expectedMessage="Newsletter Saved.";
        String actualMessage=driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div")).getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("News letter added successfully");
            return true;
        }
        else {
            System.out.println("Failed to add Newsletter!!");
            return false;
        }
    }

    public boolean logout(){
        WebElement logoutLink=driver.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
        logoutLink.click();
        WebElement loginButton=driver.findElement(By.id("login"));
        if(loginButton.isDisplayed())
            return true;
        else
            return false;
    }


    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
