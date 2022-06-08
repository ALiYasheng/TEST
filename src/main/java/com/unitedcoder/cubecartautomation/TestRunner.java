package com.unitedcoder.cubecartautomation;

import com.unitedcoder.classconcepts.LoginUser;

public class TestRunner extends TestBase{
    public static void main(String[] args) {
        browserSetUp();
        LoginPage loginPage= new LoginPage();
        LoginUser loginUser= new LoginUser("testautomation1","automation123!");
        loginPage.logIn(loginUser);
        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.verifyLogin();
        dashBoardPage.clickOnCategoryLink();
        CategoryPage categoryPage=new CategoryPage();
        categoryPage.addCategoryLink();
        categoryPage.verifyCategoryDeletedSuccessFully();
        categoryPage.deleteCategory();
        categoryPage.verifyCategoryDeletedSuccessFully();
        closeBrowser();
    }
}
