import java.io.FileReader;
import java.io.IOException;

public class DataReader
{
	public static int genero = MetabolismoBasal.MUJER;
	public static int masa;
	public static int altura;
	public static int edad;
	public static int[] h_ejercicio = new int[5];
	public static int[] h_trabajo = new int[3];
	public static int objetivo = GCD.PERDER_PESO;

	public static void leerDatos(String archivo)
	{
		Yylex lex;
		try{
			lex = new Yylex(new FileReader(archivo));
			lex.yylex();
		}catch (IOException e){
			System.err.println("No se ha podio abrir el archivo " + archivo);
		}
		rellenarDatos();
	}
	
	private static void rellenarDatos()
	{
		MetabolismoBasal.actDatos(genero, masa, altura, edad);
		ActividadFisica.actDatos(h_ejercicio, h_trabajo);
	}

	public static void badFormat()
	{
		System.err.println("Bad format expection");
		throw new RuntimeException();
	}

	public static void main(String args[])
	{	
		if(args.length>0){
			leerDatos(args[0]);
			System.out.println("Genero -> " + genero + "(0 Hombre, 1 Mujer)");
			System.out.println("Masa -> " + masa);
			System.out.println("Altura -> " + altura);
			System.out.println("Edad -> " + edad);
			System.out.print("Horas de ejercicio -> ");
			for(int n : h_ejercicio)
				System.out.print(n + " ");
			System.out.println();
			System.out.print("Horas de trabajo -> ");
			for(int n : h_trabajo)
				System.out.print(n + " ");
			System.out.println();
			System.out.println("Objetivo -> " + objetivo + "(0 Ganar peso, 1 Perder peso)");
		}
	}
}