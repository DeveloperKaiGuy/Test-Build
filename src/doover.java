import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
public class doover {
    private static int counter;
    public boolean filtertryagain() {
        boolean finaloutput;
        String firstprompt = "";
        String secondprompt = "\nWould you like to access/save another password?";
        if (counter < 1) {
            finaloutput = willtryagain(firstprompt);
        } else {
            finaloutput = willtryagain(secondprompt);
        }
        return finaloutput;
    }
    private boolean willtryagain (String prompt){
        Scanner tryagain = new Scanner(System.in);
        System.out.print(prompt);
        String tryagainstring = tryagain.nextLine();
        List<String> yesanswer = Arrays.asList("Yes", "Y", "yes", "YES", "y");
        List<String> noanswer = Arrays.asList("NO", "No", "no", "n", "N");
        boolean response = yesanswer.contains(tryagainstring);
        if (noanswer.contains(tryagainstring)){
            response = false;
        }
        counter ++;
        return response;
    }
}