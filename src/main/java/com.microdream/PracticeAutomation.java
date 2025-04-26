package com.microdream;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PracticeAutomation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        //valid user name and valid password

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.sendKeys("student");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Password123");

        Thread.sleep(800);

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton.click();

        Thread.sleep(700);

        WebElement logOutButton = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
        logOutButton.click();

        Assert.assertEquals();
    }



    //valid user name and invalid password
    @Test
    public void invalidpassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");




        WebElement userName1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName1.sendKeys("student");

        WebElement password1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password1.sendKeys("Password123");

        Thread.sleep(800);

        WebElement submitButton1 = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton1.click();
    }
}

// invalid user name and valid password
@Test
public void invalidUser() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");


//        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
//        userName.sendKeys("student");
//
//        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
//        password.sendKeys("Password123");
//
//        Thread.sleep(800);
//
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        submitButton.click();

}

//valid user name and blank password
@Test
public void blankPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

//        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
//        userName.sendKeys("student");
//
//        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
//        password.sendKeys("");
//
//        Thread.sleep(800);
//
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        submitButton.click();

}

// blank user name and valid password
@Test
public void blankUser() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

//        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
//        userName.sendKeys("");
//
//        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
//        password.sendKeys("Password123");
//
//        Thread.sleep(800);
//
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        submitButton.click();

}

//invalid user name and blank password
@Test
public void invalidUserBlankPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

//        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
//        userName.sendKeys("addff");
//
//        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
//        password.sendKeys("");
//
//        Thread.sleep(800);
//
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        submitButton.click();

}

// blank user name and invalid password
@Test
public void BlankUserInvalidPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

//        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
//        userName.sendKeys("");
//
//        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
//        password.sendKeys("123");
//
//        Thread.sleep(800);
//
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        submitButton.click();

}

//blank user name amd blank password
@Test
public void blankUserAndPassword() {
    WebDriver driver = new ChromeDriver();

    driver.get("https://practicetestautomation.com/practice-test-login/");

//        WebElement userName= driver.findElement(By.xpath("//*[@id=\"username\"]"));
//        userName.sendKeys("");
//
//        WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
//        password.sendKeys("");
//
//        Thread.sleep(800);
//
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        submitButton.click();






}



