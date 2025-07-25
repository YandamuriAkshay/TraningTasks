public class KeywordDemo {
    public static void main(String[] args) {
        final int x = 10;
        int y = 5;
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            if (x > y) {
                System.out.println("x is large");
            } else {
                System.out.println("y is large");
            }
        }
        switch (x) {
            case 10:
                System.out.println("Ten");
                break;
            default:
                break;
        }
    }
}
