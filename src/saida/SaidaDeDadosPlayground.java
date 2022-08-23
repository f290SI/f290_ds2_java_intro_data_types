package saida;

public class SaidaDeDadosPlayground {
    /**
     * Método de inicialização do projeto. É o gatilho da aplicação
     * 
     * @param args String[] - Argumento de inicialização
     * @throws Exception - Exceção padrão do Sistema.
     */
    public static void main(String[] args) throws Exception {

        // Comentarios

        // Comentarios de linha unica

        /*
         * Comentarios de multiplas linhas.
         */

        // SAIDA DE DADOS

        // Default
        /*
         * Escreve texto na saída padrão,
         * no exato ponto do cursor na saída padrão.
         */

        System.out.print("Linha 01\t");
        System.out.print("Linha 02\t");
        System.out.print("Linha 03\n\n");

        /*
         * Escreve texto na saída padrão,
         * após criar uma nova linha na saída padrão.
         */
        System.out.println("Linha 01");
        System.out.println("Linha 02");
        System.out.println("Linha 03");

        String t1 = "Corinthians", t2 = "Palmeiras";
        int gt1 = 3, gt2 = 2;

        System.out.println(t1 + " " + gt1 + " X " + gt2 + " " + t2);

        // C-Style
        System.out.printf("\n%s %d X %d %s\n", t1, gt1, gt2, t2);

        // String.format(formato, argumentos)

        String resultado = String.format("\n%s %d X %d %s\n",
                t1, gt1, gt2, t2);

        var tmplt = "insert into aluno (ra, nome, email) values (%s, '%s', '%s')";

        System.out.println(resultado);
        String.format(tmplt, 1200, "Ricardo", "ricardo@gmail.com");

    }
}
