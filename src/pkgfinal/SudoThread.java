/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ilham Bintang
 */

public class SudoThread implements Runnable {
    private int [][] puzzle = new int[2][2];
    private final Tampil gan;
    public static double waktu = 0;
    JLabel label;
    
    SudoThread(int[][] puzzle, Tampil x, JLabel label) {
        this.puzzle = puzzle;
        gan = x;
        this.label = label;
    }
    
    @Override
    public void run() {
        Solver sol = new Solver(gan);
        //double waktuMulai = System.currentTimeMillis();
        if(sol.solve(0, 0, puzzle)) {
            JOptionPane.showMessageDialog(gan, "Berhasil!");
        }
        else JOptionPane.showMessageDialog(gan, "Gagal");    
        double waktuSelesai = System.currentTimeMillis();
        waktu = (waktuSelesai- Solver.waktuMulai)/1000; 
        label.setText(Double.toString(waktu));
    }
}
