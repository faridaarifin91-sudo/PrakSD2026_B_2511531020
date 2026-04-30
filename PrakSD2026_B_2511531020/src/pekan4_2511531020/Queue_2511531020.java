package pekan4_2511531020;

public class Queue_2511531020 {
    String[] queue_1020;
    int front_1020, rear_1020, max_1020;

    public Queue_2511531020(int kapasitas_1020) {
        max_1020 = kapasitas_1020;
        queue_1020 = new String[max_1020];
        front_1020 = -1;
        rear_1020 = -1;
    }

    boolean isEmpty_1020() {
        return (front_1020 == -1 && rear_1020 == -1);
    }

    boolean isFull_1020() {
        return (rear_1020 == max_1020 - 1);
    }

    void enqueue_1020(String data_1020) {
        if (isFull_1020()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_1020()) {
                front_1020 = 0;
                rear_1020 = 0;
            } else {
                rear_1020++;
            }
            queue_1020[rear_1020] = data_1020;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    void dequeue_1020() {
        if (isEmpty_1020()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_1020[front_1020] + " telah dilayani");
            if (front_1020 == rear_1020) {
                front_1020 = rear_1020 = -1;
            } else {
                for (int i = front_1020; i < rear_1020; i++) {
                    queue_1020[i] = queue_1020[i + 1];
                }
                rear_1020--;
            }
        }
    }

    void display_1020() {
        if (isEmpty_1020()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            for (int i = front_1020; i <= rear_1020; i++) {
                System.out.println((i - front_1020 + 1) + ". " + queue_1020[i]);
            }
        }
    }

    void reverse_1020() {
        if (isEmpty_1020()) {
            System.out.println("Antrian kosong!");
        } else {
            // Tukar isi array dari depan ke belakang
            int i = front_1020;
            int j = rear_1020;
            while (i < j) {
                String temp = queue_1020[i];
                queue_1020[i] = queue_1020[j];
                queue_1020[j] = temp;
                i++;
                j--;
            }

            // Cetak isi antrian setelah dibalik
            System.out.println("Isi antrian setelah dibalik:");
            for (int k = front_1020; k <= rear_1020; k++) {
                System.out.println((k - front_1020 + 1) + ". " + queue_1020[k]);
            }
        }
    }
}
