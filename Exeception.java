public class Exeception {
    public static void main(String[] args) {
        try {
            int a=50/0;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("can not divided by 0");
    }
}