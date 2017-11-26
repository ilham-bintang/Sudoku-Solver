/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ilham Bintang
 */
public class Solver {
    private Tampil gan;
    public static double waktuMulai =0 ;
    public Solver(Tampil x) {
        gan = x;
        waktuMulai = System.currentTimeMillis();
    }
    public boolean solve(int i, int j, int[][] input) {
        
		if(j == 16) {
			j = 0;
			if(++i == 16) return true; //sudah di akhir kolom dan ketemu
		}
		//kalau sudah ada data, rekursi ke baris selanjutnya
		if(input[i][j] != 0) return solve(i, j + 1, input);
		
		for(int nilai = 1; nilai <= 16; nilai++) { try {
                    //coba tempatkan 1 sampe 16 di kotak kotak
                    Thread.sleep(0);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Solver.class.getName()).log(Level.SEVERE, null, ex);
                    }
			if(valid(i, j, nilai, input)) { //cek valid
                                gan.Arr[i][j].setText(Integer.toString(input[i][j]));
				input[i][j] = nilai; //kalau valid, masukkan sementara nilai ke kotak
                                gan.Arr[i][j].setText(Integer.toString(input[i][j]));
				if(solve(i, j + 1, input)) //rekursi ke baris selanjutnya
					return true;
			}
		}
		//backtrack
                gan.Arr[i][j].setText("");
		input[i][j] = 0;
		return false;
    }
    public boolean valid(int i, int j, int nilai, int[][] input) {
        //cek baris dan kolom
        for(int c = 0; c < 16; c++) {
                if(nilai == input[i][c] || nilai == input[c][j]) return false;
        }
        //cek kotak kecil
        for(int r = 0; r < 4; r++) {
                for(int c = 0; c < 4; c++) {
                        if(nilai == input[r+(i / 4) * 4][c+(j / 4) * 4]) return false;
                }
        }
        return true;
    }
}
