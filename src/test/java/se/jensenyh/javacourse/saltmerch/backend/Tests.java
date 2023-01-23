package se.jensenyh.javacourse.saltmerch.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;
import se.jensenyh.javacourse.saltmerch.backend.controller.CartController;
import se.jensenyh.javacourse.saltmerch.backend.controller.ProductController;
import se.jensenyh.javacourse.saltmerch.backend.model.Product;
import se.jensenyh.javacourse.saltmerch.backend.service.ProductService;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
public class Tests
{
    @Test
void testBag(){
        ProductService p = new ProductService();
        ProductController pc = new ProductController(p);
        pc.getAllBags();
        assertEquals(200, pc.getAll);
    }
}

