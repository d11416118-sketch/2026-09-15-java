public class A3 {
    public static void main(String[] args) {
        
        char c = 'A';  // char型佔2byte，範圍0~65535，對應Unicode編碼
        char d = 100;   
        int a = 10;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("a + c = " + (a + c));  

        System.out.printf("char c = %c int c = %d",c,(int)c );


    }
}
