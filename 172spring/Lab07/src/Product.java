/**
 * A class that shows the product name, quantity and price
 * @author Lei Chen
 * @date 3/20/2019
 */
public class Product {
    String name;
    int quantity;
    double price;
    public Product(){
        name = " ";
        quantity = 0;
        price = 0;
    }

    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void incrementQuantity(int num){
        quantity = quantity + num;
    }

    public boolean decrementQuanity(){
        if (quantity > 0){
            quantity = quantity - 1;
            return true;
        }
        else{
            return false;
        }
    }

    public void changePrice(double newPrice){
        price = newPrice;
    }

    public String toString(){
        return "\nProduct name:" + name + "\nQuantity:" + quantity + "\nPrice:" + price;
    }
}
