import java.util.Scanner;

public class ex1a {

    static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + key) % 26 + 'A');
            } 
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + key) % 26 + 'a');
            }

            result.append(ch);
        }

        return result.toString();
    }

    static String decrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' - key + 26) % 26 + 'A');
            } 
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' - key + 26) % 26 + 'a');
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String text = sc.nextLine();

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        // Keep key within 0-25
        key = ((key % 26) + 26) % 26;

        String encrypted = encrypt(text, key);
        System.out.println("Encrypted text: " + encrypted);

        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted text: " + decrypted);

        sc.close();
    }
}
