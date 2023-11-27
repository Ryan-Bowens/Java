public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.2;
        double latte = 5.5;
        double cappuccino = 2.4;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);

        // Noah
        System.out.println(isReadyOrder1 ? customer4 + readyMessage + ". " + displayTotalMessage + cappuccino :
        customer4 + pendingMessage);

        // Sam
        System.out.println(customer2 + ", " + displayTotalMessage + (2 * latte));
        System.out.println(!isReadyOrder1 ? customer2 + pendingMessage : customer2 + readyMessage);

        // Jimmy
        double jimmySum = dripCoffee - latte;
        System.out.println(customer3 + ", " + displayTotalMessage + jimmySum + "\n Looks like we owe you $1.30! Sorry~!");
    }   
}
