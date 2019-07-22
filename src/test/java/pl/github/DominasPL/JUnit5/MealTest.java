package pl.github.DominasPL.JUnit5;

import org.junit.jupiter.api.Test;

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

    }

    @Test
    void referenceToTheSameObjectShouldBeEqual() {

        //given
        Meal meal1 = new Meal(20);
        Meal meal2 = meal1;

        //then
        assertSame(meal1, meal2);

    }

    @Test
    void referencesToTheDifferentObjectsShouldNotBeEqual() {

        //given
        Meal meal1 = new Meal(20);
        Meal meal2 = new Meal(20);

        //then
        assertNotSame(meal1, meal2);

    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame() {

        //given
        Meal meal1 = new Meal(20, "Pizza");
        Meal meal2 = new Meal(20, "Pizza");

        //then
        assertEquals(meal1, meal2);

    }
}