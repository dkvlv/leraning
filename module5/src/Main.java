import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        String str2 = new StringBuilder(str).reverse().toString();

        if (str.equals(str2)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
