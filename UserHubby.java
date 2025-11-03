import java.util.Scanner; 

class UserHobby {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your hobby: ");
        String hobby = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();


        System.out.println("\n--- Your Details ---");
        System.out.println("Hobby: " + hobby);
        System.out.println("Age: " + age);

        input.close(); 
    }
}

