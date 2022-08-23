package classes;

public class Aluno {
    // Atributos
    public String nome;
    public String email;
    public String curso;

    public Aluno(String pNome, String pEmail, String pCurso) {
        nome = pNome;
        email = pEmail;
        curso = pCurso;
    }

    // Comportamentos
    public void exibirDados() {
        System.out.printf("\nNome: %s, email: %s, curso: %s.\n",
        nome, email, curso);
    }

    public void enviarEmail(String destinatario, String assunto) {
        System.out.printf("\nEnviado email para %s\nAssunto: %s\n\nDe: %s",
        destinatario, assunto, email);
    }

    /*
     * Quartos, Suites, Banheiros, QtdVagasEstacionamento, 
     * piscina, areaTerreno, areaConstruida,
     * 
     * // Calculos: baneiros e quartos.
     *  
     */
}
