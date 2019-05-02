/*
Model of the Diet Assistant
Must contain information about:
	- Name of the ingredient
	- Calories every 100gr
	- Fats every 100gr
	- Carbohydrates every 100gr
	- Proteins every 100gr
	- Current calories
	- Current grames
	- Current fats
	- Current carbohydrates
	- Current proteins
Must be able to:
	- Calculate current values given grames
	- Calculate current values given calories
	- Calculate current values given fats
	- Caluclate current values given carbohydrates
	- Calculate current values given proteins
*/

public class Ingredient
{
	private String name;
	private float calories_per100gr;
	private float fats_per100gr;
	private float carbohydrates_per100gr;
	private float proteins_per100gr;
	private float calories;
	private float grames;
	private float fats;
	private float carbohydrates;
	private float proteins;

	public Ingredient(String name, float calories_per100gr, float fats_per100gr, float carbohydrates_per100gr, float proteins_per100gr)
	{
		this.name = name;
		this.calories_per100gr = calories_per100gr;
		this.fats_per100gr = fats_per100gr;
		this.carbohydrates_per100gr = carbohydrates_per100gr;
		this.proteins_per100gr = proteins_per100gr;

		this.calories = 0;
		this.grames = 0;
		this.fats = 0;
		this.carbohydrates = 0;
		this.proteins = 0;
	}

	public void calculateWithGrames(float grames)
	{
		this.grames = grames;
		this.calories = this.calories_per100gr*this.grames/100;
		this.fats = this.fats_per100gr*this.grames/100;
		this.carbohydrates = this.carbohydrates_per100gr*this.grames/100;
		this.proteins = this.proteins_per100gr*this.grames/100;
	}

	public void calculateWithCalories(float calories)
	{
		this.calories = calories;
		this.grames = this.calories*100/this.calories_per100gr;
		this.fats = this.fats_per100gr*this.grames/100;
		this.carbohydrates = this.carbohydrates_per100gr*this.grames/100;
		this.proteins = this.proteins_per100gr*this.grames/100;
	}

	public void calculateWithFats(float fats)
	{
		this.fats = fats;
		this.grames = this.fats*100/this.fats_per100gr;
		this.calories = this.calories_per100gr*this.grames/100;
		this.carbohydrates = this.carbohydrates_per100gr*this.grames/100;
		this.proteins = this.proteins_per100gr*this.grames/100;
	}

	public void calculateWithCarbohydrates(float carbohydrates)
	{
		this.carbohydrates = carbohydrates;
		this.grames = this.carbohydrates*100/this.carbohydrates_per100gr;
		this.calories = this.calories_per100gr*this.grames/100;
		this.fats = this.fats_per100gr*this.grames/100;
		this.proteins = this.proteins_per100gr*this.grames/100;
	}

	public void calculateWithProteins(float proteins)
	{
		this.proteins = proteins;
		this.grames = this.proteins*100/this.proteins_per100gr;
		this.calories = this.calories_per100gr*this.grames/100;
		this.fats = this.fats_per100gr*this.grames/100;
		this.carbohydrates = this.carbohydrates_per100gr*this.grames/100;
	}

	public String getName()
	{
		return name;
	}

	public float getCalories_per100gr()
	{
		return calories_per100gr;
	}

	public float getFats_per100gr()
	{
		return fats_per100gr;
	}

	public float getCarbohydrates_per100gr()
	{
		return carbohydrates_per100gr;
	}

	public float getProteins_per100gr()
	{
		return proteins_per100gr;
	}

	public float getCalories()
	{
		return calories;
	}

	public float getGrames()
	{
		return grames;
	}

	public float getFats()
	{
		return fats;
	}

	public float getCarbohydrates()
	{
		return carbohydrates;
	}

	public float getProteins()
	{
		return proteins;
	}

	public String toString()
	{
		return "["+this.name+" -> "+this.grames+", "+this.calories+", "+this.fats+", "+this.carbohydrates+", "+this.proteins+"]";
	}
}
