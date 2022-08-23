import classes.Aluno;

public class App {

    public static void main(String[] args) {                
        Aluno ricardo = new Aluno("Ricardo Almeida", "ricardo@gmail.com", "SI");
        Aluno murilo = new Aluno("Murilo Moscardi", "murilo@gmail.com", "DSM");
        ricardo.exibirDados();
        murilo.exibirDados();   
        
        ricardo.enviarEmail(murilo.email, "Lorem ipsum dolor sit amet...");
    }
}
