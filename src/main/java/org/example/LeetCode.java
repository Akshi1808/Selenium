package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LeetCode {

    public static void main( String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://leetcode.com/accounts/login/");

        driver.findElement(By.id("id_login")).sendKeys("deepakshi");
        Thread.sleep(2000);

        driver.findElement(By.id("id_password")).sendKeys("deepakshi");
        Thread.sleep(2000);

        driver.findElement(By.id("signin_btn")).click();
        Thread.sleep(1000);


        driver.quit();



    }
}
