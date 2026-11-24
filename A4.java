public class A4 {
    /**
     * 示範 printf 的欄寬格式：%10d、%10f 靠右對齊，%-10d、%-10f 靠左對齊。
     */
    public static void main(String[] args) {
        int a = 12;
        double d = 3.14;
        System.out.printf("a = %10d\n",a);
        System.out.printf("a = %-10d\n",a);
        System.out.printf("d = %10f\n",d);
        System.out.printf("d = %-10f\n",d);
    }
}
