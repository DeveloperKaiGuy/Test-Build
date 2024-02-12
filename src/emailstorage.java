import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
@SuppressWarnings("SpellCheckingInspection")
public class emailstorage {
    encryptor safemode = new encryptor();
    public void pubmailsaver(String codenickname, String codevalue){
        privmailsaver(codenickname, codevalue);
    }
    private void privmailsaver(String codenickname, String codevalue){
        Scanner getkey = new Scanner(System.in);
        System.out.println("Please associate a key with this password. Try to use a number between 100 and 14 million. You will need this number to load this password later so write it down.");
        int finalkey = Integer.parseInt(getkey.nextLine());

        try {
            Path filelocation = Paths.get("user.home" + "\\AppData\\Roaming\\Vera\\Email\\" + codenickname + ".nop\\");
            Files.createDirectories(filelocation.getParent());
            FileWriter doittoit = new FileWriter(String.valueOf(filelocation));
            String newcode = safemode.encrypt(codevalue, finalkey, false );
            doittoit.write(newcode);
            doittoit.close();
            System.out.println("File saved successfully!");
        }
        catch (IOException e){
            System.out.println("Error, file could not be written.");
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}