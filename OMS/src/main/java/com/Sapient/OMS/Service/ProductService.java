package com.Sapient.OMS.Service;

import com.Sapient.OMS.Product;
import com.Sapient.OMS.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public Optional<Product> searchProduct(int productId) {
        return productRepository.findById(productId);
    }

    public ArrayList<Product> getAllProducts()
    {
        ArrayList<Product> productList = (ArrayList<Product>) productRepository.findAll();
        return productList;
    }
}
