import java.util.Scanner;

public class BT1608 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String a = scan.nextLine();
        System.out.println("Chuỗi:" + printUppercaseInString(a));

        System.out.print("Nhập chuỗi s: ");
        String b = scan.nextLine();
        System.out.println(b);
        System.out.println("Chuỗi s có các chữ là: " + printNonNumber(b));

        System.out.print("Nhập chuỗi s: ");
        String c = scan.nextLine();
        System.out.println(c);
        System.out.println("Chuỗi s có các chữ là: " + printNonNumber(c));
    }

    public static String printUppercaseInString(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                res = res + s.charAt(i);
            }
        }
        return res;
    }

    public static String printNonNumber(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                continue;
            }
            res = res + s.charAt(i);
        }
        return res;
    }

    public static void countConsonantVowel(String s) {
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ccount++;
            }
            System.out.println("Số nguyên âm: " + vcount);
            System.out.println("Số phụ âm: " + ccount);
        }
    }
}
