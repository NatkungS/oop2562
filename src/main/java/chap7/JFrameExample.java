package chap7;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JFrameExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm = new JFrame("Hello sunday");
        frm.setSize(450, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object rowData[][] = {
            {"1001", "o", "nn@skru.ac.th"},
            {"1002", "r", "nn@skru.ac.th"},
            {"1003", "a", "nn@skru.ac.th"},
            {"1004", "w", "nn@skru.ac.th"},
            {"1001", "a", "nn@skru.ac.th"},
            {"1002", "n", "nn@skru.ac.th"},
            {"1003", "a", "nn@skru.ac.th"},
            {"1004", "r", "nn@skru.ac.th"},
            {"1001", "m", "nn@skru.ac.th"},
            {"1002", "arm", "nn@skru.ac.th"},};

        String columnNames[] = {"ID", "Name", "E-mail"};
        JTable tblData = new JTable(rowData, columnNames);
        JScrollPane acp = new JScrollPane(tblData);
        frm.add(acp);
        frm.setVisible(true);
    }

}//end
