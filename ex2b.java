

public class ex2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String text = sc.nextLine();

        System.out.print("Enter number of rails: ");
        int n = sc.nextInt();

        String[] rail = new String[n];

        for (int i = 0; i < n; i++) {
            rail[i] = "";
        }

        int row = 0;
        int direction = 1;

        for (int i = 0; i < text.length(); i++) {
            rail[row] = rail[row] + text.charAt(i);

            if (row == n - 1)
                direction = -1;

            if (row == 0)
                direction = 1;

            row = row + direction;
        }

        System.out.print("Encrypted text: ");

        for (int i = 0; i < n; i++) {
            System.out.print(rail[i]);
        }

        sc.close();
    }
}

