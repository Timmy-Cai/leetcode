package newcode5_21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        for (int i = n - 1; i >= 2; i--) {
            if (i % 2 == 1) continue; // 奇数肯定不是偶串
            int mid = i / 2;
            String a = str.substring(0, mid);
            String b = str.substring(mid, i);
            if (a.equals(b)) {
                System.out.println(i);
                break;
            }
        }
    }
}
