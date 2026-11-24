public class A3 {
    /**
     * 示範 char 字元型別：字元對應 Unicode 編碼，char 與 int 相加會變成整數運算，
     * 最後用 printf 的 %c、%d 分別印出字元和它的編碼。
     */
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
