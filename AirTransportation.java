
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;
    private static int fees = 4;

    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName()
    {
        return name;
    }
    
    public int getNumberOfContainers()
    {
        return numberOfContainers;
    }
    
    public void setName(String newName)
    {
        newName = name;
    }
    
    public void setNumberOfContainers(int newNumberOfContainers)
    {
        newNumberOfContainers = numberOfContainers;
    }
    
    public String getTransportType() {
        return "Transporte aéreo";
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.fees));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}
