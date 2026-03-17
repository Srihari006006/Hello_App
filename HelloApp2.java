public class HelloApp2 {
    public static void main(String[] args) {
        
        // Check if user has provided any argument
        if (args.length > 0) {
            String name = args[0];   // Get first argument
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no argument is given
            System.out.println("Hello, World!");
        }
    }
}