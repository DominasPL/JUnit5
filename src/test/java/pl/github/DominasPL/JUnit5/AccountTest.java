package pl.github.DominasPL.JUnit5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest {

    @Test
    void accountShouldNotBeActiveAfterCreation() {
        //given
        Account account = new Account();

        //then
        assertFalse(account.isActive());
    }

    @Test
    void accountShouldBeActiveAfterActivation() {
        //given
        Account account = new Account();

        //when
        account.activate();

        //then
        assertTrue(account.isActive());
    }
}
