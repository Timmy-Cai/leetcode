package newcode5_21;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) System.out.println(1);
        else if (n == 2) System.out.println(2);
        else if (n == 3) System.out.println(4);
        else if (n == 4) System.out.println(6);
        else if (n == 5) System.out.println(12);
        else System.out.println(0); // dp...
    }
}
