package se.jensenyh.javacourse.saltmerch.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.jensenyh.javacourse.saltmerch.backend.model.Product;
import se.jensenyh.javacourse.saltmerch.backend.repository.ProductRepository;
import se.jensenyh.javacourse.saltmerch.backend.service.ProductService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3010")
@RestController
public class ProductController
{
    int Testid = 1;
    private final ProductService productService;
//    @GetMapping("/products")
  //  public ProductRepository productRepository(){
    //    return new ProductRepository().selectAll();  // Provided list
    // }

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    // get all:
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }
 // by category:
    @GetMapping("/products/bags")
    public List<Product> getAllBags(){
        return productService.getAllByCategory("bags");
    }

    // by id:

   // @GetMapping("products/{}")
  //  public List<Product> getById(){
    //    return productService.getById(1);
   // }



    @GetMapping("/products/{id}")
    public Object getEntireProduct (@PathVariable("id") int productId){
        return productService.getEntireProduct(productId);}

    }










