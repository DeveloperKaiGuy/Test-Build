@SuppressWarnings("SpellCheckingInspection")
public class encryptor {
    public String encrypt(String inputone, int finalkey, boolean decryptmode){
        if (decryptmode){return unsafe(inputone, finalkey);}
        else {return safe(inputone, finalkey);}
    }
    private String safe(String inputone, int finalkey){
        StringBuilder builder = new StringBuilder();
        char[] chars = inputone.toCharArray();
        for(char c : chars){
            c += (char) finalkey;
            builder.append(c);
        }
        return builder.toString();
    }
    private String unsafe(String inputone, int finalkey){
        StringBuilder builder = new StringBuilder();
        char[] chars = inputone.toCharArray();
        for (char c : chars){
            c -= (char) finalkey;
            builder.append(c);
        }
        return builder.toString();
    }

}