/**
 * A1
 */
public class A1 {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE + 1; //最大值2147483647，超過int範圍會變成最小值 
        
        long b = 7 ; 

        long c = 2147483648L;   //  java默認是int型4byte，超過int範圍的數字需要加L表示long型

        double x = 3.14;  // java默認是double型8byte，float型4byte需要加F表示

        float y = 2.178F; 

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}



































