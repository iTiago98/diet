public class ActividadFisica
{
	private static final int[] INTENSIDAD = {50, 100, 150, 200, 250};

	private static int[] horas_ejercicio;
	private static int[] horas_trabajo;

	public static void actDatos(int[] ej, int[] tra)
	{
		horas_ejercicio = ej.clone();
		horas_trabajo = tra.clone();
	}

	public static int calcular()
	{
		int res = 0;
		for (int i = 0; i < 5; i++){
			res += horas_ejercicio[i]*ActividadFisica.INTENSIDAD[i];
		}
		for (int i = 0; i < 3; i++){
			res += horas_trabajo[i]*ActividadFisica.INTENSIDAD[i];
		}
		
		return res;
	}
}