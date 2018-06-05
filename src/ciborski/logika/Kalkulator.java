package ciborski.logika;

import ciborski.Product;

import java.util.List;

public class Kalkulator {

    public double total(List<Product> products){
        return  products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double average(List<Product> products){
        return  products.stream().mapToDouble(Product::getPrice).sum()/products.size();
    }
}
