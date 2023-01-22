package se.jensenyh.javacourse.saltmerch.backend.controller;


import io.micrometer.common.lang.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.jensenyh.javacourse.saltmerch.backend.model.CartItem;
import se.jensenyh.javacourse.saltmerch.backend.service.CartService;

import java.util.List;

@CrossOrigin("http://localhost:3010")
@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/carts/{id}")
    public ResponseEntity<Object> getCartItems(@PathVariable("id") Integer id, @RequestBody CartItem item) {
        List<CartItem> items = cartService.getCartItems(item);
        if (items.isEmpty()) {
            return ResponseEntity.badRequest().body("Cart is empty.");
        }
        return ResponseEntity.ok(items);
    }

    @PatchMapping("/carts/{id}/add")
    public ResponseEntity<Object> addToCart(@PathVariable Integer id,
                                            @RequestBody CartItem item) {
        int result = cartService.addToCart(item);
        if (result == -1) {
            return ResponseEntity.badRequest().body("Out of stock.");
        } else {
            return ResponseEntity.ok().build();
        }
    }

    @PatchMapping("/carts/{id}/remove")
    public ResponseEntity<Object> removeFromCart(@PathVariable Integer id,
                                                 @RequestBody CartItem item) {
        int result = cartService.removeFromCart(item);
        if (result == -1) {
            return ResponseEntity.badRequest().body("Item not found in cart.");
        } else {
            return ResponseEntity.ok().build();
        }
    }

    @DeleteMapping("/carts/{id}")
    public ResponseEntity<Object> removeCart(@PathVariable Integer id
                                            ) {
        int result = cartService.removeCart();
        if (result == -1) {
            return ResponseEntity.badRequest().body("Cart is already empty.");
        } else {
            return ResponseEntity.ok().build();
        }
    }
}


