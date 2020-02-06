package com.Sapient.OMS.Controller;

import com.Sapient.OMS.Product;
import com.Sapient.OMS.Service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    Product product = new Product();
    ArrayList<Product> productList=new ArrayList<Product>();

    @Mock
    ProductService productService;

    @InjectMocks
    ProductController productController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        product.setProductCode(100);
        product.setPrice(100.00);
        productList.add(0,product);
    }




    @Test
    public void searchProduct() {
//        when(productService.searchProduct(any())).thenReturn(product);
//        Optional<Product> actualProduct=productController.searchProduct(any());
//        assertEquals(productOptional,actualProduct);
    }

    @Test
    public void getAllProdcuts() {
        when(productService.getAllProducts()).thenReturn(productList);
        ArrayList<Product> actualProductList=productController.getAllProdcuts();
        assertEquals(productList,actualProductList);

    }

    @Test
    public void createProduct() {
    }
}