package pekan7_2511531020;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class InsertionSortGUI_2511531020 extends JFrame {

    private static final long serialVersionUID = 1L;

    private int[] array_1020;
    private JLabel[] labelArray_1020;
    private JButton stepButton_1020, resetButton_1020, setButton_1020;
    private JTextField inputField_1020;
    private JPanel panelArray_1020;
    private JTextArea stepArea_1020;

    private int i_1020 = 1, j_1020;
    private boolean sorting_1020 = false;
    private int stepCount_1020 = 1;

    public InsertionSortGUI_2511531020() {
        setTitle("Insertion Sort: Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_1020 = new JPanel(new FlowLayout());
        inputField_1020 = new JTextField(30);
        setButton_1020 = new JButton("Set Array");
        inputPanel_1020.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_1020.add(inputField_1020);
        inputPanel_1020.add(setButton_1020);

        // Panel array visual
        panelArray_1020 = new JPanel();
        panelArray_1020.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_1020 = new JPanel();
        stepButton_1020 = new JButton("Langkah Selanjutnya");
        resetButton_1020 = new JButton("Reset");
        stepButton_1020.setEnabled(false);
        controlPanel_1020.add(stepButton_1020);
        controlPanel_1020.add(resetButton_1020);

        // Area teks untuk log langkah-langkah
        stepArea_1020 = new JTextArea(8, 60);
        stepArea_1020.setEditable(false);
        stepArea_1020.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_1020 = new JScrollPane(stepArea_1020);

        // Tambahkan panel ke frame
        add(inputPanel_1020, BorderLayout.NORTH);
        add(panelArray_1020, BorderLayout.CENTER);
        add(controlPanel_1020, BorderLayout.SOUTH);
        add(scrollPane_1020, BorderLayout.EAST);

        // Event Set Array
        setButton_1020.addActionListener(e -> setArrayFromInput_1020());

        // Event Langkah Selanjutnya
        stepButton_1020.addActionListener(e -> performStep_1020());

        // Event Reset
        resetButton_1020.addActionListener(e -> reset_1020());
    }

private void setArrayFromInput_1020() {
    String text_1020 = inputField_1020.getText().trim();
    if (text_1020.isEmpty()) return;
    String[] parts_1020 = text_1020.split(",");
    array_1020 = new int[parts_1020.length];
    try {
        for (int k_1020 = 0; k_1020 < parts_1020.length; k_1020++) {
            array_1020[k_1020] = Integer.parseInt(parts_1020[k_1020].trim());
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan dengan koma",
                "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    i_1020 = 0;
    stepCount_1020 = 1;
    sorting_1020 = true;
    stepButton_1020.setEnabled(true);
    stepArea_1020.setText("");
    panelArray_1020.removeAll();
    labelArray_1020 = new JLabel[array_1020.length];
    for (int k_1020 = 0; k_1020 < array_1020.length; k_1020++) {
        labelArray_1020[k_1020] = new JLabel(String.valueOf(array_1020[k_1020]));
        labelArray_1020[k_1020].setFont(new Font("Arial", Font.BOLD, 24));
        labelArray_1020[k_1020].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        labelArray_1020[k_1020].setPreferredSize(new Dimension(50, 50));
        labelArray_1020[k_1020].setHorizontalAlignment(SwingConstants.CENTER);
        panelArray_1020.add(labelArray_1020[k_1020]);
    }
    panelArray_1020.revalidate();
    panelArray_1020.repaint();
}

private void performStep_1020() {
    if (i_1020 < array_1020.length && sorting_1020) {
        int key_1020 = array_1020[i_1020];
        j_1020 = i_1020 - 1;

        StringBuilder stepLog_1020 = new StringBuilder();
        stepLog_1020.append("Langkah ").append(stepCount_1020).
        append(": Memasukkan ").append(key_1020).append("\n");

        while (j_1020 >= 0 && array_1020[j_1020] > key_1020) {
            array_1020[j_1020 + 1] = array_1020[j_1020];
            j_1020--;
        }

        array_1020[j_1020 + 1] = key_1020;

        updateLabels_1020();
        stepLog_1020.append("Hasil: ").append(arrayToString_1020(array_1020)).append("\n\n");
        stepArea_1020.append(stepLog_1020.toString());

        i_1020++;
        stepCount_1020++;
    }

    if (i_1020 == array_1020.length) {
        sorting_1020 = false;
        stepButton_1020.setEnabled(false);
        javax.swing.JOptionPane.showMessageDialog(this, "Sorting selesai!");
    }
}


private void updateLabels_1020() {
    for (int k_1020 = 0; k_1020 < array_1020.length; k_1020++) {
        labelArray_1020[k_1020].setText(String.valueOf(array_1020[k_1020]));
    }
}

private void reset_1020() {
    inputField_1020.setText("");
    panelArray_1020.removeAll();
    panelArray_1020.revalidate();
    panelArray_1020.repaint();
    stepArea_1020.setText("");
    stepButton_1020.setEnabled(false);
    sorting_1020 = false;
    i_1020 = 1;
    stepCount_1020 = 1;
}

private String arrayToString_1020(int[] arr_1020) {
    StringBuilder sb_1020 = new StringBuilder();
    for (int k_1020 = 0; k_1020 < arr_1020.length; k_1020++) {
        sb_1020.append(arr_1020[k_1020]);
        if (k_1020 < arr_1020.length - 1) sb_1020.append(", ");
    }
    return sb_1020.toString();
}

public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(() -> {
        InsertionSortGUI_2511531020 gui_1020 = new InsertionSortGUI_2511531020();
        gui_1020.setVisible(true);
    });
}
}

