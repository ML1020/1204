public class MoneyMan {
    public static void main(String[] args) {
        long sumRich = 0;
        long sumStranger = 0;
        for (int i = 1;i <= 30;i++){
            sumRich += 10; //累加10(万)
            //累加2的n-1次方(份)
            sumStranger = sumStranger + (long)Math.pow(2,i-1);
        }
        System.out.println(sumRich + " " + sumStranger);
    }
}
