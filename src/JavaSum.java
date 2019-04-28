import java.util.Scanner;

public class JavaSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();//large
        int b = scanner.nextInt();//small

        a--;
        b++;

        int sum = 0;

        for (int i = b; i <= a ; i++) {
            if(i%2==-1 || i%2==1) {
                sum += i;
            }
        }

        System.out.println(sum);



    }
}
