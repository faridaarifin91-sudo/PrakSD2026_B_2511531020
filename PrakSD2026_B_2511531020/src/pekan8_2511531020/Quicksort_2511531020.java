package pekan8_2511531020;

public class Quicksort_2511531020 {

    static void swap_2511531020(int[] arr_1020, int i_1020, int j_1020) {
        int temp_1020 = arr_1020[i_1020];
        arr_1020[i_1020] = arr_1020[j_1020];
        arr_1020[j_1020] = temp_1020;
    }

    // Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
    static void medianOfThree_2511531020(int[] arr_1020, int low_1020, int high_1020) {
        int mid_1020 = low_1020 + (high_1020 - low_1020) / 2;

        // Urutkan elemen low, mid, dan high
        if (arr_1020[low_1020] > arr_1020[mid_1020]) {
            swap_2511531020(arr_1020, low_1020, mid_1020);
        }

        if (arr_1020[low_1020] > arr_1020[high_1020]) {
            swap_2511531020(arr_1020, low_1020, high_1020);
        }

        if (arr_1020[mid_1020] > arr_1020[high_1020]) {
            swap_2511531020(arr_1020, mid_1020, high_1020);
        }

        swap_2511531020(arr_1020, mid_1020, high_1020);
    }

    static int partition_2511531020(int[] arr_1020, int low_1020, int high_1020) {
        // Panggil fungsi medianOfThree sebelum menentukan pivot
        medianOfThree_2511531020(arr_1020, low_1020, high_1020);

        int pivot_1020 = arr_1020[high_1020]; // Sekarang arr[high] sudah berisi nilai median
        int i_1020 = (low_1020 - 1);

        for (int j_1020 = low_1020; j_1020 <= high_1020 - 1; j_1020++) {
            // Jika elemen saat ini lebih kecil dari atau sama dengan pivot
            if (arr_1020[j_1020] <= pivot_1020) {
                i_1020++; // Increment indeks elemen yang lebih kecil
                swap_2511531020(arr_1020, i_1020, j_1020);
            }
        }

        swap_2511531020(arr_1020, i_1020 + 1, high_1020);
        return (i_1020 + 1);
    }

    static void quickSort_2511531020(int[] arr_1020, int low_1020, int high_1020) {
        if (low_1020 < high_1020) {
            int pi_1020 = partition_2511531020(arr_1020, low_1020, high_1020);
            quickSort_2511531020(arr_1020, low_1020, pi_1020 - 1);
            quickSort_2511531020(arr_1020, pi_1020 + 1, high_1020);
        }
    }

    public static void printArr_2511531020(int[] arr_1020) {
        for (int i_1020 = 0; i_1020 < arr_1020.length; i_1020++) {
            System.out.print(arr_1020[i_1020] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr_1020 = { 10, 7, 8, 9, 1, 5 };
        int N_1020 = arr_1020.length;
        System.out.print("Data sebelum diurutkan: ");
        printArr_2511531020(arr_1020);

        quickSort_2511531020(arr_1020, 0, N_1020 - 1);

        System.out.print("Data Terurut quicksort: ");
        printArr_2511531020(arr_1020);
    }
}
