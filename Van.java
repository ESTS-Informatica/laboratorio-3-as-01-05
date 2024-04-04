
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int packages;

    /**
     * Construtor para objetos da classe Van
     */
    public Van(String licensePlate, int packages)
    {
        super(licensePlate);
        this.packages = packages;
    }

    public int getPackages(){
        return packages;
    }
    
    public void setPackacges(int newPackages){
        newPackages = packages;
    }
    
            public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Matricula", getLicensePlate())); 
        sb.append(String.format("\n%15s: %s\n", "Pacotes", getPackages()));  
     
        return sb.toString();
    }
}
