package pl.github.DominasPL.JUnit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class MealTest {



    @Test
    void shouldReturnDiscountedPrice() {

        //given
        Meal meal = new Meal(100);

        //when
        int discountedPrice = meal.getDiscountedPrice(20);

        //then
        assertEquals(80, discountedPrice);
        assertThat(discountedPrice, equalTo(80));
    }

    @Test
    void referenceToTheSameObjectShouldBeEqual() {

        //given
        Meal meal1 = new Meal(20);
        Meal meal2 = meal1;

        //then
        assertSame(meal1, meal2);
        assertThat(meal1, sameInstance(meal2));

    }

    @Test
    void referencesToTheDifferentObjectsShouldNotBeEqual() {

        //given
        Meal meal1 = new Meal(20);
        Meal meal2 = new Meal(20);

        //then
        assertNotSame(meal1, meal2);
        assertThat(meal1, not(sameInstance(meal2)));


    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame() {

        //given
        Meal meal1 = new Meal(20, "Pizza");
        Meal meal2 = new Meal(20, "Pizza");

        //then
        assertEquals(meal1, meal2);
    }

    @Test
    void exceptionShouldBeThrownWhenDiscountIsHigherThanPrice() {

        //given
        Meal meal = new Meal(9, "Soup");

        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> meal.getDiscountedPrice(10));

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 18})
    void mealPricesShouldBeLowerThan20(int price) {
        assertThat(price, lessThan(20));
    }


    


}