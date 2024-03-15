package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cine {

    public static void main( String[] args ) {

        System.setProperty("webdriver.edge.driver", "src/test/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.cinecolombia.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[3]/button")).click();

        // hacer click en menu hamburguesa

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div/a")).click();

        // dirigirse a la seccion de comidas y dar click en menu

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/aside/div[1]/div/div[1]/div/div[2]/nav[3]/ul/li[1]/a")).click();

        // dar click en la seccion informativa de "Juan Valdez"

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/section[2]/div/div/div/div[1]/div[3]/article/a/div")).click();

        // seleccionar la opcion de "Bebidas Calientes" y dar click

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[2]/div[2]/div/div/div[5]/article/a/div")).click();

        // se encuentra un bug en el producto "Aromatica Md 215 ml" ya que no hay descrpicon del producto como tampoco hay una imagen alusiva de la misma

        //driver.close();


    }
}

