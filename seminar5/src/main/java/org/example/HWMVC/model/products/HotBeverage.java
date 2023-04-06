package org.example.HWMVC.model.products;

public class HotBeverage extends Product {
    private int temp;
    private boolean sugar;

    public HotBeverage(String name, int price, int temp, boolean sugar) {
        super(name, price);
        this.temp = temp;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        String line;
        if (sugar) line = " с сахаром";
        else line = "без сахара";
        return String.format("Ваш напиток %s, стоит %d рублей, температура напитка %d градусов, %s", name, price, temp, line);
    }
}
