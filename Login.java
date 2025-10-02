import java.util.Scanner;
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String correctUsername = "Nelly";
        String correctPassword = "AbcD";
        //scanner object for input
        Scanner scanner = new Scanner(System.in);
        //user has 3 attempts
        int attempts = 3;
        while (attempts > 0){
            //ask for username
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            //ask for password
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Password entered as: ");
            for (int i=0; i< password.length(); i++){
                System.out.print("*");
            }
            System.out.println();
            //check if username and password are correct
            if(username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login successful!");
                break;
            } else{
                attempts--;//reduce attempts
                System.out.println("Wrong username or password. Attempts left: " + attempts);
            }
            //if no attempts left
            if (attempts==0){
                System.out.println("Login failed! No attempts remaining.");
            }
        }
        
    }
    
}
