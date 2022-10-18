package management_product.repository;

import management_product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    void update(int id, Product product);

    void remove(int id);

}
