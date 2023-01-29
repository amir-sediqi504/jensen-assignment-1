package se.jensenyh.javacourse.saltmerch.backend.controller;


import com.fasterxml.jackson.core.PrettyPrinter;
import io.micrometer.common.lang.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import se.jensenyh.javacourse.saltmerch.backend.model.CartItem;
import se.jensenyh.javacourse.saltmerch.backend.service.CartService;
import org.springframework.web.util.UriTemplate;
import java.util.List;

@CrossOrigin("http://localhost:3010")
@RequestMapping("/api/v1")
@RestController
public class CartController {

    @Autowired
    CartService cartService;




    //


 //   @PatchMapping("/carts/{id}")
 //   public ResponseEntity<Object> addTCart(@PathVariable Integer id, @RequestBody CartItem item)
 //   {
  //      String url = "action=add";
    //    String consumeJsonString = restTemplate.getFor
 //       return new ResponseEntity<>(cartService.addToCart(item), HttpStatus.ACCEPTED);
 //   }





    // GET ALL


}


