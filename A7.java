import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double h;
        double m;
        System.out.println("請輸入姓名");
        //name = sc.next();
        name = sc.nextLine();
        /*
            next() 只會讀取空白前的字串，nextLine() 會讀取整行字串

        */
        System.out.println("請輸入年齡");
        age = sc.nextInt();
        System.out.println("請輸入身高");
        h = sc.nextDouble();
        System.out.println("請輸入餘額");
        m = sc.nextDouble();
        System.out.printf("name = %s age = %d height = %f m = %f\n",name,age,h,m);
        

        if(age>=18 && h>=150 && m>=1000){
            System.out.println("尊貴的客人你可以看電影");
        }
        else if(age>=18 && h<150 && m>=1000){
            System.out.println("矮人不行看電影");
        }
        else if(age>=18 && m<1000){
            System.out.println("窮鬼滾一邊去");
        }
        
        else{
            System.out.println("你還想看電影?");
        }


    }
}
