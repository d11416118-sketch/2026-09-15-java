public class A2 {
    public static void main(String[] args) {
        /*
        a++ 先做動作在+1
        ++a 先+1在做動作
        */

        int a = 5 , b = 8 , c = 2;
        a++;
        System.out.println("a = " + a);
        System.out.println("b = " + (b++));
        System.out.println("c = " + (++c));
        System.out.println("b = " + b);
        System.out.println("c = " + c);











    }
}
