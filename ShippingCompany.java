import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;

    /**
     * Construtor para objetos da classe ShippingCompany
     */
    public ShippingCompany(String name)
    {
        this.name = name;
        this.inService = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        newName = name;    
    }
    
    public void addTransportInService(Transport transport){
        inService.add(transport);
        this.add(transport);
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Nome da Transportadora", getName()));  
     
        return sb.toString();
    }
    
    public static void main (String[] args){
        ShippingCompany shippingCompany = new ShippingCompany("RELIABLE-MOVING");
        GroundTransportation groundTransportation = new Lorry("ABC123", 0, 0);
        GroundTransportation groundTransportation2 = new Van("ABC122", 0);
        AirTransportation airTransportation = new AirTransportation("AV1", 0);
        AirTransportation airTransportation2 = new AirTransportation("AV2", 0);
        
        System.out.println(shippingCompany.toString());
        System.out.println(groundTransportation.toString());
        System.out.println(groundTransportation2.toString());
        System.out.println(airTransportation.toString());
        System.out.println(airTransportation2.toString());
    }
}
