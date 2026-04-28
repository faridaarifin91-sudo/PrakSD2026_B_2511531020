package pekan4_2511531020;

public class QueueArrayDriver_2511531020 {
    public static void main(String[] args) {
        QueueArray_2511531020 queue_1020 = new QueueArray_2511531020(1000);

        queue_1020.enqueue_1020(10);
        queue_1020.enqueue_1020(20);
        queue_1020.enqueue_1020(30);
        queue_1020.enqueue_1020(40);

        System.out.println("Item di depan: " + queue_1020.front_1020());
        System.out.println("Item paling belakang: " + queue_1020.rear_1020());
        System.out.println("Tampilan queue:");
        queue_1020.display_1020();

        System.out.println();
        System.out.println(queue_1020.dequeue_1020() + " dihapus dari queue");
        System.out.println("Item di depan: " + queue_1020.front_1020());
        System.out.println("Item paling belakang: " + queue_1020.rear_1020());
        System.out.println("Tampilan queue setelah satu data dihapus:");
        queue_1020.display_1020();
    }
}
