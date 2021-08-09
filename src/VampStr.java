public class VampStr {
    private static final int DIGIT_NOT_FOUND = -1;
    private static final char DIGIT_FOUND = 'F';
    private static final String ALL_DIGIT_FOUND = "FFFF";
    private static final int start = 11;
    private static final int end = 99;

    int a;
    int b;
    int product;
    String abStr;
    String productStr;

    public void count() {
        int bottom = (start - 1) * (end + 1) - 1;
        for (a = start; a <= end; ++a) {
            for (b = end; b >= a; --b) {
                product = a * b;
                if (product <= bottom) {
                    break;
                }
                productStr = "" + product;
                abStr = "" + a + b;
                for (int i = 0; i < abStr.length(); i++) {
                    int digit = productStr.indexOf(abStr.charAt(i));
                    if (digit == DIGIT_NOT_FOUND) {
                        break;
                    } else {
                        productStr = productStr.substring(0, digit) + DIGIT_FOUND + productStr.substring(digit + 1);
                        if (productStr.equals(ALL_DIGIT_FOUND)) {
                            System.out.println(a + " * " + b + " = " + product);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        VampStr run = new VampStr();
        run.count();
    }
}
