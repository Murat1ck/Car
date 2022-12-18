package Product;

import java.util.Objects;


public class Product {
    private String name;
    private int price;
    private int count;

    public Product(String name, int price, int count) {
        setName(name);
        setPrice(price);
        setCount(count);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
////   public static String validateString(String value, String substitution) {
//        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;

//    }
//
//    public static boolean validateString(String value) {
//        return (value == null || value.isBlank() || value.isEmpty());
//    }
//
//    public static boolean validateBoolean(Boolean value) {
//        return value != null && value;}
//
//    public static Integer validateInteger(Integer value, Integer substitution) {
//        return (value == null || value <= 0) ? substitution : value;
//    }
}


