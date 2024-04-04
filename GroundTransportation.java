
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static double fees = 3;
    
    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }
    
    public void setLicensePlate(String newLicensePlate)
    {
        newLicensePlate = licensePlate;
    }
    
    public String getTransportType() {
        return "Transporte terrestre";
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.fees));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}
