import classes.Aluno;
import desafio.Casa;

public class App {

    public static void main(String[] args) {

        Aluno ricardo = new Aluno("Ricardo Almeida", "ricardo@gmail.com", "SI");
        Aluno murilo = new Aluno("Murilo Moscardi", "murilo@gmail.com", "DSM");
        ricardo.exibirDados();
        murilo.exibirDados();

        ricardo.enviarEmail(murilo.email, "Lorem ipsum dolor sit amet...");

        Casa casa = new Casa(3, 1, 1,
                2, 250.5F, 185.9F);
        System.out.println(casa);
    }
}
