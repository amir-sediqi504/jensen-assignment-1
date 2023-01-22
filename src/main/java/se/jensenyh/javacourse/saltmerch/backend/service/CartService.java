package se.jensenyh.javacourse.saltmerch.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.jensenyh.javacourse.saltmerch.backend.model.CartItem;
import se.jensenyh.javacourse.saltmerch.backend.repository.CartRepository;
import java.util.List;
@Service
public class CartService
{
    @Autowired
    CartRepository cartRepository;
    public List<CartItem> getCartItems(CartItem item) {
        return cartRepository.selectAllItems();
    }
    public int patch(CartItem cartItem, String addOrRemove) {
        if (addOrRemove.equalsIgnoreCase("add")) {
            return cartRepository.insertOrIncrementItem(cartItem);
        } else if (addOrRemove.equalsIgnoreCase("remove")) {
            return cartRepository.deleteOrDecrementItem(cartItem);
        } else return -3;
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



}
