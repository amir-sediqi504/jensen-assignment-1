package se.jensenyh.javacourse.saltmerch.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import se.jensenyh.javacourse.saltmerch.backend.controller.ProductController;
import se.jensenyh.javacourse.saltmerch.backend.model.ColorVariant;
import se.jensenyh.javacourse.saltmerch.backend.model.Product;
import se.jensenyh.javacourse.saltmerch.backend.service.ProductService;


class TestBag {
    @Mock
    private ProductService productService;
    private ProductController controller;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        controller = new ProductController(productService);

        List<Product> someList = new ArrayList<>();
        someList.add(new Product());

        when(productService.getAllByCategory("bags")).thenReturn(someList);


    }

    @Test
    public void getAllBags_callsGetAllByCategory() {

        List<Product> res = controller.getAllBags();
        System.out.println("res = " + res);

        verify(productService).getAllByCategory("bags");

    }

    @Test
    public void blabla(){
        List<Product> res = controller.getAllBags();
        System.out.println("res = " + res);
        assertEquals(res, controller.getAllBags());
    }
}
