package se.jensenyh.javacourse.saltmerch.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/products/hats")
    public List<Product> getAllHats(){
        return productService.getAllByCategory("hats");
    }

    @GetMapping("/products/jackets")
    public List<Product> getAllJackets(){
        return productService.getAllByCategory("jackets");
    }

    @GetMapping("/products/tshirts")
    public List<Product> getAllts(){
        return productService.getAllByCategory("tshirts");
    }




    // by id:

    @PutMapping("/products/{id}")
    public List<Product> getProdById(@PathVariable("id") Integer id) {

        return (List<Product>) productService.getEntireProduct(id);
    }

   // @GetMapping("products/{}")
  //  public List<Product> getById(){
    //    return productService.getById(1);
   // }



    @GetMapping("/products/{id}")
    public Object getEntireProduct (@PathVariable("id") int productId){
        return productService.getEntireProduct(productId);
    }

}










