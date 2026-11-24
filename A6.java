import java.util.Scanner;
public class A6 {
    /**
     * 用 Scanner 讀入姓名、年齡、身高後格式化印出。
     * 示範 next() 只讀到空白前，nextLine() 才會讀整行。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double h;
        System.out.println("請輸入姓名、年齡、身高");
        name = sc.next();
        //name = sc.nextLine();
        /*
            next() 只會讀取空白前的字串，nextLine() 會讀取整行字串

        */

        age = sc.nextInt();
        h = sc.nextDouble();
        System.out.printf("name = %s age = %d height = %f",name,age,h);
       
    }
}
