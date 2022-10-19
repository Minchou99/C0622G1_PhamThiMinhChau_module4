package product_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_management.model.Product;
import product_management.repository.IProductRepository;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    void update(Product product);

    void remove(Product product);

}
