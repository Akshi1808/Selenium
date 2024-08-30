package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class staticDropdown {

//    if tagname is Select that means dropdown is static

    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.manage().window().maximize();

        driver.findElement(By.id("divpaxinfo")).click();

       Thread.sleep(2000L);

       /*int i=1;

        while(i<5){
        driver.findElement(By.id("hrefIncAdt")).click();
        i++;

        }*/

        System.out.println(driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).getText());

        for(int i=1;i<8;i++)

            {

                driver.findElement(By.xpath("//span[@id = 'hrefIncAdt']")).click();

            }

        driver.findElement(By.id("btnclosepaxoption")).click();

//        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "8 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000L);

        WebElement staticdropdown = driver.findElement((By.id("ctl00_mainContent_DropDownListCurrency")));
        Select dropdown = new Select(staticdropdown);

        dropdown.selectByIndex(2);

        System.out.println(dropdown.getFirstSelectedOption().getText());

        Thread.sleep(2000L);


        driver.quit();


    }
}
