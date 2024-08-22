package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.in/");
        driver.manage().window().maximize();

        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();

        Thread.sleep(2000);
//        move to specific element
        a.moveToElement(move).build().perform();


    }
}
