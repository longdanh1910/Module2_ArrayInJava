import java.util.Scanner;

public class addElement {
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

        // Nhập giá trị cần chèn
        System.out.print("Nhập giá trị cần chèn: ");
        int newElement = scanner.nextInt();

        // Nhập vị trí cần chèn
        System.out.print("Nhập vị trí cần chèn (0 đến " + n + "): ");
        int position = scanner.nextInt();

        // Kiểm tra tính hợp lệ của vị trí
        if (position < 0 || position > n) {
            System.out.println("Vị trí không hợp lệ. Vui lòng chạy lại chương trình và thử lại.");
            return;
        }

        // Tạo mảng mới có kích thước lớn hơn mảng cũ 1 đơn vị
        int[] newArray = new int[n + 1];

        // Sao chép các phần tử từ mảng cũ sang mảng mới
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Chèn phần tử mới vào vị trí chỉ định
        newArray[position] = newElement;

        // Sao chép các phần tử còn lại từ mảng cũ sang mảng mới
        for (int i = position; i < n; i++) {
            newArray[i + 1] = array[i];
        }

        // Hiển thị mảng mới sau khi chèn phần tử
        System.out.println("Mảng sau khi chèn phần tử " + newElement + " tại vị trí " + position + ":");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
