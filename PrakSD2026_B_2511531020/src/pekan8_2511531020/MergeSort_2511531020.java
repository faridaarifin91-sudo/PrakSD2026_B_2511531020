package pekan8_2511531020;

public class MergeSort_2511531020 {
    void merge_2511531020(int arr_1020[], int l_1020, int m_1020, int r_1020) {
        int n1_1020 = m_1020 - l_1020 + 1;
        int n2_1020 = r_1020 - m_1020;

        int L_1020[] = new int[n1_1020];
        int R_1020[] = new int[n2_1020];

        for (int i_1020 = 0; i_1020 < n1_1020; ++i_1020)
            L_1020[i_1020] = arr_1020[l_1020 + i_1020];
        for (int j_1020 = 0; j_1020 < n2_1020; ++j_1020)
            R_1020[j_1020] = arr_1020[m_1020 + 1 + j_1020];

        int i_1020 = 0, j_1020 = 0;
        int k_1020 = l_1020;
        while (i_1020 < n1_1020 && j_1020 < n2_1020) {
            if (L_1020[i_1020] <= R_1020[j_1020]) {
                arr_1020[k_1020] = L_1020[i_1020];
                i_1020++;
            } else {
                arr_1020[k_1020] = R_1020[j_1020];
                j_1020++;
            }
            k_1020++;
        }

        while (i_1020 < n1_1020) {
            arr_1020[k_1020] = L_1020[i_1020];
            i_1020++;
            k_1020++;
        }

        while (j_1020 < n2_1020) {
            arr_1020[k_1020] = R_1020[j_1020];
            j_1020++;
            k_1020++;
        }
    }

    // Tambahan dari foto: method sort
    void sort_2511531020(int arr_1020[], int l_1020, int r_1020) {
        if (l_1020 < r_1020) {
            int m_1020 = (l_1020 + r_1020) / 2;
            sort_2511531020(arr_1020, l_1020, m_1020);
            sort_2511531020(arr_1020, m_1020 + 1, r_1020);
            merge_2511531020(arr_1020, l_1020, m_1020, r_1020);
        }
    }

    // Utility untuk print array
    static void printArray_2511531020(int arr_1020[]) {
        int n_1020 = arr_1020.length;
        for (int i_1020 = 0; i_1020 < n_1020; ++i_1020)
            System.out.print(arr_1020[i_1020] + " ");
        System.out.println();
    }

    // Main program
    public static void main(String args_1020[]) {
        int arr_1020[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Sebelum terurut:");
        printArray_2511531020(arr_1020);

        MergeSort_2511531020 ob_1020 = new MergeSort_2511531020();
        ob_1020.sort_2511531020(arr_1020, 0, arr_1020.length - 1);

        System.out.println("\nSesudah terurut menggunakan Merge Sort:");
        printArray_2511531020(arr_1020);
    }
}
