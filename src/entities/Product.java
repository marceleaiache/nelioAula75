package entities;

public class Product {

    //DECLARAÇÃO DOS ATRIBUTOS DA CLASSE
    public String name;
    public double price;
    public int quantity;

    //MÉTODOS CONSTRUTORES
    /*
     * - executa no momento da instaciação do objeto
     * - não há retorno
     * - necessita receber dados como parâmetros
     *
     * obs.:
     * this -> refere-se ao ATRIBUTO do OBJETO
     * não confunda atributo do objeto e parâmetro do método
     */

    //DECLARAÇÃO DO MÉTODO CONSTRUTOR
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //DECLARAÇÃO DE MÉTODOs DO OBJETO (FUNÇÃO)
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //DECLARAÇÃO DO MÉTODO toString
    public String toString() {
        return name
                + ", $ "
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}