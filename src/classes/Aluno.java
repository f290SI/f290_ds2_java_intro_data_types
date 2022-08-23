package classes;

/*
 * As classes definem atributos e comportamentos; elas nos permitem criar
 * tipos de dados customizados para facilitar a abstração, a manutenção e
 * usabilidade do seu código.
 */
public class Aluno {
    // Atributos públicos
    public String nome;
    public String email;
    public String curso;

    /*
     * Método construtor, método especial ao qual seu identificador é o nome 
     * da própria classe. 
     * É utilizado para facilitar, padronizar ou restringir a criação de objetos
     * durante sua inicialização. 
     */
    public Aluno(String pNome, String pEmail, String pCurso) {
        //Atribuição dos argumentos recebidos nos atributos da classe.
        this.nome = pNome;
        this.email = pEmail;
        this.curso = pCurso;
    }

    // Comportamentos - Ações que os objetos podem realizar.
    public void exibirDados() {
        System.out.printf("\nNome: %s, email: %s, curso: %s.\n",
        nome, email, curso);
    }

    /**
     * Método de simulação de evnio de e-mail para fins demonstrativos.
     * @param destinatario String
     * @param assunto String
     */
    public void enviarEmail(String destinatario, String assunto) {
        System.out.printf("\nEnviado email para %s\nAssunto: %s\n\nDe: %s",
        destinatario, assunto, email);
    }
}
