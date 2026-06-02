package pekan8_2511531020;

public class ShellSort_2511531020 {
    
    public static void shellSort_1020(int[] A_1020) {
        int n_1020 = A_1020.length;
        int gap_1020 = n_1020 / 2;

        while (gap_1020 > 0) {
            for (int i_1020 = gap_1020; i_1020 < n_1020; i_1020++) {
                int temp_1020 = A_1020[i_1020];
                int j_1020 = i_1020;

                while (j_1020 >= gap_1020 && A_1020[j_1020 - gap_1020] > temp_1020) {
                    A_1020[j_1020] = A_1020[j_1020 - gap_1020];
                    j_1020 = j_1020 - gap_1020;
                }

                A_1020[j_1020] = temp_1020;
            }

            gap_1020 = gap_1020 / 2;
        }
    }

    public static void main(String[] args) {
        int[] data_1020 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};

        System.out.print("Sebelum: ");
        printArray(data_1020);

        shellSort_1020(data_1020);

        System.out.print("Sesudah (Shell Sort): ");
        printArray(data_1020);
    }

    public static void printArray(int[] arr) {
        for (int i_1020 : arr)
            System.out.print(i_1020 + " ");

        System.out.println();
    }
}