package oop;

public class Cart {
    private float sum = 0;
    public void addProduct(Product product){
        sum += product.getPrice();
    }

    public float getTotalSum(){
        return sum;
    }
}
