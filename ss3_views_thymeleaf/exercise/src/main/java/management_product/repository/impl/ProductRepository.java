package management_product.repository.impl;

import org.springframework.stereotype.Repository;
import management_product.model.Product;
import management_product.repository.IProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1, "Bột giặt", 125000, "Sạch bẩn", "Omo"));
        productList.put(2, new Product(2, "Bột giặt", 150000, "Sạch bẩn", "Omo"));
        productList.put(3, new Product(3, "Bột giặt", 100000, "Sạch bẩn", "Omo"));
        productList.put(4, new Product(4, "Bột giặt", 175000, "Sạch bẩn", "Omo"));
        productList.put(5, new Product(5, "Bột giặt", 200000, "Sạch bẩn", "Omo"));
        productList.put(6, new Product(6, "Bột giặt", 120000, "Sạch bẩn", "Omo"));
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
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
