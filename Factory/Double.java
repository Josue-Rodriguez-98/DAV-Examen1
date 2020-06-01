/**
 *
 * @author Josué Rodríguez
 */
public class Double extends Room{
    
    public Double(){
        super("DOUBLE");
    }
    
    @Override
    public void printTariff(int days){
        System.out.println("---------------BELLA VISTA HOTEL-------------");
        System.out.println("The DOUBLE room comes with two beds.");
        System.out.println("It includes breakfast and one free dinner.");
        System.out.println("It includes access to the pool and gym.");
        System.out.println("------------------------------------------");
        double tariff = days * 45;
        System.out.println("Tariff ($45/day): $" + tariff + " for " + days + " days.");
    }
    
}
