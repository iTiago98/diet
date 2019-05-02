import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements MainView
{
  private JTextField textField_ingredient;
  private JButton button_search;
  private JLabel label_calories;
  private JLabel label_fats;
  private JLabel label_carbohydrates;
  private JLabel label_proteins;
  private JTextField textField_calories;
  private JTextField textField_fats;
  private JTextField textField_carbohydrates;
  private JTextField textField_proteins;
  private JTextField textField_grames;
  private JButton button_calculateCalories;
  private JButton button_calculateFats;
  private JButton button_calculateCarbohydrates;
  private JButton button_calculateProteins;
  private JButton button_calculateGrames;
  private JButton button_refresh;
  private JButton button_clear

  public MainPanel()
  {
  	setLayout(new BorderLayout(5, 5));

  	// Current ingredient panel
  	JPanel panel_ingredientSelector = new JPanel();
	panel_ingredientSelector.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	  	textField_ingredient = new JTextField(20);
	  	button_search = new JButton("Search");
	  	panel_ingredientSelector.add(textField_ingredient);
	  	panel_ingredientSelector.add(button_search);

  	// Current ingredient
  	JPanel panel_currentIngredient = new JPanel();
  	panel_currentIngredient.setLayout(new BorderLayout(2, 2));
  		JPanel panel_currentIngredientNoGrames = new JPanel();
  		panel_currentIngredientNoGrames.setLayout(new GridLayout(2, 2, 2, 2));
  			JPanel panel_currentINgredientNoGramesCalories = new JPanel();
  			panel_currentIngredientNoGramesCalories.setLayout(new BorderLayout(1, 1));

  }
}
