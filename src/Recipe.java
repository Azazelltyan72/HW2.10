import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final Set<Product> ingredients;

    private String name;
    private Product product;
    private double totalCost;


    public Recipe(String name) {
        ingredients = new HashSet<>();
        this.name = name;
    }

    public Set<Product> getIngredients() {
        return ingredients;
    }

    public Product getProduct() {
        return product;
    }

    public final double getTotalCost(Product... products) {
        this.ingredients.addAll(Arrays.asList(products));
        for (Product ingred : ingredients) {
            this.totalCost += ingred.getPrice()*ingred.getQuantity();
        }
        if (totalCost > 0) {
            return totalCost;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }
    public void addRecipe(Set<Recipe> recipes) {
        if (!recipes.contains(this)) {
            recipes.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.product + " уже имеется");
        }
    }


    @Override
    public String toString() {
        return "Рецепт {" +
                "название = '" + name + '\'' +
                ", суммарная стоимость рецепта = " + String.format("%.2f", getTotalCost()) +
                "руб.}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(product, recipe.product);
//        return totalCost == recipe.totalCost && ingredients.equals(recipe.ingredients) && name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, product, totalCost);
    }
}
