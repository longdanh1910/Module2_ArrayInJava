//import java.util.Scanner;
//public class deleteIndexInArr {
//    public static void main(String[] args) {
//        int size;
//        int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Mời bạn nhập số phần tử của mảng: ");
//            size = scanner.nextInt();
//            if (size < 0) {
//                System.out.println("Số phần tử của mảng phải lớn hơn 0");
//            }
//        } while (size < 0);
//
//        array = new int[size];
//        int i = 0;
//        while (i < size) {
//            System.out.print("Nhập phần tử " + (i+1) + " : ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//        System.out.println("Mảng ban đầu:" );
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j]+"\t");
//        }
//        int X;
//        System.out.println("\nNhập số phần tử cần xoá: ");
//        X=scanner.nextInt();
//        int index_del = 0;
//        for (int j = 0; j < array.length; j++) {
//            if(array[j]==X) {
//                index_del=j;
//            }
//        }
//        for (int j = index_del; j < array.length-1 ; j++) {
//           int temp=array[index_del];
//            array[index_del]=array[index_del+1];
//            array[index_del+1]=temp;
//
//        }
//        System.out.println("\nMảng sau khi xóa phần tử "+X+" ở vị trí thứ "+(index_del)+":");
//        for (int j = 0; j < array.length-1; j++) {
//            System.out.print(array[j] + "\t");
//        }
//
//    }
//}
import java.util.Scanner;

public class deleteIndexInArr{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng
        int[] array = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu:" );
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }

        // Nhập phần tử cần xóa
        System.out.print("\nNhập phần tử cần xóa: ");
        int elementToRemove = scanner.nextInt();

        // Tìm và xóa phần tử
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == elementToRemove) {
                found = true;
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                n--; // Giảm kích thước mảng đi 1
                break;
            }
        }

        if (!found) {
            System.out.println("Phần tử " + elementToRemove + " không tồn tại trong mảng.");
        } else {
            // Hiển thị mảng sau khi xóa
            System.out.println("Mảng sau khi xóa phần tử " + elementToRemove + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
