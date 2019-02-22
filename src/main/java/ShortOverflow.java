public class ShortOverflow {

    public static void main(String[] args) {
        overflow();
//        32765:32765
//        32766:32766
//        32767:32767
//        32768:-32768

        fixedOverflow();
//        32765:32765
//        32766:32766
//        32767:32767
//        32768:32767
    }

    private static void overflow() {

        System.out.println(Short.MAX_VALUE);
        short retries = 1;
        for (int i = 1; i <= Short.MAX_VALUE + 1; i++) {

            System.out.println(String.format("%s:%s", i, retries));
            retries += 1;
        }
    }

    private static void fixedOverflow() {
        System.out.println(Short.MAX_VALUE);
        short retries = 1;
        for (int i = 1; i <= Short.MAX_VALUE + 1; i++) {

            System.out.println(String.format("%s:%s", i, retries));
            if (i >= Short.MAX_VALUE) {
                retries = Short.MAX_VALUE;
            } else {
                retries += 1;
            }
        }
    }
}

