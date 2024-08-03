package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class spicejet {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //to maximize
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(60));

        driver.findElement(By.xpath("//div[@class = 'css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input[1]")).sendKeys("AGR");
        Thread.sleep(200);

//        driver.findElement(By.xpath("//div[@class = 'to-testID-destination']/div/div[1]")).click();
        driver.findElement(By.xpath("//div[@class = 'css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input[1][2]")).sendKeys("JAI");
        Thread.sleep(400);

        driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep]/div[1]")).click();
        Thread.sleep(2000);

        driver.close();

    }
}
