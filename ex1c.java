import java.util.*;

class ex3a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter key: ");
        String key = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char k = key.charAt(i % key.length());

            char c = (char) ((ch - 'A' + k - 'A') % 26 + 'A');
            result = result + c;
        }

        System.out.println("Encrypted text: " + result);
    }
}
