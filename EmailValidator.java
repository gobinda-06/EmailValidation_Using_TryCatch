import java.util.*;

class Demo {
    private String email;

    public Demo(String str) {
        this.email = str;
    }

    public void checkEmail() {
        try {
            System.out.println("Email check started...");

            // If email does NOT contain @ or .
            if (!email.contains("@") || !email.contains(".")) {
                throw new Exception("Invalid Email: Missing '@' or '.' symbol!");
            }

            System.out.println(" You have entered a valid email: " + email);
        } catch (Exception e) {
            System.out.println(" " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your email:");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        Demo d1 = new Demo(n);
        d1.checkEmail(); // fixed call
        System.out.println("Thank You!");
        sc.close();
    }
}
