package pl.github.DominasPL.JUnit5;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    //testy wydajnościowe
    @Test
    void simulateLargeOrder() {

        //given
        Cart cart = new Cart();

        //when
        //then
        assertTimeout(Duration.ofMillis(1), () -> cart.simulateLargeOrder());


    }
}