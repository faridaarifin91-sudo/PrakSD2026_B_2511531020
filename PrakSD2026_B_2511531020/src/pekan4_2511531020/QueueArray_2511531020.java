package pekan4_2511531020;

public class QueueArray_2511531020 {
    int front_1020, rear_1020, size_1020;
    int capacity_1020;
    int array_1020[];
    
    public QueueArray_2511531020(int capacity) {
        this.capacity_1020 = capacity;
        front_1020 = this.size_1020 = 0;
        rear_1020 = capacity - 1;
        array_1020 = new int[this.capacity_1020];
    }
    
    boolean isFull_1020(QueueArray_2511531020 queue) {
        return (queue.size_1020 == queue.capacity_1020);
    }
    
    boolean isEmpty_1020(QueueArray_2511531020 queue) {
        return (queue.size_1020 == 0);
    }
    
    void enqueue_1020(int item) {
        if (isFull_1020(this))
            return;
        this.rear_1020 = (this.rear_1020 + 1) % this.capacity_1020;
        this.array_1020[this.rear_1020] = item;
        this.size_1020 = this.size_1020 + 1;
        System.out.println(item + " enqueued to queue");
    }
    
    int dequeue_1020() {
        if (isEmpty_1020(this))
            return Integer.MIN_VALUE;
        int item = this.array_1020[this.front_1020];
        this.front_1020 = (this.front_1020 + 1) % this.capacity_1020;
        this.size_1020 = this.size_1020 - 1;
        return item;
    }

    int front_1020() {
        if (isEmpty_1020(this))
            return Integer.MIN_VALUE;
        return this.array_1020[this.front_1020];
    }

    int rear_1020() {
        if (isEmpty_1020(this))
            return Integer.MIN_VALUE;
        return this.array_1020[this.rear_1020];
    }

    // mencetak elemen antrian
    void display_1020() {
        int i;
        if (front_1020 == rear_1020) {
            System.out.println("\nAntrian Kosong\n");
            return;
        }

        // kunjungi dari depan sampai belakang dan cetak
        for (i = front_1020; i <= rear_1020; i++)
            System.out.printf(" %d <-- ", array_1020[i]);

        return;
    }
}
