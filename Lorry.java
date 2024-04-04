
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int numberOfPallets;
    private int trailers;

    /**
     * Construtor para objetos da classe Lorry
     */
    public Lorry(String licensePlate, int numberOfPallets, int trailers)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    public int getTrailers(){
        return trailers;
    }
    
    public void setNumberOfPallets(int newNumberOfPallets){
        newNumberOfPallets = numberOfPallets;
    }
    
    public void setTrailers(int newTrailers){
        newTrailers = trailers;
    }
    
        public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Matricula", getLicensePlate())); 
        sb.append(String.format("\n%15s: %s\n", "Nº Paletes", getNumberOfPallets()));  
        sb.append(String.format("\n%15s: %s\n", "Atrelado(s)", getTrailers()));  

     
        return sb.toString();
    }
}
