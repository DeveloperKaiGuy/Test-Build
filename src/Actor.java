import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")

public class Actor {
    public void act(int input1, int input2){
        doactprivate(input1, input2);
    }
    private void doactprivate(int input1, int input2){
        if (input1 == 1 && input2 == 1){
            gamestorage gamesaver = new gamestorage();
            Scanner gamesavescan = new Scanner(System.in);
            Scanner gamevaluescan = new Scanner(System.in);
            System.out.println("Please give a nickname to the account you would like to save.");
            String gamesave = gamesavescan.nextLine();
            System.out.println("Please input the password you would like to associate with this account.");
            String gamevalue = gamevaluescan.nextLine();
            gamesaver.pubgamesaver(gamesave, gamevalue);}
        if (input1 == 1 && input2 == 2){
            gamereader gameloader = new gamereader();
            Scanner gameloadscan = new Scanner(System.in);
            Scanner keyscan = new Scanner(System.in);
            System.out.println("Input the nickname of the game account you'd like to load.");
            String gameload = gameloadscan.nextLine();
            System.out.println("Input the key associated with this account.");
            int key = Integer.parseInt(keyscan.nextLine());
            String finaloutput = gameloader.pubload(gameload, key);
            System.out.println("Your requested password is: " + finaloutput);}
        if (input1 == 2 && input2 == 1){
            workstorage worksaver = new workstorage();
            Scanner worksavescan = new Scanner(System.in);
            Scanner workvaluescan = new Scanner(System.in);
            System.out.println("Please give a nickname to the account you would like to save.");
            String worksave = worksavescan.nextLine();
            System.out.println("Please input the password you would like to associate with this account.");
            String workvalue = workvaluescan.nextLine();
            worksaver.pubworksaver(worksave, workvalue);
        }
        if (input1 == 2 && input2 == 2){
            workreader workloader = new workreader();
            Scanner workloadscan = new Scanner(System.in);
            Scanner keyscan = new Scanner(System.in);
            System.out.println("Input the nickname of the work account you'd like to load.");
            String gameload = workloadscan.nextLine();
            System.out.println("Input the key associated with this account.");
            int key = Integer.parseInt(keyscan.nextLine());
            String finaloutput = workloader.pubload(gameload, key);
            System.out.println("Your requested password is: " + finaloutput);
        }
        if (input1 == 3 && input2 == 1){
            emailstorage mailsaver = new emailstorage();
            Scanner mailsavescan = new Scanner(System.in);
            Scanner mailvaluescan = new Scanner(System.in);
            System.out.println("Please give a nickname to the account you would like to save.");
            String gamesave = mailsavescan.nextLine();
            System.out.println("Please input the password you would like to associate with this account.");
            String gamevalue = mailvaluescan.nextLine();
            mailsaver.pubmailsaver(gamesave, gamevalue);}
        if (input1 == 3 && input2 == 2){
            emailreader mailloader = new emailreader();
            Scanner mailloadscan = new Scanner(System.in);
            Scanner keyscan = new Scanner(System.in);
            System.out.println("Input the nickname of the game account you'd like to load.");
            String gameload = mailloadscan.nextLine();
            System.out.println("Input the key associated with this account.");
            int key = Integer.parseInt(keyscan.nextLine());
            String finaloutput = mailloader.pubload(gameload, key);
            System.out.println("Your requested password is: " + finaloutput);
        }
    }
}