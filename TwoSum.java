import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int n, target;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the arr: ");
        n = scan.nextInt();
        System.out.println("Enter the target: ");
        target = scan.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }
                else {
                    if(num[i] + num[j] == target) {
                        System.out.println(Arrays.asList(i, j));
                        return;
                    }
                }
            }
        }
    }
}
