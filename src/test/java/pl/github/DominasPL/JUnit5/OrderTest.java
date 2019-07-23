package pl.github.DominasPL.JUnit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;

    @BeforeEach
    void initializeOrder() {
//        System.out.println("This method runs before each test!");
        order = new Order();
    }

    @AfterEach
    void cleanUp() {
//        System.out.println("This method runs after each test!");
        order.cancel();
    }

    @Test
    void testAssertArrayEquals() {

        //given
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4};

        //then
        assertArrayEquals(nums1, nums2);

    }

    @Test
    void mealListShouldBeEmptyAfterOrderCreation() {

        //then
        assertThat(order.getMeals(), empty());
        assertThat(order.getMeals().size(), equalTo(0));
        assertThat(order.getMeals(), hasSize(0));
    }

    @Test
    void addingMealToOrderShouldIncreaseOrderSize() {

        //given
        Meal meal = new Meal(15, "Burger");
        Meal meal2 = new Meal(10, "Sandwich");

        //when
        order.addMealToOrder(meal);

        //then
        assertThat(order.getMeals().size(), equalTo(1));
        assertThat(order.getMeals(), hasSize(1));
        assertThat(order.getMeals(), contains(meal));
        assertThat(order.getMeals(), hasItem(meal));

        assertThat(order.getMeals().get(0).getPrice(), equalTo(15));
    }

    @Test
    void removingMealFromOrderShouldDecreaseOrderSize() {

        //given
        Meal meal = new Meal(15, "Burger");

        //when
        order.addMealToOrder(meal);
        order.removeMealFromMeals(meal);

        //then
        assertThat(order.getMeals(), hasSize(0));
        assertThat(order.getMeals(), not(contains(meal)));

    }

    @Test
    void mealsShouldBeInCorrectOrderAfterAddingThemToOrder() {

        //given
        Meal meal1 = new Meal(10, "Pizza");
        Meal meal2 = new Meal(15, "Burger");

        //when
        order.addMealToOrder(meal1);
        order.addMealToOrder(meal2);

        //then
        assertThat(order.getMeals(), contains(meal1, meal2));
//        assertThat(order.getMeals(), containsInAnyOrder(meal2, meal1));

    }

    @Test
    void testIfToMealListAreTheSame() {

        //given
        Meal meal1 = new Meal(10, "Pizza");
        Meal meal2 = new Meal(15, "Burger");
        Meal meal3 = new Meal(12, "Kebab");

        List<Meal> meals1 = Arrays.asList(meal1, meal2, meal3);
        List<Meal> meals2 = Arrays.asList(meal1, meal2, meal3);

        //then
        assertThat(meals1, is(meals2));

    }
}