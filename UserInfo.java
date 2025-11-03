import java.util.Scanner; 

class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your class: ");
        String userClass = input.nextLine();

    
        System.out.println("\n--- Your Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Class: " + userClass);

        input.close(); 
    }
}
