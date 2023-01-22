package se.jensenyh.javacourse.saltmerch.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.jensenyh.javacourse.saltmerch.backend.model.Product;
import se.jensenyh.javacourse.saltmerch.backend.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.selectAll();
    }

    public List<Product> getAllByCategory(String category) {
        return productRepository.selectAllOfCategory(category);
    }

    public Product getEntireProduct(int id){
        return productRepository.getEntireProduct(id);
    }
}
