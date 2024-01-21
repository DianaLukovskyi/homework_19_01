
public class Main {
    public static void main(String[] args) {


        try {
            int a = 40 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e.getMessage());
        }
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());

        }
    }
}