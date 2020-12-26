package task0217;

public class Task0217 {
    public static int min(int a, int b, int c, int d) {
        if (min(a, b) > c) {
            if (min(a, b) > d) {
                return c;
            }
        } else {
            return d;
        }
    }

    public static int min(int a, int b) {
        if(a < b){
            return a;
        }
        else {
            return b;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
