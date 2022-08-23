package entrada;

import java.util.Scanner;

public class EntradaDeDadosPlayground {
    public static void main(String[] args) {

        // Declaração do objeto Scanner para leitura de dados em console.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        // Entrada de dados via Scanner
        String nome = entrada.nextLine();

        System.out.println("Digite o seu ano de nascimento:");
        // Entrada de dados via Scanner e conversão para o tipo de dados Integer
        Integer ano = entrada.nextInt();
        Integer idade = 2022 - ano;

        String template = "Bem-vindo %s ao Mundo Java!\n" +
                "Começou a programar em Java com %d anos!\n";
        System.out.printf(template, nome, idade);

        entrada.close();
    }
}
