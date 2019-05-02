import java.awt.event.ActionListener;

public interface MainView
{
  public static final String SEARCH = "SEARCH";
  public static final String CALCULATE_GIVEN_GRAMES = "CALCULATE_GIVEN_GRAMES";
  public static final String CALCULATE_GIVEN_CALORIES = "CALCULATE_GIVEN_CALORIES";
  public static final String CALCULATE_GIVEN_FATS = "CALCULATE_GIVEN_FATS";
  public static final String CALCULATE_GIVEN_CARBOHYDRATES = "CALCULATE_GIVEN_CARBOHYDRATES";
  public static final String CALCULATE_GIVEN_PROTEINS = "CALCULATE_GIVEN_PROTEINS";
  public static final String REFRESH = "REFRESH";
  public static final String CLEAN = "CLEAN";

  public void controler(ActionListener ctrl);

  public void setLog(String msg, boolean error);

  public String getGrames();

  public String getCalories();

  public String getFats();

  public String getCarbohydrates();

  public String getProteins();

  public void setGrames(String s);

  public void setCalories(String s);

  public void setFats(String s);

  public void setCarbohydrates(String s);

  public void setProteins(String s);

  public void setIgredient(String s);

  public void refreshIngredientList(Ingredient i);

  public void clearIngredient();
}
