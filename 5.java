import java.util.*;

class Main1 {
    static String reverseCustomerName(String name) {
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--)
            rev += name.charAt(i);

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " +
            reverseCustomerName(name));
    }
}