public class T6Q1d {
    public static void main(String[] args){
        pentagonalNumber(5);
    }

    static void pentagonalNumber(int test) {
        String result = test + " is not a pentagonal number.";
        int num = 0;
        for (int n = 0; num <= test; n++) {
            num = (n * (3 * n - 1)) / 2;
            if (test == num) {
                result = test + " is a pentagonal number.";
            }
        }

        for (int n = 0; num <= test; n--) {
            num = (n * (3 * n - 1)) / 2;
            if (test != num) {
                result = test + " is a pentagonal number.";
            }
        }
        System.out.println(result);

    }
}