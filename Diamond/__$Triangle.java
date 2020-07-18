public class __$Triangle {
    public static void main(String[] args) {
        print0();
        System.out.println("-----------------");
        print1();
        System.out.println("-----------------");
        print2();
        System.out.println("-----------------");
        print3();
    }

    public static void print0() {
        /*
         *  *
         *  **
         *  ***
         *  ****
         * */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print1() {
        /*
        *  ****
        *  ***
        *  **
        *  *
        * */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print2() {
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < - Math.abs(4 - i) + 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print3() {
//        x >= 0, 先小后大: y = |c - x| 当y = 0时x = c
//        x >= 0, 先大后小: y = -|c - x| 当y = 0时x = c
//
//
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//        y = |4 - x|
//        y = -|4 - x| * 2 + 9
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < Math.abs(4 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < -Math.abs(4 - i) * 2 + 9; j++) {
                if ((j & 1) != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
