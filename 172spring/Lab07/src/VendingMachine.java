import java.math.RoundingMode;
import java.util.ArrayList;
import java.math.BigDecimal;
/**
 * A class that calculate how the vending Machine works
 * @author Lei Chen
 * @date 3/20/2019
 */
public class VendingMachine extends Product{

    double balance;
    Product deriredProduct;
    ArrayList<Product>inventory;

    /**
     * Add product information
     */
    public VendingMachine(){
        inventory= new ArrayList();
        inventory.add(new Product("Dr.Pepper",5,1.25));
        inventory.add(new Product("Snapple",5,1.00));
        inventory.add(new Product("Water",5,0.80));

        balance = 0.0;
    }

    /**
     * calculate the coin type
     * @param coinType-base on coin class
     */
    public void insertCoin(String coinType){
        Coin coins = new Coin();
        BigDecimal num1 = new BigDecimal(balance);
        BigDecimal num2 = new BigDecimal(coins.value(coinType));
        BigDecimal num3 = num1.add(num2);
        balance = num3.setScale(2, RoundingMode.HALF_EVEN).doubleValue();;
    }

    /**
     * calculate quantity of drinks
     * @param num - number of drink
     * @return
     */
    public boolean buy(int num) {
        deriredProduct = inventory.get(num-1);

        if (deriredProduct.quantity > 0 && balance >= deriredProduct.price){
            BigDecimal num4 = new BigDecimal(balance);
            BigDecimal num5 = new BigDecimal(deriredProduct.price);
            BigDecimal num6 = num4.subtract(num5);
            balance = num6.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
            deriredProduct.decrementQuanity();
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * getters
     * @return - balacve/change/inventory
     */
    public double getBalance(){
        return balance;
    }

    public double makeChange() {
        double Changes = balance;
        balance = 0.0;
        return Changes;
    }
    public String getInventory(){
        String words = "";
        for (Product tmp:inventory){
            words = words + tmp;
        }
        return words;
    }
}
