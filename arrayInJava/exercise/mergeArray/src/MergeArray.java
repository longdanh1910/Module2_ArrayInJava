import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng 1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Nhập các phần tử cua mảng 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Phần tử thứ " + (i+1) +" : ");
            arr1[i]=scanner.nextInt();
        }

        System.out.println("Nhập số phần tử của mảng 2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Nhập các phần tử cua mảng 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Phần tử thứ " + (i+1) +" : ");
            arr2[i]=scanner.nextInt();
        }

        int n3=n1+n2;
        int[] arr3 = new int[n3];
        for (int i = 0; i < n1; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[i+n1]=arr2[i];
        }
        System.out.println("Mảng thứ 3 sau khi gộp:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        


    }
}
