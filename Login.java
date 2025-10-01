import java.util.Scanner;
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String correctUsername = "Nelly";
        String correctPassword = "12345";
        //scanner object for input
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;// user has 3 attempts
        while (attempts > 0){
            //ask for username
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            //ask for password
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Password entered as: ");
            for (int i=0;password.length(); i++){
                System.out.print("*");
            }
            System.out.println();
            //check if the username and password are correct
            if(username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login successful!");
                break;
            } else{
                attempts--;//reduce attempts
                System.out.println("Wrong username or password. Attempts left: " + attempts);
            }
            if (attempts==0){//no attempts
                System.out.println("Login failed! No attempts remaining.");
            }
        }
        
    }
    
}
