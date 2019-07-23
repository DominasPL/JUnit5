package pl.github.DominasPL.JUnit5;

public class Account {

    private boolean active;
    private Address defaultDeliveryAddress;

    public Account() {
        this.active = false;
    }

    public Account(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;

        if (defaultDeliveryAddress != null) {
            activate();
        } else {
            this.active = false;
        }
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Address getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }


    public void activate() {
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }


}
