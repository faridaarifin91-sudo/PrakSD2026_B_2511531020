package pekan7_2511531020;

public class SelectionSort_2511531020 {
    public static void selectionSort1020(int[] arr_1020) {
        int n_1020 = arr_1020.length;
        for (int i_1020 = 0; i_1020 < n_1020 - 1; i_1020++) {
            int minIndex_1020 = i_1020;
            for (int j_1020 = i_1020 + 1; j_1020 < n_1020; j_1020++) {
                if (arr_1020[j_1020] < arr_1020[minIndex_1020]) {
                    minIndex_1020 = j_1020;
                }
            }
            int temp_1020 = arr_1020[i_1020];
            arr_1020[i_1020] = arr_1020[minIndex_1020];
            arr_1020[minIndex_1020] = temp_1020;
        }
    }

    public static void main(String[] args_1020) {
        int arr_1020[] = {23, 78, 45, 8, 32, 56, 1};
        int n_1020 = arr_1020.length;
        System.out.print("array yang belum terurut:\n");
        for (int i_1020 = 0; i_1020 < n_1020; i_1020++) {
            System.out.print(arr_1020[i_1020] + " ");
        }
        System.out.println("");
        selectionSort1020(arr_1020);
        System.out.print("array yang terurut:\n");
        for (int i_1020 = 0; i_1020 < n_1020; i_1020++) {
            System.out.print(arr_1020[i_1020] + " ");
        }
        System.out.println("");
    }
}

