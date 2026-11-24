public class A5 {
    /**
     * 示範跳脫字元：用 printf 印出反斜線、百分比符號、雙引號、單引號。
     */
    public static void main(String[] args) {
        char a ='\u1111';

        System.out.printf("\\");
        System.out.printf("%%");
        System.out.printf("\"");
        System.out.printf("\'");

    }
}
