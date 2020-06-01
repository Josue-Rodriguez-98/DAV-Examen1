import java.util.Scanner;

/**
 *
 * @author Josué Rodríguez
 */
public class BuildABear {
    
    public Scanner entrada = new Scanner(System.in);
    public BuildABear(){}
    
    public void buildBear(PlushieBuilder builder){
        System.out.println("Choose the size of your bear:");
        builder.setSize(this.sizeMenu());
        System.out.println("Choose the color of your bear:");
        builder.setColor(this.colorMenu());
        System.out.println("Choose the scent of your bear:");
        builder.setSmell(this.scentMenu());
        System.out.print("Will it have pants? [y/n]: ");
        char pants = entrada.next().charAt(0);
        builder.addPants(pants == 'y' || pants == 'Y');
        System.out.print("Will it have a shirt? [y/n]: ");
        char shirt = entrada.next().charAt(0);
        builder.addShirt(shirt == 'y' || shirt == 'Y');
        System.out.print("Will it have a hat? [y/n]: ");
        char hat = entrada.next().charAt(0);
        builder.addHat(hat == 'y' || hat == 'Y');
        System.out.println("Finally, give your bear a name:");
        entrada.nextLine();
        String name = entrada.nextLine();
        builder.setName(name);
        System.out.println("Congratulations! You've build a bear!");
    }
    
    public String sizeMenu(){
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.print("Select a color: ");
        int size = entrada.nextInt();
        switch (size) {
            case 1:
                System.out.println(">You're gonna build a small bear!");
                return "SMALL";
            case 2:
                System.out.println(">You're gonna build a medium bear!");
                return "MEDIUM";
            case 3:
                System.out.println(">You're gonna build a large bear!");
                return "LARGE";
            default:
                System.out.println(">You're gonna build a small bear!");
        }
        return "SMALL";
    }
    
    public String colorMenu(){
        System.out.println("1) Black");
        System.out.println("2) Brown");
        System.out.println("3) White");
        System.out.print("Select a color: ");
        int size = entrada.nextInt();
        switch (size) {
            case 1:
                System.out.println(">You're gonna build a black bear!");
                return "BLACK";
            case 2:
                System.out.println(">You're gonna build a brown bear!");
                return "BROWN";
            case 3:
                System.out.println(">You're gonna build a white bear!");
                return "WHITE";
            default:
                System.out.println(">You're gonna build a black bear!");
        }
        return "BLACK";
    }
    
    public String scentMenu(){
        System.out.println("1) Strawberry");
        System.out.println("2) Chocolate");
        System.out.println("3) Vanilla");
        System.out.println("4) No scent");
        System.out.print("Select a color: ");
        int size = entrada.nextInt();
        switch (size) {
            case 1:
                System.out.println(">Your bear will have strawberry smell!");
                return "STRAWBERRY";
            case 2:
                System.out.println(">Your bear will have chocolate smell!");
                return "CHOCOLATE";
            case 3:
                System.out.println(">Your bear will have vanilla smell!");
                return "VANILLA";
            default:
                System.out.println(">Your bear will have no smell!");
        }
        return "NO";
    }
    
}
