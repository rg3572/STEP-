import java.util.*;

class Main1 {
    static boolean iterative(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    static boolean recursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;

        return recursive(s, i + 1, j - 1);
    }

    static boolean arrayReverse(String s) {
        char[] a = s.toCharArray();
        String rev = "";

        for (int i = a.length - 1; i >= 0; i--)
            rev += a[i];

        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Iterative: " + iterative(s));
        System.out.println("Recursive: " +
            recursive(s, 0, s.length() - 1));
        System.out.println("Array Reversal: " + arrayReverse(s));
    }
}