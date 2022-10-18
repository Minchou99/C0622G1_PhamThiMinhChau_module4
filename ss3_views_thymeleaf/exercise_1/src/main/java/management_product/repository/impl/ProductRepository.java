package management_product.repository.impl;

import management_product.model.Product;
import management_product.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1, "Iphone12", 12000000, "Beauty", "Iphone"));
        productList.put(2, new Product(2, "Iphone13", 15000000, "Beauty", "Iphone"));
        productList.put(3, new Product(3, "Iphone14", 17000000, "Beauty", "Iphone"));
        productList.put(4, new Product(4, "Iphone11", 10000000, "Beauty", "Iphone"));
        productList.put(5, new Product(5, "IphoneX", 9000000, "Beauty", "Iphone"));
        productList.put(6, new Product(6, "IphoneXS", 8000000, "Beauty", "Iphone"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = findAll();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                products.add(productList.get(i));
            }
        }
        return products;
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
