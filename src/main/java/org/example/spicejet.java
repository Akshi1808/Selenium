package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class spicejet {

    public static <list> void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //to maximize
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(60));

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input[1]"));

        for (WebElement element : elements) {
            System.out.println(element.getText());
            // Perform actions like click, sendKeys, etc.
        }

        WebElement firstElement = elements.get(0);
        firstElement.sendKeys("AGR");

        WebElement secondElement = elements.get(1);
        secondElement.sendKeys("JSA");

        Thread.sleep(1000);

        List<WebElement> date = driver.findElements(By.xpath("//div[@class = 'css-1dbjc4n']/div/div[3]"));

        WebElement futuredate = date.get(5);
        System.out.println(futuredate);
        futuredate.click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class = 'css-1dbjc4n r-18u37iz r-1wtj0ep r-1lgpqti']/div[2]/div[1]")).click();
        Thread.sleep(3000);

        driver.close();

    }
}
