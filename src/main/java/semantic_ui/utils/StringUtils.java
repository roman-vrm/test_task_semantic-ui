package semantic_ui.utils;

public class StringUtils {

    public static String randomString (String mode, int lenght) {
        String alphabet;

        switch (mode) {
            case "alpha":
                alphabet="abcdefghijklmnoprstuvwxyz";

                break;
            case "numeric":
                alphabet="0123456789";

                break;
            case "alphanumeric":
                alphabet="abcdefghijklmnoprstuvwxyz0123456789";
                break;
            default:
                alphabet="";
        }
        String result = "";

        for (int i = 0; i < lenght; i ++) {
            int index = (int) (Math.random()*alphabet.length());
            result+=alphabet.charAt(index);
        }
        return result;

    }
}
