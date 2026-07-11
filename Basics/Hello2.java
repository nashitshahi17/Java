import java.util.*;
public class Hello2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine(); // When nextInt() reads the integer, it does not consume the newline (\n) that you type after the number. So nextLine() immediately reads that leftover newline and returns an empty string.
        String y = sc.nextLine();
        System.out.println(x);
        System.out.println(y);
    }
}
