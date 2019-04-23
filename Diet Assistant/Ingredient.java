/*
Model of the Diet Assistant
Must contain information about:
	- Name of the ingredient
	- Calories every 100gr
	- Current calories
	- Current gr
Must be able to:
	- Calculate current calories given current gr
	- Calculate current gr given current calories
*/

public class Ingredient
{
	private String name;
	private float calpergr;
	private float calories;
	private float gr;

	public Ingredient(String name, float calories, float gr)
	{
		this(name, calories*100/gr);
	}

	public Ingredient(String name, float calpergr)
	{
		this.name = name;
		this.calpergr = calpergr;
		this.calories = 0;
		this.gr = 0;
	}

	public void calculateCalories(float gr)
	{
		this.gr = gr;
		this.calories = calpergr*this.gr/100;
	}

	public void calculateGr(float calories)
	{
		this.calories = calories;
		this.gr = this.calories*100/calpergr;
	}

	public String getName()
	{
		return name;
	}

	public float getCalpergr()
	{
		return calpergr;
	}

	public float getCalories()
	{
		return calories;
	}

	public float getGr()
	{
		return gr;
	}
}