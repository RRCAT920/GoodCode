public class __$Primer {
    public static void main(String[] args) {
        label:
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            System.out.println(i);
        }
    }
}
