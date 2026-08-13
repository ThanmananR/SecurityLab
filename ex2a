import java.util.*;

public class ex2a {
    static char[][] m = new char[5][5];

    static void makeKey(String key) {
        String s = "";
        key = (key + "ABCDEFGHIKLMNOPQRSTUVWXYZ").toUpperCase();

        for (char c : key.toCharArray())
            if (c == 'J') c = 'I';

        for (char c : key.toCharArray())
            if (s.indexOf(c) < 0 && c >= 'A' && c <= 'Z')
                s += c;

        for (int i = 0; i < 25; i++)
            m[i / 5][i % 5] = s.charAt(i);
    }

    static String prepare(String s) {
        s = s.toUpperCase().replaceAll("[^A-Z]", "").replace('J', 'I');
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            r += a;

            if (i + 1 < s.length() && a == s.charAt(i + 1))
                r += 'X';
        }

        if (r.length() % 2 != 0)
            r += 'X';

        return r;
    }

    static String encrypt(String s) {
        String out = "";

        for (int i = 0; i < s.length(); i += 2) {
            char a = s.charAt(i), b = s.charAt(i + 1);
            int r1 = 0, c1 = 0, r2 = 0, c2 = 0;

            for (int r = 0; r < 5; r++)
                for (int c = 0; c < 5; c++) {
                    if (m[r][c] == a) { r1 = r; c1 = c; }
                    if (m[r][c] == b) { r2 = r; c2 = c; }
                }

            if (r1 == r2) {
                out += m[r1][(c1 + 1) % 5];
                out += m[r2][(c2 + 1) % 5];
            } else if (c1 == c2) {
                out += m[(r1 + 1) % 5][c1];
                out += m[(r2 + 1) % 5][c2];
            } else {
                out += m[r1][c2];
                out += m[r2][c1];
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Key: ");
        String key = sc.nextLine();

        System.out.print("Plain text: ");
        String text = sc.nextLine();

        makeKey(key);
        text = prepare(text);

        System.out.println("Prepared Text: " + text);
        System.out.println("Cipher Text: " + encrypt(text));
    }
}
