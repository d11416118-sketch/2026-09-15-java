import java.util.Scanner;
public class A8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("請輸入分數");
        n = sc.nextInt();
        
        if(n>=80 && n<=100){
            System.out.println("A,你簡直天才");
        }
        else if(n>=70 && n<80){
            System.out.println("B,至少努力");
        }
        else if(n>=60 && n<70){
            System.out.println("C,運氣不錯0");
        }
        else if(n>100 || n<0){
            System.out.println("還敢亂輸入分數?");
        }
        else{
            System.out.println("D,明年見");
        }






    }
}
