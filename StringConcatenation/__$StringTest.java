public class __$StringTest {
    public static void main(String[] args) {
        char c = 'a'; // 97
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);
        System.out.println(c + str + num);
        System.out.println(c + (num + str));
        System.out.println((c + num) + str);
        System.out.println(str + num + c);

            //p02
        //*    *
        System.out.println("*    *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));
    }
}
