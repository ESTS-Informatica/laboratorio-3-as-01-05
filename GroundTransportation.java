
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static int fees = 3;
    
    
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
}
