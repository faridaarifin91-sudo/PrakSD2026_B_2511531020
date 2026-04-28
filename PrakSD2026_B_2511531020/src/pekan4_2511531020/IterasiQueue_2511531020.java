package pekan4_2511531020;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class IterasiQueue_2511531020 {
    public static void main(String args[]) {
        Queue<String> q_1020 = new LinkedList<>();

        q_1020.add("Praktikum");
        q_1020.add("Struktur");
        q_1020.add("Data");
        q_1020.add("Dan");
        q_1020.add("Algoritma");

        Iterator<String> iterator_1020 = q_1020.iterator();
        while (iterator_1020.hasNext()) {
            System.out.print(iterator_1020.next() + " ");
        }
    }
}
