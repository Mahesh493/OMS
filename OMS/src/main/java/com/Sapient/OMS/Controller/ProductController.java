package com.Sapient.OMS.Controller;

import com.Sapient.OMS.Product;
import com.Sapient.OMS.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/inventory")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/product/{productId}")
    public Optional<Product> searchProduct(@PathVariable int productId)
    {
        return productService.searchProduct(productId);
    }

    @GetMapping("/product")
    public ArrayList<Product> getAllProdcuts()
    {
        return productService.getAllProducts();
    }

    @PostMapping("/product")
    public void createProduct(@RequestBody Product product)
    {
        productService.createProduct(product);
    }


}

