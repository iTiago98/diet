public class MetabolismoBasal
{
	public static final int HOMBRE = 0;
	public static final int MUJER = 1;
	
	private static int genero;
	private static int masa;
	private static int altura;
	private static int edad;

	public static void actDatos(int g, int m, int a, int e)
	{
		genero = g;
		masa = m;
		altura = a;
		edad = e;
	}

	public static int calcular()
	{
		double res;
		switch(genero){
			case MetabolismoBasal.HOMBRE: res	= 66.5								
												+ 13.75*masa
												+ 5*altura
												- 6.78*edad
												;break;
			case MetabolismoBasal.MUJER: res	= 655
												+ 9.6*masa
												+ 1.85*altura
												- 4.68*edad
												;
			default: res = 0;
		}
		return (int)res;
	}
}