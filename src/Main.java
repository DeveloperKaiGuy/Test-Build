@SuppressWarnings("SpellCheckingInspection")
public class Main {
    public static void main (String[] args) {
        doover onemore = new doover();
        while (onemore.filtertryagain()) {
            requesttype accounttype = new requesttype();
            actiontype accountaction = new actiontype();

            verifyclass pinauth = new verifyclass();
            Actor commit = new Actor();
            int acctype;
            int acttype;
            if (!pinauth.authget()) {
                System.out.println("Verification Failed. Restart the program to try again.");
                System.exit(0);
            }
            acctype = accounttype.getrqt();
            acttype = accountaction.getact();
            commit.act(acctype, acttype);
        }
    }
}
