import java.util.Scanner;

//本题相当于遍历字符串，以每个下标为开始，进行提取子串。
//然后相当于找最大值一样，依次打擂台。找到最大值的GC比例
public class DNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();
        int usedSize = scanner.nextInt();
        String maxStr = "";
        double maxRatio = 0;
        for (int i = 0;i < dna.length() - usedSize + 1;i++){
            String string = dna.substring(i,i+usedSize);
            if (Giveratio(string) > maxRatio){
                maxStr = string;
                maxRatio = Giveratio(string);
            }
        }
        System.out.println(maxStr);
    }

    //返回一个字符串的GC比例
    private static double Giveratio(String string) {
        double ratio = 0; //这里要用double型，如果用int型，2/5的结果为0
        double count = 0; //用double型，原因同上
        for (char ch : string.toCharArray()){
            if (ch == 'G' || ch == 'C'){
                count++;
            }
        }
        ratio = count/(double)string.length();
        return ratio;
    }
}
