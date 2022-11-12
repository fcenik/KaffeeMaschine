package beans;

import utils.CoffeeGrosse;

import java.math.BigDecimal;

public class Coffee {

    public Coffee() {
    }

    public Coffee(String coffeeName, BigDecimal coffeePrice, String coffeeOrigin, CoffeeGrosse coffeeSize, boolean withSugar) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeOrigin = coffeeOrigin;
        this.coffeeSize = coffeeSize;
        this.withSugar = withSugar;
    }

    private String coffeeName;
    private BigDecimal coffeePrice;
    private String coffeeOrigin;
    private CoffeeGrosse coffeeSize;
    private boolean withSugar;

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public BigDecimal getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(BigDecimal coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public String getCoffeeOrigin() {
        return coffeeOrigin;
    }

    public void setCoffeeOrigin(String coffeeOrigin) {
        this.coffeeOrigin = coffeeOrigin;
    }

    public CoffeeGrosse getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(CoffeeGrosse coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public boolean isWithSugar() {
        return withSugar;
    }

    public void setWithSugar(boolean withSugar) {
        this.withSugar = withSugar;
    }

    @Override
    public String toString() {
        return "beans.Coffee{" +
                "coffeeName='" + coffeeName + '\'' +
                ", coffeePrice=" + coffeePrice +
                ", coffeeOrigin='" + coffeeOrigin + '\'' +
                ", coffeeSize=" + coffeeSize +
                ", withSugar=" + withSugar +
                '}';
    }
}
