public class Main
{
	public static void main(String args[])
	{
		if(args.length>0){
			DataReader.leerDatos(args[0]);
			
			int gastoCaloricoDiario = GCD.gastoCaloricoDiario();
			int[] gramosPorDia = GCD.gramosPorDia();
	
			System.out.println("Necesitas consumir "+gastoCaloricoDiario+"cal.");
			System.out.println(gramosPorDia[0]+"gr de hidratos.");
			System.out.println(gramosPorDia[1]+"gr de proteinas.");
			System.out.println(gramosPorDia[2]+"gr de lipidos.");
			System.out.println("=========================================");
			float[] dieta = {0.2f, 0.15f, 0.3f, 0.15f, 0.2f};
			System.out.println("DIETA ESTÁNDAR");
			System.out.println("Desayuno: " + (int)(gastoCaloricoDiario*dieta[0])+"kcal. ( "
								+ (int)(gramosPorDia[0]*dieta[0]) + "hdr. ) ( "
								+ (int)(gramosPorDia[1]*dieta[0]) + "pr. ) ( "
								+ (int)(gramosPorDia[2]*dieta[0]) + "lp. )");
			System.out.println("Med. Mñ.: " + (int)(gastoCaloricoDiario*dieta[1])+"kcal. ( "
								+ (int)(gramosPorDia[0]*dieta[1]) + "hdr. ) ( "
								+ (int)(gramosPorDia[1]*dieta[1]) + "pr. ) ( "
								+ (int)(gramosPorDia[2]*dieta[1]) + "lp. )");
			System.out.println("Almuerzo: " + (int)(gastoCaloricoDiario*dieta[2])+"kcal. ( "
								+ (int)(gramosPorDia[0]*dieta[2]) + "hdr. ) ( "
								+ (int)(gramosPorDia[1]*dieta[2]) + "pr. ) ( "
								+ (int)(gramosPorDia[2]*dieta[2]) + "lp. )");
			System.out.println("Med. Tr.: " + (int)(gastoCaloricoDiario*dieta[3])+"kcal. ( "
								+ (int)(gramosPorDia[0]*dieta[3]) + "hdr. ) ( "
								+ (int)(gramosPorDia[1]*dieta[3]) + "pr. ) ( "
								+ (int)(gramosPorDia[2]*dieta[3]) + "lp. )");
			System.out.println("____Cena: " + (int)(gastoCaloricoDiario*dieta[4])+"kcal. ( "
								+ (int)(gramosPorDia[0]*dieta[4]) + "hdr. ) ( "
								+ (int)(gramosPorDia[1]*dieta[4]) + "pr. ) ( "
								+ (int)(gramosPorDia[2]*dieta[4]) + "lp. )");
		}else{
			System.err.println("Por favor, especifica un archivo de datos.");
		} 
	}
}