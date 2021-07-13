package orelly;

public class Random {
    public static void main(String[] args) {
        String[] worldListOne = {
            "0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
        };
        int oneLength = worldListOne.length;
        System.out.println("oneLength = " + oneLength);
    int rand = (int)(Math.random() * oneLength);
        System.out.println(rand);
    }
}
