package tipos;

public class TiposDeDados {
    public static void main(String[] args) {
        // Primitivos
        // byte - 8 bits -> -128 a 127
        byte nota1 = 127;
        Short mShort = 1000;

        int mInt1 = 1000;
        Integer mInt2 = 2000;

        // System.out.println(mInt1);
        // System.out.println(mInt2);

        // short, int, long, float, double
        // char
        // boolean

        // Não Primitivos - Wrappers
        // Byte, Short, Integer, Long, Float, Double
        // Character, String
        // Tipos autorais Classes

        System.out.println("Tipos de dados em Java\n");
        System.out.println("Inteiros:");
        System.out.printf("Byte: %d byte: de %d até %d\n",
                Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.printf("Short: %d byte: de %d até %d\n",
                Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("Integer: %d byte: de %d até %d\n",
                Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("Long: %d byte: de %d até %d\n",
                Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println("\nPontos Flutuantes:");
        System.out.printf("Float: %d byte: de %s até %s\n",
                Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double: %d byte: de %s até %s\n",
                Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);

        int i = 2000;
        long l = 2_000;

        // Casting
        i = (int)l;

        // Promotion
        long l1 = i;

        byte b = (byte)130;
        System.out.println("b: "+b);

        // 16/08/2022
        //Guilherme, Ricieri, Ricardo, Murilo, Jonas, Gabriel V., Nardi, Lucas B, Alex, Fabio.




        
        
    }
}
