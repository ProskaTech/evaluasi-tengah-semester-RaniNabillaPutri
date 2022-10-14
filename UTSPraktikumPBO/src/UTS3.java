//Created by 21343034_Rani Nabilla Putri

import javax.swing.JOptionPane;

public class UTS3 {
    public static void main(String[] args) {
        String i = "", keterangan = "";
        int nilai;

        i = JOptionPane.showInputDialog("Masukkan nilai : ");
        nilai = Integer.parseInt(i);

        if(nilai < 0) {
           keterangan = "Bilangan Negatif";
        }
        else {
           keterangan = "Bilangan Positif";
        }

        JOptionPane.showMessageDialog(null, keterangan);
        System.out.println(nilai + " merupakan " + keterangan);
    }
}