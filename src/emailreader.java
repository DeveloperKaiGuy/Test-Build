import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
public class emailreader {
    public String pubload(String codename, int keyinput){
        return privload(codename, keyinput);
    }
    private String privload(String codename, int keyinput){
        encryptor unsafemode = new encryptor();
        StringBuilder builder = new StringBuilder();
        try{
            Scanner getpassword = new Scanner(Paths.get("user.home" + "\\AppData\\Roaming\\Vera\\Email\\" + codename + ".nop\\"));
            while (getpassword.hasNextLine()){
                String line = getpassword.nextLine();
                builder.append(line);
            }
        } catch (IOException e){
            System.out.println("Error, failed to retrieve password.");
        }
        return unsafemode.encrypt(String.valueOf(builder), keyinput,true);
    }
}