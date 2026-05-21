package pekan7_2511531020;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class SortingGUI_2511531020 extends JFrame {
    private JTextField tfNama_1020, tfNim_1020, tfProdi_1020;
    private JButton btnTambah_1020, btnHapus_1020, btnSort_1020;
    private JComboBox<String> cbAlgoritma_1020;
    private JTextArea areaVisualisasi_1020;
    private JTable tableMahasiswa_1020;
    private DefaultTableModel model_1020;
    private ArrayList<Mahasiswa_2511531020> daftarMahasiswa_1020;

    public SortingGUI_2511531020() {
        setTitle("Sorting Nama Mahasiswa");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        daftarMahasiswa_1020 = new ArrayList<>();

        // Panel Input di atas
        JPanel panelInput_1020 = new JPanel(new GridLayout(2,6,5,5));
        tfNama_1020 = new JTextField();
        tfNim_1020 = new JTextField();
        tfProdi_1020 = new JTextField();
        btnTambah_1020 = new JButton("Tambah Data");
        btnTambah_1020.setBackground(new Color(128, 128, 128));
        btnHapus_1020 = new JButton("Hapus Semua");
        btnHapus_1020.setBackground(new Color(128, 128, 128));

        panelInput_1020.add(new JLabel("Nama:")); panelInput_1020.add(tfNama_1020);
        panelInput_1020.add(new JLabel("NIM:")); panelInput_1020.add(tfNim_1020);
        panelInput_1020.add(new JLabel("Prodi:")); panelInput_1020.add(tfProdi_1020);
        panelInput_1020.add(btnTambah_1020); panelInput_1020.add(btnHapus_1020);

        getContentPane().add(panelInput_1020, BorderLayout.NORTH);

        // Tabel Data Mahasiswa di kiri
        String[] kolom = {"Nama", "NIM", "Program Studi"};
        model_1020 = new DefaultTableModel(kolom, 0);
        tableMahasiswa_1020 = new JTable(model_1020);
        JScrollPane scrollTable = new JScrollPane(tableMahasiswa_1020);

        // Panel kontrol + visualisasi di kanan
        JPanel panelRight_1020 = new JPanel(new BorderLayout());
        cbAlgoritma_1020 = new JComboBox<>(new String[]{"Insertion Sort", "Selection Sort", "Bubble Sort"});
        btnSort_1020 = new JButton("Mulai Sorting");
        JPanel panelControl = new JPanel();
        panelControl.setBackground(new Color(64, 128, 128));
        panelControl.add(cbAlgoritma_1020);
        panelControl.add(btnSort_1020);

        areaVisualisasi_1020 = new JTextArea();
        JScrollPane scrollVisual = new JScrollPane(areaVisualisasi_1020);

        panelRight_1020.add(panelControl, BorderLayout.NORTH);
        panelRight_1020.add(scrollVisual, BorderLayout.CENTER);

        // SplitPane untuk membagi tabel dan visualisasi
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollTable, panelRight_1020);
        splitPane.setDividerLocation(350);
        getContentPane().add(splitPane, BorderLayout.CENTER);

        // Event Listener
        btnTambah_1020.addActionListener(e -> tambahData_1020());
        btnHapus_1020.addActionListener(e -> hapusSemua_1020());
        btnSort_1020.addActionListener(e -> mulaiSorting_1020());
    }

    private void tambahData_1020() {
        Mahasiswa_2511531020 m = new Mahasiswa_2511531020(
                tfNama_1020.getText(),
                tfNim_1020.getText(),
                tfProdi_1020.getText()
        );
        daftarMahasiswa_1020.add(m);
        model_1020.addRow(new Object[]{m.getNama_1020(), m.getNim_1020(), m.getProdi_1020()});
    }

    private void hapusSemua_1020() {
        daftarMahasiswa_1020.clear();
        model_1020.setRowCount(0);
        areaVisualisasi_1020.setText("");
    }

    private void mulaiSorting_1020() {
        String pilihan = (String) cbAlgoritma_1020.getSelectedItem();
        if (pilihan.equals("Insertion Sort")) {
            insertionSort_1020();
        } else if (pilihan.equals("Selection Sort")) {
            selectionSort_1020();
        } else {
            bubbleSort_1020();
        }
    }

    private void insertionSort_1020() {
        areaVisualisasi_1020.append("\n=== INSERTION SORT ===\n");
        for (int i = 1; i < daftarMahasiswa_1020.size(); i++) {
            Mahasiswa_2511531020 key = daftarMahasiswa_1020.get(i);
            int j = i - 1;
            while (j >= 0 && daftarMahasiswa_1020.get(j).getNama_1020()
                    .compareToIgnoreCase(key.getNama_1020()) > 0) {
                daftarMahasiswa_1020.set(j + 1, daftarMahasiswa_1020.get(j));
                j--;
            }
            daftarMahasiswa_1020.set(j + 1, key);
            tampilkanLangkah_1020("Langkah " + i);
        }
    }

    private void selectionSort_1020() {
        areaVisualisasi_1020.append("\n=== SELECTION SORT ===\n");
        for (int i = 0; i < daftarMahasiswa_1020.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < daftarMahasiswa_1020.size(); j++) {
                if (daftarMahasiswa_1020.get(j).getNama_1020()
                        .compareToIgnoreCase(daftarMahasiswa_1020.get(minIndex).getNama_1020()) < 0) {
                    minIndex = j;
                }
            }
            Mahasiswa_2511531020 temp = daftarMahasiswa_1020.get(minIndex);
            daftarMahasiswa_1020.set(minIndex, daftarMahasiswa_1020.get(i));
            daftarMahasiswa_1020.set(i, temp);
            tampilkanLangkah_1020("Pass " + (i + 1));
        }
    }

    private void bubbleSort_1020() {
        areaVisualisasi_1020.append("\n=== BUBBLE SORT ===\n");
        for (int i = 0; i < daftarMahasiswa_1020.size() - 1; i++) {
            for (int j = 0; j < daftarMahasiswa_1020.size() - i - 1; j++) {
                if (daftarMahasiswa_1020.get(j).getNama_1020()
                        .compareToIgnoreCase(daftarMahasiswa_1020.get(j + 1).getNama_1020()) > 0) {
                    Mahasiswa_2511531020 temp = daftarMahasiswa_1020.get(j);
                    daftarMahasiswa_1020.set(j, daftarMahasiswa_1020.get(j + 1));
                    daftarMahasiswa_1020.set(j + 1, temp);
                }
            }
            tampilkanLangkah_1020("Pass " + (i + 1));
        }
    }

    private void tampilkanLangkah_1020(String langkah) {
        areaVisualisasi_1020.append(langkah + " :[");
        for (Mahasiswa_2511531020 m : daftarMahasiswa_1020) {
            areaVisualisasi_1020.append(m.getNama_1020() + " ");
        }
        areaVisualisasi_1020.append("]\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SortingGUI_2511531020().setVisible(true));
    }
}
