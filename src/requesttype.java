import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
public class requesttype {
    public int getrqt(){
        return makerqt();
    }
    private int makerqt(){
        int total = 0;
        List<String> gamecondition = Arrays.asList("game", "Game", "GAME", "G", "g");
        List<String> workcondition = Arrays.asList("Work", "work", "WORK", "w", "W");
        List<String> emailcondition = Arrays.asList("Email", "email", "EMAIL", "E", "e", "E-mail", "e-mail", "E-MAIL");
        Scanner userrqtscan = new Scanner(System.in);
        System.out.println("What type of account would you like to access? There are game, work, and email accounts.");
        String userrqt = userrqtscan.nextLine();
        if (gamecondition.contains(userrqt)){total = 1;}
        if (workcondition.contains(userrqt)){total = 2;}
        if (emailcondition.contains(userrqt)){total = 3;}
        return total;
    }
}