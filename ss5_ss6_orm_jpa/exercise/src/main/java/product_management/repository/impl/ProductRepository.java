package product_management.repository.impl;

import org.springframework.stereotype.Repository;
import product_management.model.Product;
import product_management.repository.IProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ProductRepository implements IProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager
                .createQuery("select p from Product as p ", Product.class);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> findByName(String name) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product as p where p.name like :name ", Product.class)
                .setParameter("name", "%" + name + "%");
        return query.getResultList();
    }

    @Override
    public void update(Product product) {
        entityManager.merge(product);
    }

    @Override
    public void remove(Product product) {
        entityManager.remove(entityManager.merge(product));
    }
}
