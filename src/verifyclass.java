import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
public class verifyclass {
    public boolean authget() {
        int gotcode = authmake();
        return gotcode == 1;
    }
    private int authmake() {
        int total = 0;

        for (int attemptnumber = 1; attemptnumber < 4; attemptnumber++) {
            Scanner auth = new Scanner(System.in);
            System.out.println("Please input the authorization PIN for this program." + " You are on attempt number " + attemptnumber + " out of 3.");
            String authguess = auth.nextLine();
            int authguessnumber = Integer.parseInt(authguess);
            if (9025 == authguessnumber) {
                total = 1;
                System.out.println("Verification Successful.");
                break;
            }
        }
        return total;
    }
}