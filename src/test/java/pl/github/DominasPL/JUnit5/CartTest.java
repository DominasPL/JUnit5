package pl.github.DominasPL.JUnit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test cases for cart")
class CartTest {

    //testy wydajnościowe
//    @Disabled
    @Test
    @DisplayName("Cart is able to process 1000 orders in 5ms")
    void simulateLargeOrder() {

        //given
        Cart cart = new Cart();

        //when
        //then
        assertTimeout(Duration.ofMillis(5), () -> cart.simulateLargeOrder());


    }
}