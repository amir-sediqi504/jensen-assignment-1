package se.jensenyh.javacourse.saltmerch.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import se.jensenyh.javacourse.saltmerch.backend.model.CartItem;
import se.jensenyh.javacourse.saltmerch.backend.repository.CartRepository;
import java.util.List;
@Service
public class CartService
{
    @Autowired
    CartRepository cartRepository;

    public List<CartItem> getCartItem(Integer id) {
        return cartRepository.selectAllItems();
    }


    public int patch(CartItem cartItem, String addOrRemove) {
        if (addOrRemove.equalsIgnoreCase("add")) {
            return cartRepository.insertOrIncrementItem(cartItem);
        } else if (addOrRemove.equalsIgnoreCase("remove")) {
            return cartRepository.deleteOrDecrementItem(cartItem);
        } else return -1;
    }

    public Integer addItemToCart(int id, String action, CartItem item){
        return cartRepository.insertOrIncrementItem(item);
    }
    public int RemoveItemToCart(int id, String action, CartItem item){
        return cartRepository.deleteOrDecrementItem(item);
    }

    public int add(CartItem cartItem, String add){
        return cartRepository.insertOrIncrementItem(cartItem);
    }

    public int delete(CartItem cartItem, String delete){
        return cartRepository.deleteOrDecrementItem(cartItem);
    }

    public int addToCart(CartItem cartItem) {
        return cartRepository.insertOrIncrementItem(cartItem);
    }

    public int removeFromCart(CartItem cartItem) {
        return cartRepository.insertOrIncrementItem(cartItem);
    }

    public int removeCart() {
        cartRepository.deleteAllItems(true);
        return 1;
    }

    //



    public int addItem(int id, String action, CartItem item) {
        return cartRepository.insertOrIncrementItem(item);
    }













}
