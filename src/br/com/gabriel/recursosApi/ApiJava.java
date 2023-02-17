package br.com.gabriel.recursosApi;

import br.com.gabriel.livraria.Autor;

import java.util.Random;

public class ApiJava {
    public static void main(String[] args) {

        Autor	autor	=	new Autor();
        autor.setNome("Rodrigo	Turini");
        Autor	autor2	=	new	Autor();
        autor2.setNome("Rodrigo	Turini");

        //metodo equals
        if	(autor	==	autor2)	{
            System.out.println("Igual");
        }	else	{
            System.out.println("Diferente");
        }

        if	(autor.equals(autor2))	{
            System.out.println("Igual");
        }	else	{
            System.out.println("Diferente");
        }

        //wrappers tranforma um tipo primitivo em uma referencia a um objeto
        Object	objeto	=	"Uma	String";
        Object	objeto1	=	10;
        Object	objeto3	=	new	Integer(10);

        Integer	integer	=	new	Integer(10);
        int	valor	=	integer.intValue();

        //metodos parse
        boolean	resultado	=	Boolean.parseBoolean("false");
        byte	parseByte	=	Byte.parseByte("1");
        short	parseShort	=	Short.parseShort("10");
        int	parseInt	=	Integer.parseInt("10");
        long	parseLong	=	Long.parseLong("10");
        float	parseFloat	=	Float.parseFloat("10.0");
        double	parseDouble	=	Double.parseDouble("10.0");
        int	parseInt2	=	Integer.parseInt("ABC");//resultara em erro

        //java.lang
        Random	random	=	new Random();
        System.out.println(random.nextInt(10));

        long	round	=	Math.round(3.99);
        long	max	=	Math.max(100,	10);
        int	min	=	Math.min(100,	10);
        int	abs	=	Math.abs(-5);
        double	sqrt	=	Math.sqrt(4);

        //java.lang.string
        String	java	=	"java";
        String	replace	=	java.replace("v",	"c");
        String	upperCase	=	java.toUpperCase();
        String	lowerCase	=	"JAVA".toLowerCase();
        char	charAt	=	java.charAt(0);
        boolean	endsWith	=	java.endsWith("a");
        boolean	startsWith	=	java.startsWith("s");
        boolean	equals	=	java.equalsIgnoreCase("JAVA");

    }
}
