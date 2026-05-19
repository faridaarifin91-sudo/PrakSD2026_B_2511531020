package pekan7_2511531020;

public class InsertionSort_2511531020 {
    public static void insertionSort1020(int[] arr_1020) {
        int n_1020 = arr_1020.length;
        for (int i_1020 = 1; i_1020 < n_1020; i_1020++) {
            int key_1020 = arr_1020[i_1020];
            int j_1020 = i_1020 - 1;
            while (j_1020 >= 0 && arr_1020[j_1020] > key_1020) {
                arr_1020[j_1020 + 1] = arr_1020[j_1020];
                j_1020--;
            }
            arr_1020[j_1020 + 1] = key_1020;
        }
    }

    public static void main(String[] args_1020) {
        int arr_1020[] = {23, 78, 45, 8, 32, 56, 1};
        int n_1020 = arr_1020.length;
        System.out.printf("array yang belum terurut:\n");
        for (int i_1020 = 0; i_1020 < n_1020; i_1020++)
            System.out.print(arr_1020[i_1020] + " ");
        System.out.println("");
        insertionSort1020(arr_1020);
        System.out.printf("array yang terurut:\n");
        for (int i_1020 = 0; i_1020 < n_1020; i_1020++)
            System.out.print(arr_1020[i_1020] + " ");
        System.out.println("");
    }
}
