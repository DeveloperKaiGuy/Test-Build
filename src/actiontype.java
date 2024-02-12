import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
public class actiontype {
    public int getact(){return makeact();}
    private int makeact(){
        int lastact = 0;
        List<String> storagecondition = Arrays.asList("save", "Save", "s", "S", "SAVE");
        List<String> retrievalcondidion = Arrays.asList("Load", "load", "l", "L", "LOAD");
        Scanner useractionget = new Scanner(System.in);
        System.out.println("Would you like to (load) a password or (save) one? Please reply with one of the parenthesized words.");
        String useractiontype = useractionget.nextLine();
        if (storagecondition.contains(useractiontype)){lastact = 1;}
        if (retrievalcondidion.contains(useractiontype)){lastact = 2;}
        return lastact;
    }

}