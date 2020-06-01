/**
 *
 * @author Josué Rodríguez
 */
public class Triple extends Room{
    
    public Triple(){
        super("TRIPLE");
    }
    
    @Override
    public void printTariff(int days){
        System.out.println("---------------BELLA VISTA HOTEL-------------");
        System.out.println("The TRIPLE room comes with three beds.");
        System.out.println("It includes breakfast and dinner.");
        System.out.println("It includes access to the pool and gym.");
        System.out.println("You can access to every event held in the hotel during your stay.");
        System.out.println("Two free entries to the spa");
        System.out.println("-----------------------------------------------------------------");
        double tariff = days * 55;
        System.out.println("Tariff ($55/day): $" + tariff + " for " + days + " days.");
    }
    
}
