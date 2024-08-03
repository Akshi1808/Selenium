package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //to maximize
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        Thread.sleep(100);

        driver.findElement(By.id("inputUsername")).sendKeys("deepakshi");
        Thread.sleep(100);

        driver.findElement(By.name("inputPassword")).sendKeys("hello");
        Thread.sleep(200);

        driver.findElement(By.className("signInBtn")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofDays(60));
        Thread.sleep(2000);

        // css selector we use because of error and also there is no specific class, id, tag etc.
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        // use linktext because of link and there is no class, id etc.
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);

        //using xpath
        // can also use (//form/input[1]) -- this is called parent child tagname
        driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("Deepakshi");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("deepakshiraliya12345@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder = 'Phone Number']")).sendKeys("8874665575");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class ='forgot-pwd-btn-conainer']/button[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id = 'visitUSOne']")).click();
        Thread.sleep(2000);

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//
//        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//
//        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//
//        driver.findElement(By.className("signInBtn")).click();
//
//        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//        driver.findElement(By.linkText("Forgot your password?")).click();
//
//        Thread.sleep(1000);//
//
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//
//        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//
//        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//
//        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//
//        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//        Thread.sleep(1000);
//
//        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//
//        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//
//        driver.findElement(By.id("chkboxOne")).click();
//
//        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        driver.close();
    }
}