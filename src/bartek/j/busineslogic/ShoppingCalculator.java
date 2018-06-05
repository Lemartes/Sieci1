package bartek.j.busineslogic;

import bartek.j.model.Product;

import java.util.List;

public class ShoppingCalculator {

    public double totalPrice(List<Product> products){
        return  products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double averagePrice(List<Product> products){
        return  products.stream().mapToDouble(Product::getPrice).sum()/products.size();
    }
}
