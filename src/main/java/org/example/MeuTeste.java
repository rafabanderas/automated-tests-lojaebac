package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeuTeste{
    public static void main(String[] args) {
        // Configurar o driver do Chrome (certifique-se de ter o ChromeDriver instalado e configurado corretamente)
        System.setProperty("webdriver.chrome.driver", "caminho/para/o/chromedriver");

        // Inicializar o WebDriver
        WebDriver driver = new ChromeDriver();

        // Abrir a URL da loja online
        driver.get("http://lojaebac.ebaconline.art.br/");

        // Localizar e clicar no botão "Adicionar ao carrinho" para o primeiro produto
        WebElement primeiroProdutoBtn = driver.findElement(By.xpath("//button[text()='Adicionar ao carrinho'][1]"));
        primeiroProdutoBtn.click();

        // Localizar e clicar no botão "Adicionar ao carrinho" para o segundo produto
        WebElement segundoProdutoBtn = driver.findElement(By.xpath("//button[text()='Adicionar ao carrinho'][2]"));
        segundoProdutoBtn.click();

        // Validar se os produtos foram adicionados ao carrinho com sucesso
        WebElement carrinhoLink = driver.findElement(By.id("cart-products-count"));
        int quantidadeProdutosNoCarrinho = Integer.parseInt(carrinhoLink.getText());
        if (quantidadeProdutosNoCarrinho == 2) {
            System.out.println("Os produtos foram adicionados ao carrinho com sucesso!");
        } else {
            System.out.println("Houve um problema ao adicionar os produtos ao carrinho.");
        }

        // Fechar o navegador
        driver.quit();
    }
}
