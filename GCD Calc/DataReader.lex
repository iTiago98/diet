%%

%int

%{
	int ej = 0;
	int tr = 0;
%}

%state GENERO
%state MASA
%state ALTURA
%state EDAD
%state EJERCICIO
%state TRABAJO
%state OBJETIVO

%%

<YYINITIAL>
{
	Genero[\t ]*=[\t ]*
		{	
			yybegin(GENERO);
		}
	Masa[\t ]*=[\t ]*
		{
			yybegin(MASA);
		}
	Altura[/t ]*=[/t ]*
		{
			yybegin(ALTURA);
		}
	Edad[/t ]*=[/t ]*
		{
			yybegin(EDAD);
		}
	Ejercicio[/t ]*=[/t ]*
		{
			yybegin(EJERCICIO);
		}
	Trabajo[/t ]*=[/t ]*
		{
			yybegin(TRABAJO);
		}
	Objetivo[/t ]*=[/t ]*
		{
			yybegin(OBJETIVO);
		}
	(\r?\n)+
		{}
	.
		{
			DataReader.badFormat();
		}
}

<GENERO>
{
	HOMBRE
		{
			DataReader.genero=MetabolismoBasal.HOMBRE;
		}
	MUJER
		{
			DataReader.genero=MetabolismoBasal.MUJER;
		}
	[\t ]+
		{}
	\r?\n
		{
			yybegin(YYINITIAL);
		}
	.
		{
			DataReader.badFormat();
		}
}

<MASA>
{
	[0-9]|([1-9][0-9]*)
		{
			DataReader.masa=Integer.parseInt(yytext());
		}
	[\t ]+
		{}
	\r?\n
		{
			yybegin(YYINITIAL);
		}
	.
		{
			DataReader.badFormat();
		}
}

<ALTURA>
{
	[0-9]|([1-9][0-9]*)
		{
			DataReader.altura=Integer.parseInt(yytext());
		}
	[\t ]+
		{}
	\r?\n
		{
			yybegin(YYINITIAL);
		}
	.
		{
			DataReader.badFormat();
		}
}

<EDAD>
{
	[0-9]|([1-9][0-9]*)
		{
			DataReader.edad=Integer.parseInt(yytext());
		}
	[\t ]+
		{}
	\r?\n
		{
			yybegin(YYINITIAL);
		}
	.
		{
			DataReader.badFormat();
		}
}

<EJERCICIO>
{
	[0-9]|([1-9][0-9]*)
		{
			if(ej < 5){
				DataReader.h_ejercicio[ej]=Integer.parseInt(yytext());
				ej++;
			}else DataReader.badFormat();
		}
	[\t ]+
		{}
	\r?\n
		{
			if(ej==5) yybegin(YYINITIAL);
			else DataReader.badFormat();
		}
	.
		{
			DataReader.badFormat();
		}
}

<TRABAJO>
{
	[0-9]|([1-9][0-9]*)
		{
			if(tr < 3){
				DataReader.h_trabajo[tr]=Integer.parseInt(yytext());
				tr++;
			}else DataReader.badFormat();
		}
	[\t ]+
		{}
	\r?\n
		{
			if(tr==3) yybegin(YYINITIAL);
			else DataReader.badFormat();
		}
	.
		{
			DataReader.badFormat();
		}
}

<OBJETIVO>
{
	GANAR_PESO
		{
			DataReader.objetivo=GCD.GANAR_PESO;
		}
	PERDER_PESO
		{
			DataReader.objetivo=GCD.PERDER_PESO;
		}
	[\t ]+
		{}
	\r?\n
		{
			yybegin(YYINITIAL);
		}
	.
		{
			DataReader.badFormat();
		}
}



































