package Product;

import java.util.Objects;

public class Recipe {
    private String name;
    private ProductList productList;
    private Test totalCost;

    public Recipe(String name, ProductList productList, Test totalCost) {
       setName(name);
       setProductList(productList);
       setTotalCost(totalCost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public Test getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Test totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
