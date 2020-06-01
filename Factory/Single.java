/**
 *
 * @author Josué Rodríguez
 */
public class Single extends Room{
    
    public Single(){
        super("SINGLE");
    }
    
    @Override
    public void printTariff(int days){
        System.out.println("---------------BELLA VISTA HOTEL-------------");
        System.out.println("The SIMPLE room comes with a single bed.");
        System.out.println("It includes breakfast and access to the pool.");
        System.out.println("---------------------------------------------");
        double tariff = days * 35;
        System.out.println("Tariff ($35/day): $" + tariff + " for " + days + " days.");
    }
    
}
