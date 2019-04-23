public class GCD
{
	private static final float CALORIAS[] = {4, 4, 9};
	private static final float PORCENTAJES[] = {0.55f, 0.25f, 0.20f};
	
	public static final int GANAR_PESO = 0;
	public static final int PERDER_PESO = 1;

	public static int objetivo = GCD.PERDER_PESO;

	public static void establecerObjetivo(int o)
	{
		objetivo = o;
	}
	
	public static int gastoCaloricoDiario()
	{
		return MetabolismoBasal.calcular()+ActividadFisica.calcular();
	}

	public static int[] gramosPorDia ()
	{
		int[] res = new int[3];
		for(int i = 0; i < 3; i++)
			res[i] = (int)(GCD.gastoCaloricoDiario()*PORCENTAJES[i]/CALORIAS[i]);
		return res; 
	}
}