package desafio;

public class Casa {
    public int quarto;
    public int suite;
    public int banheiro;
    public int quantidadeVagasEstacionamento;
    public boolean piscina = false;
    public float areaTerreno;
    public float areaConstuida;

    public Casa() {
    }

    public Casa(int quarto, int suite, int banheiro, int quantidadeVagasEstacionamento, float areaTerreno,
            float areaConstuida) {
        this.quarto = quarto;
        this.suite = suite;
        this.banheiro = banheiro;
        this.quantidadeVagasEstacionamento = quantidadeVagasEstacionamento;
        this.areaTerreno = areaTerreno;
        this.areaConstuida = areaConstuida;
    }

    public int calcularQtdQuartos() {
        return this.quarto + this.suite;
    }
    
    public int calcularQtdBanheiros() {
        return this.banheiro + this.suite;
    }

    

    public String obterDados() {
        return "Casa(quarto= " + calcularQtdQuartos() + 
        ", suite= "+ suite +
        ", banheiro= "+ calcularQtdBanheiros() +
        ", vagasEstacionamento= "+ quantidadeVagasEstacionamento +
        ", piscina= "+ piscina +
        ", areaTerreno= "+ areaTerreno +
        ", areaConstuida= "+ areaConstuida +
        ")";
    }

    @Override
    public String toString() {
        return "Casa [areaConstuida=" + areaConstuida + 
        ", areaTerreno=" + areaTerreno +
        ", banheiro=" + calcularQtdBanheiros() + 
        ", piscina=" + (piscina ? "SIM" : "NÃO") + 
        ", quantidadeVagasEstacionamento=" + quantidadeVagasEstacionamento + 
        ", quarto=" + calcularQtdQuartos() + 
        ", suite=" + suite + 
        "]";
    }

    /*
     * Guilherme, Ricieri, Ricardo, Fabio, Alex, Murilo, Gabriel Venesian, Jonas, Nardi, Larissa
     */


    
}
