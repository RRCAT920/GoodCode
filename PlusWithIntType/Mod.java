package loop;

public class Mod {

    public static void main(String[] args) {
        int i=10;
        while(i>0){
            i = i +1;
            if(i==10){
                break;
            }
        }
        System.out.println("i=" + i);
    }

}









// 结果是-2^31
