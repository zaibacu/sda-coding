package oop;

public class GroceryStore {
    private Product[] products;
    private int count = 0;
    private Cart cart = new Cart();

    public GroceryStore(){
        this.products = new Product[5];
    }

    public void addProduct(String name, float price){
        addProduct(new Product(name, price));
    }

    public void addProduct(Product product){
        products[count] = product;
        count++;
    }

    public void listProducts(){
        System.out.println("Products:");
        for(int i = 0; i < products.length; i++){
            System.out.printf("%d) %s\n", i, products[i]);
        }
    }

    public void addToCart(int index){
        cart.addProduct(products[index]);
        System.out.printf("Current sum: %.2f EUR\n", cart.getTotalSum());
    }

    public void pay(){
        System.out.printf("It will be: %.2f EUR\n", cart.getTotalSum());
    }
}
