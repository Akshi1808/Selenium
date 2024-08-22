package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FrameTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        Thread.sleep(1000);

//        for dragging the element
        Actions a = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        Thread.sleep(1000);
        WebElement target = driver.findElement(By.id("droppable"));
        Thread.sleep(1000);

        a.dragAndDrop(source, target).build().perform();
    }
}
